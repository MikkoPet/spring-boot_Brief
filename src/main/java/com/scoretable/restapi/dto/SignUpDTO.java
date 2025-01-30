package com.scoretable.restapi.dto;

import com.scoretable.restapi.UserRole;

public record SignUpDTO (String username, String password, UserRole role) {

}
