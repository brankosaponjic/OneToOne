package brankosaponjic.onetoone;

import brankosaponjic.onetoone.entity.License;
import brankosaponjic.onetoone.entity.Person;
import brankosaponjic.onetoone.repository.LicenseRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class OnetooneApplicationTests {

    @Autowired
    LicenseRepository licenseRepository;

    @Test
    void testCreateLicense() {
        License license = new License();
        license.setType("CAR");
        license.setValidFrom(new Date());
        license.setValidTo(new Date());

        Person person = new Person();
        person.setFirstName("Bill");
        person.setLastName("Cristal");
        person.setAge(55);

        license.setPerson(person);

        licenseRepository.save(license);
    }

}
