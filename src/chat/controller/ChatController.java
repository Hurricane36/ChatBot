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
		String chatbotSays = JOptionPane.showInputDialog(text);
		chatbotSays = SimpleBot.processText(chatbotSays);
		return"";
	}
	
		public String useChatbotCheckers(String text)
		{
			return null;
		}
		public Object getChatbot()
		{
			
			return null;
		}
}
