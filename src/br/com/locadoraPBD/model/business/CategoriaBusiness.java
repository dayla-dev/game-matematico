/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadoraPBD.model.business;

import br.com.locadoraPBD.JPAUtil.Conexao;
import br.com.locadoraPBD.model.DAO.CategoriaDAO;
import br.com.locadoraPBD.model.DAO.IcoreCategoriaDAO;
import br.com.locadoraPBD.model.DAO.exceptions.NonexistentEntityException;
import br.com.locadoraPBD.model.beans.Categoria;
import java.util.List;

/**
 *
 * @author Dayla
 */
public class CategoriaBusiness implements IcoreCategoriaBusiness{
    
    IcoreCategoriaDAO categoriaDAO;
    
    public CategoriaBusiness(){
        categoriaDAO = new CategoriaDAO(Conexao.conexao());
    }

    @Override
    public void Salvar(Categoria categoria) {

        categoriaDAO.Salvar(categoria);
    }

    @Override
    public void Editar(Categoria categoria) throws NonexistentEntityException, Exception {

        categoriaDAO.Editar(categoria);
    }

    @Override
    public void Remover(Categoria categoria) throws NonexistentEntityException {

        categoriaDAO.Remover(categoria.getId());
    }

    @Override
    public List<Categoria> getCategoriaPorNomeCat(String nomeCategoria) {

        return categoriaDAO.getCategoriaPorNomeCat(nomeCategoria);
    }

    @Override
    public List<Categoria> getCategoriaPorTipo(String tipoCategoria) {

        return categoriaDAO.getCategoriaPorTipo(tipoCategoria);
    }

    @Override
    public Categoria getPessoaCategoriaPorId(Long id) {

        return categoriaDAO.getPessoaCategoriaPorId(id);
    }   

    @Override
    public List<Categoria> getTodasCategorias() {

        return categoriaDAO.getTodasCategorias();
    }
    
}
