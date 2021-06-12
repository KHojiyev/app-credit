package uz_developer.credit_survey_app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditDTO {


    private String passportSerial;
    private Integer passportNumber;
    private Double userSalary;
    private Double creditAmount;



}
