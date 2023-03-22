package com.portafolio.mgb.Repo;

import com.portafolio.mgb.Entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

/**
 *
 * @author jesica
 */

public interface IntPersonaRep extends JpaRepository<Persona,Long>{
    
    
}
