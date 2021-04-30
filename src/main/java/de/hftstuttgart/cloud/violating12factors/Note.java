package de.hftstuttgart.cloud.violating12factors;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Note {
    @Id
    Integer id;
    String author;
    String content;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    
}
