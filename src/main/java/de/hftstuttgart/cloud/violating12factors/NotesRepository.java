package de.hftstuttgart.cloud.violating12factors;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface NotesRepository extends CrudRepository<Note, Integer> {
    Optional<Note> findById(Integer id);
}
