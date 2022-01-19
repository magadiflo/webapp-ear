package org.magadiflo.webapp.ear.ejb.services;

import jakarta.ejb.Local;
import org.magadiflo.webapp.ear.ejb.entities.Usuario;

import java.util.List;

@Local
public interface UsuarioServiceLocal {

    List<Usuario> listar();

}
