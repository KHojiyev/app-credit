package uz_developer.credit_survey_app.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {


    private String userName;

    private String password;

    private String firstName;

    private String lastName;

    private Date birthDate;

    private String familyName;

    private String nationality;

    private String passportSerial;

    private Integer passportNumber;

    private String givenFrom;

    private Date givenDate;

    private Date dueDate;

    private String otherInfos;


}
