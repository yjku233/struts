package test.interceptor;

import java.util.Date;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import test.struts.FormProAction;

public class MyInterceptor implements Interceptor {
	private Date d;
	public void destroy() { // 종료되기 전에
	}

	public void init() { //서버가 시작할때 최초 1회 실행
		d = new Date();	
	}

	public String intercept(ActionInvocation arg0) throws Exception { //인터셉트를 실행할 때 마다
		Object obj = arg0.getAction(); // 목적지 Action클래스의 객체
		
		if(obj instanceof Myface) {
			Myface mf = (Myface)obj;
			mf.setDate(d);
		}
		
		return arg0.invoke();
	}

}
