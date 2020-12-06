import java.util.Scanner;

public class Adress {
    private String adress, country,building, apartment, region, city, street, house;


    public Adress(String adress) {
        this.adress = adress;
    }


    public void adress(){
        try {

            String[] a = adress.split(", ");

            a[0] = a[0].trim();

            country = a[0];
            region = a[1];
            city = a[2];
            street = a[3];
            house = a[4];
            building = a[5];

            a[6] = a[6].trim();

            apartment = a[6];
        }


        catch(Exception e){
            System.out.println("БАН!");
        }

    }

 //тестируем
    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);
        Adress address = new Adress(scanner.nextLine());

        address.adress();


        System.out.println(address.toString());

    }



    @Override
    public String toString() {
        return "Adress{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }
}