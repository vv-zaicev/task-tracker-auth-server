package com.example.task_tracker_auth_server.dto;

public record UserSignUpRequest(String username, String email, String password) {
}
