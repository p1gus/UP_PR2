package com.example.demo.repo;
import com.example.demo.models.Jornalists;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface JornalRepository extends CrudRepository<Jornalists, Long> {
    List<Jornalists> findByFam(String fam);
    List<Jornalists> findByFamContains(String fam);
}
