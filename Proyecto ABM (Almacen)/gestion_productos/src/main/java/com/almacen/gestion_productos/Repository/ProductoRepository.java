package com.almacen.gestion_productos.Repository;

import com.almacen.gestion_productos.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long > {

}
