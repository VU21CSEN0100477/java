class stringbuffer1
{
    public static void main(String[] args) {
        int a=477;
        StringBuffer s=new StringBuffer("Hello");
        StringBuffer s1=new StringBuffer("123456789");
        StringBuffer s2=new StringBuffer("This xyz is shiva");
        StringBuffer s3=new StringBuffer("Elon Musk");
        //Gives the character at that particular index
        System.out.println("result 1:"+s.charAt(1));
        //Sets the character at that particular index
        s.setCharAt(0, 'T');
        System.out.println("result 2:"+s);
        //adds string or any other data types
        s.append(" Gitam ").append(a);
        System.out.println("result 3:"+s);
        //inserts string
        s.insert(0,"vishakapatnam campus ");
        System.out.println("result 4:"+s);
        //reverses stringbuf
        s1.reverse();
        System.out.println("result 5:"+s1);
        //deletes a part of string as specified in its index values
        s2.delete(5,8);
        System.out.println("result 6:"+s2);
        //deletes the character at that particular index
        s1.deleteCharAt(0);
        System.out.println("result 7:"+s1);
        //replaces part of a string in the specified index with a specified text
        s3.replace(5,9,"Tery");
        System.out.println("result 8:"+s3);
        //demonstrating capacity()
        System.out.println("result 9:"+s3.capacity()); 
        //Using lastindexof() to find the last occurence of the string
        StringBuffer s4= new StringBuffer("Java is powerful and Java is faster");
        int i = s4.lastIndexOf("Java");
        System.out.println("result 10: "+i);
        // Demonstrate the indexOf() method
        int b = s4.indexOf("Shiva kumar");
        System.out.println("result 11: "+b);
        //Length of the string
        StringBuffer s5= new StringBuffer("abcde");
        System.out.println("result 12:"+s5.length());
        // Demonstrate the substring() method
        StringBuffer s6 = new StringBuffer("Java");
        StringBuffer s7 = new StringBuffer(" in third semester");
	    StringBuffer sbss = s6.append(s7);
	    System.out.println("result 13:"+sbss);

    }
}