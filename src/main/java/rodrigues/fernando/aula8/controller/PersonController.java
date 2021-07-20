package rodrigues.fernando.aula8.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rodrigues.fernando.aula8.model.Person;

@RestController
public class PersonController {

    @GetMapping("/person")
    public String getPerson() {

        Person person = new Person();
        person.setName("Fernando");
        person.setAge(17);

        return person.toString();
    }
}
