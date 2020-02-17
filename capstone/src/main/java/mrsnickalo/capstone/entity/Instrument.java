package mrsnickalo.capstone.entity;

import java.util.Objects;
import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Lindsay Gen10
 * @date Feb 5, 2020
 */

public class Instrument 
{
    @Id
    int instrumentId;
    
    @NotNull
    String instrumentName;
    
    int categoryId;

    public int getInstrumentId() 
    {
        return instrumentId;
    }

    public void setInstrumentId(int instrumentId) 
    {
        this.instrumentId = instrumentId;
    }

    public String getInstrumentName() 
    {
        return instrumentName;
    }

    public void setInstrumentName(String instrumentName) 
    {
        this.instrumentName = instrumentName;
    }

    public int getCategoryId()
    {
        return categoryId;
    }
    
    public void setCategoryId(int categoryId)
    {
        this.categoryId = categoryId;
    }
    @Override
    public int hashCode() 
    {
        int hash = 5;
        hash = 53 * hash + this.instrumentId;
        hash = 53 * hash + Objects.hashCode(this.instrumentName);
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
        final Instrument other = (Instrument) obj;
        if (this.instrumentId != other.instrumentId) 
        {
            return false;
        }
        if (!Objects.equals(this.instrumentName, other.instrumentName)) 
        {
            return false;
        }
        return true;
    }
    
    
}
