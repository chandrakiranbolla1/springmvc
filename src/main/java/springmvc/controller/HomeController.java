package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home url");
		model.addAttribute("name","Chandra Kiran");
		model.addAttribute("id",1);
		List<String> friends = new ArrayList<String>();
		friends.add("Chandra Kiran");
		friends.add("chandra");
		friends.add("Kiran");
		friends.add("Bolla");
		model.addAttribute("f",friends);

		return "index";
	}

	@RequestMapping("/about")
	public String about(){
		System.out.println("this is about url");
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView help(){
		System.out.println("this is help controller");

		//creating model and view data
		ModelAndView modelAndView = new ModelAndView("help");

		//setting the data
		modelAndView.addObject("name","Chandra Kiran");
		modelAndView.addObject("id",123);
		modelAndView.addObject("son","first born");

		//marks
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(17);
		list.add(18);
		list.add(19);
		list.add(20);
		list.add(9009090);
		list.add(121);

		modelAndView.addObject("marks",list);

		//setting the view name
		modelAndView.setViewName("help");
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time",now);
		return modelAndView;
	}
}
