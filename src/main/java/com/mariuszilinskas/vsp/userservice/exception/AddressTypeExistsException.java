package com.mariuszilinskas.vsp.userservice.exception;

import com.mariuszilinskas.vsp.userservice.enums.AddressType;

public class AddressTypeExistsException extends RuntimeException {

    public AddressTypeExistsException(AddressType addressType) {
        super(String.format("The %s address is already associated with an account.", addressType));
    }

}
