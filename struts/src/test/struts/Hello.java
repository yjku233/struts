package test.struts;

public class Hello {
	
	public String execute() {
		System.out.println("Hello execute()");
		return "success";
	}
	
	public String test() {
		System.out.println("ok test()");
		return "ok";
	}
}