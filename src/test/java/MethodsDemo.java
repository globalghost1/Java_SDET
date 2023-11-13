public class MethodsDemo {
    public static void main (String[] args) {

        MethodsDemo d = new MethodsDemo();
        String name = d.getData();
        System.out.println(name);
        MethodsDemo2 d1 = new MethodsDemo2();
        d1.getUserData();
        getDate2();

    }
    public void getData()
    {
        System.out.println("Hello World");
        return "Rahul Shetty";
    }
    public static String getDate2()
    {
        System.out.println("Hello World");
        return "Rahul Shetty";
    }
}



