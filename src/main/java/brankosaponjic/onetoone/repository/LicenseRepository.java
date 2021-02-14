package brankosaponjic.onetoone.repository;

import brankosaponjic.onetoone.entity.License;
import org.springframework.data.repository.CrudRepository;

public interface LicenseRepository extends CrudRepository<License, Long> {
}