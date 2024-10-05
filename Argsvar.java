public class Argsvar 
{
    public static void main(String args[])
    {
        System.out.println(average(43,66,78,16));
        System.out.println(average(33,17,7,4,9,11,18));
    }
    public static int average(int...num)
    {
        int tot=0;
        for(int x:num)
        {
            tot+=x;
        }
        return tot/num.length;
    }
}