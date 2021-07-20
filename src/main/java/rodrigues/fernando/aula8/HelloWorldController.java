package rodrigues.fernando.aula8;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {

    @GetMapping("/")
    public String index(){
        return "Boraaa! Porque dormi não da xp";
    }

    @GetMapping("/my-name")
    public String getMyName(){
        return "Fernando Rodrigues";
    }
}
