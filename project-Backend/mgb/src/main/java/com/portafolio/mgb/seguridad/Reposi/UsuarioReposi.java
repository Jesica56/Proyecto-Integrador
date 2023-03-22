
package com.portafolio.mgb.seguridad.Reposi;

import com.portafolio.mgb.seguridad.entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jesica
 */
@Repository
public interface UsuarioReposi extends JpaRepository<Usuario, Integer>{
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);
    
    boolean existsByNombreUsuario(String nombreUsuario);
    boolean existsByEmail(String email);
}
