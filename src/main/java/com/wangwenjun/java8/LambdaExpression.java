package com.wangwenjun.java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by wangwenjun on 2016/10/12.
 */
public class LambdaExpression {

	public static void main(String[] args) {
		Comparator<Apple> byColor = new Comparator<Apple>() {
			@Override
			public int compare(Apple o1, Apple o2) {
				return o1.getColor().compareTo(o2.getColor());
			}
		};

		List<Apple> list = Collections.emptyList();

		list.sort(byColor);

		// compare
		Comparator<Apple> byColor2 = (o1, o2) -> o1.getColor().compareTo(o2.getColor());
		
		// run
		Runnable r = () -> {};

		// apply - 有入参，有返回值
		Function<String, Integer> flambda = s -> s.length();
		Function<Apple, Boolean> f = (a) -> a.getColor().equals("green");

		// test - 有入参，返回布尔值
		Predicate<Apple> p = (Apple a) -> a.getColor().equals("green");
		
		// accept - 有入参，没有返回值
		Consumer<String> c = (a) -> System.out.println("-->" + a.length());
		c.accept("abc");
		
		// get -> 无入参，有返回值
		Supplier<String> s = () -> "green";
		System.out.println(s.get());
	}
}
