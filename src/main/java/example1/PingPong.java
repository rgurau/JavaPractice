package example1;

import java.util.Scanner;

public class PingPong {

    public void returnValue() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100");
        Integer value = Integer.valueOf(input.nextLine());

        int a = returnDivResult(value, 3);
        int b = returnDivResult(value, 5);
        if(a == 0) System.out.println("ping");
        if(b == 0) System.out.println("pong");
    }

    public Integer returnDivResult(Integer i, Integer d){
        int a = i % d;
        return a;
    }


}
