package org.acme.dto;

public class PrdDtoResponse {

	long idp;
	boolean status;
	
	
	public PrdDtoResponse(long idp, boolean status) {
		super();
		this.idp = idp;
		this.status = status;
	}
	public long getIdp() {
		return idp;
	}
	public void setIdp(long idp) {
		this.idp = idp;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public PrdDtoResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
