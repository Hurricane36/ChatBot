package chat.controller;
import javax.swing.JOptionPane;

import chat.model.ChatBot;
import chat.view.*;
public class ChatController
{
	private ChatBot SimpleBot;
	private ChatFrame appFrame;
	public ChatController()
	{
		SimpleBot = new ChatBot();
		appFrame = new ChatFrame(this);
	}
	public void start()
	{
		
	}
	public String interactwithchatbot(String text)
	{
		String output = "";
		output = SimpleBot.processText(text);
		return output;
	}
	
		public String UseChatbotCheckers(String text)
		{
			
			return "Halloween";
		}
		
		private void close()
		{
			System.exit(0);
		}
		
		public void handleErrors(Exception error)
		{
			JOptionPane.showMessageDialog(appFrame, error.getMessage());
		}
		
		public ChatBot GetChatbot()
		{
			
			return SimpleBot;
		}
		public ChatFrame getChatFrame()
		{
			return appFrame;
		}
		
		
}
