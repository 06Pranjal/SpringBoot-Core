package com.SpringCore.SPEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
public class Demo {
	@Value("#{22+11}")
	private int x;
	@Value("#{10+11}")
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + "]";
	}
	
}
