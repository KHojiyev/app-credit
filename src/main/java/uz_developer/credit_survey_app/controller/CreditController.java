package uz_developer.credit_survey_app.controller;

import org.springframework.web.bind.annotation.*;
import uz_developer.credit_survey_app.dto.CreditDTO;
import uz_developer.credit_survey_app.response.Response;
import uz_developer.credit_survey_app.service.CreditService;

@RestController
@RequestMapping("/api/credit")
public class CreditController {

    final CreditService creditService;


    public CreditController(CreditService creditService) {
        this.creditService = creditService;
    }


    @PostMapping
    public Response surveyForCredit(@RequestBody CreditDTO creditDTO) {
        return creditService.surveyForCredit(creditDTO);
    }


}
