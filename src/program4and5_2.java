class getset {
    public String name;
    public String type;
    public String gName() { return name; 
    }
    public void sName(String N)
    {
        this.name = N;
    }
    public String ctype(){return type;}
    public void stype(String m){
        this.type=m;
    }
}
public class program4and5_2 {
    public static void main(String[] args)
    {
        getset obj = new getset();
        System.out.println("Companies name are:");
        obj.sName("Google");
        obj.stype("tech");
        System.out.println("company name is: "+obj.gName());
        System.out.println("comapany type is: "+obj.ctype());
        obj.sName("Microsoft");
        obj.stype("tech");
        System.out.println("company name is: "+obj.gName());
        System.out.println("comapany type is: "+obj.ctype());
        obj.sName("Meta");
        obj.stype("tech");
        System.out.println("company name is: "+obj.gName());
        System.out.println("comapany type is: "+obj.ctype());
        obj.sName("Facebook");
        obj.stype("tech");
        System.out.println("company name is: "+obj.gName());
        System.out.println("comapany type is: "+obj.ctype());
        obj.sName("Apple");
        obj.stype("tech");
        System.out.println("company name is: "+obj.gName());
        System.out.println("comapany type is: "+obj.ctype());
    }
}
