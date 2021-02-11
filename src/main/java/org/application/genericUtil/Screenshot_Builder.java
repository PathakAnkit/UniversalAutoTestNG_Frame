package org.application.genericUtil;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;

public class Screenshot_Builder {
	
		public static String getFormatedDateTime(){
			SimpleDateFormat sd = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
			return sd.format(new Date());
		}
		

		public static void takeDesktopScreenshot(String folder){
			
		String timeStamp=getFormatedDateTime();
		
		try{
			Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle screenRect = new Rectangle(d);
			Robot r=new Robot();
			BufferedImage img=r.createScreenCapture(screenRect);
			File output=new File(folder + timeStamp + ".png");
			ImageIO.write(img, "png", output);
		}
		catch(Exception e)
		{	
			System.out.println(e.getMessage());
		}
	}

  //end of class
}
