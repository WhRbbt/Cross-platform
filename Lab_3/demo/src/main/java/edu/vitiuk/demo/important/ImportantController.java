package edu.vitiuk.demo.important;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/important")
public class ImportantController {

    @GetMapping
    public String important(Model model) {
        return "important/important";
    }
}
