package uz_developer.credit_survey_app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetUserInfoDTO {


    private String passportSerial;
    private Integer passportNumber;


}
