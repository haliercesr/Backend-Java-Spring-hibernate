//en la carpeta repositories son componentes que van a interactuar con la capa de persistencia permitiendonos la escritura, lectura y eliminacion en una base de datos
package com.cesarhalier.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesarhalier.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
