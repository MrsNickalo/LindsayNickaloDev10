package mrsnickalo.capstone.entity;

import java.util.Objects;
import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Lindsay Gen10
 * @date Feb 6, 2020
 */

public class Category 
{
    @Id
    int categoryId;
    
    @NotNull
    String category;

    public int getCategoryId() 
    {
        return categoryId;
    }

    public void setCategoryId(int categoryId) 
    {
        this.categoryId = categoryId;
    }

    public String getCategory() 
    {
        return category;
    }

    public void setCategory(String category) 
    {
        this.category = category;
    }

    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 67 * hash + this.categoryId;
        hash = 67 * hash + Objects.hashCode(this.category);
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
        final Category other = (Category) obj;
        if (this.categoryId != other.categoryId) 
        {
            return false;
        }
        if (!Objects.equals(this.category, other.category)) 
        {
            return false;
        }
        return true;
    }
    
    
}
