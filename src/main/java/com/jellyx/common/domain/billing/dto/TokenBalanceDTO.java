package com.jellyx.common.domain.billing.dto;

import lombok.Builder;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Builder
public class TokenBalanceDTO {
    private Long currentBalance;
    private Long totalEarned;
    private Long totalSpent;
    private LocalDateTime lastUpdated;
}