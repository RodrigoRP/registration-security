package com.rodrigoramos.springboot.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Builder
@Getter
@Setter
public class CustomerDTO extends AbstractDTO<Long> {

    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String cpf;

}