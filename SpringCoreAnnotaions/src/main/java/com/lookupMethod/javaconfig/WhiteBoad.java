package com.lookupMethod.javaconfig;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class WhiteBoad {
	private String drawShaps;

	public void setDrawShaps(String drawShaps) {
		this.drawShaps = drawShaps;
	}
	public String draw() {
		System.out.println("Drawing the shap"+drawShaps);
		return drawShaps;
	}
}
