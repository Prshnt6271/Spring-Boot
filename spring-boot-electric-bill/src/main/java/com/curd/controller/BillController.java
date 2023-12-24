package com.curd.controller;

import com.curd.Entity.Bill;
import com.curd.service.BillService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RequestMapping("/bills")
public class BillController {

    @Autowired
    private BillService billService;

    @GetMapping("/")
    public String getAllBills(Model model) {
        List<Bill> bills = billService.getAllBills();
        model.addAttribute("bills", bills);
        return "billList";
    }

    @RequestMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("bill", new Bill());
        return "addBill";
    }

    @RequestMapping("/save")
    public String saveBill(@ModelAttribute("bill") Bill bill) {
        billService.saveBill(bill);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable int id, Model model) {
        Bill bill = billService.getBillById(id);
        model.addAttribute("bill", bill);
        return "editBill";
    }

    @PostMapping("/update")
    public String updateBill(@ModelAttribute("bill") Bill bill) {
        // Perform the update logic in the service
        Bill updatedBill = billService.updateBill(bill);

        // Redirect to the bill list page
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteBill(@PathVariable int id) {
        billService.deleteBill(id);
        return "redirect:/";
    }
}
