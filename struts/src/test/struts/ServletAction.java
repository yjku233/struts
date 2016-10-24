package test.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

public class ServletAction implements ServletRequestAware {
	
	private HttpServletRequest request;
	
	public String execute() {
		String id = request.getParameter("id");
		request.setAttribute("id", id);
		System.out.println(id);
		return "success";
	}

	public void setServletRequest(HttpServletRequest arg0) {
		this.request = arg0;
	}
}
