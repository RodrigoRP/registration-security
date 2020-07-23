package com.rodrigoramos.springboot.controller.impl;

import com.rodrigoramos.springboot.controller.CustomerController;
import com.rodrigoramos.springboot.dto.CustomerDTO;
import com.rodrigoramos.springboot.mapper.CustomerMapper;
import com.rodrigoramos.springboot.model.Customer;
import com.rodrigoramos.springboot.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/customer")
@RestController
public class CustomerControllerImpl implements CustomerController {

    private final CustomerService customerService;
    private final CustomerMapper customerMapper;


    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer save(@RequestBody CustomerDTO customerDTO) {
        Customer customer = customerMapper.toModel(customerDTO);
        return customerService.save(customer);
    }

    @Override
    @GetMapping("/{id}")
    public Customer findById(@PathVariable("id") Long id) {
        return customerService.findById(id).orElse(null);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        customerService.deleteById(id);
    }

    @Override
    @GetMapping
    public List<Customer> list() {
        return customerService.findAll();
    }

  /*  @Override
    @GetMapping("/page-query")
    public Page<Customer> pageQuery(Pageable pageable) {
        Page<Customer> customerPage = customerService.findAll(pageable);

        return new PageImpl<>(customerPage, pageable, customerPage.getTotalElements());
    }*/

    @Override
    @PutMapping("/{id}")
    public Customer update(@RequestBody CustomerDTO customerDTO, @PathVariable("id") Long id) {
        return customerMapper.toModel(customerDTO);
    }
}