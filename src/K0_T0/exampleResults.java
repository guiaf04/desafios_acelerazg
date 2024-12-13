package K0_T0;

import java.util.List;

import static K0_T0.largest_prime_factor.prime_factor;

public class exampleResults {
  public static void main(String[] args) {
    List<Integer> lista = prime_factor(600851475143L);
    System.out.println("Question 1: " + even_fibbonaci_numbers.sum_of_even_valued_fibonacci());
    System.out.println("Question 2: "+ lista.stream().max(Integer::compareTo).get());
    System.out.println("Question 3: " + multiple3_or_5.sum_multiples_bellow_1000());
  }
}
