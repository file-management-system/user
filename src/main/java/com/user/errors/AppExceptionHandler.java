package com.user.errors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class AppExceptionHandler {
	private final Logger logger = LoggerFactory.getLogger(AppExceptionHandler.class);

	@ExceptionHandler(EmptyResultDataAccessException.class)
	@ResponseBody
	public String handleEmptyDataException(EmptyResultDataAccessException ex) {
		// System.out.println(ex.getMessage());
		logger.error(ex.getMessage());
		return "NO DATA FOUND";
	}
}
