import java.util.Comparator;
import java.util.TreeSet;

public class MysetCmpr {

    public static void main(String a[]){
        MyComp obj = new MyComp();
        TreeSet<String> ts = new TreeSet<String>(obj);
        ts.add("RED");
        ts.add("ORANGE");
        ts.add("BLUE");
        ts.add("GREEN");
        ts.add("Z");
        ts.add("AB");


        System.out.println(ts);
    }
}

//Comparator can be used for any type
//usage with String is given below
class MyComp implements Comparator<String> {

    //return negative if str1 is larger than str2
    //return positive int if str1 is smaller than str2
    public int compare(String str1, String str2) {

        int x = str1.length();
        int y = str2.length();
        //return str2.compareTo(str1);//sort in reverse order
        //System.out.println("Hello from Comparator str1:"+str1+" str2:"+str2);
        int z = (str1.charAt(x - 1) - str2.charAt(y - 1));//sort based on String size
        //return str2.compareTo(str1);
        if (str1.hashCode() != str2.hashCode()) {
            z = 1;
            return z;

        }else {
            return z;
        }

    }
}
