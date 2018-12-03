package chat.controller;
import javax.swing.JOptionPane;

import chat.model.ChatBot;

public class ChatController
{
	private ChatBot SimpleBot;
	
	public ChatController()
	{
		SimpleBot = new ChatBot();
	
	}
	public void start()
	{
		String userText = "";
		while (!userText.equalsIgnoreCase("Quit"))
		{
			
		}
	}
	public String interactwithchatbot(String text)
	{
		String output = "";
		String userResponse = JOptionPane.showInputDialog(text);
		output = SimpleBot.processText(userResponse);
		return output;
	}
	
		public String UseChatbotCheckers(String text)
		{
			
			return "Halloween";
		}
		public ChatBot GetChatbot()
		{
			
			return SimpleBot;
		}
}
