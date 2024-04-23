package com.example.Product_API.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.NoSuchElementException;

@ControllerAdvice
public class ProductControllerAdvice {
//    @ExceptionHandler(NoSuchElementException.class)
//    public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException elementException){
//        return new ResponseEntity<String>("invalid Id , No such value is present Please correct it", HttpStatus.NOT_FOUND);
//    }
}
