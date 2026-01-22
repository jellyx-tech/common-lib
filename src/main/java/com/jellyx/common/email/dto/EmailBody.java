package com.jellyx.common.email.dto;

public record EmailBody(String subject, String text, EmailBodyType type) {
}
