package test.sum;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class SumProAction extends AbstractInterceptor implements Action , Preparable , ModelDriven {
	private DTO dto;
	private int sum;
	public String execute() {
		DAO dao = new DAO();
		sum = dao.sum(dto);
		return "success";
	}
	
	public int getSum() {
		return sum;
	}
	
	public Object getModel() {

		return dto;
	}

	public void prepare() throws Exception {
		dto = new DTO();
	}

	public String intercept(ActionInvocation invocation) throws Exception {
		
		long start = System.currentTimeMillis();
		
		String result = invocation.invoke();
		
		long end = System.currentTimeMillis() - start;
		
		System.out.println(end + "ms");

		return result;
	}
}
