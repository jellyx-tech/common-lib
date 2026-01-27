package com.jellyx.common.domain.billing.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserBalanceSummaryDTO {
    private TokenBalanceDTO tokens;
    private MoneyBalanceDTO money;
}