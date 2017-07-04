import java.util.*;
 class Prime {
					static int n,count=0;
               public static void main (String[] args)
                        {
                         
                          Scanner sc=new Scanner(System.in);
                          System.out.println("Enter n");
                          n=sc.nextInt();
                          Nilesh p=new Nilesh();
                          p.Prasad();
                         }
            }                        
class Nilesh extends Prime
{
	
  void Prime() {
        System.out.println("NUMBER IS PRIME");
}
  void Composite() {
        System.out.println("NUMBER IS COMPOSITE");
}
  void Prasad() {
        for(int i=1;i<=Prime.n;i++)
        {
         if(Prime.n%i==0 || Prime.n%i==Prime.n)
             {
              Prime.count++;
             }
          else if (Prime.count >2)
            { 
              Composite();
              break;
            }
          }
          if(Prime.count==2)
        {
          Prime();
        }
          else if (count<2)
        {
          System.out.println("NUMBER IS NEITHER PRIME NOR COMPOSITE");
        }
    }
  }
