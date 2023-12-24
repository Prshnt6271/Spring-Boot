package com.example.dataEx.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Testcontroller {

    @GetMapping("/formm")
    public String showForm() {
        return "form";
    }

    @PostMapping("/calculate")
    public String calculateBill(
            @RequestParam("consumerId") String consumerId,
            @RequestParam("consumerName") String consumerName,
            @RequestParam("currentReading") int currentReading,
            @RequestParam("previousReading") int previousReading,
            Model model) {

        // Calculate electric bill (you can customize this logic)
        int unitsConsumed = currentReading - previousReading;
        float rate=0;
        if(unitsConsumed<300) {
        	rate=(float) 1.75;
        	
        }
        
        if(unitsConsumed>=300 || unitsConsumed<500) {
        	rate=(float) 3.25;
        }
        else {
        	rate=(float) 7.25;
        }
        double billAmount = rate * unitsConsumed; // Assuming a rate of 5.0 per unit

        // Prepare data to display in the result page
        model.addAttribute("consumerId", consumerId);
        model.addAttribute("consumerName", consumerName);
        model.addAttribute("unitsConsumed", unitsConsumed);
        model.addAttribute("billAmount", billAmount);

        return "calculate";
    }
}
