package com.harman.lms.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class CustomNotFoundException extends RuntimeException {

  public CustomNotFoundException(final String msg) {
    super(msg);
  }
}
