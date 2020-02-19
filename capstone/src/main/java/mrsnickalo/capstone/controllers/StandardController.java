package mrsnickalo.capstone.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import mrsnickalo.capstone.entity.Category;
import mrsnickalo.capstone.entity.Instrument;
import mrsnickalo.capstone.entity.Song;
import mrsnickalo.capstone.entity.Tempo;
import mrsnickalo.capstone.service.LilyPadService;
import mrsnickalo.capstone.service.StandardServiceLayerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Lindsay Gen10
 * @date Feb 5, 2020
 * Controller for when user is not signed in
 */

@Controller
public class StandardController 
{
    @Autowired
    StandardServiceLayerImpl service;
    
    @Autowired
    LilyPadService lilypad;

    @PostConstruct
    public void fillLibrary()
    {
        List<Song> songs = service.findAllSongs();
        for(Song song : songs)
        {
            lilypad.createLilypad(song);
        }
    }
    
    @GetMapping({"/","/home"})
    public String displayHome(Model model)
    {
        
        return "home";
    }
    
    @GetMapping("/songlibrary")
    public String displaySongLibrary(Model model)
    {
        List<Song> songs = service.findAllSongs();
        model.addAttribute("songs", songs);
        return "songlibrary";
    }
    
    @GetMapping("/playsong")
    public String displaySong(Model model, int id)
    {
        Song song = service.findByIdSong(id);
        List<Tempo> tempos = service.findAllTempos();
        List<Instrument> instruments = service.findAllInstruments();
        List<Category> categories = service.findAllCategories();
        Map<Category, List<Instrument>> categoryMap = new HashMap<>();
        for(Category c : categories)
        {
            List<Instrument> list = new ArrayList<>();
            for(Instrument i : instruments)
            {
                if(i.getCategoryId() == c.getCategoryId())
                {
                    list.add(i);
                }
            }
            categoryMap.put(c, list);
        }
        model.addAttribute("song", song);
        model.addAttribute("tempos", tempos);
        model.addAttribute("instruments", categoryMap);
        return "playsong";
    }
    
    @GetMapping("/playsoprano")
    public String playSoprano(Integer id, String tempo, Integer instrument)
    {
        Song song = service.findByIdSong(id);
        Tempo t = service.findByIdTempo(tempo);
        song.setBpm(t.getBpm());
        Instrument i = service.findByIdInstrument(instrument);
        service.playSong(song, "soprano", i);
        return "redirect:/playsong?id=" + song.getSongId();
    }
    
    @GetMapping("/playalto")
    public String playAlto(Integer id, String tempo, Integer instrument)
    {
        Song song = service.findByIdSong(id);
        Tempo t = service.findByIdTempo(tempo);
        song.setBpm(t.getBpm());
        Instrument i = service.findByIdInstrument(instrument);
        service.playSong(song, "alto", i);
        return "redirect:/playsong?id=" + song.getSongId();
    }
    
    @GetMapping("/playtenor")
    public String playTenor(Integer id, String tempo, Integer instrument)
    {
        Song song = service.findByIdSong(id);
        Tempo t = service.findByIdTempo(tempo);
        song.setBpm(t.getBpm());
        Instrument i = service.findByIdInstrument(instrument);
        service.playSong(song, "tenor", i);
        return "redirect:/playsong?id=" + song.getSongId();
    }
    
    @GetMapping("/playbass")
    public String playBass(Integer id, String tempo, Integer instrument)
    {
        Song song = service.findByIdSong(id);
        Tempo t = service.findByIdTempo(tempo);
        song.setBpm(t.getBpm());
        Instrument i = service.findByIdInstrument(instrument);
        service.playSong(song, "bass", i);
        return "redirect:/playsong?id=" + song.getSongId();
    }
    
    @GetMapping("/playall")
    public String playSong(Integer id, String tempo, Integer instrument)
    {
        Song song = service.findByIdSong(id);
        Tempo t = service.findByIdTempo(tempo);
        song.setBpm(t.getBpm());
        Instrument i = service.findByIdInstrument(instrument);
        service.playSong(song, "all", i);
        return "redirect:/playsong?id=" + song.getSongId();
    }
}
