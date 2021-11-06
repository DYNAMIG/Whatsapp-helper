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
        int i = 1;
        String myArray[] = {"I shouldn’t have fought with you","Please, accept my apologies for fighting with you"
        		,"I must apologize for this grave mistake","How stupid thoughtless of me it was."
        		,"Please, accept my apologies for this act","Pardon me for this grave mistake"
        		,"It’s all my fault.","I really screwed up this time","I’m ashamed of my behavior"
        		,"I truly regret my offensive behaviour","It won’t happen again"
        		,"Maine jo bhi kaha uske liye mai dil se mafi mangta hu"
        		,"Itni buri tarike se batt karne ke liye maff karna"
        		,"Maine jo bhi kaha uske liye mafi cahta hu, mai thume hurt nahi karna cahta tha"
        		,"Muje woh nahi kehna chaiye tha please maff kardo","Please......maff kardoooooo"
        		,"Tum meri life ho.....","Please muje chodkar mat jana"
        		,"Mai thumse bhot pyar karta hu please naraz mat ho mujse..."
        		,"Jab tak thum muje maff nahi karogi mai khana nahi khaunga"
        		,"Mai depression mei jaa raha hu, please maff kardo muje"
        		,"Mai thumare bina jeee nahi sakta......"
        		,"Sorry.................................................."
        		,"Mera kutta bhi ro raha hai muje rota dhekar..."
        		,"Mere itne aasu beh rahe hai ki abb aanke dard kar rahi hai"
        		,"Please yeh meri akhri mistake hai muje maff kardoooooo"
        		,"Agge se aisa nahi karunga mai please.....!"
        		,"Pata nahi uss waqt mere dimag mei kya chal raha tha ki maine thumse ladai kar li..!"
        		,"Mera bolne ka style uss waqt bhot hurt karne wala tha maine observe kiya, abb please maff kardo!"
        		,"Please bas ekk bar keh do ki tum naraz nahi ho..!","Thumare bina life meaningless hai"
        		,"Jaise pen ka cap pen ke bina nahi reh sakta waise hi mai thumare bina nahi reh sakta!"
        		,"Jaise Graphic card ke bina gaming pc adhura hai waise hi mai thumare bina adhura hu"
        		,"Mai thumare liye games khelna chod dunga"
        		,"Rote rote mere sarr mei dard ho raha hai please abb tho maff kardo muje"
        		,"Mai itne message iss liye kar raha hu kyoki muje malum hai ki agar maine thume kho diya tho mai puri life regret karunga"
        		,"죄송 해요 (joesong haeyo)"
        		,"Muje itne time tak torelate karne ke liye bhot shukriya please abb reply kardo aur ladai khatam karte hai","༎ຶ‿༎ຶ","༼;´༎ຶ ۝ ༎ຶ༽","( ꈨຶ ˙̫̮ ꈨຶ )","(-̩̩-̩̩-̩̩-̩̩-̩̩_-̩̩-̩̩-̩̩-̩̩-̩̩)","ಥ╭╮ಥ","( ･ั﹏･ั)"};
    	Robot robot = new Robot();
        Scanner sc = new Scanner(System.in);
        System.out.println("Spam will start in 5s Please select your targeted window");
        
          
          while (i==1)
          {
			for(int v = 0;v<myArray.length;)
			{  
				Thread.sleep(5000);
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
                 double max = myArray.length;
                 double min = 1;
                 double range = max-min+1;
                 v =(int) (Math.random()*range);
			 }
		   }
    
       }
    }