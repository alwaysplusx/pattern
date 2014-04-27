package org.moon.pattern.bridge.example2.impl;

import org.moon.pattern.bridge.example2.Image;

public class JPGImage extends Image {

	@Override
	public void show() {
		System.out.println("jpg image");
		imple.showInScreen(null);
	}

}
