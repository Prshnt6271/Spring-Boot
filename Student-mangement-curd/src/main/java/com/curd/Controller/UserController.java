package com.curd.Controller;

import com.curd.Entity.Users;
import com.curd.Repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {

    @Autowired
    private UserRepo repo;

    // home page display existing students records
    @GetMapping("/")
    public String listUsers(Model model) {
        model.addAttribute("users", repo.findAll());
        return "hh";
    }

    // for add new student
    @GetMapping("/add-new")
    public String showCreateUserForm() {

        return "Add";
    }

    // for save
    @PostMapping("/save")
    public String saveUser(Users users, RedirectAttributes redirectAttributes) {
        // Check if a user with the same ID already exists

        if (repo.existsById(users.getId())) {
            redirectAttributes.addFlashAttribute("errorMessage", "ID is already prsent !!");
        } else {
            // If ID is not taken, proceed with the save operation
            Users savedUser = repo.save(users);
        }

        return "redirect:/";
    }

    // for delete
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id, RedirectAttributes redirectAttributes) {
        repo.deleteById(id);
        redirectAttributes.addFlashAttribute("successMessage", "User Deleted Successfully !!");
        return "redirect:/";
    }

    //  for update the record
    @GetMapping("/update/{id}")
    public String updateForm(@PathVariable int id, ModelMap model) {
        Users user = repo.findById(id).orElse(null);
        model.put("user", user);
        return "Update";
    }

    @PostMapping("/update")
    public String updateUser(@ModelAttribute Users user, RedirectAttributes redirectAttributes) {
        repo.save(user);
        redirectAttributes.addFlashAttribute("successMessage", "User updated successfully !!");

        return "redirect:/";
    }
}

