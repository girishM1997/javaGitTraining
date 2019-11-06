package com.training;

import java.util.Arrays;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("ram","sham","atul");
		list.forEach(System.out::println);

		for( String each:list) {
			System.out.println(each);
			
			Book book=new Book(1001,"head first Java");
		}
	}

}
