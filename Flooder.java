package bhelp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Flooder
{
    public static void main(String args[]) throws AWTException, InterruptedException
    {
        int arr[] = new int[4];
        arr[1]=1;arr[2]=0;arr[3]=0;arr[4]=10000;
        Scanner sc = new Scanner(System.in);
        Flooder alpha = new Flooder();
        String myArray[] = {"Test Case 1", "This is from Test case 1","Yes its sure that this is from text case 1"};
        String myArray1[] = {"This is from text case 2","Text case 2","Yes its sure that its from test case 2"};
    	Robot robot = new Robot();
        System.out.println("Please Enter the delay in between sending messages(IN SECONDS)");
        arr[2]= sc.nextInt()*1000;
        System.out.println("Please Enter the delay in between switching Arrays(IN SECONDS)");
        arr[3]= sc.nextInt()*1000;
        long st = System.currentTimeMillis();
        long wt = arr[3];
        long et = st+wt;
        sc.nextLine();
        System.out.println("Do you want to send messages predefined or you want to send your own messages");
        String Choice = sc.nextLine().toUpperCase();
        if(Choice.equals("YES"))
        	alpha.Stroke(arr[2]);
        else {
        System.out.println("Spam will start in 10(s) Please select your targetted window");
        Thread.sleep(arr[4]);
        for(int v = 0;v<myArray.length;)
			{  
				 while(System.currentTimeMillis()<et)
        	     {
					 Thread.sleep(arr[2]);
					 String text = myArray[v];
                     StringSelection stringSelection = new StringSelection(text);
                     Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                     clipboard.setContents(stringSelection, null);
                     robot.keyPress(KeyEvent.VK_CONTROL);
                     robot.keyPress(KeyEvent.VK_V);
                     robot.keyRelease(KeyEvent.VK_CONTROL);
                     robot.keyRelease(KeyEvent.VK_V);
                     robot.keyPress(KeyEvent.VK_ENTER);
                     robot.keyRelease(KeyEvent.VK_ENTER);
                     double m = myArray.length,mi = 1,r = m-mi+1;
                     v = (int) (Math.random()*r);
        	     }
				 while(true)
				 {
					 Thread.sleep(arr[2]);
					 String text = myArray1[v];
                     StringSelection stringSelection = new StringSelection(text);
                     Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                     clipboard.setContents(stringSelection, null);
                     robot.keyPress(KeyEvent.VK_CONTROL);
                     robot.keyPress(KeyEvent.VK_V);
                     robot.keyRelease(KeyEvent.VK_CONTROL);
                     robot.keyRelease(KeyEvent.VK_V);
                     robot.keyPress(KeyEvent.VK_ENTER);
                     robot.keyRelease(KeyEvent.VK_ENTER);
                     double m = myArray.length,mi = 1,r = m-mi+1;
                     v =(int) (Math.random()*r);
				 }
			     
			 }
        }
		  sc.close();
    }
    void Stroke(int delay) throws AWTException, InterruptedException
    {
    	@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
    	Robot robot = new Robot();
    	System.out.println("Please enter the Phrase you want to spam");
    	String text = sc.nextLine();
    	StringSelection stringSelection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
        System.out.println("Spamming will Start in 10(s)");
        Thread.sleep(10000);
        while(true)
        {
        	Thread.sleep(delay);
        	robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        }
     } 
}
//updated code Copyright© 
