package com.goosen1.config.beetl;

import org.beetl.ext.spring.BeetlGroupUtilConfiguration;

public class BeetlConfiguration extends BeetlGroupUtilConfiguration {

	@Override
	public void initOther() {

		groupTemplate.registerFunctionPackage("ctxPath", "/frame-mp-demo1");

	}

}
