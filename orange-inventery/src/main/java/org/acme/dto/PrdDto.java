package org.acme.dto;

public class PrdDto {

	long idp;
	int qte;
	
	
	
	public PrdDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PrdDto(long idp, int qte) {
		super();
		this.idp = idp;
		this.qte = qte;
	}
	public long getIdp() {
		return idp;
	}
	public void setIdp(long idp) {
		this.idp = idp;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	
}
