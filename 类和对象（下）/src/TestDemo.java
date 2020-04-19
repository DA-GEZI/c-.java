import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/*class Person{
    private String name;
    private int age;
    public Person(){//构造方法
         System.out.println("Person<init>");
    }
    public Person(String name,int age){
          this.name=name;
          this.age=age;
        System.out.println("Person<String,int>");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String toString(){
        return "Person{"+
                "name='"+name+'\''+
                ",age="+age+
                '}';
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Person person1=new Person();//Person<init>
        System.out.println(person1);//Person{name='null',age=0}
        Person person2=new Person("bit",19);//Person<String,int>
        System.out.println(person2);//Person{name='bit',age=19}
    }

}*/
/*class Person{
    private String name;
    private int age;
    public Person(){//构造方法
        this("wang",18);//只能调用一个this
        System.out.println("Person<init>");
    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("Person<String,int>");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Person person1 = new Person();
     //打印   //Person<String,int>
              //Person<init>
    }
}*/
/*class Person{
    private String name;
    private int age;
    public Person(){//构造方法
        System.out.println("Person<init>");
    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("Person<String,int>");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Person person1 = new Person();
        //打印      //Person<init>
    }
}*/
/*class Person {
    private String name;
    private int age;
    public Person() {//构造方法
        System.out.println("Person<init>");
    }
    public Person(String name, int age) {
        System.out.println("Person<String,int>");
    }
    {
        System.out.println("实例代码块......");//实例代码块......
    }
    static {
        System.out.println("静态代码块......");//静态代码块......
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Person person1 = new Person();
     //打印  //实例代码块......
             //Person<String,int>
             //Person<init>
    }
}*/
/*class Person {
    private String name;
    private int age;
    public Person() {//构造方法
        System.out.println("Person<init>");//Person<init>
    }
    public Person(String name, int age) {
        System.out.println("Person<String,int>");
    }
    {
        System.out.println("实例代码块......");//实例代码块......
    }
    static {
        System.out.println("静态代码块......");//静态代码块......
    }
}
        public class TestDemo {
            public static void main(String[] args) {
            Person person1 = new Person();//打印的是不带有参数的
            System.out.println("=========");
            Person person2 = new Person();//静态代码块只打印一次
     //打印 //静态代码块......
            //实例代码块......
            //Person<init>
            //=========
            //实例代码块......
            //Person<init>
    }
}*/
/*class Person {
    private String name;
    private int age;
    public static int count = 0;

    static {
        count = 90;
        System.out.println("静态代码块......");//静态代码块......
    }
}
public class TestDemo {
    public static void main(String[] args) {
        System.out.println(Person.count);//90
    }
    }*/
/*class Person {
    private String name;
    private int age;
    static {
        count = 90;
        System.out.println("静态代码块......");//静态代码块......
    }

    public static int count = 0;
}
public class TestDemo {
    public static void main(String[] args) {
        System.out.println(Person.count);//0
    }
}*/




