package com.telran.homeworktask1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class GreetingsController {

    int count = 0;
    private List<Integer> countValues = new ArrayList<>();

    @GetMapping(value="/message")
    public String message() {
        Random random = new Random();
        boolean wellCome = true;
        boolean output = random.nextBoolean();
        if (output == wellCome) {
            return "Well come!";
        } else {
            return "You are not well come";
        }
    }

    @GetMapping(value="/count")
    public int count() {
        return count++;
    }

    @GetMapping(value="/info")
    public void info() {
        System.out.println(count);
    }

    @GetMapping(value="/save-and-reset")
    public int saveAndReset() {
        countValues.add(count);
        return count = 0;
    }

    @GetMapping(value="/list")
    public List<Integer> list() {
        return countValues;
    }
}
