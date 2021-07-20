package com.Day6;

public class TestMethodOverloading {

	public static void main(String[] args) {
		MethodOverloading objMethodOverloading = new MethodOverloading();
		objMethodOverloading.getDateAndTemperature("India", 101);
		objMethodOverloading.getDateAndTemperature1("Maharashtra");
		objMethodOverloading.getDateAndTemperature("Pune");
		objMethodOverloading.getDateAndTemperature11("Haveli");
		objMethodOverloading.getDateAndTemperature("15/7/2021", "22c");
	}

}
