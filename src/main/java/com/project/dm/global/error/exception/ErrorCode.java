package com.project.dm.global.error.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    MENU_NOT_FOUND(404, "Menu Not Found");

    private final int status;
    private final String message;

}
