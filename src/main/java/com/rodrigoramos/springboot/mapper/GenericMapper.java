package com.rodrigoramos.springboot.mapper;

public interface GenericMapper<E, D> {

    E toModel(D dto);

/*    D asDTO(E entity);

    List<E> asEntityList(List<D> dtoList);

    List<D> asDTOList(List<E> entityList);*/

}