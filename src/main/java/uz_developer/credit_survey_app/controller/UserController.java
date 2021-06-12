package uz_developer.credit_survey_app.controller;

import org.springframework.web.bind.annotation.*;
import uz_developer.credit_survey_app.dto.UserDTO;
import uz_developer.credit_survey_app.dto.GetUserInfoDTO;
import uz_developer.credit_survey_app.response.Response;
import uz_developer.credit_survey_app.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {


    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping
    public Response addCustomer(@RequestBody UserDTO userDTO){
        return userService.addCustomer(userDTO);
    }

    @GetMapping("/info")
    public Response getUserInfo(@RequestBody GetUserInfoDTO getUserInfoDTO){
        return userService.getUserInfo(getUserInfoDTO);
    }


}
