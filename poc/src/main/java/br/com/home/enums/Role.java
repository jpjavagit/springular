package br.com.home.enums;

public enum Role {
	ROLE_ADMIN("ROLE_ADMIN"), 
	ROLE_USER("ROLE_USER"),
	ROLE_ANONYMOUS("ROLE_ANONYMOUS");
	
	private Role(String role){
		this.role = role;
	}
	
	private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
}
