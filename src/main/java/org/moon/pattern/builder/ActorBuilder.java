package org.moon.pattern.builder;

/**
 * 抽象建造者
 * @author wuxin
 * <p>2014年1月24日 下午11:29:32</p>
 */
public abstract class ActorBuilder {

	public abstract void buildType();
	public abstract void buildSex();
	public abstract void buildFace();
	public abstract void buildCostume();
	public abstract void buildHairStyle();
	
	protected Actor actor = new Actor();
	
	public Actor createActor(){
		return actor;
	}
	
	/**
	 * 钩子方法
	 * @return
	 */
	public boolean isBareheader(){
		return false;
	}
	
	/**
	 * 有时也可以将指挥者与建造者的角色想融合
	 */
	public Actor construct(){
		this.buildType();
		this.buildSex();
		this.buildFace();
		this.buildHairStyle();
		this.buildCostume();
		return actor;
	}
	
}
