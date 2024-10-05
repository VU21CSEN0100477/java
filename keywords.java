class Student{  
    int roll;  
    String name;  
    float fee;  
    Student(int roll,String name,float fee){  
    this.roll=roll;  
    this.name=name;  
    this.fee=fee;  
    }  
    void display(){System.out.println(roll+" "+name+" "+fee);}  
    }  
    class Final {
        final int AGE = 18;
          void display(){
              System.out.println("Age: " +AGE);
        }
        }
    class keywords{  
    public static void main(String args[]){  
    Student s1=new Student(111,"Shiva",5000);  
    Student s2=new Student(112,"nanda",6000);  
    Final s3=new Final();
    s1.display();  
    s2.display();  
    s3.display();
    String s= new String("CS");
       s= null;
       System.gc();
       System.out.println("output of main method");
    }
}
class finalizeMethod {
   
   protected void finalize()
   {
       System.out.println("output of finalize method");
   }
}