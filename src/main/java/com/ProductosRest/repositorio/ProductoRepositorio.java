package com.ProductosRest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProductosRest.modelo.Producto;

public interface ProductoRepositorio extends JpaRepository<Producto, Integer> {

}
