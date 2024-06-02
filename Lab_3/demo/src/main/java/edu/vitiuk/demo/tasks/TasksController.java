package edu.vitiuk.demo.tasks;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tasks")
public class TasksController {

    @GetMapping
    public String myTasks(Model model) {
        return "tasks/tasks";
    }
}
