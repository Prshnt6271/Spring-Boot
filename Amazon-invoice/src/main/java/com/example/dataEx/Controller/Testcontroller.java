package com.example.dataEx.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Testcontroller {

    @GetMapping("/")
//    @ResponseBody
    public String showForm() {
        return "form";
    }

    @PostMapping("/res")
    public String calculate(
            @RequestParam String customerId,
            @RequestParam String customerName,
            @RequestParam String mobileNumber,
            @RequestParam String productName,
            @RequestParam double price,
            @RequestParam int quantity,
            Model model
    ) {
        // Use the provided parameters directly
        // You can perform additional validation or business logic here

        // Calculate total, discount, and GST
        double total = calculateTotal(price, quantity);
        double discount = calculateDiscount(total);
        double gst = 1000.00;

        // Add data to the model
        model.addAttribute("customerId", customerId);
        model.addAttribute("customerName", customerName);
        model.addAttribute("mobileNumber", mobileNumber);
        model.addAttribute("productName", productName);
        model.addAttribute("price", price);
        model.addAttribute("quantity", quantity);
        model.addAttribute("total", total);
        model.addAttribute("discount", discount);
        model.addAttribute("gst", gst);

        return "bill";  // Assuming "bill" is the name of your view template
    }

    private double calculateTotal(double price, int quantity) {
        return price * quantity;
    }

    private double calculateDiscount(double total) {
        if (total < 2500) {
            return total * 0.1;  // 10% discount
        } else if (total >= 2500 && total < 5000) {
            return total * 0.15;  // 30% discount
        } else {
            return 0.3;  // No discount
        }
    }
}
