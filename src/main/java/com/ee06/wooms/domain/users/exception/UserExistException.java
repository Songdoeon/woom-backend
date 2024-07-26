package com.ee06.wooms.domain.users.exception;

import com.ee06.wooms.global.exception.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UserExistException extends RuntimeException {
    final ErrorCode errorCode;
}
