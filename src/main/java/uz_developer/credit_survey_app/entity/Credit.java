package uz_developer.credit_survey_app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Credit {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private double creditAmount;

    private double creditPercent;

    private LocalDate issued;

    private LocalDate dueDate;

    @ManyToOne
    private Passport passport;

    private String extraInfos;


    public Credit(Double creditAmount, double creditPercent, LocalDate issued, LocalDate dueDate, Passport passport, String extraInfos) {
        this.creditAmount = creditAmount;
        this.creditPercent = creditPercent;
        this.issued = issued;
        this.dueDate = dueDate;
        this.passport = passport;
        this.extraInfos = extraInfos;
    }
}
