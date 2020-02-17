package mrsnickalo.capstone.entity;

import java.util.Objects;
import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Lindsay Gen10
 * @date Feb 5, 2020
 */

public class Tempo 
{
    @Id
    String tempoId;
    
    @NotNull
    int bpm;

    public String getTempoId() 
    {
        return tempoId;
    }

    public void setTempoId(String tempoId) 
    {
        this.tempoId = tempoId;
    }

    public int getBpm() 
    {
        return bpm;
    }

    public void setBpm(int bpm) 
    {
        this.bpm = bpm;
    }

    @Override
    public int hashCode() 
    {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.tempoId);
        hash = 67 * hash + this.bpm;
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
        final Tempo other = (Tempo) obj;
        if (this.bpm != other.bpm) 
        {
            return false;
        }
        if (!Objects.equals(this.tempoId, other.tempoId)) 
        {
            return false;
        }
        return true;
    }
    
    
}
