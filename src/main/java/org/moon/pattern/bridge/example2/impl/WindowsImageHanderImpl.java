package org.moon.pattern.bridge.example2.impl;

import org.moon.pattern.bridge.example2.ImageHander;

public class WindowsImageHanderImpl implements ImageHander{

	@Override
	public void showInScreen(byte[] imgBytes) {
		System.out.println("show in windows screen");
	}

}
