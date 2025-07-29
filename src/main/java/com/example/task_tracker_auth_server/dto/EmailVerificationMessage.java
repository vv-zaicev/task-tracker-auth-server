package com.example.task_tracker_auth_server.dto;

public record EmailVerificationMessage (String email, String username, String code, int expirationTimeMinutes){
}
