package com.lookup.annotation;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
abstract public class MathLearning {
	public void add(int i,int j) {
		QMath qMath=null;
		qMath=getQMath();
		qMath.setI(i);
		qMath.setJ(j);
		int sum = qMath.sum();
		System.out.println("Sum of two number"+sum);
	}
	@Lookup
	public QMath getQMath() {
		return null;
	}
	
}
