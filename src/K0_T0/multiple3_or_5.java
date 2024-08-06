package K0_T0;

public class multiple3_or_5 {

  public static boolean multipe_of_3(int n){
    return n % 3 == 0;
  }

  public static boolean multipe_of_5(int n){
    return n % 5 == 0;
  }

  public static int sum_multiples_bellow_1000(){
    int sum = 0;
    for(int i = 0; i < 1000; i++){
      if(multipe_of_3(i) || multipe_of_5(i)){
        sum += i;
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println("Sum of multiples of 3 or 5 bellow 1000: " + sum_multiples_bellow_1000());

  }
}