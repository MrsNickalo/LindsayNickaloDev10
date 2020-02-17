package mrsnickalo.capstone.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lindsay Gen10
 * @date Feb 14, 2020
 */

@Service
public class PasswordEncoder 
{
    public String encodePassword(String password)
    {
        String clearTxtPw = password;
        // BCrypt
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String hashedPw = encoder.encode(clearTxtPw);
        return hashedPw;
    }
}
