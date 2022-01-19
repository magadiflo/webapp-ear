package org.magadiflo.webapp.ear.ejb.repositories;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.magadiflo.webapp.ear.ejb.entities.Usuario;

import java.util.List;

@RequestScoped
public class UsuarioRepositoryImpl implements UsuarioRepository {

    @Inject
    private EntityManager em;

    @Override
    public List<Usuario> listar() {
        return this.em.createQuery("SELECT u FROM Usuario AS u", Usuario.class).getResultList();
    }

}
