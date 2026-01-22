package com.jellyx.common.dto.workspace;

import lombok.Data;

@Data
public class CreateCommandWorkspaceDTO {
    private String name;
    private String description;
    private boolean favorite;
    private String workspaceIconPath;
}
