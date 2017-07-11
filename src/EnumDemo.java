
enum Day
{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
};
public class EnumDemo
{


    public static void main(String[] a)
    {
        for(Day obj:Day.values()){
        System.out.println(obj);
        Day today = obj;
        Day x=Day.values()[1];
        System.out.println(x);
        //EnumDemo ed = new EnumDemo();
        printWorkload(today);
    }}

    //an enum type can be used as local variable, parameter
    static public void printWorkload(Day today)
    {
        if (today == Day.WEDNESDAY)
        {
            System.out.println("Higly Hectice");
        }
        else if(today == Day.MONDAY)
        {
            System.out.println("Just Started");
        }
        else
        {
            System.out.println("Some other day");
        }
    }
}