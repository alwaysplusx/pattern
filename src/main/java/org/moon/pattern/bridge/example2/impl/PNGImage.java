package org.moon.pattern.bridge.example2.impl;

import org.moon.pattern.bridge.example2.Image;

public class PNGImage extends Image{

	@Override
	public void show() {
		System.out.println("png image");
		imple.showInScreen(null);
	}

}
