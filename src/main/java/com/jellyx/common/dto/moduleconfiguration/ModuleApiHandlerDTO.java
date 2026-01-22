package com.jellyx.common.dto.moduleconfiguration;

import com.jellyx.common.domain.moduleconfiguration.InputParameter;
import com.jellyx.common.domain.moduleconfiguration.ResponseType;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class ModuleApiHandlerDTO {
    private UUID id;
    private String name;
    private String label;
    private String description;
    private String category;
    private String handlerType;
    private ResponseType responseType;
    private List<PreviewConfigDTO> previewConfigs;
    private String documentationSource;
    private List<InputParameter> inputParameters;
}
