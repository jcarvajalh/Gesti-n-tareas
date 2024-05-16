package com.jcamilo.managementtask.controller;

import com.jcamilo.managementtask.model.Task;
import com.jcamilo.managementtask.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("tasks", taskService.getAllTasks());
        return "index";
    }

    @PostMapping("/addTask")
    public String addTask(@RequestParam String title_task,
                          @RequestParam String desc_task,
                          @RequestParam String due_date,
                          @RequestParam(required = false) boolean alarm_task) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date dueDate = null;
        try {
            dueDate = formatter.parse(due_date);
        } catch (ParseException e) {
            e.printStackTrace();
            return "error"; // Podrías redirigir a una página de error
        }
        Task task = new Task(title_task, desc_task, dueDate, alarm_task);
        taskService.addTask(task);
        return "redirect:/";
    }
}
