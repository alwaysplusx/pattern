package org.moon.pattern.builder.impl;

import org.moon.pattern.builder.ActorBuilder;

public class DevilBuilder extends ActorBuilder {

	@Override
	public void buildType() {
		actor.setType("devil");
	}

	@Override
	public void buildSex() {
		actor.setSex("男");
	}

	@Override
	public void buildFace() {
		actor.setFace("阴森");
	}

	@Override
	public void buildCostume() {
		actor.setCostume("黑衣");
	}

	@Override
	public void buildHairStyle() {
		actor.setHairstyle("光头");
	}

}
