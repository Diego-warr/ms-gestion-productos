package com.project.msgestionproductos.repository;

import com.project.msgestionproductos.entity.ProductoEntity;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<ProductoEntity, Long> {

    @Query("select p from ProductoEntity p where p.estado='1'")
    List<ProductoEntity> getAllActivos();
}
