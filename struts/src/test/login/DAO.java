package test.login;

public class DAO {
	public boolean check(DTO dto) {
		boolean x;
		if(dto.getId().equals("test")) {
			dto.setName("ȫ�浿");
			x = true;
		} else { x = false; }
		return x;
	}
}
