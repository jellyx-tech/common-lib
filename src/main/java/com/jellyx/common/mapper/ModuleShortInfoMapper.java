package com.jellyx.common.mapper;

import com.jellyx.common.domain.moduleconfiguration.ModuleConfiguration;
import com.jellyx.common.dto.moduleconfiguration.ModuleConfigurationShortInfoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ModuleShortInfoMapper {
    ModuleConfigurationShortInfoDTO mapToShortInfoDTO(ModuleConfiguration moduleConfiguration);
}
