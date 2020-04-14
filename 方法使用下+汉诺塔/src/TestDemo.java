public class TestDemo {
    /* public static void func1(int n){
         if(n>9){
             func1(n/10);
         }
         System.out.println(n%10);
     }
     public static void main(String[] args) {
        func1(123);
 }
}*/
    //求1+......+10
/*public static  int sum(int n) {
    if (n== 1) {
        return 1;
    }
    return n+sum(n-1);
}
       public static void main(String[] args) {
           System.out.println(sum(5));
   }
}*/
//写一个递归，输入非负整数，返回组成它的数字之和，//1792
    /*public static int func1(int n) {
        if (n > 9) {
            return n % 10 + func1(n / 10);
        }
        return n; m, m, m n                            ,   m
    }
        public static void main(String[] args) {
        System.out.println(func1(1729));
    }
}*/
    //斐波那契
     /* public static int fabonaci2(int n){
          int f1=1;
          int f2=1;
          int f3=0;
          for(int i=3;i<=n;i++){
              f3=f1+f2;
              f1=f2;
              f2=f3;
          }
          return f3;
      }
//
    public static void main(String[] args) {
        System.out.println(fabonaci2(n));
    }
}*/
     //汉诺塔
     //n为盘子个数
    //1个：2^1-1  2个：2^2-1  3个：2^3-1
    //pos1起始位置，pos2中途位置，pos3目的地位置
/* public static void move(char pos1,char pos2){
        System.out.println(pos1+"->"+pos2+" ");
    }
     public static void hanoi(int n,char pos1,char pos2,char pos3) {
         if (n == 1) {
             move(pos1, pos3);
         } else {
             hanoi(n - 1, pos1, pos3, pos2);//将n-1个盘子移动到目的地pos2，经过pos3
             move(pos1, pos3);
             hanoi(n - 1, pos2, pos1, pos3);
         }
     }
    public static void main(String[] args) {
         hanoi(1,'A','B','C');
         System.out.println();
         hanoi(2,'A','B','C');
        System.out.println();
         hanoi(3,'A','B','C');
        System.out.println();
    }
}*/
   //n个台阶 有几种跳法
    //青蛙只能一次跳1个或者两个
    //1个台阶：一种跳法
    //2个台阶：一次跳一个
    //           一次跳两个 共两种跳法
    //3个台阶：一次跳一个剩下(n-1)=2个跳法     共三种跳法
    //4个台阶：一次跳1个剩下(n-1)=3个台阶跳法  三种跳法
    //         一个跳两个剩下(n-2)=2个台阶跳法 两种跳法
    //                                         总共5种跳法

   /* public static int JumpFloor(int target){
          if(target==1){
              return 1;
          }else if(target==2){
             return 2;
          }else{
             return JumpFloor(target-1)+JumpFloor(target-2);
          }
    }
    public static void main(String[] args) {
        System.out.println(JumpFloor(3) );
    }
    }*/


