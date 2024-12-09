package springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springmvc.model.User;

@Controller
public class ContactController {
    @ModelAttribute
    public void commonDataForModel(Model m){
        m.addAttribute("Header", "15 Days to Go!");
        m.addAttribute("Desc","Srinivasa Kalyanam");
        m.addAttribute("Nithin and Raashi khanna");
    }

    @RequestMapping("/contact")
    public String showForm(){
        return "Contact";
    }

    @RequestMapping(path = "/processform",method = RequestMethod.POST)
    public String handleForm( @ModelAttribute User user, Model model){
        System.out.println(user);
        return "success";
    }

}
