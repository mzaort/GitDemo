package mzaort.java8;

import java.util.Arrays;

public class Lambada {
	public static final String STD = "stdlib.c";
	public static void main(String[] args) {
		Arrays.asList(1, 2, 3).stream().filter(x -> x % 2 == 0).forEach(System.out::println);
		System.out.println(STD);
	}
}
