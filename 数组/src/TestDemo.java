import java.util.Arrays;

public class TestDemo {
    //在同一个类中定义多个方法
    //要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
   /* public static double Max3(int a,int b,double c){
        double max3=(a>b?a:b)>c?(a>b?a:b):c;
        return max3;
    }
    public static double Max2(double x,double y){
       return (x>y?x:y);
    }
    public static int Max1(int x,int y){
       return (x>y?x:y);
    }
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int max1 = Max1(a, b);
        System.out.println("max1=" + max1);
        double a1 = 1.1;
        double b1 = 2.2;
        double max2 = Max2(a1, b1);
        System.out.println("max2=" + max2);
        int a2 = 1;
        int a3 = 2;
        double b2 = 1.1;
        double max3 = Max3(a2, a3, b2);
        System.out.println("max3=" + max3);
    }
}*/
    //用斐波那契求第n项
    /*public static int fabonaci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fabonaci(n - 1) + fabonaci(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(fabonaci(40));
    }
}*/
    //调整数组顺序使得奇数位于偶数之前
   /* public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i;
        int j;
        for (i = 0; i < 10; i++) {
            for (j = i + 1; j < 10; j++) {
                if (arr[j] % 2 != 0) {
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}*/
    //有一组数据，只有一个数字是出现一次，其他是两次,找出这个数字
   /* public static void main(String[] args) {
    int []arr={1,1,2,2,4,3,4,5,5};
    int i=0;
    int j=0;
    int count;
    for(i=0;i<9;i++){
        count =0;
        for(j=0;j<9;j++){
            if(arr[i]==arr[j])
                count ++;

        }if(count==1){
            System.out.println(arr[i]);
        }
    }
}*/
    //数组
    /*public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] array2 = new int[]{11, 22, 33, 44};
    int[] array3 = new int[4];//大小为4，为4个零
    System.out.println(array);
}
}*/
    //求长度
/*    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        //int len = array.length;//属性
        //System.out.println(len);
        //不能取等号 i<=array会越界
        for(int i=0;i<array.length;i++){//for(数组当中每一个元素的类型：打印的数组名称)
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for(int val:array){
            System.out.print(val+" ");
        }
    }
}*/
   /* public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        System.out.println(array[100]);//越界
    }
}*/
    //数组进行参数传递
    /*public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        printArray(array);
    }
}*/
//交换两个数字
    /*public static void swap(int[] array) {
        int tmp = array[0];
        array[0] = array[1];
        array[1] = tmp;
    }
    public static void main(String[] args) {
        int[] array1 = {1, 2};
        System.out.println(array1[0] + " " + array1[1]);
        swap(array1);
        System.out.println(array1[0] + " " + array1[1]);
    }
}*/
   /* public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //String ret = Arrays.toString(array);//将数组以字符串形式输出
        System.out.println(Arrays.toString(array));
    }
}*/
    /*public static void main(String[] args) {
        int a = 0;
        System.out.println(a);
        int[] array = null;//不引用任何对象(空对象)
        System.out.println(array[0]);
    }
}*/
    //重新申请数一块内存
    //原来数组全部扩大2倍
   /* public static int[] func(int[] array) {
        int[] tmp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i] * 2;
        }
        return tmp;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] ret = func(array);
        System.out.println(Arrays.toString(ret));
    }
}*/
    //给数组扩大2倍
    /*public static void func(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] ret = func(array);
        System.out.println(Arrays.toString(ret));
    }
}*/
    //数组排序
    /*public static void main(String[] args) {
        int[] array = {12, 21, 3, 43, 55, 6};
        Arrays.sort(array);//排序
        //Arrays：操作数组的工具类，调用数组就用Arrays.
        System.out.println(Arrays.toString(array));
    }
}*/
    //打印字符串
       /* public static String myToString(int[] array){
        String ret = "[";
        for (int i = 0; i < array.length; i++) {
            ret += array[i];
            ret += ",";
            if (i!= array.length - 1) {
                ret += ",";
            }
        }
           ret+="]";
           return ret;
}
    public static void main(String[] args) {
        int[] array = {12, 21, 3, 43, 55, 6};
        System.out.println(Arrays.toString(array));
    }
}*/
    //拷贝
        /* public static int[]copyArray(int[] array){
             int[] ret = new int[array.length];
             for (int i = 0; i < array.length; i++) {
                 ret[i]=array[i];
             }
             return ret;
         }
         public static void main(String[] argv) {
                  int[] array = {1,2,3,4,5,6,7};
                  int[] ret=copyArray(array);
             System.out.println(Arrays.toString(array));
              }
}*/
    //拷贝
    /*public static void main(String[] argv) {
        int[] array = {1,2,3,4,5,6,7};
        int[] ret=Arrays.copyOf(array,array.length);//返回一个新对象
        System.out.println(Arrays.toString(ret));
    }
}*/
    //拷贝
    /*public static void main(String[] argv) {
        int[] array = {1,2,3,4,5,6,7};
        int[] ret=new int[array.length];
           System.arraycopy(array,0 ,ret,0,array.length);
        System.out.println(Arrays.toString(ret));
    }
    }*/
    //拷贝
   /* public static void main(String[] argv) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] ret = array.clone();
        System.out.println(Arrays.toString(ret));
    }
}*/
    //求出数组的最大值
   /* public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
        public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(max(array));
    }
}*/
   //实现数组的平均 值
   /*public static double avg (int [] array) {
        int sum = 0;
      //for(int x:array){
        //   sum+=x;
      //}
        for(int i=0;i<=array.length;i++){
            sum+= i;
        }
        return(double)sum/(double)array.length;
    }
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(avg(array));
    }
}*/
//求数组所有元素之和
    /*public static int sum(int [] array){
        int sum=0;
        for(int i=0;i<=array.length;i++){
            sum+= i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(sum(array));
    }
}*/
    //创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
   /* public static void main(String[] args) {
        int[] arr=new int[100];
        int i;
        for(i=0;i<arr.length;i++){
            arr[i]=i+1;
        }
        System.out.print(Arrays.toString(arr));
    }
}*/
