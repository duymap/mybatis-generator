package com.duy;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
/**
 * 
 */

/**
 * @author duy.chung
 *
 */
public class Generator {
	public static void main(String[] args) {
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		File configFile = new File("config.xml");
		try {
			
			Properties p = new Properties();
			p.setProperty("generated.source.dir", new java.io.File( "." ).getCanonicalPath().concat("/src/main/java/com/duy"));
			
			ConfigurationParser cp = new ConfigurationParser(p, warnings);						
			Configuration config = cp.parseConfiguration(configFile);			
			DefaultShellCallback callback = new DefaultShellCallback(overwrite);			
			MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);				
			myBatisGenerator.generate(null);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (XMLParserException e) {
			e.printStackTrace();
		} catch (InvalidConfigurationException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Successfully! Please check your mapper, model and xml packages.");
	}
}
