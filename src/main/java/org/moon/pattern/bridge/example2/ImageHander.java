package org.moon.pattern.bridge.example2;

/**
 * 不同的系统不同的有不同的图片处理方式
 * 用该接口来控制系统维度的变化
 * @author wuxin
 * <p>Jan 25, 2014 6:26:58 PM</p>
 */
public interface ImageHander {
	public void showInScreen(byte[] imgBytes);
}
