package mrsnickalo.capstone.entity;

import java.util.Objects;
import java.util.Set;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Lindsay Gen10
 * @date Feb 5, 2020
 */

public class User 
{
    @Id
    String username;

    @NotNull
    String password;
    
    @NotNull
    boolean enabled;
    
    @NotNull
    Set<Role> roles;
    
    public String getUsername() 
    {
        return username;
    }

    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getPassword() 
    {
        return password;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }

    public boolean isEnabled() 
    {
        return enabled;
    }

    public void setEnabled(boolean enabled) 
    {
        this.enabled = enabled;
    }

    public Set<Role> getRoles() 
    {
        return roles;
    }

    public void setRoles(Set<Role> roles) 
    {
        this.roles = roles;
    }
    
    @Override
    public int hashCode() 
    {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.username);
        hash = 53 * hash + (this.enabled ? 1 : 0);
        hash = 53 * hash + Objects.hashCode(this.roles);
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) 
        {
            return true;
        }
        if (obj == null) 
        {
            return false;
        }
        if (getClass() != obj.getClass()) 
        {
            return false;
        }
        final User other = (User) obj;
        if (this.enabled != other.enabled) 
        {
            return false;
        }
        if (!Objects.equals(this.username, other.username)) 
        {
            return false;
        }
        if (!Objects.equals(this.roles, other.roles)) 
        {
            return false;
        }
        return true;
    }
}
