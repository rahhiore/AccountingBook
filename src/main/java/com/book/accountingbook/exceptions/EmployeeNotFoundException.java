package com.book.accountingbook.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class EmployeeNotFoundException extends RuntimeException {
}
