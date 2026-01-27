package com.jellyx.common.domain.billing.dto;

import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
public class MoneyBalanceDTO {
    private BigDecimal currentBalance;
    private String currency;
    private BigDecimal totalTopup;
    private BigDecimal totalSpent;
    private LocalDateTime lastUpdated;
}