package training1;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import org.openqa.selenium.WebElement;
import java.awt.event.KeyEvent;

public class AutomateSTK {

	public static void main(String[] args) throws AWTException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/sendtokindle");
		driver.manage().window().maximize();
		driver.findElement(By.id("s2k-dnd-sign-in-button-text")).click();
		driver.findElement(By.id("ap_email_login")).sendKeys("mhegulaj@amazon.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/span/form/span/span/input")).click();
		driver.findElement(By.id("ap_password")).sendKeys("123456");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("s2k-dnd-add-your-files-button")).click();
		String filePath1="\"C:\\Users\\vignesdr\\Downloads\\YJOP_PDF\\Endnote.pdf\" \"C:\\Users\\vignesdr\\Downloads\\YJOP_PDF\\Tamil_pdf.pdf\" \"C:\\Users\\vignesdr\\Downloads\\YJOP_PDF\\Test_CN.pdf\" \"C:\\Users\\vignesdr\\Downloads\\YJOP_PDF\\Marati_pdf.pdf\" \"C:\\Users\\vignesdr\\Downloads\\YJOP_PDF\\Internal_Hyperlinks.pdf\"";

		Robot rb=new Robot();
		rb.delay(2000);
	

	    StringSelection ss1 = new StringSelection(filePath1);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300);");
		
		rb.delay(2000);

		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[4]/div[1]/div[3]/div[1]/div[1]/div/div[4]/div[3]/span/span")).click();
		
		String filePath2="\"C:\\Users\\vignesdr\\Downloads\\YJOP_PDF\\Text-Image.pdf\" \"C:\\Users\\vignesdr\\Downloads\\YJOP_PDF\\corruptedpdf.pdf\" \"C:\\Users\\vignesdr\\Downloads\\YJOP_PDF\\Malayalam_pdf.pdf\" \"C:\\Users\\vignesdr\\Downloads\\YJOP_PDF\\Non_Friction-merged.pdf\"";

		Robot rb2=new Robot();
		rb2.delay(2000);
		StringSelection ss2 = new StringSelection(filePath2);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);
		
		rb2.keyPress(KeyEvent.VK_CONTROL);
		rb2.keyPress(KeyEvent.VK_V);
		
		rb2.keyRelease(KeyEvent.VK_CONTROL);
	    rb2.keyRelease(KeyEvent.VK_V);
		
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.delay(3000);
		
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
		
		rb.delay(2000);

		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[4]/div[1]/div[3]/div[1]/div[1]/div/div[4]/div[3]/span/span")).click();
		
		String filePath3="\"C:\\Users\\vignesdr\\Downloads\\YJOP_PDF\\Image_link.pdf\" \"C:\\Users\\vignesdr\\Downloads\\YJOP_PDF\\Rotated pages.pdf\" \"C:\\Users\\vignesdr\\Downloads\\YJOP_PDF\\Call of Cthulhu 7th Edition Quick-Start Rules.pdf\" \"C:\\Users\\vignesdr\\Downloads\\YJOP_PDF\\Landscape_new.pdf\"";

		Robot rb3=new Robot();
		rb3.delay(2000);
		StringSelection ss3 = new StringSelection(filePath3);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss3, null);
		
		rb3.keyPress(KeyEvent.VK_CONTROL);
		rb3.keyPress(KeyEvent.VK_V);
		
		rb3.keyRelease(KeyEvent.VK_CONTROL);
	    rb3.keyRelease(KeyEvent.VK_V);
		
		
		rb3.keyPress(KeyEvent.VK_ENTER);
		rb3.keyRelease(KeyEvent.VK_ENTER);
		rb3.delay(3000);
		
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 100);");
		
		rb.delay(2000);

		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[4]/div[1]/div[3]/div[1]/div[1]/div/div[4]/div[3]/span/span")).click();
		
		String filePath4="\"C:\\Users\\vignesdr\\Downloads\\YJOP_PDF\\passwordpdf.pdf\" \"C:\\Users\\vignesdr\\Downloads\\YJOP_PDF\\Test_JP_Vertical_pdf.pdf\" \"C:\\Users\\vignesdr\\Downloads\\YJOP_PDF\\Test_JP_Horizontal_pdf.pdf\" \"C:\\Users\\vignesdr\\Downloads\\YJOP_PDF\\Text-Image.pdf\"";

		Robot rb4=new Robot();
		rb3.delay(2000);
		StringSelection ss4 = new StringSelection(filePath3);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss4, null);
		
		rb4.keyPress(KeyEvent.VK_CONTROL);
		rb4.keyPress(KeyEvent.VK_V);
		
		rb4.keyRelease(KeyEvent.VK_CONTROL);
	    rb4.keyRelease(KeyEvent.VK_V);
		
		rb4.keyPress(KeyEvent.VK_ENTER);
		rb4.keyRelease(KeyEvent.VK_ENTER);
		rb4.delay(3000);
		
		driver.findElement(By.id("s2k-r2s-send-button")).click();
	}

}
