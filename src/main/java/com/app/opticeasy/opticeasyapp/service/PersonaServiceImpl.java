package com.app.opticeasy.opticeasyapp.service;

import com.app.opticeasy.opticeasyapp.models.Persona;
import com.app.opticeasy.opticeasyapp.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> buscarPersonas() {
        return (List<Persona>) personaRepository.findAll();
    }

    @Override
    public Persona guardarPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Optional<Persona> buscarPersonaPorId(Long id) {
        return personaRepository.findById(id);
    }

    @Override
    public void eliminarPersonaPorId(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona actualizarPersona(Long id,Persona persona) {
        return null;
    }
}
