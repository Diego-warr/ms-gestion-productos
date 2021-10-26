package com.project.msgestionproductos.service.impl;

import com.fasterxml.jackson.databind.json.JsonMapper;
import com.project.msgestionproductos.dto.ProductoDTO;
import com.project.msgestionproductos.entity.ProductoEntity;
import com.project.msgestionproductos.repository.ProductoRepository;
import com.project.msgestionproductos.service.ProductoService;
import com.project.msgestionproductos.service.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductoServiceImpl implements ProductoService {

    private JsonMapper jsonMapper;

    private ProductoRepository productoRepository;

    @Autowired
    public ProductoServiceImpl(JsonMapper jsonMapper, ProductoRepository productoRepository) {
        this.jsonMapper = jsonMapper;
        this.productoRepository = productoRepository;
    }

    @Override
    public List<ProductoDTO> findLike(ProductoDTO productoDTO) throws ServiceException {
        try {
            return this.productoRepository.getAllActivos().stream().map(e -> this.getProductoDTO(e))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public Optional<ProductoDTO> findById(ProductoDTO productoDTO) throws ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ProductoDTO save(ProductoDTO productoDTO) throws ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    // Mappers

    private ProductoDTO getProductoDTO(ProductoEntity productoEntity) {
        return jsonMapper.convertValue(productoEntity, ProductoDTO.class);
    }
}
