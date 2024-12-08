package springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import springmvc.model.User;

@Controller
public class ContactController {
    @RequestMapping("/contact")
    public String showForm(){
        return "Contact";
    }

    @RequestMapping(path = "/processform",method = RequestMethod.POST)
    public String handleForm(
            @RequestParam ("email") String email,
            @RequestParam ("UserName") String name,
            @RequestParam ("password") String pasword, Model model
    ){
        User user = new User();
        user.setEmail(email);
        user.setUserName(name);
        user.setPassword(pasword);

        model.addAttribute("user", user);

        //process the data i.e send to database
        return "sucess";
    }
}
