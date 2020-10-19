import java.util.Scanner;

public class Exercise {
    public static void main(String[] args)  {
        Scanner operation = new Scanner(System.in);
        System.out.println("Choose Even Number or Odd Number");
        System.out.println("Please ! Type 1 = Odd Number");
        System.out.println("Please ! Type 2 = Even Number");

      switch (operation.nextInt()){
          case 2:
              for(int i =0;i<=100;i++){
                  while (i%2==0){
                      System.out.println(i);
                      i++;
                  }
              }
              break;
          case 1:
             int x = 0;
             while (x<=100){
                 if(x%2==1){
                     System.out.println(x);
                 }
                 x++;
             }
      }
    }

}

