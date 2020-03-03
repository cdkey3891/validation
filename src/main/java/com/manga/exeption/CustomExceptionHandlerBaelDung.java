//package com.manga.exeption;
//
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.FieldError;
//import org.springframework.validation.ObjectError;
//import org.springframework.web.bind.MethodArgumentNotValidException;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.context.request.WebRequest;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@ControllerAdvice
//public class CustomExceptionHandlerBaelDung extends ResponseEntityExceptionHandler {
//    //https://www.baeldung.com/global-error-handler-in-a-spring-rest-api
//
//    //xử lý khi POST một Entity thiếu Field
//    @Override
//    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
//        List<String> errors = new ArrayList<>();
//        for (FieldError error: ex.getBindingResult().getFieldErrors()) {
//            errors.add(error.getField()+": "+error.getDefaultMessage());
//        }
//        for (ObjectError error: ex.getBindingResult().getGlobalErrors()) {
//            errors.add(error.getObjectName()+": "+error.getDefaultMessage());
//        }
//        ErrorMessage errorMessage = new ErrorMessage(HttpStatus.BAD_REQUEST, ex.getLocalizedMessage(), errors);
//        return handleExceptionInternal(ex, errorMessage, headers, errorMessage.getStatusCode(), request);
//    }
//}
