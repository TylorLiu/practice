package org.tylor.other.input;

import java.io.IOException;
import org.tylor.util.FileUtil;


public class FileInput implements Input{
	private String filePath;
	public FileInput(String filePath){
		this.filePath=filePath;
	}
	public  String getInputString()  {
		String content="";
		try {
			content= FileUtil.readFileFully(filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return content;
	}

}
