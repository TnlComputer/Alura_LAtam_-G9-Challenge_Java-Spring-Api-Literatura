package com.alura.literatura.controller;

import com.alura.literatura.model.BookEntity;
import com.alura.literatura.service.GutenbergService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class GutenbergController {

    private final GutenbergService service;

    // Buscar y guardar si es necesario
    @GetMapping("/{id}")
    public BookEntity getById(@PathVariable Integer id) {
        return service.getBookById(id);
    }

    @GetMapping("/search/title")
    public List<BookEntity> searchByTitle(@RequestParam String q) {
        return repository.findByTitleContainingIgnoreCase(q);
    }

    @GetMapping("/search/author")
    public List<BookEntity> searchByAuthor(@RequestParam String q) {
        return repository.findByAuthorsContainingIgnoreCase(q);
    }

    @GetMapping("/search/language")
    public List<BookEntity> searchByLanguage(@RequestParam String lang) {
        return repository.findByLanguagesContaining(lang);
    }

}
