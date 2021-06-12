package uz_developer.credit_survey_app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;


    private String userName;

    private String password;

    private String extraInfos;

    @ManyToMany
    private List<Role> role;

    @OneToOne
    private Passport passport;


    public User(String userName, String password, String extraInfos, Passport passport) {
        this.userName = userName;
        this.password = password;
        this.extraInfos = extraInfos;
        this.passport = passport;
    }
}
