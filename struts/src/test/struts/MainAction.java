package test.struts;

import com.opensymphony.xwork2.Action;

public class MainAction implements Action {
	public String execute() {
		
		return "success";
	}
	
	public String getHello() {
		return "Hello World";
	}
}
