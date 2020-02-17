package mrsnickalo.capstone.controllers;

import mrsnickalo.capstone.service.AdminServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Lindsay Gen10
 * @date Feb 14, 2020
 */

@Controller
public class AdminController 
{
    @Autowired
    AdminServiceLayer service;
    
    @GetMapping("/admin")
    public String displayAdminPage(Model model)
    {
        model.addAttribute("users", service.findAllUsers());
        return "admin";
    }
    
    @PostMapping("/deleteUser")
    public String deleteUser(String username)
    {
        service.deleteUser(username);
        return "redirect:/admin";
    }
}
