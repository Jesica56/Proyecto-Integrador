
package com.portafolio.mgb.seguridad.Reposi.Service;

import com.portafolio.mgb.seguridad.entity.Usuario;
import com.portafolio.mgb.seguridad.entity.UsuarioPrin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author jesica
 */
@Service
public class UserDeatailsImpl implements UserDetailsService{

    @Autowired
    UsuarioServ usuarioServ;
    
    
        
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
     Usuario usuario =  usuarioServ.getByNombreUsuario(username).get();
     return UsuarioPrin.build(usuario);
    }
    
}
