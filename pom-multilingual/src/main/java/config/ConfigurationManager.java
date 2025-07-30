package config;

import org.aeonbits.owner.ConfigCache;

public class ConfigurationManager {

	public static config.Configuration configuration(){
		return ConfigCache.getOrCreate(Configuration.class);
	}
}
