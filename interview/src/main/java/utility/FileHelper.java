package utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FileHelper {
	
	public static Properties readPropertiesFile(String FilePath)
	{
		FileReader file = null;
		try {
			file=new FileReader(FilePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop=new Properties();
		try {
			prop.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
	
	public static String readConfigValue(String key)
	{
		return FileHelper.readPropertiesFile(System.getProperty("user.dir")+"\\src\\main\\resources\\Config.properties").getProperty(key);
	}
	
	
	

}
