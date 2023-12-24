package com.example.dataEx.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pojo.md;
@Controller
public class TestController {

    @GetMapping("/")
    public String showForm(Model model) {
//    	*Inside showForm:
//    	*An instance of the md class (your model) is created.
//    	*This instance is added to the model with the key "md" using model.addAttribute("md", ob);.
//    	*The "form.html" page is then rendered.
    	md ob=new md();
        model.addAttribute("md",  ob);
        
//        model.addAttribute("md",new md()); // you can also create object using this way

        return "form";
    }

    @PostMapping("/res")
    public String calculate(@ModelAttribute md obj, Model model) {
    	
//The @ModelAttribute annotation in the calculate method binds the form data to an instance of the md class that is ob.
       
        // Calculate total, discount, and GST
        double total = calculateTotal(obj.getPrice(), obj.getQuantity());
        double discount = calculateDiscount(total);
        double gst = 1000.00;

        // Add data to the model
        model.addAttribute("md", obj);
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
