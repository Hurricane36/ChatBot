package chat.tests;
import chat.model.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import chat.controller.ChatController;

public class ControllerTest
{

	private ChatController testController;
	@Before
	public void setUp() throws Exception
	{
		testController = new ChatController();
	}

	@After
	public void tearDown() throws Exception
	{
		testController = null;
	}

	@Test
	public void testChatController()
	{
		assertNotNull("Chatbot data member not initialized", testController.GetChatbot());
	}

	@Test
	public void testInteractWithChatbot()
	{
		assertNotNull("Stub method used, implement with code", testController.interactwithchatbot(""));
		assertNotNull("Null should not ever be returned", testController.interactwithchatbot(null));
	}

	@Test
	public void testUseChatbotCheckers()
	{
		assertTrue("Spooky tester method not implemented", testController.UseChatbotCheckers("spooky").contains("Halloween"));
	}

	@Test
	public void testGetChatbot()
	{
		assertNotNull("Chatbot data member not initialized", testController.GetChatbot());
	}

}
