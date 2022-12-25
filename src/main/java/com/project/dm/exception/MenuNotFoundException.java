package com.project.dm.exception;

import com.project.dm.global.error.exception.BusinessException;
import com.project.dm.global.error.exception.ErrorCode;

public class MenuNotFoundException extends BusinessException {

    public static final BusinessException EXCEPTION =
            new MenuNotFoundException();

    private MenuNotFoundException() {
        super(ErrorCode.MENU_NOT_FOUND);
    }

}
