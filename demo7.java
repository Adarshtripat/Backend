//prient table
import java.util.Scanner;
public class demo7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("inter any number for table ");
        int num = sc.nextInt();
        for(int i =1;i<=10;i++){
           int result = num*i;
           System.out.println(num+"x"+i+"="+ result);
        }
        myfun();
    }
    //foctorial in java
public static void myfun(){
    Scanner sc = new Scanner (System.in);
    System.out.println("inter any number for factorial ");
    int num = sc.nextInt();
    int sum =1;
    for(int j = 1;j<=num;j++){
        sum= sum*j;
        System.out.println("result is :"+sum);
    }
}
}
