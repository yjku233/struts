package test.sum;

public class DAO {
	
	public int sum(DTO dto) {
		int sum = dto.getNum1() + dto.getNum2();
		return sum;
	}

}
