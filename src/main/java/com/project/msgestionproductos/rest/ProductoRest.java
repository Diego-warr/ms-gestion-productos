package com.project.msgestionproductos.rest;

import com.project.msgestionproductos.dto.ProductoDTO;
import com.project.msgestionproductos.service.ProductoService;
import com.project.msgestionproductos.service.exception.ServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

import static com.project.msgestionproductos.rest.commons.Constants.API_PRODUCTOS;


@Slf4j
@RestController
@RequestMapping(API_PRODUCTOS)
public class ProductoRest {


    private ProductoService productoService;


    @Autowired
    public ProductoRest(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public ResponseEntity<?> findLike(@RequestParam(name = "nombre", defaultValue = "") String nombre){
        try {
            return ResponseEntity.ok(productoService.findLike(null));
        } catch (ServiceException e) {
            log.error(e.getMessage(),e);
            return ResponseEntity.internalServerError().build();
        }
    };


    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathParam("id") Long id){

        return null;
    };

    @PostMapping
    public ResponseEntity<?> add(@RequestBody @Validated ProductoDTO productoDTO){

        return null;
    };

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathParam("id") Long id, @RequestBody @Validated ProductoDTO productoDTO){

        return null;
    };

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathParam("id") Long id){

        return null;
    };


}
