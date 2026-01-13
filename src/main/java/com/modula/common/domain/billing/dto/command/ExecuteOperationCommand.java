package com.modula.common.domain.billing.dto.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Map;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExecuteOperationCommand {

    private UUID userId;

    private UUID moduleId;

    private String operationKey;

    private String referenceId;

    private String description;

    private Map<String, Object> parameters;
}