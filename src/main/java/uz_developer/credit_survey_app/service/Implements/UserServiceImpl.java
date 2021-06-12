package uz_developer.credit_survey_app.service.Implements;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uz_developer.credit_survey_app.dto.UserDTO;
import uz_developer.credit_survey_app.dto.GetUserInfoDTO;
import uz_developer.credit_survey_app.entity.Passport;
import uz_developer.credit_survey_app.entity.User;
import uz_developer.credit_survey_app.repository.PassportRepository;
import uz_developer.credit_survey_app.repository.UserRepository;
import uz_developer.credit_survey_app.response.Response;
import uz_developer.credit_survey_app.service.UserService;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    final UserRepository userRepository;
    final PassportRepository passportRepository;

    public UserServiceImpl(UserRepository userRepository, PassportRepository passportRepository) {
        this.userRepository = userRepository;
        this.passportRepository = passportRepository;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Response addCustomer(UserDTO userDTO) {
        Passport passport = new Passport(
                userDTO.getFirstName(),
                userDTO.getLastName(),
                userDTO.getBirthDate(),
                userDTO.getFamilyName(),
                userDTO.getNationality(),
                userDTO.getPassportSerial(),
                userDTO.getPassportNumber(),
                userDTO.getGivenFrom(),
                userDTO.getGivenDate(),
                userDTO.getDueDate(),
                userDTO.getOtherInfos());

        Passport savedPassport = passportRepository.save(passport);

        User user  = new User(
                userDTO.getUserName(),
                userDTO.getPassword(),
                userDTO.getOtherInfos(),
                savedPassport );
        User savedUser = userRepository.save(user);

        return new Response("user was saved",true,"user id: "+savedUser.getId());

    }

    @Override
    public Response getUserInfo(GetUserInfoDTO getUserInfoDTO) {
        Optional<Passport> passport = passportRepository.findByPassportSerialAndPassportNumber(getUserInfoDTO.getPassportSerial(), getUserInfoDTO.getPassportNumber());
        if (passport.isEmpty())
            return new Response("Such passport info was not found",false);
        return new Response("Success",true,passport.get());
    }
}
