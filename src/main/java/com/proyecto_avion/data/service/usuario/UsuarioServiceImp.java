package com.proyecto_avion.data.service.usuario;

import com.proyecto_avion.data.entities.Usuario;
import com.proyecto_avion.data.persistencia.dao.IUsuarioDao;
import com.proyecto_avion.data.service.usuario.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImp implements IUsuarioService {

    @Autowired
    private IUsuarioDao usuarioDao;

    @Override
    public List<Usuario> findAll() {
        return (List<Usuario>) usuarioDao.findAll();
    }
}