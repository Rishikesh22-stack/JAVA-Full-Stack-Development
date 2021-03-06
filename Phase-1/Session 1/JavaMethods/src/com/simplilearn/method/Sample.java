package com.simplilearn.method;

public class Sample {
    //method with no return value, without parameter
    public void display()
    {
        System.out.println("Welcome to JAVA");
    }
    
    //method which will calculate some value and return as a result
    //2 parameter
    public int add(int a,int b)
    {
        int num1=a+b;
        int num2=a*b;
        return num1+num2;
    }
    //method to check user validity and return true or false, one parameter
    public boolean valid(int age)
    {
        if(age>18)
            return true;
        else
            return false;
    }
    //method to return fullname based on fname and lname, 2 parameterized
    public String fullName(String fname,String lname)
    {
        return fname+" "+lname;
    }
    public static void main(String[] args) {
        Sample s=new Sample();
        s.display();
        int result=s.add(2, 4);
        System.out.println("Result "+result);
        System.out.println(s.valid(24));
        System.out.println("My full Name is "+s.fullName("Rishikesh ", "Kulkarni"));
        
    }
}
