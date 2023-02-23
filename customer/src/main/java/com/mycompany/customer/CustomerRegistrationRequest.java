package com.mycompany.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
