package com.example.demo.repo;

import com.example.demo.models.Chitateli;
import com.example.demo.models.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReaderRepository extends CrudRepository<Chitateli, Long> {
    List<Chitateli> findByFam(String fam);
}
