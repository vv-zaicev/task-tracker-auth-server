package com.example.task_tracker_auth_server.dto;

public record VerifyUserRequest(String email, String code) {
}
