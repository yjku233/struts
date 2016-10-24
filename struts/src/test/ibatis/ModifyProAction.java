package test.ibatis;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import ch11.logon.LogonDataBean;

public class ModifyProAction implements Action, Preparable, ModelDriven, IbatisAware {
	
	private LogonDataBean dto = null;
	SqlMapClient sqlMap = null;
	
	public void setIbatisAware(SqlMapClient sqlMap) {
		this.sqlMap = sqlMap;
	}

	public Object getModel() {
		return dto;
	}

	public void prepare() throws Exception {
		dto = new LogonDataBean();
	}

	public String execute() throws Exception {
		sqlMap.update("userUpdate", dto);
		return "success";
	}
}
