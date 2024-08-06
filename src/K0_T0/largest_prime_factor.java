package K0_T0;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class largest_prime_factor {

  public static boolean isPrime(int n){
    boolean isPrime = true;

    for(int i = 2; i < Math.sqrt(n); i++){
      if(n % i == 0)
        isPrime = false;
    }

    return isPrime;
  }

  public static List<Integer> prime_factor(long n){
    List<Integer> prime_factor_list = new ArrayList<>();

    for(int i = 2; i < Math.sqrt(n); i++){
      if(isPrime(i) && n % i == 0){
        prime_factor_list.add(i);
      }
    }

    return prime_factor_list;
  }

  public static void main(String[] args) {
    List<Integer> lista = prime_factor(600851475143L);
    System.out.println(lista.stream().max(Integer::compareTo).get());
  }
}
