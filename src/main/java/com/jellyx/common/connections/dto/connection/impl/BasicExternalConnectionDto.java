package com.jellyx.common.connections.dto.connection.impl;

import com.jellyx.common.connections.dto.connection.ExternalConnectionDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class BasicExternalConnectionDto extends ExternalConnectionDto {
    private String login;
    private String password;
}
