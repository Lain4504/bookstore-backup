package com.kas.online_book_shop.dto;

public record ResetPasswordRequest(
        String token,
        String password) {
}
