package test.ibatis;

import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class InsertAction implements Action, Preparable, ModelDriven{
	
	private TestDto dto;
	
	public Object getModel() {
		return dto;
	}

	public void prepare() throws Exception {
		dto = new TestDto();
	}

	public String execute() throws Exception {
		
		Reader re = Resources.getResourceAsReader("sqlMapConfig.xml");
		SqlMapClient sqlMap = SqlMapClientBuilder.buildSqlMapClient(re);
		
		sqlMap.insert("insertTest",dto);
		
		return "success";
	}

}
