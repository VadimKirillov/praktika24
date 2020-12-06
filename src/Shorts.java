public class Shorts {

    private String number, name, color, size;

    Shorts(String array){
        try {
            String[] a = array.split(",");
            number = a[0];
            name = a[1];
            color = a[2];
            size = a[3];
        }
        
        catch (Exception e){
            System.out.println("БАН!");
        }
    }
    
    
    @Override
    public String toString() {
        return "Shirt{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public static void main(String[] args){
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        
        
        for (String shirt : shirts) {
            Shorts shirt1 = new Shorts(shirt);
            System.out.println(shirt1.toString());
        }
    }


}