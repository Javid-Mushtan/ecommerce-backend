package com.app.ecom.dto;

import com.app.ecom.model.UserRole;
import lombok.Data;

@Data
public class UserResponse {
    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private UserRole role;
    private AddressDTO address;
}
