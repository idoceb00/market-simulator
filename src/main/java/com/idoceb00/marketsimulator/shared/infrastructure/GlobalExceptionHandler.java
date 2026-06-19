package com.idoceb00.marketsimulator.shared.infrastructure;

import com.idoceb00.marketsimulator.users.domain.exception.UserNotFoundException;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(UserNotFoundException.class)
  public ResponseEntity<Map<String, String>> handleUserNotFound(UserNotFoundException ex) {
    // TODO: return 404 with error message
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<Map<String, String>> handleValidationErrors(
      MethodArgumentNotValidException ex) {
    // TODO: return 400 with field validation error messages
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @ExceptionHandler(Exception.class)
  public ResponseEntity<Map<String, String>> handleGeneralError(Exception ex) {
    // TODO: return 500 with generic error message
    throw new UnsupportedOperationException("Not yet implemented");
  }
}
