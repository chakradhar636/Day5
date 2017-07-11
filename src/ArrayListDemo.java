
import java.util.*;

class VehicleModel{
    String make;
    String model;
    long units;
    double price;
    VehicleModel(String s1,String s2,long u,double p){
        make=s1;
        model=s2;
        units=u;
        price=p;
    }

}
public class ArrayListDemo {

    public static void main(String[] args) {
        //List allows duplicate values, stores values in the order given/added
        //Dynamic Arrays, can shrink or increase size dynamically unlike normal arrays
       /*
        ArrayList<String> atmp = new ArrayList<String>();
        atmp.add("hgdf");
        ArrayList<String> al = new ArrayList<String>();
        al.addAll(atmp);
        al.add("BCD");
        al.add("A1");
        al.add("A2");
        al.add("A2");

        dArrayList("Original ArrayList: ", al);

        Collections.reverse(al);

        dArrayList("After Reversing: ",al);
        System.out.println("-------------------------");

        Collections.shuffle(al);

        dArrayList("After Shuffling ",al);
        */
        ArrayList<VehicleModel> ob=new ArrayList<>();
        ob.add(new VehicleModel("x","y",3,2));
        ob.add(new VehicleModel("x","z",4,3));
        dArrayList("class objects",ob);
    }

    static void dArrayList(String str, ArrayList<VehicleModel> ob )
    {
        System.out.println("------------------------------");
        System.out.println(str);
        Iterator<VehicleModel> itr = ob.iterator();
        //using Iterator, we can traverse only in forward direction
        while(itr.hasNext())
        //for(;itr.hasNext();)
        {
            VehicleModel tStr = itr.next(); //returns Object
            System.out.println(tStr.make);
            System.out.println(tStr.model);
            System.out.println(tStr.units);
            System.out.println(tStr.price);
        }
    }

}
