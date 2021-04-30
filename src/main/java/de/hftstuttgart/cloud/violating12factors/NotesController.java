package de.hftstuttgart.cloud.violating12factors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotesController {

    NotesRepository repository;
    
    @Autowired
    public NotesController(NotesRepository repository) {
        this.repository = repository;
    }


    @GetMapping("/info")
    public String getInfo() {
        return "Hallo Welt!";
    }

    @GetMapping("/notes")
    public Iterable<Note> getNotes() {
        return repository.findAll();
    }

    @PostMapping("/notes")
    public Note createNote(@RequestBody Note note) {
        repository.save(note);
        return note;
    }
        
}
