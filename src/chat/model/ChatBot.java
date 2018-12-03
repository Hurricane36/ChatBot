package chat.model;
import java.util.ArrayList;

public class ChatBot
{
	ArrayList<String> responseList = new ArrayList<String>();
	ArrayList<String> spookyList =  new ArrayList<String>();
	private String joke;
	private String currentUser;
	private String content;
	private String getContent;
	private String contentChecker;
	private String ChatBot;
	private String ChatbotString;
	private String ProcessText;
	
	
	public ChatBot()
	{
		this.joke = "Why did the monkey cross the road? It was stapled to the chicken";
		this.currentUser = new String("default user - boring!!!");
		this.content = new String("empty of all content but not null");
		
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		buildTheLists();
	}
	public ChatBot(String string)
	{
		this.joke = "Why did the monkey cross the road? It was stapled to the chicken";
		this.currentUser = new String("default user - boring!!!");
		this.content = new String("empty of all content but not null");
		
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		buildTheLists();
		content = "sample content";
	}
	
	private void buildTheLists()
	{
		responseList.add("Hello! How are you?");
		responseList.add("Goodbyr - no more talking!");
		responseList.add("Whats your name?");
		responseList.add("Whats your mothers maiden name?");
		responseList.add("how old are you?");
		responseList.add("What was the name of your first pet?");
		responseList.add("What Hospital were you born in?");
		responseList.add("are you human?");
		responseList.add("you stink!");
		responseList.add("Get out of my HEAD!");
		responseList.add("WHo said that?");
		responseList.add("what street did you grow uo on?");
		responseList.add("You smelllllll bad");
		responseList.add("Hi Cade");
		responseList.add("Cade! Go AWAY!");
		responseList.add("How many Dogs do you have?");
		responseList.add("Cats suck");
		
		
		
		
		
		
		spookyList.add("Halloween");
		spookyList.add("Halloween more like spooktober");
		spookyList.add("Your identity was stolen!!!");
		spookyList.add("Your car was stolen");
		spookyList.add("BOOOOOO!");
		spookyList.add("Turn around.......");
		spookyList.add("RUN!!!!!!");
		spookyList.add("Boo again");
		
	}
	
	public String processText(String userText)
	{
		String answer = "";
		 answer += "You said: " + userText;
		 
		if (contentChecker(userText))
		{
			answer = "";
			answer += "Chatbot Says: You said the special words. \n";
		}
		else if (answer == null)
		{
			answer += " Chatbot Says: It appears we have recieved null...";
		} 
		else
		{
			int randomIndex = (int) (Math.random() * responseList.size());
			answer += "Chatbot says: " + responseList.get(randomIndex);
		}
		
		return answer;
		
	}

	public ArrayList<String> getSpookyList()
	{
		return spookyList;
	}

	public ArrayList<String> getResponseList()
	{
		return responseList;
	}

	public String getContent()
	{
		// TODO Auto-generated method stub
		return content;
	}

	public String getCurrentUser()
	{
		// TODO Auto-generated method stub
		return currentUser;
	}

	public boolean legitimacyChecker(String input)
	{
		boolean isValid = true;
		if(input == null)
		{
			isValid = false;
		}
		else if (input.length() < 2)
		{
			isValid = false;
		}
		else if (input.contains("dfg") || input.contains("cvb"))
		{
			isValid = false;
		}
		
		return isValid;
	}
	
	public boolean spookyChecker(String input)
	{
		boolean isValid = false;
		if(input.contains("Halloween"))
		{
			isValid = true;
		}
		for(String phrase: spookyList)
		{
			if (input.contains(phrase))
			{
				isValid = true;
			}
		
		}
		return isValid;
	}
	public boolean contentChecker(String text)
	{
		boolean hasContent = false;
		 if( text == null)
		{
			hasContent = false;
		}
		 else if (text.equals(content))
		{
			hasContent = true;
		}
		else
		{
			hasContent = false;
		}
		return hasContent;
	}
	
	

	
	
}


