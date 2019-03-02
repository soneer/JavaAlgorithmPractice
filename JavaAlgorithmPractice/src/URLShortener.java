import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

public class URLShortener {
HashMap<String, String> urlMap;
final String DOMAIN = "shortener.com/";
Timer timer = new Timer();
int interation = 100000;
	public URLShortener() {
		// TODO Auto-generated constructor stub
		urlMap = new HashMap<String, String>();
	}	
	
	public void addURL(String url){
		String key = createUniqueId();
		urlMap.put(key, url);
		TimerTask removeKey = new TimerTask() {		
			@Override
			public void run() {
				urlMap.remove(key);
			}
		};
		timer.schedule(removeKey, 5000);
	}
	
	
	public String createUniqueId(){
		String hex =  Integer.toHexString(interation);
		interation++;
		return hex;
		
	}
	
	public void printMap(){
		for(String key : urlMap.keySet()){
			System.out.println("Key:"+key +"   URL:"+urlMap.get(key));
		}
	}

}
