package mrsnickalo.capstone.controllers;

import java.util.List;
import javax.annotation.PostConstruct;
import mrsnickalo.capstone.dao.CategoryDao;
import mrsnickalo.capstone.dao.LilyPad;
import mrsnickalo.capstone.entity.Instrument;
import mrsnickalo.capstone.entity.Song;
import mrsnickalo.capstone.entity.Tempo;
import mrsnickalo.capstone.service.LilyPadService;
import mrsnickalo.capstone.service.StandardServiceLayerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

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
    
    int counter = 0;
    
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
        if(counter == 0)
        {
//            List<Song> songs = service.findAllSongs();
//            for(Song song : songs)
//            {
//                lilypad.createLilyPad(song);
//            }
        }
        counter++;
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
        model.addAttribute("song", song);
        model.addAttribute("tempos", tempos);
        model.addAttribute("instruments", instruments);
        return "playsong";
    }
    
    @GetMapping("/playsoprano")
    public String playSoprano(int id, @RequestParam String tempo, @RequestParam String instrument)
    {
        Song song = service.findByIdSong(id);
        Tempo t = service.findByIdTempo(tempo);
        song.setBpm(t.getBpm());
        Instrument i = service.findByIdInstrument(Integer.parseInt(instrument));
        service.playSong(song, "soprano", i);
        return "redirect:/playsong?id=" + song.getSongId();
    }
    
    @GetMapping("/playalto")
    public String playAlto(int id, @RequestParam String tempo, @RequestParam String instrument)
    {
        Song song = service.findByIdSong(id);
        Tempo t = service.findByIdTempo(tempo);
        song.setBpm(t.getBpm());
        Instrument i = service.findByIdInstrument(Integer.parseInt(instrument));
        service.playSong(song, "alto", i);
        return "redirect:/playsong?id=" + song.getSongId();
    }
    
    @GetMapping("/playtenor")
    public String playTenor(int id, @RequestParam String tempo, @RequestParam String instrument)
    {
        Song song = service.findByIdSong(id);
        Tempo t = service.findByIdTempo(tempo);
        song.setBpm(t.getBpm());
        Instrument i = service.findByIdInstrument(Integer.parseInt(instrument));
        service.playSong(song, "tenor", i);
        return "redirect:/playsong?id=" + song.getSongId();
    }
    
    @GetMapping("/playbass")
    public String playBass(int id, @RequestParam String tempo, @RequestParam String instrument)
    {
        Song song = service.findByIdSong(id);
        Tempo t = service.findByIdTempo(tempo);
        song.setBpm(t.getBpm());
        Instrument i = service.findByIdInstrument(Integer.parseInt(instrument));
        service.playSong(song, "bass", i);
        return "redirect:/playsong?id=" + song.getSongId();
    }
    
    @GetMapping("/playall")
    public String playSong(Integer id, @RequestParam String tempo, @RequestParam Integer instrument)
    {
        Song song = service.findByIdSong(id);
        Tempo t = service.findByIdTempo(tempo);
        song.setBpm(t.getBpm());
        Instrument i = service.findByIdInstrument(instrument);
        service.playSong(song, "all", i);
        return "redirect:/playsong?id=" + song.getSongId();
    }
}
