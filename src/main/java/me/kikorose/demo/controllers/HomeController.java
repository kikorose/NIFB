package me.kikorose.demo.controllers;

import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController {

    @GetMapping("/fizzbuzz")
    public String loadTvForm(Model model){
        model.addAttribute("fizzbuzz", new FizzBuzz());
        return "fizzbuzz";
    }

    @GetMapping("/fizz")
    public String loadTvForm(Model model){
        model.addAttribute("fizz", new Fizz());
        return "fizz";
    }

    @GetMapping("/buzz")
    public String loadTvForm(Model model){
        model.addAttribute("buzz", new Buzz());
        return "buzz";
    }

    @GetMapping("/fizzbuzz")
    public String loadTvForm(Model model){
        model.addAttribute("tvshow", new Tvshow());
        return "tvform";
    }
}
}
