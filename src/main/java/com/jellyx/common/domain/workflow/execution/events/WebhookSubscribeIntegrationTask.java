package com.jellyx.common.domain.workflow.execution.events;

import com.jellyx.common.domain.workflow.Workflow;
import lombok.Data;

import java.util.Map;

@Data
public class WebhookSubscribeIntegrationTask {
    private Workflow workflow;
    private Map<String, Object> webhookParams;
}
