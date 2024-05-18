package com.app.opticeasy.opticeasyapp.repositories;

import com.app.opticeasy.opticeasyapp.models.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepository extends CrudRepository<Persona, Long> {

    //Aqui deben ir las consultas personalizadas
}
