package test.struts;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class UploadAction {
	
	private String writer;
	private File [] save;
	private String [] saveContentType;
	private String [] saveFileName;
	
	public void setWriter(String writer) { this.writer = writer; }
	public void setSave(File [] save) { this.save = save; }
	public void setSaveContentType(String [] saveContentType) { this.saveContentType = saveContentType; }
	public void setSaveFileName(String [] saveFileName) { this.saveFileName = saveFileName; }
	
	public String execute() throws Exception {
		for(int i = 0; i < save.length; i++) {
			File copy = new File("f://save//"+saveFileName[i]);
			FileUtils.copyFile(save[i], copy);
		}
		return "success";
	}
}
