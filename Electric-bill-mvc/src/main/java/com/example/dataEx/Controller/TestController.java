package com.example.dataEx.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dataEx.Model.ElectricBillForm;  // Update the import statement

@Controller
public class TestController {

    @GetMapping("/formm")
    public String showForm(Model model) {
        model.addAttribute("electricBillForm", new ElectricBillForm());
        return "form";
    }

    @PostMapping("/calculate")
    public String calculateBill(@ModelAttribute ElectricBillForm electricBillForm, Model model) {

        // Calculate electric bill (you can customize this logic)
        int unitsConsumed = electricBillForm.getCurrentReading() - electricBillForm.getPreviousReading();
        float rate;

        if (unitsConsumed < 300) {
            rate = (float) 1.75;
        } else if (unitsConsumed >= 300 && unitsConsumed < 500) {
            rate = (float) 3.25;
        } else {
            rate = (float) 7.25;
        }

        double billAmount = rate * unitsConsumed;

        // Prepare data to display in the result page
        model.addAttribute("electricBillForm", electricBillForm);
        model.addAttribute("unitsConsumed", unitsConsumed);
        model.addAttribute("billAmount", billAmount);

        return "calculate";
    }
}
