package K0_T0;

public class even_fibbonaci_numbers {

  public static int fibbonaci(int n){
    if(n <= 1){
      return 1;
    }else{
      return fibbonaci(n-1) + fibbonaci(n - 2);
    }
  }

  public static int sum_of_even_valued_fibonacci(){
    int sum = 0;
    int fibbonaci_number = 0;
    int i = 0;
    while(fibbonaci_number <= 4000000){
      fibbonaci_number = fibbonaci(i);
      if(fibbonaci_number % 2 == 0){
        sum += fibbonaci_number;
      }
      i++;
    }
    return sum;
  }

  public static void main(String[] args) {
    for(int i = 0; i < 10; i++){
      System.out.println(fibbonaci(i));
    }
    System.out.println("Result: " + sum_of_even_valued_fibonacci());
  }
}
