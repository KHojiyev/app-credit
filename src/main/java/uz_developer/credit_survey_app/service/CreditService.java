package uz_developer.credit_survey_app.service;

import org.springframework.stereotype.Service;
import uz_developer.credit_survey_app.dto.CreditDTO;
import uz_developer.credit_survey_app.response.Response;

@Service
public interface CreditService {


    Response surveyForCredit(CreditDTO creditDTO);
}
