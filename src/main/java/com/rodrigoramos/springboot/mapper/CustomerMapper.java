package com.rodrigoramos.springboot.mapper;

import com.rodrigoramos.springboot.dto.CustomerDTO;
import com.rodrigoramos.springboot.model.Customer;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CustomerMapper {

    private final ModelMapper modelMapper;

    public Customer toModel(CustomerDTO customerDTO) {
        return modelMapper.map(customerDTO, Customer.class);
    }
}