
/*
自定义类型
类
         构建对象的模板所有类来自一个Object
        通过一个类可产生多个对象
        字段  -成员变量 定义在方法外面类的里面  对象在堆上
        实例成员变量：定义在对象里面
        静态成员变量：不在对象里面定义
        方法 -行为
        访问修饰限定符：public共有     private私有    protected受保护的
        什么都不写：默认权限
        如何访问对象中的实例成员变量：通过sout(per.name)
        操作符：点号  对象引用.成员变量
        实例成员没有初始化默认值为对应的0:引用类型默认为null，简单类型默认为0
        char-'\u0000'  boolen-false
        局部变量在使用时候一定要初始化
        实例成员变量不用初始化
        访问静态成员：也是为0，但不属于对象，属于类，直接sout(类名.静态成员变量)
        实例成员方法：通过对象的引用访问
        修饰方法
        在任何方法上应用static关键词，叫做静态方法
        静态成员变量只有一份
        静态方法内部不能访问非静态数据成员
        静态方法属于类，不属于类的对象
        静态方法可以访问静态数据成员，并且可以更改静态数据成员的值
        实例方法里面可以调用静态的也可以调用非静态
对象
            实体：通过模板产生实体
                找对象  创对象 使用对象
封装
                用private来修饰属性或者方法
           限定只可以在类中使用
           this：当前对象的引用
           把成员方法或者成员变量使用private进行修饰
一个对象的产生分几步？如何产生？
1.为对象分配内存
2.调用合适的构造方法 构造方法是和类名相同，且没有返回值
                                  作用：构造对象
                                  构造方法不止一个
                                   总是伴随new操作一起调用
当没有提供构造方法时候，编译器会自动提供一个不带有参数的构造方法
当提供构造方法时候，编译器就不会生成一个构造方法
面试问题
      this关键字代表对象的引用，this储存的是对象分配的地址，先调用构造方法才能引用
this功能
      this():调用自己的构造方法-只能在构造方法里面写，只能调用一次，只能写在第一行
      this.date:调用当前对象的属性
      this.func():调用当前对象的方法
构造方法
      构造方法可以重载
构造器与类同名
代码块
      实例代码块(构造代码块)：特性
      静态代码块：静态方法和静态成员是不以来对象，可以通过类访问
      静态方法里面访问了实例变量成员，那么这个实例成员变量是依赖对象的，但是静态方法不依赖
      打印顺序
Person person1 = new Person();是无参数打印
先打印静态代码块-实例代码块-Person<init>
静态代码块只打印一次   只要是静态的都只打印一次。且是最早被执行的
如果都是静态的，难么和它定义的前后顺序有关
复杂度
      衡量一个算法的效率，两个方面
      1.时间复杂度：算法的运行速度，算法中的基本执行次数
      2.空间复杂度：衡量一个算法的额外空间

*/

import java.util.Arrays;
public class TestDemo {
    /* public static void main(String[] args){
         String s;
         System.out.println("s="+s);//编译失败，没有初始化
     }
 }*/
      /* static boolean Paddy;
       public static void main(String args[]){
           System.out.println(Paddy);//false
       }
   }*/
       /* private static int x = 100;//100
      public static void main(String args[]) {
            TestDemo td1 = new TestDemo();//100
            td1.x++;//101
            TestDemo  td2 = new TestDemo ();//101
            td2.x++;//102
            TestDemo td3= new TestDemo ();//102
            td3.x++;//102
            TestDemo .x--;//103
            System.out.println(" x=" + x);//102
        }
    }*/
    /*private int count;//0
    TestDemo(int a) {//88
        count=a;//count=0 a=88
    }
    public static void main(String[] args) {
        TestDemo test=new TestDemo(88);
        System.out.println(test.count);//88
    }
}*/
       /* static int cnt = 6;//6
        static{
            cnt += 9;
        }
    static{
        cnt /=3;
    }
        public static void main(String[] args){
            System.out.println("cnt="+cnt);//5
        }
    }*/
    //交换两个数组
    /*public static void swap(int[] array, int[] array2) {
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            tmp = array[i];
            array[i] = array2[i];
            array2[i] = tmp;
        }
    }
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4};
        int[] array2= {5,6,7,8,9};
        swap(array,array2);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
}*/







