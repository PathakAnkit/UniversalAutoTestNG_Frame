package org.application.genericUtil;

import org.application.constant.UniversalConstants;
import org.sikuli.script.Screen;

public class Sikuli_Builder {

	public static void sikuliClick(String ImageName) {
		try {
			Screen s = new Screen();
			s.click(UniversalConstants.SIKULI_PATH + ImageName + ".png");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void sikuliDoubleClick(String ImageName) {
		try {
			Screen s = new Screen();
			s.doubleClick(UniversalConstants.SIKULI_PATH + ImageName + ".png");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void sikuliSendText(String ImageName, String Text) {
		try {
			Screen s = new Screen();
			s.type(UniversalConstants.SIKULI_PATH + ImageName + ".png", Text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void sikuliHover(String ImageName) {
		try {
			Screen s = new Screen();
			s.hover(UniversalConstants.SIKULI_PATH + ImageName + ".png");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void sikuliFind(String ImageName) {
		try {
			Screen s = new Screen();
			s.find(UniversalConstants.SIKULI_PATH + ImageName + ".png");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// end of class
}
