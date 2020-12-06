import java.util.Scanner;

public class Phone {


    public static String Phonenumber(String a){

        String b[]=new String[4];
        if(a.substring(0,1).equals("+")){

            b[0]=a.substring(0,2);
            b[1]=a.substring(2,5);
            b[2]=a.substring(5,8);
            b[3]=a.substring(8,12);

        }

        else{
            b[0]="+"+Integer.toString(Integer.parseInt(a.substring(0,1))-1);
            b[1]=a.substring(1,4);
            b[2]=a.substring(4,7);
            b[3]=a.substring(7,11);

        }


        return b[0] + "" +b[1] + "-" +b[2] +"-" +b[3];
    }



        public static void main(String []args){
            Scanner scanner = new Scanner(System.in);
            String a;
            a = scanner.nextLine();
            Phone phone = new Phone();
            System.out.println(phone.Phonenumber(a));
        }

}