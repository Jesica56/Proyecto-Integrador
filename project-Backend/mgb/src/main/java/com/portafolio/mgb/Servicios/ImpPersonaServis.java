/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.mgb.Servicios;

import com.portafolio.mgb.Entidad.Persona;
import com.portafolio.mgb.Interfaz.IntPersonaServicio;
import com.portafolio.mgb.Repo.IntPersonaRep;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jesica
 */

@Service
public class ImpPersonaServis implements IntPersonaServicio{
              //tipo y nombre de variables
    @Autowired IntPersonaRep intpersonarep;
    
    
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = intpersonarep.findAll();
        return persona;
              
    }

    @Override
    public void guardarPersona(Persona persona) {
        intpersonarep.save(persona);
    }

    @Override
    public void eliminarPersona(Long id) {
      intpersonarep.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
      Persona persona = intpersonarep.findById(id).orElse(null);
      return persona;
    }
    
}
