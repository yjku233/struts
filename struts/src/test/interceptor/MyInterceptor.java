package test.interceptor;

import java.util.Date;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import test.struts.FormProAction;

public class MyInterceptor implements Interceptor {
	private Date d;
	public void destroy() { // ����Ǳ� ����
	}

	public void init() { //������ �����Ҷ� ���� 1ȸ ����
		d = new Date();	
	}

	public String intercept(ActionInvocation arg0) throws Exception { //���ͼ�Ʈ�� ������ �� ����
		Object obj = arg0.getAction(); // ������ ActionŬ������ ��ü
		
		if(obj instanceof Myface) {
			Myface mf = (Myface)obj;
			mf.setDate(d);
		}
		
		return arg0.invoke();
	}

}
