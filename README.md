# Creating-DisplayempDetail
in this programme we have create display raised salary of employee. For this we make Employee class where we do vendor side opertaion like taking input i.e name,sal,age
void read(){
System.out.println("enter name");
name=sc.nextLine();
System.out.println("Enter Age");
age=sc.nextInt();
System.out.println("Enter salary");
sal=sc.nextInt();
System.out.println("Enter designation");
design=sc.next();
}
now after that for displaying in consle we take disp method i.e
void disp(){
System.out.println("Name:"+name);
System.out.println("age:"+age);
System.out.println("salary:"+sal);
System.out.println("desgination:"+design);
}
for raise operation we take raise method
void raise(){
sal=sal+1000;
System.out.println(" salary raised-----");
}
Now for client side logic we give..
for showing an option we give display side option
System.out.println("\n 1.create");
		System.out.println("2.Display");
		System.out.println("3.Raise salary");
		System.out.println("4.Exit");
		System.out.println("Enter your choice");
    now after that we take a switch case
    switch(c)
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
now using do while loop we perform operation
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
in this way the whole code run
![Screenshot (947)](https://user-images.githubusercontent.com/84003456/118311596-c046cd80-b50d-11eb-8681-9180d5134169.png)
![Screenshot (948)](https://user-images.githubusercontent.com/84003456/118311605-c2109100-b50d-11eb-84ae-800cd5c899de.png)
![Screenshot (949)](https://user-images.githubusercontent.com/84003456/118311608-c2a92780-b50d-11eb-959a-c2ba0ab2fa88.png)
![Screenshot (950)](https://user-images.githubusercontent.com/84003456/118311610-c2a92780-b50d-11eb-9f14-c692db247b6d.png)

