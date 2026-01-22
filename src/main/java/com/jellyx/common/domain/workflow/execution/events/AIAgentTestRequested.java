package com.jellyx.common.domain.workflow.execution.events;

import com.jellyx.common.dto.ai.module.AIAgentDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AIAgentTestRequested {
    private String sessionId;
    private String threadId;
    private String prompt;
    private AIAgentDto agentConfig;
    private Map<String, Object> llmParams;
}