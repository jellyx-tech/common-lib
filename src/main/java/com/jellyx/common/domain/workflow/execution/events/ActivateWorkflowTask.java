package com.jellyx.common.domain.workflow.execution.events;

import com.jellyx.common.domain.workflow.Workflow;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActivateWorkflowTask {
    private Workflow workflow;
    private boolean isActive;
}
