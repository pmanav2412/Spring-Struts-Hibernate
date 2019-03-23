package com.demo.struts;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	User u = new User();
	public User getU() {
		return u;
	}

	public void setU(User u) {
		this.u = u;
	}
	
	
  

	
	public void validate() {
		if(u.getEmail().length() <1) {
			addFieldError("u.email", "U must enter the email");
		}
		if(u.getPassword().length() <1) {
			addFieldError("u.password", "U must enter the password");
		}
	}

//	private String email;
//	private String password;
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}

//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
	

	public String execute() {

		try {
			System.out.println(u.getEmail());
		boolean a=Service.service(u.getPassword(),u.getEmail());
		 if(a) 
		  return SUCCESS;
		 else
			 return ERROR;
		}catch(Exception e) {
			e.printStackTrace();
		}
	 return ERROR;
	
	}
	

	
	
}
