import java.util.Scanner;//Scanner一个类
import java.util.Random;


public class TestDemo {

    public static void main(String[] args) { 
     String input = "1 fish 2 fish red fish blue fish";
        Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
        System.out.println(s.nextInt());//1
        System.out.println(s.nextInt());//2
        System.out.println(s.next());//red
        System.out.println(s.next());//blue
        s.close();
    }
 }
 //break结束本次循环，剩下的85次不循环
 //continue死循环  14个hehehe死循环重复85次打印15
 //break只在循环(while)语句还有switch语句中用
 //continue只能在循环中用
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        while(num<=100){
        	if(num%15==0){
        		System.out.println("hahaha");
        		//break;
        		continue;
        	}
        	System.out.println("hehehe");
        	num++;
        }
    }
}
//for的死循环
        for( ; ; ){
        	System.out.println("hahaha");
        }
    }
}

//while的死循环
        while( true ){
        	System.out.println("hahaha");
        }
    }
}
//死循环
//byte范围-128到127
        for(byte=0;i<=130;i++ ){
        	System.out.println("hahaha");
        }
    }
}
//死循环
////如果表达式2没有for循环，那么永远为真，继续往下走
        for(int i=0; ;i++ ){
        	System.out.println("hahaha");
        }
    }
}
//5的阶乘
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    for(int j=1;j<=num;j++){
    	int ret=1;
    	for(int i=1;i<=j;i++){
    	 ret*=1;
        }
        sum+=ret;
    }
        System.out.println(sum);
    }
}
//求两个正整数的最大公约数
//余数为0时候 除数就是最大公约数
//24   18
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=0;
        while(a&b != 0){
            c=a % b;//6
        	a=b;//18
        	b=c;//6
         }
         System.out.println(b);
     }
 }
//计算1/1-1/2+1/3-......-1/100的值
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        double sum=0;
        int flg=1;
        for(int i=1;i<=n;i++){
        	sum=sum+1.0/1*flg
        	flg=-flg;
        }
        System.out.println(sum);
    }
}
//1-100中出现多少9
//找每个位上的数字是几
        int count=0;
        for(int i=1;i<=100;i++){
        	if(i/10==9){
        		count++;
        	}
        	if(i%10==9){
        		count++;
        	}
        }
         System.out.println(count);
     }
 }
 //找一个十进制的数字每一位上是几 只需要除10 模10
 //找一个二进制数字则 除2 模2
  int count=0;
        for(int i=1;i<=100;i++){
        	if(i/10==9){
        		count++;
        	}
        	else if(i%10==9){
        		count++;
        	}
        }
         System.out.println(count);
     }
 }
 
         Scanner scan=new Scanner(System.in);
         while (scan.hasNextInt()){
         	int num=scan.nextInt();
         	System.out.println(num);
         }
     }
 }
 //猜数字游戏
            Scanner scan=new Scanner(System.in);
         	Random random=new Random();//用来产生随机数
         	int randNum=random.nextInt(100);//0-100不包含100，电脑随机选出的数字
         	System.out.println(randNum);
         	while(true){
         		System.out.println("请输入要猜的数字：");
         		int num=scan.nextInt();
         		if(num<randNum){
         			System.out.println("猜的数字小了!");
         		}else if(num==randNum){
         			System.out.println("猜的数字对了!");
         			break;
         		}else{
         			System.out.println("猜的数字大了!");
         		}
         	}
         }
     }
     //打印1-100之间的素数
                Scanner scan=new Scanner(System.in);
               int n=scan.nextInt();
               for(int i=2;i<100;i++){
        	   if(n%i==0){
        	   System.out.println(n+"不是素数! ");
        	   break;
        	}
        }
    }
}
        Scanner scan=new Scanner(System.in);
               int n=scan.nextInt();
               for(int i=2;i<=n/2;i++){
        	   if(n % i == 0){
        	   System.out.println(n+"不是素数! ");
        	   break;
        	}
        }
    }
}
//打印乘法口诀
            for(int i=1;i<=9;i++){
            	for(int j=1;j<=i;j++){
            		System.out.print(i+"*"+j+"="+i*j+" ");
            	}
            	 System.out.println();
            }
        }
    }
        
       
   


     
                   

         		
         	

         
     



        	

        


    




        


