package org.moon.pattern.bridge.example2.impl;

import org.moon.pattern.bridge.example2.ImageHander;

public class LinuxImageHanderImpl implements ImageHander {

	@Override
	public void showInScreen(byte[] imgBytes) {
		System.out.println("show in linux screen");
	}

}
