public class creatingNewMethod {
    public static void main(String[] args){
       String message = greetUser("Raushan","Kumar");
        System.out.println(message);
    }

    public static String greetUser(String firstName,String lastName){
        return ("Hello " + firstName + " " + lastName);
    }
}
