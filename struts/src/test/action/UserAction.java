package test.action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import test.action.Dao;
import test.action.UserInfo;

public class UserAction implements Action , Preparable , ModelDriven {
	private UserInfo userInfo;
	
	Log log = LogFactory.getLog(UserAction.class);
	
	public String execute() throws Exception {
		
		log.info(">>>>execute()");
		
		Dao dao = Dao.getInstance();
		
		if(dao.insertMember(userInfo)) {
			return "success";
		} else { return "error"; }
	}


	public Object getModel() {

		return userInfo;
	}

	public void prepare() throws Exception {
		log.info(">>>>objectCreate");
		userInfo = new UserInfo();
	}
}
