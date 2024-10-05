class constructorover
{
    constructorover()
    {
        System.out.println("\nConstructor without parameter");
    }
    constructorover(int i)
    {
        System.out.println("\nConstructor with integer");
    }
    constructorover(String str)
    {
        System.out.println("\nConstructor with String");
    }
}
public class constructoroverload
{
    public static void main(String args[])
    {
        constructorover d1=new constructorover();
        constructorover d2=new constructorover(2);
        constructorover d3=new constructorover("Constructor");
    }
}