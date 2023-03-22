
package com.portafolio.mgb.seguridad.Reposi;

import com.portafolio.mgb.seguridad.Enum.RolNombre;
import com.portafolio.mgb.seguridad.entity.Rol;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jesica
 */
@Repository
public interface RolReposit extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
}
