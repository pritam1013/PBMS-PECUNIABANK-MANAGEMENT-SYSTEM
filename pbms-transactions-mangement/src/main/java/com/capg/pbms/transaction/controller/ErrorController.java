package com.capg.pbms.transaction.controller;

import java.util.Date;


import javax.security.auth.login.AccountNotFoundException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capg.pbms.transaction.exception.ChequeBounceException;
import com.capg.pbms.transaction.exception.InsufficienBalanceException;
import com.capg.pbms.transaction.model.ErrorResponse;

/*******************************************************************************************************************************
-Author                   :     P.AkashPawar
-Created/Modified Date    :     23-08-2020
-Description              :     ErrorController Class for handling Transaction Management System Exceptions
*******************************************************************************************************************************/
@RestControllerAdvice
public class ErrorController {
	@ResponseStatus(code = HttpStatus.CREATED)
	@ExceptionHandler(value = { AccountNotFoundException.class })
	public ErrorResponse handleStudentAlreadyExistsException(Exception ex, HttpServletRequest req) {

		return new ErrorResponse(new Date(), ex.getMessage(), HttpStatus.BAD_REQUEST.getReasonPhrase(),
				HttpStatus.BAD_REQUEST.value(), req.getRequestURL().toString());

	}

	@ResponseStatus(code = HttpStatus.CREATED)
	@ExceptionHandler(value = { InsufficienBalanceException.class })
	public ErrorResponse handleStudentNotException(Exception ex, HttpServletRequest req) {

		return new ErrorResponse(new Date(), ex.getMessage(), HttpStatus.BAD_REQUEST.getReasonPhrase(),
				HttpStatus.BAD_REQUEST.value(), req.getRequestURL().toString());

	}

	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = { ChequeBounceException.class })
	public ErrorResponse handleStudentAgeException(Exception ex, HttpServletRequest req) {
		return new ErrorResponse(new Date(), ex.getMessage(), HttpStatus.BAD_REQUEST.getReasonPhrase(),
				HttpStatus.BAD_REQUEST.ordinal(), req.getRequestURI().toString());
	}

}
