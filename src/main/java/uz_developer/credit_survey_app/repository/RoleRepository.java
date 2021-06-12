package uz_developer.credit_survey_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz_developer.credit_survey_app.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {




}
