package com.portafolio.mgb.Controler;

import com.portafolio.mgb.Entidad.Persona;
import com.portafolio.mgb.Interfaz.IntPersonaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jesica
 */
@RestController
@CrossOrigin(origins="http://localhost:4200")


public class PersonaControl {

    @Autowired
    IntPersonaServicio intpersonaservicio;
    //metodos a utilizar

    @GetMapping("persona/traer")
    public List<Persona> getPersona() {
        return intpersonaservicio.getPersona();
    }
    
    @PostMapping("/persona/crear")
    public String crearPersona(@RequestBody Persona persona){
        intpersonaservicio.guardarPersona(persona);
        return "Persona encontrada correctamente";
    }
    
    @DeleteMapping("/persona/borrar/{id}")
    public String eliminarPersona(@PathVariable Long id){
        intpersonaservicio.eliminarPersona(id);
        return "La persona fue eliminada correctamente";
    }
    
    @PutMapping("/persona/editar/{id}")
    public Persona editarPersona(@PathVariable Long id, 
                                 @RequestParam("Nombre") String nuevoNombre,
                                 @RequestParam("Apellido") String nuevoApellido,
                                 @RequestParam("img") String nuevoImg){
      Persona persona =  intpersonaservicio.buscarPersona(id);
      
      persona.setNombre(nuevoNombre);
      persona.setApellido(nuevoApellido);
      persona.setImg(nuevoImg);
      
      intpersonaservicio.guardarPersona(persona);
      return persona;
    }
    
    @GetMapping("/persona/traer/perfil")
    public Persona buscarPersona(){
        return intpersonaservicio.buscarPersona(Long.MIN_VALUE);
    }
   

}
