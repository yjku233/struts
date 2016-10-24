package test.checkbox;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class CheckboxProAction implements Action,Preparable,ModelDriven{
	private DTO dto;

	public Object getModel() {
		return dto;
	}

	public void prepare() throws Exception {
		dto = new DTO();	
	}

	public String execute() throws Exception {

		return "success";
	}

}
