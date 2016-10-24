package test.ibatis;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import ch11.logon.LogonDataBean;

public class DeleteProAction implements Action, IbatisAware, ServletRequestAware, Preparable, ModelDriven {
	private LogonDataBean dto = null;
	SqlMapClient sqlMap = null;
	private String id = null;
	private String passwd = null;
	private int pw;
	HttpServletRequest request = null;
	private boolean check = false;
	
	public Object getModel() {
		return dto;
	}

	public void prepare() throws Exception {
		dto = new LogonDataBean();
	}

	public void setServletRequest(HttpServletRequest arg0) {
		request = arg0;
	}

	public void setIbatisAware(SqlMapClient sqlMap) {
		this.sqlMap = sqlMap;
	}

	public String execute() throws Exception {
		id = dto.getId();
		passwd = dto.getPasswd();
		pw = (Integer)sqlMap.queryForObject("pwCheck", passwd);
		if(pw == 1) {
			sqlMap.delete("userDelete", id);
			check = true;
		} else { check = false; }
		return "success";
	}
	public boolean getCheck() {
		return check;
	}
}
