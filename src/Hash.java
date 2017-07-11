
import java.util.*;
class A{
    String s1;
    String s2;
    A(String x,String y){
        this.s1=x;
        this.s2=y;
    }
    public String toString(){
       // System.out.println(s1+s2);
        return s1+" "+s2;
    }
}
public class Hash {

    public static void main(String args[])
    {
        //stores unique values only, and insertion order is not maintained
        HashSet hs = new HashSet();
        A o1=new A("x","y");
        A o2=new A("x1","y1");
        A o3=new A("x2","y2");
        A o4=new A("x","y");
        A o5=new A("x1","y1");
        hs.add(o1);
        hs.add(o2);
        hs.add(o3);
        hs.add(o4);
        hs.add(o5);
        System.out.println(" :"+hs);
        Iterator itr = hs.iterator();
        while(itr.hasNext())
        {

            {
            System.out.println((itr.next()).toString());
            }
        }
        System.out.println("--------------------");
        //ListIterator not available for Set

		/*Enumeration enm=Collections.enumeration(hs);

		for(;enm.hasMoreElements();)
		{
			System.out.println(enm.nextElement());
		}*/

       // String min_str = (String)Collections.min(hs);

       // System.out.println("Minimum is: "+min_str);

        //Collections.reverse(hs);// is supported only by List, and not Set

    }

}
