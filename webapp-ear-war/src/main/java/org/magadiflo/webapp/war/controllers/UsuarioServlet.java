package org.magadiflo.webapp.war.controllers;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.magadiflo.webapp.ear.ejb.services.UsuarioServiceLocal;

import java.io.IOException;

@WebServlet({"/listar", "/"})
public class UsuarioServlet extends HttpServlet {

    @Inject
    private UsuarioServiceLocal service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("usuarios", this.service.listar());
        getServletContext().getRequestDispatcher("/listar.jsp").forward(req, resp);
    }
}
