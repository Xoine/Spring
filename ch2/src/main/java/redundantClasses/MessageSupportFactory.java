package redundantClasses;

import java.io.FileInputStream;
import java.util.Properties;

import org.springframework.context.support.StaticApplicationContext;


public class MessageSupportFactory {
	
//	private static MessageSupportFactory instance = null;
//	private Properties props = null;
//	private MessageRenderer renderer = null;
//	private MessageProvider provider = null;
//	
//	static {
//			instance = new MessageSupportFactory();
//	}
//	
//	private MessageSupportFactory(){
//		props = new Properties();
//		
//		try {
//			props.load(new FileInputStream("src/conf/msf.properties"));
//			
//			String rendererClass = props.getProperty("renderer.class");
//			String providerClass = props.getProperty("provider.class");
//			renderer = (MessageRenderer) Class.forName(rendererClass).newInstance();
//			provider = (MessageProvider) Class.forName(providerClass).newInstance();
//			
//		} catch (Exception e) {
//			e.getStackTrace();
//		}
//		
//	}
//	
//	public static MessageSupportFactory getInstance(){
//		return instance;
//	}
//	public MessageRenderer getMessageRenderer(){
//		return renderer;
//	}
//	public MessageProvider getMessageProvider(){
//		return provider;
//	}
}
