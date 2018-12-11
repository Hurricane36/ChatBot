package chat.view;
import javax.swing.JPanel;
import chat.controller.ChatController;
import chat.controller.IOController;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class ChatPanel extends JPanel
{
	private ChatController appController;
	private JTextField chatField;
	private JTextArea chatArea;
	private SpringLayout appLayout;
	private JButton saveButton;
	private JButton loadButton;
	private JButton chatButton;
	private JButton checkerButton;
	private JScrollPane chatPane;
	
	
	
	public ChatPanel(ChatController appController)
	{
		super();
		this.appController = appController;
		appLayout = new SpringLayout();
		saveButton = new JButton("Save");
		loadButton = new JButton("Load");
		chatButton = new JButton("Chat");
		checkerButton = new JButton("Check Text");
		chatField = new JTextField("Talk to the bot here", 50);
		chatArea = new JTextArea("Chat Area", 20, 50);
		chatPane = new JScrollPane();
		
		
		
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
			
	}
	private void setupScrollPane()
	{
		chatArea.setEditable(false);
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		
		chatPane.setViewportView(chatArea);
		chatPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		chatPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(800,600));
		this.setBackground(Color.RED);
		this.add(chatPane);
		this.add(chatButton);
		this.add(saveButton);
		this.add(loadButton);
		this.add(checkerButton);
		this.add(chatField);	
	}
	
	private void setupLayout()
	{
		
		
		appLayout.putConstraint(SpringLayout.SOUTH, saveButton, -81, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, saveButton, -245, SpringLayout.EAST, this);
		
		appLayout.putConstraint(SpringLayout.WEST, saveButton, 44, SpringLayout.EAST, loadButton);
		appLayout.putConstraint(SpringLayout.SOUTH, loadButton, -81, SpringLayout.SOUTH, this);
		
		appLayout.putConstraint(SpringLayout.NORTH, chatButton, 0, SpringLayout.NORTH, saveButton);
		appLayout.putConstraint(SpringLayout.WEST, chatButton, 45, SpringLayout.EAST, saveButton);
		appLayout.putConstraint(SpringLayout.SOUTH, chatButton, -81, SpringLayout.SOUTH, this);
		
		appLayout.putConstraint(SpringLayout.WEST, loadButton, 28, SpringLayout.EAST, checkerButton);
		appLayout.putConstraint(SpringLayout.EAST, loadButton, 189, SpringLayout.EAST, checkerButton);
		appLayout.putConstraint(SpringLayout.SOUTH, checkerButton, -81, SpringLayout.SOUTH, this);
		
		
		appLayout.putConstraint(SpringLayout.NORTH, loadButton, 28, SpringLayout.SOUTH, chatField);
		appLayout.putConstraint(SpringLayout.NORTH, saveButton, 28, SpringLayout.SOUTH, chatField);
		appLayout.putConstraint(SpringLayout.NORTH, checkerButton, 28, SpringLayout.SOUTH, chatField);
	
		
		
		
		appLayout.putConstraint(SpringLayout.EAST, chatButton, -14, SpringLayout.EAST, chatPane);
		appLayout.putConstraint(SpringLayout.WEST, checkerButton, 0, SpringLayout.WEST, chatPane);
		appLayout.putConstraint(SpringLayout.EAST, checkerButton, 136, SpringLayout.WEST, chatPane);
		appLayout.putConstraint(SpringLayout.NORTH, chatField, 30, SpringLayout.SOUTH, chatPane);
		appLayout.putConstraint(SpringLayout.WEST, chatField, 0, SpringLayout.WEST, chatPane);
		appLayout.putConstraint(SpringLayout.EAST, chatField, 0, SpringLayout.EAST, chatPane);
		appLayout.putConstraint(SpringLayout.NORTH, chatPane, 50, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, chatPane, 50, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, chatPane, -50, SpringLayout.EAST, this);
		
		
		
		
		
		
		
		
	}
	
	
	
	private void setupListeners()
	{
		chatButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userText = chatField.getText();
				String response = "";
				response = appController.interactwithchatbot(userText);
				chatArea.append(response);
				chatArea.setCaretPosition(chatArea.getDocument().getLength());
				chatField.setText("");
			}
			
		});
		
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click)
			{
				String chatText = chatArea.getText();
				String path = ".";
				IOController.saveText(appController,  path, chatText);
				chatArea.setText("Chat Saved!");
			}
		});
		
		loadButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent click)
			{
				
				
			}
			
		});
		
		checkerButton.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent click)
			{
				
				
			}
			
		});
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
