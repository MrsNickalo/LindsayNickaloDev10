package mrsnickalo.capstone.entity;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.LocalDate;
import java.util.Objects;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Lindsay Gen10
 * @date Feb 5, 2020
 */

public class Song 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int songId;
    
    @NotBlank(message = "Please enter a title.")
    @Size(max = 250, message = "Song title too long!")
    String title;
    
    @NotBlank(message = "Please enter an artist.")
    @Size(max = 250, message = "Song artist too long!")
    String artist;
    
    @Min(1000)
    @Max(2020) //will modify to be whatever current year is later
    int year;
    
    @MusicStringConstraint(message = "Invalid JFugue Music String for soprano!")
    String soprano;
    
    @MusicStringConstraint(message = "Invalid JFugue Music String for alto!")
    String alto;
    
    @MusicStringConstraint(message = "Invalid JFugue Music String for tenor!")
    String tenor;
    
    @MusicStringConstraint(message = "Invalid JFugue Music String for bass!")
    String bass;
    
    int bpm;
    
    User user;

    public int getSongId() 
    {
        return songId;
    }

    public void setSongId(int songId) 
    {
        this.songId = songId;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getArtist() 
    {
        return artist;
    }

    public void setArtist(String artist) 
    {
        this.artist = artist;
    }

    public int getYear() 
    {
        return year;
    }

    public void setYear(int year) 
    {
        this.year = year;
    }

    public String getSoprano() 
    {
        if(soprano != null)
        {
            return soprano;
        }
        else
        {
            return null;
        }
    }

    public void setSoprano(String soprano) 
    {
        this.soprano = soprano;
    }

    public String getAlto() 
    {
        if(alto != null)
        {
            return alto;
        }
        else
        {
            return null;
        }
    }

    public void setAlto(String alto) 
    {
        this.alto = alto;
    }

    public String getTenor() 
    {
        if(tenor != null)
        {
            return tenor;
        }
        else
        {
            return null;
        }
    }

    public void setTenor(String tenor) 
    {
        this.tenor = tenor;
    }

    public String getBass() 
    {
        if(bass != null)
        {
            return bass;
        }
        else
        {
            return null;
        }
    }

    public void setBass(String bass) 
    {
        this.bass = bass;
    }

    public int getBpm() 
    {
        return bpm;
    }

    public void setBpm(int bpm) 
    {
        this.bpm = bpm;
    }

    public User getUser() 
    {
        return user;
    }

    public void setUser(User user) 
    {
        this.user = user;
    }

    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 79 * hash + this.songId;
        hash = 79 * hash + Objects.hashCode(this.title);
        hash = 79 * hash + Objects.hashCode(this.artist);
        hash = 79 * hash + this.year;
        hash = 79 * hash + Objects.hashCode(this.soprano);
        hash = 79 * hash + Objects.hashCode(this.alto);
        hash = 79 * hash + Objects.hashCode(this.tenor);
        hash = 79 * hash + Objects.hashCode(this.bass);
        hash = 79 * hash + this.bpm;
        hash = 79 * hash + Objects.hashCode(this.user);
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
        final Song other = (Song) obj;
        if (this.songId != other.songId) 
        {
            return false;
        }
        if (this.year != other.year) 
        {
            return false;
        }
        if (this.bpm != other.bpm) 
        {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) 
        {
            return false;
        }
        if (!Objects.equals(this.artist, other.artist)) 
        {
            return false;
        }
        if (!Objects.equals(this.soprano.replaceAll("[\\n\\t]", ""), other.soprano.replaceAll("[\\n\\t]", ""))) 
        {
            return false;
        }
        if (!Objects.equals(this.alto.replaceAll("[\\n\\t]", ""), other.alto.replaceAll("[\\n\\t]", ""))) 
        {
            return false;
        }
        if (!Objects.equals(this.tenor.replaceAll("[\\n\\t]", ""), other.tenor.replaceAll("[\\n\\t]", ""))) 
        {
            return false;
        }
        if (!Objects.equals(this.bass.replaceAll("[\\n\\t]", ""), other.bass.replaceAll("[\\n\\t]", ""))) 
        {
            return false;
        }
        if (!Objects.equals(this.user, other.user)) 
        {
            return false;
        }
        return true;
    }
    
    @Documented
    @Constraint(validatedBy = MusicStringValidator.class)
    //@Target( { ElementType.METHOD, ElementType.FIELD })
    @Target(ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MusicStringConstraint 
    {
        String message() default "Please enter valid JFugue Music Strings!";
        Class<?>[] groups() default {};
        Class<? extends Payload>[] payload() default {};
    }
    
    static public class MusicStringValidator implements ConstraintValidator<MusicStringConstraint, String> 
    {
        @Override
        public void initialize(MusicStringConstraint musicString) 
        {

        }
 
        @Override
        public boolean isValid(String musicString, ConstraintValidatorContext cxt) 
        {
            musicString = musicString.replaceAll("[ABCDEFG#b0123456789.qhwisR|]", "").trim();
            return musicString.length()< 1;
        }
    }
    
}
