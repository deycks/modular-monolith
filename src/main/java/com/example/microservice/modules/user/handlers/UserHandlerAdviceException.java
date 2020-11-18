package com.example.microservice.modules.user.handlers;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.microservice.modules.user.util.UserEnum;

@RestControllerAdvice
public class UserHandlerAdviceException {
	
	@ExceptionHandler(value = { MissingServletRequestParameterException.class })
    public HttpEntity<HashMap<String, Object>>  manejarTipoDeArgumentoDelMetodo(MissingServletRequestParameterException exception) {
    	LinkedHashMap<String, Object> body = new LinkedHashMap<>();
		body.put(UserEnum.RESPONSE_CODE, UserEnum.MISSING_PARAM.getCode());
		body.put(UserEnum.RESPONSE_MESSAGE, UserEnum.MISSING_PARAM.getMessage());
		body.put(UserEnum.RESPONSE_DETAIL, UserEnum.PARAM_REQ + exception.getParameterName());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);

    }
	
}
