package com.training;

import java.util.Arrays;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("ram","sham","atul");
		list.forEach(System.out::println);

	}

}
