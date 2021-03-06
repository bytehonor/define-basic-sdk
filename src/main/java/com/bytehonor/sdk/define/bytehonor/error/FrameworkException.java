package com.bytehonor.sdk.define.bytehonor.error;

import com.bytehonor.sdk.define.bytehonor.code.StandardCode;

public class FrameworkException extends RuntimeException {

	private static final long serialVersionUID = 623379646603016408L;
	
	private int errorCode;

	public FrameworkException() {
		super();
		this.errorCode = StandardCode.FRAMEWORK_ERROR;
	}

	public FrameworkException(String message) {
		super(message);
		this.errorCode = StandardCode.FRAMEWORK_ERROR;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
}
