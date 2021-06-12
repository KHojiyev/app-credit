package uz_developer.credit_survey_app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

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


    public Passport(String firstName, String lastName, Date birthDate, String familyName, String nationality, String passportSerial, Integer passportNumber, String givenFrom, Date givenDate, Date dueDate, String otherInfos) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.familyName = familyName;
        this.nationality = nationality;
        this.passportSerial = passportSerial;
        this.passportNumber = passportNumber;
        this.givenFrom = givenFrom;
        this.givenDate = givenDate;
        this.dueDate = dueDate;
        this.otherInfos = otherInfos;
    }
}
