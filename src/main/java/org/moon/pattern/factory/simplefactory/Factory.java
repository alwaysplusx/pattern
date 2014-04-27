package org.moon.pattern.factory.simplefactory;

import org.moon.pattern.factory.simplefactory.impl.ApplePhone;
import org.moon.pattern.factory.simplefactory.impl.OtherPhone;
import org.moon.pattern.factory.simplefactory.impl.SamSungPhone;

public class Factory {

	public static Phone createPhone(String type){
		Phone phone = null;
		if("apple".equals(type)){
			phone = new ApplePhone();
		}else if("samsung".equals(type)){
			phone = new SamSungPhone();
		}else {
			phone = new OtherPhone();
		}
		return phone;
	}
}
