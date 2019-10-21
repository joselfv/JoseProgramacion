package spring.boot.DeploySpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping
    public String hello(Model model) {
        model.addAttribute("message", "Desplegar aplicación Spring Boot en Heroku");
        return "hello";
    }

}
