package Day1.demo01;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /* System.out.println(shuLiangJi(n));*/
        int[] num = str(n);
/*        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }*/
/*
        System.out.println(isHave(n));*/

        for(int i = 1;i < n ;i++){
            if(isHave(i) != 0){
                System.out.println(isHave(i));
            }
        }

    }
    public static int shuLiangJi(int n){
        int i =0;
        while(n != 0){
            n /= 10;
            i ++;
        }
        return i;
    }
    public static int[] str(int n){
        int[] num = new int[shuLiangJi(n)];
        int m =0;
        int i = shuLiangJi(n) -1;
        while (n !=0){
            m = n%10;
            num[i] = m;
            n /= 10;
            i --;
        }
        return num;
    }
    public static int isHave(int n){
        int[] num = str(n);
        int t = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if(num[i] == num[j]){
                    t = 1;
                    break;
                }
                if( t ==1){
                    break;
                }
            }
        }
        return t==1 ? n : 0;
    }
}
