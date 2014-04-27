package org.moon.pattern.bridge.example2;

/**
 * 图片抽象类
 * 是应用该抽象类来控制图片类型维度的变化
 * @author wuxin
 * <p>Jan 25, 2014 6:23:34 PM</p>
 */
public abstract class Image {
	
	protected ImageHander imple;
	
	public void setImple(ImageHander imple) {
		this.imple = imple;
	}
	
	public abstract void show();
	
}
