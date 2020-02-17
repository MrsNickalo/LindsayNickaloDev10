package mrsnickalo.capstone.controllers;

import java.time.Year;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import mrsnickalo.capstone.entity.Instrument;
import mrsnickalo.capstone.entity.Song;
import mrsnickalo.capstone.entity.Tempo;
import mrsnickalo.capstone.entity.User;
import mrsnickalo.capstone.service.LilyPadService;
import mrsnickalo.capstone.service.PrivateServiceLayerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Lindsay Gen10
 * @date Feb 5, 2020
 * Controller for when user is signed in
 */

@Controller
public class PrivateController 
{
    @Autowired
    PrivateServiceLayerImpl service;
    
    @Autowired
    LilyPadService lilypad;
    
    @GetMapping("/addsong")
    public String displayAddSong()
    {
        
        return "addsong";
    }
    
    @PostMapping("/addsong")
    public String addSong(HttpServletRequest request, String title, String artist, String year, String soprano, String alto, String tenor, String bass)
    {
        String username = request.getUserPrincipal().getName();
        User user = new User();
        user.setUsername(username);
        Song song = new Song();
        song.setTitle(title + " " + username);
        song.setArtist(artist);
        if(!year.isEmpty())
        {
            song.setYear(Integer.parseInt(year));
        }
        else
        {
            song.setYear(Year.now().getValue());
        }
        song.setSoprano(soprano);
        song.setAlto(alto);
        song.setTenor(tenor);
        song.setBass(bass);
        song.setBpm(120);
        service.addSong(song, user);
        lilypad.createLilypad(song);
        return "redirect:/personallibrary?id=" + username;
    }
    
    @GetMapping("/personallibrary")
    public String displayPersonalLibrary(Model model, HttpServletRequest request)
    {
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = request.getUserPrincipal().getName();
        User user = new User();
        user.setUsername(username);
        List<Song> songs = service.findAllSongsUser(user);
        model.addAttribute("songs", songs);
        return "personallibrary";
    }
    
    @GetMapping("/updatesong")
    public String displayUpdateSong(Model model, int id)
    {
        Song song = service.findByIdSong(id);
        model.addAttribute("song", song);
        return "updatesong";
    }
    
    @PostMapping("/updatesong")
    public String updateSong(HttpServletRequest request, int id, String title, String artist, String year, String soprano, String alto, String tenor, String bass)
    {
        String username = request.getUserPrincipal().getName();
        Song song = service.findByIdSong(id);
        song.setSongId(id);
        if(title != null)
        {
            if(title.contains(username))
            {
                song.setTitle(title);
            }
            else
            {
                song.setTitle(title + " " + username);
            }
        }
        if(artist != null)
        {
            song.setArtist(artist);
        }
        if(year != null)
        {
            song.setYear(Integer.parseInt(year));
        }
        if(soprano != null)
        {
            song.setSoprano(soprano);
        }
        if(alto != null)
        {
            song.setAlto(alto);
        }
        if(tenor != null)
        {
            song.setTenor(tenor);
        }
        if(bass != null)
        {
            song.setBass(bass);
        }
        service.updateSong(song);
        lilypad.createLilypad(song);
        return "redirect:/personallibrary?id=";
    }
    
    @GetMapping("/deletesong")
    public String deleteSong(HttpServletRequest request, int id)
    {
        service.deleteSong(id);
        String username = request.getUserPrincipal().getName();
        User user = new User();
        user.setUsername(username);
        return "redirect:/personallibrary?id=" + username;
    }
    
    @GetMapping("/playsongP")
    public String displaySong(Model model, int id)
    {
        Song song = service.findByIdSong(id);
        List<Tempo> tempos = service.findAllTempos();
        List<Instrument> instruments = service.findAllInstruments();
        model.addAttribute("song", song);
        model.addAttribute("tempos", tempos);
        model.addAttribute("instruments", instruments);
        return "playsongP";
    }
    
    @GetMapping("/playsopranoP")
    public String playSoprano(int id, @RequestBody String tempo, @RequestBody String instrument)
    {
        Song song = service.findByIdSong(id);
        Tempo t = service.findByIdTempo(tempo);
        song.setBpm(t.getBpm());
        Instrument i = service.findByIdInstrument(Integer.parseInt(instrument));
        service.playSong(song, "soprano", i);
        return "redirect:/playsongP?id=" + song.getSongId();
    }
    
    @GetMapping("/playaltoP")
    public String playAlto(int id, @RequestBody String tempo, @RequestBody String instrument)
    {
        Song song = service.findByIdSong(id);
        Tempo t = service.findByIdTempo(tempo);
        song.setBpm(t.getBpm());
        Instrument i = service.findByIdInstrument(Integer.parseInt(instrument));
        service.playSong(song, "alto", i);
        return "redirect:/playsongP?id=" + song.getSongId();
    }
    
    @GetMapping("/playtenorP")
    public String playTenor(int id, @RequestBody String tempo, @RequestBody String instrument)
    {
        Song song = service.findByIdSong(id);
        Tempo t = service.findByIdTempo(tempo);
        song.setBpm(t.getBpm());
        Instrument i = service.findByIdInstrument(Integer.parseInt(instrument));
        service.playSong(song, "tenor", i);
        return "redirect:/playsongP?id=" + song.getSongId();
    }
    
    @GetMapping("/playbassP")
    public String playBass(int id, @RequestBody String tempo, @RequestBody String instrument)
    {
        Song song = service.findByIdSong(id);
        Tempo t = service.findByIdTempo(tempo);
        song.setBpm(t.getBpm());
        Instrument i = service.findByIdInstrument(Integer.parseInt(instrument));
        service.playSong(song, "bass", i);
        return "redirect:/playsongP?id=" + song.getSongId();
    }
    
    @GetMapping("/playallP")
    public String playSong(int id, @RequestBody String tempo, @RequestBody String instrument)
    {
        Song song = service.findByIdSong(id);
        Tempo t = service.findByIdTempo(tempo);
        song.setBpm(t.getBpm());
        Instrument i = service.findByIdInstrument(Integer.parseInt(instrument));
        service.playSong(song, "all", i);
        return "redirect:/playsongP?id=" + song.getSongId();
    }
    
    @GetMapping("/addsonginstructions")
    public String addSongInstructions()
    {
        
        return "addsonginstructions";
    }
    
//        
//    @GetMapping("/addsoprano")
//    public String displayAddSoprano()
//    {
//        
//        return "addsoprano";
//    }
//    
//    @PostMapping("/addsoprano")
//    public String addSoprano(Model model, String soprano)
//    {
//        model.addAttribute("soprano", soprano);
//        return "redirect:/addsong";
//    }
//    
//    @GetMapping("/addalto")
//    public String displayAddAlto()
//    {
//        
//        return "addalto";
//    }
//    
//    @PostMapping("/addalto")
//    public String addAlto(Model model, String alto)
//    {
//        model.addAttribute("soprano", alto);
//        return "redirect:/addsong";
//    }
//    
//    @GetMapping("/addtenor")
//    public String displayAddTenor()
//    {
//        
//        return "addtenor";
//    }
//    
//    @PostMapping("/addtenor")
//    public String addTenor(Model model, String tenor)
//    {
//        model.addAttribute("soprano", tenor);
//        return "redirect:/addsong";
//    }
//    
//    @GetMapping("/addbass")
//    public String displayAddBass()
//    {
//        
//        return "addbass";
//    }
//    
//    @PostMapping("/addbass")
//    public String addBass(Model model, String bass)
//    {
//        model.addAttribute("soprano", bass);
//        return "redirect:/addsong";
//    }
}