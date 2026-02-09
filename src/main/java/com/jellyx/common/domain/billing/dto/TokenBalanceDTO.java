package com.jellyx.common.domain.billing.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TokenBalanceDTO {
    private Long currentBalance;
    private Long totalEarned;
    private Long totalSpent;
    private LocalDateTime lastUpdated;

    public TokenBalanceDTO(Long currentBalance, Long totalSpent, Long totalEarned) {
        this.currentBalance = currentBalance;
        this.totalSpent = totalSpent;
        this.totalEarned = totalEarned;
        this.lastUpdated = null;
    }
}