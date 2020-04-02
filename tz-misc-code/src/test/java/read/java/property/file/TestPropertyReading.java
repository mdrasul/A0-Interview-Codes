package read.java.property.file;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestPropertyReading {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		SharedConfig.config = ReadConfigFile.readProperties();
		
		System.out.println(SharedConfig.config.get("Sauce-username"));

	}

}
