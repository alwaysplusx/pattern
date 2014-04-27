package org.moon.pattern.bridge.example2;

import org.moon.pattern.bridge.example2.impl.JPGImage;
import org.moon.pattern.bridge.example2.impl.WindowsImageHanderImpl;

public class Client {

	public static void main(String[] args) {
		Image image = new JPGImage();
		image.setImple(new WindowsImageHanderImpl());
		image.show();
	}
	
}
