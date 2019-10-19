/**
 * 
 */
package com.portal.exceptions;

/**
 * @author Vikram
 *
 */
public class PortalException extends RuntimeException {
	
	private static final long serialVersionUID = 7583907808309739975L;
	
	/**
	 * Variable to hold the error message.
	 */
	private String errorMessage;

	/**
	 * @param errorMessage
	 */
	public PortalException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
