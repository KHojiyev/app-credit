package uz_developer.credit_survey_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz_developer.credit_survey_app.entity.Passport;

import java.util.Optional;

@Repository
public interface PassportRepository extends JpaRepository<Passport,Integer> {



    Optional<Passport> findByPassportSerialAndPassportNumber(String passportSerial, Integer passportNumber);


}
