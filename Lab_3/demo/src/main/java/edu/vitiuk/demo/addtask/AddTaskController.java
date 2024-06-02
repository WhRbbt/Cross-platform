package edu.vitiuk.demo.addtask;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/add")
public class AddTaskController {

    @GetMapping
    public String addTask(Model model) {
        return "add/add";
    }
}
