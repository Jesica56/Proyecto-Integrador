package com.portafolio.mgb.seguridad.Reposi.Service;

import com.portafolio.mgb.seguridad.Reposi.UsuarioReposi;
import com.portafolio.mgb.seguridad.entity.Usuario;
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
public class UsuarioServ {

    @Autowired
    UsuarioReposi usuarioReposi;

    public Optional<Usuario> getByNombreUsuario(String nombreUsuario) {
        return usuarioReposi.findByNombreUsuario(nombreUsuario);
    }

    public boolean existsByNombreUsuario(String nombreUsuario) {
        return usuarioReposi.existsByNombreUsuario(nombreUsuario);
    }

    public boolean existsByEmail(String emails) {
        return usuarioReposi.existsByEmail(emails);

    }

    public void save(Usuario usuario) {
        usuarioReposi.save(usuario);
    }
}
