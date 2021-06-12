package uz_developer.credit_survey_app.service;

import org.springframework.stereotype.Service;
import uz_developer.credit_survey_app.dto.UserDTO;
import uz_developer.credit_survey_app.dto.GetUserInfoDTO;
import uz_developer.credit_survey_app.response.Response;

@Service
public interface UserService {


    Response addCustomer(UserDTO userDTO);


    Response getUserInfo(GetUserInfoDTO getUserInfoDTO);

}
