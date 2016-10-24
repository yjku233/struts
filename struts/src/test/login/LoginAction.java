package test.login;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class LoginAction implements Action , Preparable , ModelDriven , LoginDAOAware {
	
	private DTO dto;
	private DAO dao;
	
	public Object getModel() {
		return dto;
	}


	public void prepare() throws Exception {
		dto = new DTO();
	}

	public String execute() throws Exception {
		if(dao != null) {
			if(dao.check(dto)) {
				return "success";
			} else { return "login"; }
		} else { return "error"; }
	}

	public void setLoginDAO(DAO dao) {
		this.dao = dao;
	}

}