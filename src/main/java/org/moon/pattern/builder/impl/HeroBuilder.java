package org.moon.pattern.builder.impl;

import org.moon.pattern.builder.ActorBuilder;

public class HeroBuilder extends ActorBuilder {

	@Override
	public void buildType() {
		actor.setType("hero");
	}

	@Override
	public void buildSex() {
		actor.setSex("男");
	}

	@Override
	public void buildFace() {
		actor.setFace("爷们");
	}

	@Override
	public void buildCostume() {
		actor.setCostume("戎装");
	}

	@Override
	public void buildHairStyle() {
		actor.setHairstyle("长发");
	}

}
