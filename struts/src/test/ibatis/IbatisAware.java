package test.ibatis;

import com.ibatis.sqlmap.client.SqlMapClient;

public interface IbatisAware {
	public void setIbatisAware(SqlMapClient sqlMap);
}
