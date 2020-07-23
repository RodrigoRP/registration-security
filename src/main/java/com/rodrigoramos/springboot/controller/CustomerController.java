package com.rodrigoramos.springboot.controller;

import com.rodrigoramos.springboot.dto.CustomerDTO;
import com.rodrigoramos.springboot.model.Customer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Api(tags = "Customer API")
public interface CustomerController {
    @ApiOperation("Add new data")
    public Customer save(@RequestBody CustomerDTO customer);

    @ApiOperation("Find by Id")
    public Customer findById(@PathVariable("id") Long id);

    @ApiOperation("Delete based on primary key")
    public void delete(@PathVariable("id") Long id);

    @ApiOperation("Find all data")
    public List<Customer> list();

/*    @ApiOperation("Pagination request")
    public Page<Customer> pageQuery(Pageable pageable);*/

    @ApiOperation("Update one data")
    public Customer update(@RequestBody CustomerDTO dto, @PathVariable("id") Long id);
}