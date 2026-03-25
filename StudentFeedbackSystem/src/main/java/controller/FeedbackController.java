package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import entity.Feedback;
import repository.FeedbackRepository;

@RestController
@CrossOrigin("*")
public class FeedbackController {

    @Autowired
    private FeedbackRepository repo;

    @GetMapping("/")
    public String home(){
        return "Feedback System Running";
    }

    @PostMapping("/submit")
    public Feedback submitFeedback(@RequestBody Feedback feedback){
        return repo.save(feedback);
    }

    @GetMapping("/all")
    public List<Feedback> getAllFeedback(){
        return repo.findAll();
    }
}
