package uz_developer.credit_survey_app.service.Implements;

import org.springframework.stereotype.Service;
import uz_developer.credit_survey_app.dto.CreditDTO;
import uz_developer.credit_survey_app.entity.Credit;
import uz_developer.credit_survey_app.entity.Passport;
import uz_developer.credit_survey_app.repository.CreditRepository;
import uz_developer.credit_survey_app.repository.PassportRepository;
import uz_developer.credit_survey_app.response.Response;
import uz_developer.credit_survey_app.service.CreditService;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class CreditServiceImpl  implements CreditService {

    final CreditRepository creditRepository;
    final PassportRepository passportRepository;

    public CreditServiceImpl(CreditRepository creditRepository, PassportRepository passportRepository) {
        this.creditRepository = creditRepository;
        this.passportRepository = passportRepository;
    }


    @Override
    public Response surveyForCredit(CreditDTO creditDTO) {
        // there are initial amounts and percents of credit

        double creditPercent = 0.25;
        int creditTime = 3;
        double normalPercentForPaying = 0.8;
        double taxFeePercentOfSalary = 0.3;
        Optional<Passport> passport = passportRepository.findByPassportSerialAndPassportNumber(creditDTO.getPassportSerial(), creditDTO.getPassportNumber());
        if (passport.isEmpty())
            return new Response("Such passport info was not found",false);
        double userAnnualIncome = creditDTO.getUserSalary() * 12 * (1-taxFeePercentOfSalary);

        // conditionally i get 3 years for credit time and 25% for credit percent
        // and user pays credit by linear mode

        // it is normally when credit amount is maximum 50-90 percent of income of user
        // so i get average 80 percent

        boolean checkForCredit = creditDTO.getCreditAmount() * (creditPercent+1) < userAnnualIncome * creditTime * normalPercentForPaying;
        if(checkForCredit) {
            LocalDate localDate = LocalDate.now();

            Credit credit = new Credit(
                    creditDTO.getCreditAmount(),
                    creditPercent,
                    localDate,
                    localDate.plusYears(creditTime),
                    passport.get(),
                    " " );
            Credit saveDCredit = creditRepository.save(credit);
            return new Response("Success",true,saveDCredit.getId());
        }else {

            return  new Response("failed",false,"sorry your salary amount is not enough for credit" +
                    " amount so we recommend you lower amount ,in average : " +  (userAnnualIncome * creditTime * normalPercentForPaying) +" or lower" );

        }





    }
}
