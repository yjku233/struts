package test.ibatis;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.opensymphony.xwork2.Action;

public class LoginProAction implements Action, IbatisAware, ServletRequestAware {
	private SqlMapClient sqlMap = null;
	private HttpServletRequest request = null;
	
	public String execute() throws Exception {
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		HashMap map = new HashMap();
		map.put("id",id);
		map.put("passwd", passwd);
		int check = (Integer)sqlMap.queryForObject("userCheck",map);
		if(check == 1) {
			HttpSession session = request.getSession();
			session.setAttribute("memId", id);
			return "success";
		} else {
			request.setAttribute("check", new Integer(check));
			return "login";
		}

	}
	public void setIbatisAware(SqlMapClient sqlMap) {	this.sqlMap = sqlMap; }
	public void setServletRequest(HttpServletRequest arg0) { request = arg0; }

}
