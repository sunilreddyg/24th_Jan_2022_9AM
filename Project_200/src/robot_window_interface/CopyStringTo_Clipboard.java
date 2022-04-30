package robot_window_interface;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class CopyStringTo_Clipboard 
{

	public static void main(String[] args) throws Exception 
	{

		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		
		
		String path="D:\\Manual Classnotes\\Defect_Handling\\MyResume.docx";
		
		//String selection
		StringSelection spath=new StringSelection(path);
		//Get System clipboard access
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Set selected text into clipboard
		clipboard.setContents(spath, spath);
		
		//Press Control+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);  //Down keys must release after press
	}

}
