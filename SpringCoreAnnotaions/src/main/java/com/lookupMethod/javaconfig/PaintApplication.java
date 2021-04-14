package com.lookupMethod.javaconfig;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
//no source code
public class PaintApplication {

	public void animate() {
		WhiteBoad whiteBoad = null;
		List<String> shaps = Arrays.asList(new String[] { "rectangle", "circle" });
		ListIterator<String> ls = shaps.listIterator();
		while (ls.next() != null) {
			String shap = ls.next();
			whiteBoad = getwBoad();
			whiteBoad.setDrawShaps(shap);
			whiteBoad.draw();
		}

	}

	public WhiteBoad getwBoad() {
		return null;
	}

}
