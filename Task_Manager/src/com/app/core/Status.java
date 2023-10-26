package com.app.core;

public enum Status {

	PENDING, INPROGRESS,COMPLETED;

	private String status;
	
	String getStatus() {
		
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
