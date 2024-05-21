package com.app.opticeasy.opticeasyapp.service;

import com.app.opticeasy.opticeasyapp.models.Persona;

import java.util.List;
import java.util.Optional;

public interface PersonaService {

    public List<Persona> buscarPersonas();

    public void guardarPersona(Persona persona);

    public Persona actualizarPersona(Long id, Persona persona);

    public Persona buscarPersonaPorId(Long id);

    public void  eliminarPersonaPorId(Long id);
}
