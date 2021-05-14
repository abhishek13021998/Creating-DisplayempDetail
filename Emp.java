import java.util.Scanner;
class Employee{
String name,design;
int age,sal;
Scanner sc=new Scanner(System.in);
void read(){
System.out.println(" enter name");
name=sc.nextLine();
System.out.println("Enter Age");
age=sc.nextInt();
System.out.println("Enter salary");
sal=sc.nextInt();
System.out.println("Enter designation");
design=sc.next();
}
void disp(){
System.out.println("Name:"+name);
System.out.println("age:"+age);
System.out.println("salary:"+sal);
System.out.println("desgination:"+design);
}
void raise(){
sal=sal+1000;
System.out.println(" salary raised-----");
}
}
public class Emp{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);

Employee e=new Employee();
int c;
boolean r=false;
do{
System.out.println("\n 1.create");
System.out.println("2.Display");
System.out.println("3.Raise salary");
System.out.println("4.Exit");
System.out.println("Enter your choice");
c=sc.nextInt();
switch(c){
case 1: e.read();
        r=true;
        break;

case 2: if(r)
        e.disp();
       else
       System.out.println("\n no records------!");
       break;

case 3:if(r)
       e.raise();
       else
          System.out.println("\n no records------!");
      break;
case 4:    System.out.println("\n Existing");
       break;

default: System.out.println("\n Invalid choice--!!");
}
}while(c!=4);
}
}


      
       
     

