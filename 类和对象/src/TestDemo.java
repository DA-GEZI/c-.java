import java.util.Arrays;
    //二维数组
   /* [][]里面不允许出现行数列数
        //int[][] array2=new int[][] {{1,2,3},{4,5,6}};
        //int[][] array3=new int[2][3];
        for (int i = 0; i < 2; i++) {//行数
            for (int j = 0; j < 3; j++) {//列数
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
    }
}*/
    /*public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < array.length; i++) {//行
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}*/
    //Arrays.deepToString深度打印数组
    /*public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.toString(array));//打印的是每行的地址
        System.out.println(Arrays.deepToString(array));//深度打印
    }
}*/
    /*public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}};{
            for (int[] tmp : array) {
                for (int x:tmp){//打印每一个地址中的整形数字
                    System.out.print(x+" ");
                }
                System.out.println();
            }
        }
    }
}*/
    /*public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}};{
            for (int[] tmp : array) {//打印的是数组的地址
                System.out.print(tmp);
            }
        }
    }
}*/
    //不规则数组：必须指定行
    /*public static void main(String[] args) {
        int[][] array=new int[2][];
        array[0]=new int[3];
        array[1]=new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}*/
    /*public static void main(String[] args) {
        int[][] array=new int[2][];
        array[0]=new int[]{1,2,3};
        array[1]=new int[]{4,5};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
         System.out.println(Arrays.deepToString(array));
    }
}*/
    //一个数组中只有一个数字出现一次，其他数字出现两次，找出出现的数字
//找一个数组中，只出现一次的数组(1,4,3,1,2,4)
    /*public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 3, 4};
        int ret = 0;
        for (int i = 0; i < array.length; i++) {
            ret^= array[i];
        }
        System.out.println(ret);
    }
}*/
    //类
    //定义一个类class Person类型
   /* class Person {
        //字段-成员变量
        public String name;//引用类型null
        public int age;     //简单类型0
        public char ch;
        public boolean flg;
        public static int size;//0//静态成员变量不在对象里面
        //方法-行为
        public void eat() {
            int a=10;//局部变量
            System.out.println("eat()!+a");
        }
        public void sleep() {
            System.out.println("sleep()!");
        }
    }
public class TestDemo {
    public static void main(String[] args) {
        Person per = new Person();//通过关键字new 实例化一个对象
        //per.都是在堆中
         System.out.println(per.name);//null
         System.out.println(per.age);//0
         System.out.println(per.ch);//'\u0000'
        System.out.println(per.flg);//false
        //静态不在堆中
        System.out.println(Person.size);//0
    }
}*/
/*class Person {
    //字段-成员变量
    public String name;//引用类型null
    public int age;     //简单类型0
    public char ch;
    public boolean flg;
    public static int size;//0//静态成员变量不在对象里面
    //方法-行为
    public void eat() {
        int a=10;//局部变量
        System.out.println("eat()!");
    }
    public void sleep() {
        System.out.println("sleep()!");
    }
   public static void func1(){
        System.out.println("static::func1()");
    }
}
//void show也可以
public class TestDemo {
    public static void main(String[] args) {
        //Person per = new Person();
        //per.eat();//sleep()!
        //per.sleep();//sleep()!
        Person.func1();//不用调用，直接用
    }
}*/
/*
class Test{
    public int a;//0
    public static int count;//0
    }
    public class TestDemo {
    public static void main(String[] args) {
           Test t1 = new Test();
           t1.a++;//1
           Test.count++;//1
           System.out.println(t1.a);//1
           System.out.println( Test.count);//1
           System.out.println("==========");//==========
          Test t2 = new Test();
          t2.a++;
          Test.count++;
          System.out.println(t2.a);//1
          System.out.println(Test.count);//2
    }
    }
*/

class student {
    //限定只可以在类中使用
    private String name;
    private int age;

    //公开的接口
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void func1() {
        System.out.println("func1()");
    }

    public void show() {
        System.out.println("我叫" + this.name + ",今年" + this.age + "岁");
    }
}
    //以上是类的实现者
    //以下是类的调用者
    public class TestDemo {
        public static void main(String[] args) {
            Student student = new Student();
            student.setName("wang");
            String str = student.getName();
            System.out.println(str);
            //student.show();
            //System.out.println(student);
        }
    }



