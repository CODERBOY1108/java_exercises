package practise;
class prog2{
int id;
String name,designation;
float salary;
prog2(int id,String name,float salary,String designation){
this.id=id;
this.name=name;
this.designation=designation;
this.salary=salary;
}
void display(){System.out.println(id+" "+name+" "+salary+" " +designation+"");}
}
class program6and7_2{
public static void main(String args[]){
prog2 s1=new prog2(21215061,"rajat",500000f,"Software dev");
prog2 s2=new prog2(21215043,"manik",600000f,"Systems Engineer");
s1.display();
s2.display();
}
}