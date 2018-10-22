package chat.model;
import java.util.ArrayList;
public class ChatBot
{
	ArrayList responseList = new ArrayList();
	ArrayList spookyList =  new ArrayList();
	private String joke;
	private String currentUser;
	private String content;

	public ChatBot()
	{
		this.joke = "Why did the monkey cross the road? It was stapled to the chicken";
		this.currentUser = new String("default user - boring!!!");
		this.content = new String("empty of all content but not null");
		
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		buildTheLists();
		
	}
	
	private void buildTheLists()
	{
		responseList.add("Hello! How are you?");
		responseList.add("Goodbyr - no more talking!");
		responseList.add("Whats your name?");
		responseList.add("Whats your mothers maiden name?");
		responseList.add("What was the name of your first pet?");
		
		spookyList.add("Hallowenn");
		spookyList.add("Halloween more like spooktober");
		spookyList.add("Your identity was stolen!!!");
		spookyList.add("Your car was stolen");
		spookyList.add("BOOOOOO!");
		spookyList.add("Turn around.......");
		spookyList.add("RUN!!!!!!");
		
	}
	
	public String processText(String userText)
	{
		String output = "";
		
		output += "You said:" + userText;
		
		return output;
		
	}
}

