
package com.portafolio.mgb.seguridad.Reposi.Service;

import com.portafolio.mgb.seguridad.Enum.RolNombre;
import com.portafolio.mgb.seguridad.Reposi.RolReposit;
import com.portafolio.mgb.seguridad.entity.Rol;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jesica
 */
@Service
@Transactional
public class RolService {
    @Autowired
    RolReposit rolReposit;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolReposit.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        rolReposit.save(rol);
    }
}
