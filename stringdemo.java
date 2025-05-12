package Java_programs;

public class stringdemo {
    public static void main(String[] args) {
        String name = "Ramesh";
        String employee = "Ramesh";
        // System.out.println(name == employee);
        String tenant = new String("Ramesh");
        // System.out.println("shallow"+ name+" "+employee);
        // System.out.println("shallow "+(name == tenant));
        // System.out.println("Deeps "+name.equals(tenant));

        StringBuilder builder = new StringBuilder("NUmbers are ");
        builder.append(""+1);

        System.out.println(builder);
        

    }
}
