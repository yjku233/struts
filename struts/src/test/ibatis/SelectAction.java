package test.ibatis;

import java.io.Reader;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.opensymphony.xwork2.Action;

public class SelectAction implements Action {
	private List list;
	private TestDto dto;
	private List age;
	
	public String execute() throws Exception {
		Reader re = Resources.getResourceAsReader("sqlMapConfig.xml");
		SqlMapClient sqlMap = SqlMapClientBuilder.buildSqlMapClient(re);	
		list = sqlMap.queryForList("testAll");
		
		dto = (TestDto)sqlMap.queryForObject("testId","project");
		
		age = sqlMap.queryForList("testAge");
		
		return "success";
	}
	
	public List getList() {
		return list;
	}
	public TestDto getDto() {
		return dto;
	}
	public List getAge() {
		return age;
	}
}
