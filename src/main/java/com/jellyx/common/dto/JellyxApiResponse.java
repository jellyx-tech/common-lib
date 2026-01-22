package com.jellyx.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JellyxApiResponse {
    private boolean success;
    private String message;

    public static JellyxApiResponse success(String message) {
        return JellyxApiResponse.builder()
                .success(true)
                .message(message)
                .build();
    }

    public static JellyxApiResponse error(String message) {
        return JellyxApiResponse.builder()
                .success(false)
                .message(message)
                .build();
    }
}
