package test.ibatis;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import ch11.logon.LogonDataBean;

public class ConfirmIdAction implements Action, IbatisAware, Preparable, ModelDriven {
	private SqlMapClient sqlMap;
	private LogonDataBean dto;
	private boolean check = false;
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
		if ((Integer)sqlMap.queryForObject("confirmId", dto.getId()) == 1) {
			check = true;
		} else { check = false; }
		return "success";
	}
	public boolean getCheck() {
		return check;
	}
}
