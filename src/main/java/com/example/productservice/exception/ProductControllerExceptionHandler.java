package com.example.productservice.exception;


import com.example.productservice.ui.ErrorResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice //Globalizing the exception handling
public class ProductControllerExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ErrorResponseModel> handleCouponNotFoundException(CouponNotFoundException e)
    {
        ErrorResponseModel errorResponseModel=new ErrorResponseModel();
        errorResponseModel.setCode(HttpStatus.NOT_FOUND.value());
        errorResponseModel.setMessage(e.getMessage());
        return new ResponseEntity<ErrorResponseModel>(errorResponseModel,HttpStatus.NOT_FOUND);
    }
}
