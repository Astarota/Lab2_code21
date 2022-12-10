import java.util.Scanner;

public class Main {
    public static void task1(){
        int number;
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        if(number>10) {
            int secondLastDigit = (number % 100) / 10;
            System.out.println(secondLastDigit);
        }
        else{
            System.out.println("-1");
        }
    }
    public static void task2(){
        int number2;
        Scanner sc=new Scanner(System.in);
        number2=sc.nextInt();
        if (number2>=10){
            while(number2>100) {
                number2 /= 10;
            }
            number2%=10;
                System.out.println(number2);
        }
        else{
            System.out.println("-1");
        }
    }
    public static void task3(){
        int i,fact=1;
        int number3;//It is the number to calculate factorial
        Scanner sc=new Scanner(System.in);
        number3=sc.nextInt();
        for(i=1;i<=number3;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number3+" is: "+fact);
    }
    public static void task4(){
        int n0 = 1;
        int n1 = 1;
        int n2;
        int count;
        Scanner sc=new Scanner(System.in);
        count=sc.nextInt();

        System.out.print(n0+" "+n1+" ");
        for(int i = 3; i <= count; i++){
            n2=n0+n1;
            System.out.print(n2+" ");
            n0=n1;
            n1=n2;
        }
        System.out.println();
    }
    public static void task5(){
        int count;
        Scanner sc=new Scanner(System.in);
        count=sc.nextInt();
        double product1=1;
        double product2;
        for(int i=1;i<=count;i++){
            product2=1+(1/Math.pow(i,2));
            product1*=product2;
        }
        System.out.println(product1);
    }
    public static void task6(){
        double product1=1;
        double product2;
        double product3;
        double product4=1;
        int x;
        Scanner sc =new Scanner(System.in);
        x=sc.nextInt();
        int count=6;
        for(int i=1;i<=count;i++){
            product2=x-Math.pow(2,i);
            product1*=product2;
            product3=x-(Math.pow(2,i)-1);
            product4*=product3;
        }
        product1/=product4;
        System.out.println(product1);
    }
    public static void task7(){
        double product2;
        double product3;
        double product4=1;
        double x;
        Scanner sc =new Scanner(System.in);
        x=sc.nextDouble();
        int count=7;
        double product1=x;
        for(int i=1;i<=count;i++){
            product2=product1/(Math.pow(x,2)+Math.pow(2,i));
            product1=product2;
        }
        product1/=Math.pow(x,2)+256/Math.pow(x,2);
        System.out.println(product1);
    }


    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
}