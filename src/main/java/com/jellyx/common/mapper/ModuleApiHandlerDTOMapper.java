package com.jellyx.common.mapper;

import com.jellyx.common.domain.moduleconfiguration.ModuleAction;
import com.jellyx.common.domain.moduleconfiguration.ModuleTrigger;
import com.jellyx.common.dto.moduleconfiguration.ModuleApiHandlerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ModuleApiHandlerDTOMapper {
    ModuleApiHandlerDTO actionToDTO(ModuleAction moduleAction);
    ModuleApiHandlerDTO triggerToDTO(ModuleTrigger moduleTrigger);
}
