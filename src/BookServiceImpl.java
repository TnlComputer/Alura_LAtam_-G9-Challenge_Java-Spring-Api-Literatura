package com.alura.literatura.literatura;

import com.alura.literatura.literatura.model.Book;
import com.alura.literatura.literatura.repository.BookRepository;
import com.alura.literatura.literatura.service.BookService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository repository;
    private final RestTemplate restTemplate = new RestTemplate();

    public BookServiceImpl(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Book> getAll() { return repository.findAll(); }

    @Override
    public Book getById(Long id) { return repository.findById(id); }

    @Override
    public Book fetchFromGutenbergAPI(Long id) {
//        String url = URL_BASE + id + "/";
        Book book = restTemplate.getForObject(URL_BASE + Book.class);
        if (book != null) {
            repository.save(book);
        }
        return book;
    }
}