package com.harman.lms.advice;

import com.harman.lms.entity.ResponseMsg;
import com.harman.lms.exception.CustomNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class WebRestControllerAdvice {
  @ExceptionHandler(CustomNotFoundException.class)
  public ResponseMsg handleNotFoundException(final CustomNotFoundException ex) {
    final ResponseMsg responseMsg = new ResponseMsg(ex.getMessage());
    return responseMsg;
  }
}
