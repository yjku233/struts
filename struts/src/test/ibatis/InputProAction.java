package test.ibatis;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import ch11.logon.LogonDataBean;

public class InputProAction implements Action,IbatisAware,Preparable,ModelDriven{
	
	private LogonDataBean dto;
	private SqlMapClient sqlMap;
	
	public Object getModel() {
		return dto;
	}

	public void prepare() throws Exception {
		dto = new LogonDataBean();
	}


	public void setIbatisAware(SqlMapClient sqlMap) {
		this.sqlMap = sqlMap;
	}


	public String execute() throws Exception {
		sqlMap.insert("userInsert", dto);
		return "success";
	}

}
