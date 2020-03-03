//package com.manga.exeption;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//import org.springframework.web.context.request.WebRequest;
//
//import java.util.NoSuchElementException;
//
//@RestControllerAdvice
//public class ApiExceptionHandeler {
//    /**
//     * Tất cả các Exception không được khai báo sẽ được xử lý tại đây
//     */
//    @ExceptionHandler(Exception.class)
//    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//    public ErrorMessage handleAllException(Exception ex, WebRequest request) {
//        return new ErrorMessage(12345, ex.getLocalizedMessage());
//    }
//
//    /**
//     * IndexOutOfBoundsException sẽ được xử lý riêng tại đây
//     */
//    @ExceptionHandler(IndexOutOfBoundsException.class)
//    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
//    public ErrorMessage todoException(Exception ex, WebRequest request) {
//        return new ErrorMessage(10123, "Doi tuong khong ton tai");
//    }
//
//    @ExceptionHandler(NoSuchElementException.class)
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    public ErrorMessage noSuchElementExceptionCustom(Exception ex, WebRequest request) {
//        return new ErrorMessage(112233, "No Such Element Exception Custom");
//    }
//
//
//}
