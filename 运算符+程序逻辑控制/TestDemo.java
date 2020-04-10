import java.util.Scanner;//Scanner一个类

public class TestDemo {

    public static void main(String[] args) {  
    	//除数为0是异常
    	System.out.println(5/2);//2
    	System.out.println(5.0/2);//2.5
    	System.out.println((float)5/2);//2.5 float5=5.0/2=2.5
    	System.out.println((float)(5/2));//2.0 5/2=2 float2=2.0
    	System.out.println(5/0);

    }
}
	   //可对in求模，也可对double求模
        System.out.println(10%3);//1
    	System.out.println(-10%3);//-1   -10%3=-3余-1
    	System.out.println(10%-3);//1     10%-3=-3余1
    	System.out.println(-10%-3);//-1  -10%-3=3余-1
    	System.out.println(11.5%2.0);//1.5
    }
}
 
    	int a=10;
    	int b=++a;
    	System.out.println(b);//11
    	int c=a++;            //c=a a=a+1
    	System.out.println(c);//11
    }
 }   
    	int i=10;
    	i=i++;
    	system.out.println(i);//10 
    }
}
//关系运算符的表达式返回值都是boolean类型，只有两个值true或false
        int a=10;
        int b=20;
        int c=30;
        System.out.println(a==b);//false
        System.out.println(a!=b);//true
        System.out.println(a<b);//true
        System.out.println(a>b);//false
        System.out.println(a<=b);//true
        System.out.println(a>=b);//false
    }
}
//逻辑运算符
//java中 !非 只能用于布尔类型
        int a=10;
        int b=20;
        //System.out.println(!a<b);//报错
        boolean flg=true;
        System.out.println(!flg);//false
        System.out.println(!(a<b));//false
        //boolean flg=true;
        //System.out.println(flg);//true
    }
}
//输入输出
//nextLine()包含了空格
//next只要遇到空格会结束掉
        Scanner scan = new Scanner(System.in);//键盘
        //String str = scan.nextLine();//输入一个字符串
        //System.out.println(str);//wang zi ge
        String str = scan.next(); //wang zi ge      
        System.out.println(str);//wang
    }
}
//逻辑控制     
//退出循环：ctr+c(直接中断)    ctr+D(正常退出)
         Scanner scan = new Scanner(System.in);//键盘
         while(scan.hasNextInt()){//输入多个年
         int year=scan.nextInt();
         if((year%4==0 && year%100!=0) ||(year%4==0)){
         	System.out.println("闰年!");
         }else{
         	System.out.println("不是闰年!");
         }
     }
     }
 }

        int x=10;
        int y=10;
        if(x==10){//()里面只能是布尔表达式
        	if(y==10){
        		System.out.println("aaa");//aaa
        	}
        	else{
        		System.out.println("bbb");
        	}
        }
        } 
     }   
     // long float double boobLean 四种都不可以作为switch语句
     // break 不要省略
     //不能表达复杂序列
      int a=10;
        switch(a){
     	case 1:
     	    System.out.println("1");
     	    break;
     	case 2:
     	    System.out.println("2");
     	    break;
     	default:
     	    System.out.println("请输入正确数字！");
     	}
     }
     }
     //循环结构  java与c循环一样
     //只有while循环只能放boolean
     //求5的阶乘
     int num=5;
     int i=1;
     int ret=1;
      while(i<=num){
     	ret*=i;
     	i++;
      }
     	System.out.println(ret);
    }
}
    //5阶乘的和
    int num=5;
     int i=1;
     int ret=1;
     int sum=0;
      while(i<=num){
     	ret*=i;//ret=1*1 i=2 sum=1*1
     	i++;   //ret=1*1*2 i=3 sum=1*1+1*1*2
     	sum+=ret;//ret=1*1*2*3 i=4 sum=1*1+1*1*2+1*1*2*3
      }
     	System.out.println(sum);
    }
}
    int num=1;
     int sum=0;
      while(num<=5){
      	int i=1;
      	int ret=1;
      	while(i<=num){
     	    ret*=i;
     	    i++; 
     	}  
     	sum+=ret;
     	num++;
     }
     	System.out.println(sum);
    }
}
   








  
    		
    	