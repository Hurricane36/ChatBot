package gui.view;
import javax.swing.*;

import gui.controller.GUIController;
public class ChatFrame extends JFrame
{
	private GUIController appController;
	private ChatPanel appPanel;
	
public ChatFrame(GUIController appController)
{
	super();
	this.appController = appController;
	this.appPanel = new ChatPanel(appController);
	setupFrame();
}


private void setupFrame()	
{
	this.setContentPane(appPanel);
}
	
}