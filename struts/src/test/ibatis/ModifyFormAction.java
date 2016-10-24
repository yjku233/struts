package test.ibatis;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.opensymphony.xwork2.Action;

import ch11.logon.LogonDataBean;

public class ModifyFormAction implements Action, IbatisAware, ServletRequestAware {

	private SqlMapClient sqlMap = null;
	private HttpServletRequest request = null;
	private LogonDataBean dto = new LogonDataBean();
	
	public void setIbatisAware(SqlMapClient sqlMap) {
		this.sqlMap = sqlMap;
	}
	public String execute() throws Exception {
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("memId");
		dto = (LogonDataBean)sqlMap.queryForObject("modify", id);
		return "success";
	}
	public void setServletRequest(HttpServletRequest arg0) {
		request = arg0;
	}
	public LogonDataBean getDto() {
		return dto;
	}
}
