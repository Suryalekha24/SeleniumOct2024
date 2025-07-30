package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config.fr.properties")
public interface Configuration extends Config{
	
	@Key("timeout")
	int getTimeOut();
	
	@Key("username")
	String getusername();
	
	@Key("password")
	String getpassword();
	
	@Key("leadsLink")
	String leadsLink();
	
	@Key("createLeadLink")
	String createLeadLink();
}
