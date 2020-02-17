package mrsnickalo.capstone.service;

import java.util.HashSet;
import java.util.Set;
import mrsnickalo.capstone.dao.UserDao;
import mrsnickalo.capstone.entity.Role;
import mrsnickalo.capstone.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lindsay Gen10
 * @date Feb 13, 2020
 */


@Service
public class UserDetailsServiceImpl implements UserDetailsService
{
    @Autowired
    UserDao users;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = users.findById(username);
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        for(Role role : user.getRoles()) 
        {
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getRole()));
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantedAuthorities);
    }
}
