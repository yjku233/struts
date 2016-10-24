package test.login;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LoginDAOInterceptor implements Interceptor {
	DAO dao;
	public void init() {
		dao = new DAO();
	}	
	public void destroy() {
		dao = null;
	}	
	public String intercept(ActionInvocation invocation) throws Exception {
		Object action = invocation.getAction();		
		if (action instanceof LoginDAOAware) {
			LoginDAOAware loginDAOAware = (LoginDAOAware)action;
			loginDAOAware.setLoginDAO(dao);		
		}		
		return invocation.invoke();
	}	

}
