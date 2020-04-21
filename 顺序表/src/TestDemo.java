
    //编写一个类Calculator，有两个属性num1,num2,这两个数值不能在定义的同时初始化，最后实现加减乘除四种运算
   /*class Calculator{
       private int num1;
        private int num2;
        public int getNum1(){
            return num1;
        }
        public void setNum1(int num1){
            this.num1=num1;
        }
        public int getNum2(){
            return num2;
        }
        public void setNum2(int num2){
            this.num2=num2;
        }
        public int add(){
            return this.num1+this.num2;
        }
        public int sub(){
            return this.num1 - this.num2;
        }
        public int mul(){
            return this.num1 * this.num2;
        }
        public double dev(){
            return this.num1*1.0/this.num2;
        }
    }
    public class TestDemo {
    public static void main(String[] args){
        Calculator calculator=new Calculator();
        calculator.setNum1(10);
        calculator.setNum2(20);
        System.out.println("加法");//加法
        System.out.println(calculator.add());//30
        System.out.println("减法");//减法
        System.out.println(calculator.sub());//-10
        System.out.println("乘法");//乘法
        System.out.println(calculator.mul());//200
        System.out.println("除法");//出发
        System.out.println(calculator.dev());//0.5
    }
    }*/
   //交换两个值
   /* class MyValue{
        private int val;
        public int getVal(){
            return val;
        }
        public void setVal(int val){
            this.val=val;
        }
    }
    public class TestDemo {
     public static void swap(MyValue myValue1, MyValue myValue2){
            int tmp = myValue1.getVal();
            myValue1.setVal(myValue2.getVal());//通过get才能得到set
            myValue2.setVal(tmp);//2的值设置为1的值
        }
            public static void main (String[]args){
                MyValue myValue1 = new MyValue();
                myValue1.setVal(10);
                MyValue myValue2 = new MyValue();
                myValue2.setVal(20);
                System.out.println(myValue1.getVal());//10
                System.out.println(myValue2.getVal());//20
                System.out.println("开始交换");
                swap(myValue1, myValue2);
                System.out.println(myValue1.getVal());//20
                System.out.println(myValue2.getVal());//10
            }
        }*/
/*
      class MyValue{
             public int val;
      }
      public class TestDemo {
          public static void swap(MyValue myValue1, MyValue myValue2) {
              int tmp = myValue1.val;
              myValue1.val = myValue2.val;
              myValue2.val = tmp;
          }
              public static void main(String[] args) {
              MyValue myValue1 = new MyValue();
              myValue1.val = 10;
              MyValue myValue2 = new MyValue();
              myValue2.val = 20;
              System.out.println(myValue1.val);//10
              System.out.println(myValue2.val);//20
              System.out.println("开始交换");
              swap(myValue1, myValue2);
              System.out.println(myValue1.val);//20
              System.out.println(myValue2.val);//10
          }
      }
*/
/*
复杂度
        衡量一个算法的效率，两个方面分析
        时间复杂度：衡量算法的运行速度，算法中的基本操作的执行次数
        空间复杂度：衡量一个算法所需的额外空间
        大O 渐进法来表示
        1.用常数1取代运行时间中的所有加法常熟
        2.在修改后的运行次数函数中，只保留最高阶
        3.如果最高阶项存在且不是1，则去除与这个项目相乘的常熟，得到的结果就是大O阶
        4.最坏情况下的时间复杂度O（N）
        顺序表和链表
        链表
        1.不带有几点的单向非循环链表
        2.不带头节点的双向非循环链表
        数据结构
        数组+结构       组织数据的方式
        组织数据的方式不一样，才有多的数据结构
*/




