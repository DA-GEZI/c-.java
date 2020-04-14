import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TestDemo {
    /* public static void main(String[] args) {//psvm
         System.out.println("hello");
     }
 }*/
//返回二进制1的个数
    //&1
    //判断每一位上是不是1，让当前数字&1
    //右移前面补1
   /* public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if (((n >>i) & 1) == 1) {
                count++;
            }
        }
        System.out.println("count:" + count);
    }
}*/
  /*  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count=0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        System.out.println("count:" + count);
    }
}*/
    //打印二进制的基数位和偶数位
   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//6            //00000000000000000000000000000110
        for(int i=31;i>=1;i-=2){                 //00000000000000000000000000000110 i>=1时倒数第2位为1是奇数
            System.out.print(((n>>i) & 1)+" ");  //0 0000000000000000000000000000011 所以右移了一位
        }                                        //所以打印出来偶数位的最后1位是1
        System.out.println();
        for(int i=30;i>=0;i-=2){                //00000000000000000000000000000110
            System.out.print(((n>>i) & 1)+" "); //00000000000000000000000000000110 i>=0时最后一位偶数位为0
        }                                       //00000000000000000000000000000110 右移动0位
        System.out.print();                     //所以打印出来奇数位的最后一位是0
    }
}*/
    //java的方法就是c语言当中的函数
  /*  public static int maxNum(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int ret = maxNum(n1, n2);
        System.out.println(ret);
    }
}*///求三个数中的最大值
   /* public static int maxNum(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }
    public static int maxThreeNum(int num1, int num2,int num3) {
        return maxNum(maxNum(num1,num2),num3);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int ret = maxThreeNum(n1, n2, n3);
        System.out.println(ret);
    }
}*/
//实现让两个数相加
    //只有值传递，没有地址传递
    //一个方法可以调用多次
    /*public static int sum(int x, int y) {
        return x + y;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 2;
        int b = 3;
        int ret = sum(a, b);
        System.out.println(ret);
        int ret2=sum(a=3,b=4);
         System.out.println(ret2);
    }
}*/
    //计算5阶乘的和
    /*public static int factor(int n) {
        //每一个数字
        int sum=0;
        for (int i = 1; i <= n; i++) {
            int ret = 1;
            for (int j = 1; j <= i; j++) {
                ret *= j;
            }
            sum += ret;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(factor( 5));
    }
}*/
    /*public static int factor(int n) {
        //每一个数字
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += fac(i);
        }
        return sum;
    }
        public static int fac(int num) {
        int ret = 1;
        for (int i = 1; i <= num; i++) {
            ret *= i;
        }
        return ret;
    }
    public static void main(String[] args) {
        System.out.println(factor( 5));
    }
}*/
    //交换两个数字
   /* public static void main(String[] args) {
        int a=1;
        int b=2;
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
    }
}*/
    //求两个数的和
   /* public static void main(String[] args) {
        int a=1;
        int b=2;
        int sum=(a+b);
        System.out.println(sum);
    }
}*/
   /*public static int sumInt(int a,int b){
       return(a+b);
   }
    public static double sumDouble(double a,double b){
        return(a+b);
    }
    public static void main(String[] args) {
       int a=1;
       int b=2;
        System.out.println(sumInt(a,b));
        double d1=12.2;
        double d2=14.3;
        System.out.println(sumDouble(d1,d2));
    }
}*/
    //重载
    //方法名相同
    //返回值不做要求
    //参数列表不同（参数个数或者参数的类型不同）
    //同一个类当中
    /*public static int sum(int a,int b){
        return a+b;
    }
    public static double sum(double a,double b){
        return a+b;
    }
    public static double sum(double a,double b,double c){
        return a+b+c;
    }
    public static void main(String[] args) {
        int a=1;
        int b=2;
        System.out.println(sum(a,b));
        double d1=12.2;
        double d2=14.3;
        System.out.println(sum(d1,d2));
        double d3=12.2;
        double d4=14.3;
        double d5=13.3;
        System.out.println(sum(d3,d4,d5));
    }
}*/
    //方法的递归
    //要调用自己本身
    //要有一个趋近于终止的条件
    //推倒出 递归的公式：重要
//求n的阶乘
       /*public static int fac(int n){
           if(n==1){
               return 1;
           }
           int tmp= n*fac(n-1);
           return tmp;
       }
    public static void main(String[] args) {
        System.out.println(factor( 5));
    }
}*/
    //打印每一位123
 /*public static int func1(int n){
           if(n>9){
               func1(n/10);// 123/10=12余数3  12/10=1余数2
           }
     System.out.println(factor(n%10);//1%10=0余数1
 }
    public static void main(String[] args) {
      func1(123);
    }
}*/
    //求1+......+5
   /* public static int sum(int n) {
          if(n==1){
              return n;
          }
          return n+sum(n-1);
    }
    static void main(String[] args) {
        System.out.println(5);
    }
}
*/








