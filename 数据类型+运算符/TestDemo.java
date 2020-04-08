//每一个类都会生成一个字节码文件
//保存的是类型信息
//int 4个字节  -2^31-2^31-1
//jdk开发工具 jre运行环境 jvm虚拟机
public class TestDemo {
	public static void main (String[] args) {
		System.out.println("hello");
	}
}
//长整形
//8个字节
//一个符号位63个数值位
public class TestDemo {
	@param args [description]
	public static void main (String[] args) { 
		long a=10L;//10只是整形 10L为长整形
		System.out.println(a);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		int b=10;
		int c=20;
		System.out.println(a+c);//30
		System.out.println("hahaha"+a+c);//hahaha1020//任何类型的数据和字符串拼接，结果就为字符串
        System.out.println("hahaha"+(a+c));//hahaha30
     }
}
public class TestDemo {
	public static void main (String[] args) {//String[] args运行时命令参数
		for(int i=0;args.length;i++){
			System.out.println(args[i]);
		}
		System.out.println("kaixin");
	}
//双精度浮点型 
//double占8个字节
public class TestDemo {

	public static void main (String[] args) {
		double d =12.5;
		System.out.println(d);
		System.out.println(Double.MAX_VALUE);//4.9E
		System.out.println(Double.MIN_VALUE);//324
    }
}
public class TestDemo {

	public static void main (String[] args) {
		//小数和整数在内存当中存储时 存储方式不一样
		//遇到小数用double不用float
		int a=1;
		int b=2;
		System.out.println(a/b); //0 a和b都是整形 所以不可以保存小数
         double num=1.1;         //双精度
         System.out.println(num*num);//有精度 精确表示1.210000000002
     }
}
//单精度
public class TestDemo {

	public static void main (String[] args) {
		//float  4个字节
		//不允许把一个double类型的值直接赋给float
		float f=12.3f;//后面加f
		System.out.println(f);
//字符数据类型
//char  2个字节 0-65535  没有负数
//Unicode-->包含很多，中文
public class TestDemo {

	public static void main (String[] args) {
		char ch1='a';
        System.out.println(ch);
        char ch2='王';
        System.out.println(ch2);
        char ch3='97';//a
        System.out.println(ch3);
        }
}
//字节类型 byte 一个字节 数值 -128——127
//每一种数据类型再给其赋值时候不可以超过类型范围
public class TestDemo {

	public static void main (String[] args) {
		byte b=12;
		byte b=21;
		System.out.println(b+" "+c);
		System.out.println(byte.MAX_VALUE);127
		System.out.println(byte.MIN_VALUE);-128

        System.out.println(Byte.MAX_VALUE+1);// 128  byte 默认以整形打印

        byte d=127;//不可以超过最大到127  2147483648
        int i=2147483648;
         System.out.println(Interger.MIN_VALUE);

	}	
}

//短整型 short 2个字节  32767-32768
public class TestDemo {

	public static void main (String[] args) {
		short sh=12;
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MIN_VALUE);
	}
}
//布尔类型
////没有明确大小
//自己两个取值 true和 false
//没有所谓的0是假1是真
public class TestDemo {

	public static void main (String[] args) {
		Boolean flg=teue;
		System.out.println(flg);
//字符串类型
//string定义
public class TestDemo {

	public static void main (String[] args) {
		String str="hello";//hello
		System.out.println(str);
	}
}
public class TestDemo {

	public static void main (String[] args) {
		String str="\"hello"\";
		System.out.println(str);//"hello"
	}
}
//整形提升
//小于4个字节的数据类型 运算时 会发生类型提升
public class TestDemo {

	public static void main (String[] args) {
		byet i=10;
		byet k=20;
		byet a=(byte)(i+k);
        System.out.println(d);
	}
//常量只能被初始化一次，且用时  一定要初始化 定义是必须大写
	public class TestDemo {

	public static void main (String[] args) {
		final int MAXNUM=10;
		System.out.println(MAXNUM);
	}
}
//隐式类型转换
//把一个小类型数据给大类型
//显式类型转换
//大类型转小类型 要进行强制转换
public class TestDemo {

	public static void main (String[] args) {
		int a=19;
		long b=a;
		System.out.println(b);//19
		long c=10L;
		int d=(int)c;
		System.out.println(d);//10
    }
}
//Int 和string相互转换
public class TestDemo {

	public static void main (String[] args) {
		int num=10;
		//方法1
		String str1=num+"";
		//方法2
		String str2=String.valueOf(num);
		string str="100";
		int num=Integer.parseInt(str);
    }
}




