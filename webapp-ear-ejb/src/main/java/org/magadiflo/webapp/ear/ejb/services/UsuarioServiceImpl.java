package org.magadiflo.webapp.ear.ejb.services;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import org.magadiflo.webapp.ear.ejb.entities.Usuario;
import org.magadiflo.webapp.ear.ejb.repositories.UsuarioRepository;

import java.util.List;

@Stateless
public class UsuarioServiceImpl implements UsuarioServiceLocal {

    @Inject
    private UsuarioRepository repository;

    @Override
    public List<Usuario> listar() {
        return repository.listar();
    }

}
