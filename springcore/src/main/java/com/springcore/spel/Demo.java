package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{22+10}")
	private int x;
	@Value("#{1+97+23+22}")
	private int y;
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private int z;
	@Value("#{ new java.lang.String('Priyanka')}")
	private String name;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

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
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ",name =" + name+"]";
	}

}
