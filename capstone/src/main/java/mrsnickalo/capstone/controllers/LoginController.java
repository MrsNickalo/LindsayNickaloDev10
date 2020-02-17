package mrsnickalo.capstone.controllers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import mrsnickalo.capstone.config.PasswordEncoder;
import mrsnickalo.capstone.entity.Role;
import mrsnickalo.capstone.entity.User;
import mrsnickalo.capstone.service.PrivateServiceLayerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Lindsay Gen10
 * @date Feb 13, 2020
 */

@Controller
public class LoginController 
{
    @Autowired
    PrivateServiceLayerImpl serviceP;
    
    @Autowired
    PasswordEncoder encoder;
    
    @GetMapping("/login")
    public String showLoginForm()
    {
        
        return "login";
    }
    
    @GetMapping("/signup")
    public String showSignUpForm()
    {
        
        return "signup";
    }
    
    @PostMapping("/signup")
    public String addUser(String username, String password, Model model)
    {
        User user = new User();
        user.setUsername(username);
        user.setPassword(encoder.encodePassword(password));
        user.setEnabled(true);
        Set<Role> roles = new HashSet<>();
        Role role = new Role();
        role.setId(1);
        role.setRole("ROLE_USER");
        roles.add(role);
        user.setRoles(roles);
        try
        {
            User newUser = serviceP.addUser(user);
        }
        catch(Exception e)
        {
            model.addAttribute("error", true);
            return "signup";
        }
        return "redirect:/home";
    }
}
