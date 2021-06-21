class AddSub{
    public int num1;
    public int num2;
    public AddSub(int num1,int num2)
    {
        this.num1=num1;
        this.num2=num2;
    }
    public int add()
    {
        return num1+num2;
    }
    public int subtract()
    {
        return num1-num2;
    }
}
class MultiDiv extends AddSub
{
    public MultiDiv(int num1,int num2)
    {
        super(num1,num2);
    }
    public int multiply()
    {
        return num1*num2;
    }
    public int divide()
    {
        return num1/num2;
    }
    
}
class calc {
    public static void main(String[] args) {
         
        AddSub ab= new AddSub(10,2);
        System.out.println("sum: "+ab.add());
        System.out.println("sub: "+ab.subtract());
        
        MultiDiv md=new MultiDiv(8,2);
        System.out.println("multi: "+md.multiply());
        System.out.println("div: "+md.divide());
        
    }
}