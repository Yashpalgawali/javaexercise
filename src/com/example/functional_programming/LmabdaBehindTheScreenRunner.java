package com.example.functional_programming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {

		return number % 2 == 0;
	}

}

class SystemOutConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer number) {
		System.out.println(number);
	}

}

class NumberSquareMapper implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer number) {
		// TODO Auto-generated method stub
		return number * number;
	}

}

public class LmabdaBehindTheScreenRunner {

	public static void main(String[] args) {

		Predicate<? super Integer> evenPredicate = createEvenPredicate();
		
		Predicate<? super Integer> oddPredicate = n -> n %2!=0;
		
		List.of(23,46,789,14).stream().filter(evenPredicate).forEach(System.out::println);

		// List.of(23, 46, 789, 14).stream().filter(new
		// EvenNumberPredicate()).forEach(System.out::println);
		// List.of(23, 46, 789, 14).stream().filter(new EvenNumberPredicate()).forEach(
		// new SystemOutConsumer());

		List.of(23, 46, 789, 14).stream().filter(new EvenNumberPredicate()).map(new NumberSquareMapper())
				.forEach(new SystemOutConsumer());

	}

	private static Predicate<? super Integer> createEvenPredicate() {
		return n -> n %2==0;
	}

}
