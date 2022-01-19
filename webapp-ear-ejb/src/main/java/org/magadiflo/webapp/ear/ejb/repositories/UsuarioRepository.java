package org.magadiflo.webapp.ear.ejb.repositories;

import org.magadiflo.webapp.ear.ejb.entities.Usuario;

import java.util.List;

public interface UsuarioRepository {

    List<Usuario> listar();

}
