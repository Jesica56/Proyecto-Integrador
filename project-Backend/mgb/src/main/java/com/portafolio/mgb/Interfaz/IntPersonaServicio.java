
package com.portafolio.mgb.Interfaz;

import com.portafolio.mgb.Entidad.Persona;
import java.util.List;


/**
 *
 * @author jesica
 */
public interface IntPersonaServicio {
    //Metodos a utilizar
    
    public List<Persona> getPersona();
    
    //Guarda un objeto de tipo persona
    public void guardarPersona(Persona persona);
    
    //ELiminar un objeto se busca por Id
    public void eliminarPersona(Long id);
    
    //Buscar una persona
    public Persona buscarPersona(Long id);
    
}
