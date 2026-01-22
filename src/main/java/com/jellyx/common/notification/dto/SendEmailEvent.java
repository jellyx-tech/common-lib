package com.jellyx.common.notification.dto;

import java.util.Map;

public record SendEmailEvent(
        String recipientEmail,
        NotificationType type,
        Map<String, String> params
) {}