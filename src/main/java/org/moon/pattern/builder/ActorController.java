package org.moon.pattern.builder;

/**
 * 指挥类,用于控制各个部件的创建步骤
 * @author wuxin
 * <p>2014年1月24日 下午11:35:36</p>
 */
public class ActorController {
	
	public Actor construct(ActorBuilder builder) {
		builder.buildType();
		builder.buildSex();
		builder.buildFace();
		builder.buildCostume();
		// 钩子方法,抽象建造者的子类可以覆盖定义的方法来控制对象是否创建
		if (builder.isBareheader()) {
			builder.buildHairStyle();
		}
		return builder.createActor();
	}
	
}
