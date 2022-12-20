package com.cleyton.os.controlles.exceptions;

import java.io.Serializable;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Service
public class StandardError implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long timestamp;
	private Integer status;
	private String error;
}
