package com.exampe.demo.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandlerControllerAdvice {

	@Autowired
	public ExceptionResponse response;
	
	
	@ExceptionHandler(NotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	@ResponseBody ExceptionResponse handlerNotFoundException(NotFoundException expection, HttpServletRequest req) {
		
		response.setErrorMessage(expection.getMessage());
		response.setRequestURI(req.getRequestURI());
		
		return response;
	}
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody ExceptionResponse handlerNotFoundException(Exception exception,HttpServletRequest req)
	{
		ExceptionResponse response=new ExceptionResponse();
		response.setErrorMessage(exception.getMessage());
		response.setRequestURI(req.getRequestURI());
		return response;
		
	}
}
