package com.jellyx.common.domain.billing.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TokenValidationResponseDTO {

    private String status;

    private String message;

    private Long tokensUsed;

    private UUID transactionId;
}