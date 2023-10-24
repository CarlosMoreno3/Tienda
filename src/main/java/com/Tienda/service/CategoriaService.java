
package com.Tienda.service;

import com.Tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    
    //Retorna una lista de categorias (activas o todas)
    public List<Categoria> getCategorias(boolean activos);
    
    //Retorna una Categoria por ID
    public Categoria getCategoria(Categoria categoria);
    
    //Se inserta un nuevo registro si el ID de la categoria esta vacio
    //Se actualiza el registro si el ID de la categoria NO esta vacio
    public void save(Categoria categoria);
    
    public void delete(Categoria categoria);
    
}
