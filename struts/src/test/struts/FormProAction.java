package test.struts;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class FormProAction extends ActionSupport implements Preparable , ModelDriven {
	
	private DTO dto;
	
	public String execute() {

		return "success";
	}

	public Object getModel() {
		return dto;
	}

	public void prepare() throws Exception {
		dto = new DTO();
	}

}
