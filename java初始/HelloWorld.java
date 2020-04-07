/*/*//一个java文件中，只有一个public的类
//且 类名 需要和文件名是相同的
//类名 一定要采用大驼峰的形式命名
//public static必须有
//{}方法体
//如果一个类是public的 那么这个类的类名 一定要和文件名相同
//并且一个java文件中只能有一个共有的类
//文档注释 加到类的开始 或者 方法的开始/** 空  */
//ctr+shift+/既可以用这个注释 也可以取消注释
//行注释  // 或者ctr+/
/*public class A{
	
}*/

public class HelloWorld {

    public static void main(String[] args) {  
		
         System.out.println("HelloWorld");

	}

}
public class HelloWorld {

    public static void main(String[] args) {  
     /*java中整形int 不管多少位都是4个字节32位
     0代表整数 1代表负数
     对于正数来说 0为符号位+31（为数值位） 2^31-1
     对于负数来说 1为符号位+31（为数值为） -2^31*/
    	int a=10;
		
         System.out.println(a);//打印且换行
          System.out.println(a);//打印但是不换行
         System.out.printf("%d\n",a);//以格式化的形式输出

	}

}
public class HelloWorld {

    public static void main(String[] args) {  
    	int a =10;
   
		System.out.println(Integer.MAX_VALUE);//2147483647
		System.out.println(Integer.MIN_VALUE);//-2147483648
         
	}

}
public class HelloWorld {

    public static void main(String[] args) {  
    	
     //正数+1为负数最小值
     //负数-1为正数最大值
		int max=Integer.MAX_VALUE+1;//-2147483648
		
		System.out.println(max);
		
         }
public class HelloWorld {

    public static void main(String[] args) {  
    	
     //正数+1为负数最小值
     //负数-1为正数最大值
		int max=Integer.MIN_VALUE-1;
		
		System.out.println(max);//2147483647
		
         }

}
//java中没有全局变量，一个局部变量没有进行初始化，那么就不可以使用
//在类内部 方法的外部的 成员变量
//变量的标识符：数字 字母 下划线 $  不可以 （int 2a=0 int $a=0 int_a=0）开头;*/*/
   
public class HelloWorld {

    public static void main(String[] args) {  
     int a=0 ;
   
		System.out.println(a)
	}
}
