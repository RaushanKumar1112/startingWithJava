public class operatorInJava {
     public static void main(String [] args){
         int x=1;
         int y=1;
         System.out.println(x == y);

         int temperature =22;
         boolean isWarm = (temperature>20 && temperature<30);
         System.out.println(isWarm);

         boolean hasHighIncome=true;
         boolean hasGoodCredit=true;
         boolean hasNoCriminalRecord=false;
         boolean isElgible = (hasGoodCredit || hasHighIncome) && !hasNoCriminalRecord;
         System.out.println(isElgible);

          //If-Else
          int temperature1 = 23;
          if(temperature1>30){
              System.out.println("It's hot day");
          }
          else if(temperature1>20){
              System.out.println("Beautiful Day");
          }
          else{
              System.out.println("cold day");
          }

          // How to write it in  clean way
          int income =120_000;
//          boolean hasHighIncome;
//          if(income>100_000)
//              hasHighIncome = true;
//          else
//              hasHighIncome = false;

          boolean hasHighIncome1= (income>100_000);

          //Ternary Operator
          int income1=120_000;
//          String className;
//          if(income>100_000)
//               className="First" ;
//          else
//               className="Economy";
          String className=income1>100_000 ? "First" : "Economy";

          //Switch Statements
          String role="admin";
          switch(role){
               case "admin":
                    System.out.println("You're an admin");
                    break;
               case "moderator":
                    System.out.println("You're a moderator");
                    break;
               default:
                    System.out.println("You're a guest");
          }
     }
}
