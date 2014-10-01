import java.util.*;
import java.util.regex.*;
import java.io.*;

class Main{
    public static void main(String Args[])
    {
	
	 Pattern p = Pattern.compile("(.*)(\\d+)(.*)");
	 Matcher m = p.matcher("This order was placed for QT3000! OK?");
	 //boolean b = m.matches();
	 while(m.find())
	     {
		 System.out.println("start="+m.start(1)+" Groups: "+m.group(1)+" ensds:"+m.end(1));
		 System.out.println("start="+m.start(2)+" Groups: "+m.group(2)+" ensds:"+m.end(2));
		 System.out.println("start="+m.start(3)+" Groups: "+m.group(3)+" ensds:"+m.end(3));
	     }
	 System.out.println(m);

    }


} 
