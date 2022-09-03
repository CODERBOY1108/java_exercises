package practise;
class Student{  
int rollno;  
String name;  
int fee;  
Student(int rollno,String name,int fee){  
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);
}  
}  
class program6and7{  
public static void main(String args[]){  
Student s1=new Student(101,"rajat",60000);  
Student s2=new Student(102,"manik",45000);  
s1.display();  
s2.display();  
}
}