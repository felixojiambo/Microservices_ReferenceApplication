package com.ecom.customer.dtos;

import com.ecom.customer.models.Address;

public record CustomerResponse(
        String id,
        String firstname,
        String lastname,
        String email,
        Address address
) {

}