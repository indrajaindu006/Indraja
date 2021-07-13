package com.example.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class IssueNotFound extends RuntimeException {

	private static final long serialVersionUID = 454763752181658428L;

	private String message;

}
