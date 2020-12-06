import java.util.*;

public class main {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String  a = in.nextLine();
;
        StringBuilder result = getLine(a.split(" "));
        System.out.println(result.toString());
    }


    public static StringBuilder getLine(String... words) {
        if (words == null || words.length == 0)
        { return new StringBuilder(); }
        if ("".equals(words[0]) || words.length == 1)

        {return new StringBuilder(words[0]); }

        StringBuilder result = new StringBuilder();

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i ++)
            if (!words[i].equals(""))
                list.add(words[i]);
        while (!checker(list))
        {
            Collections.shuffle(list);
        }
        
        for (String s : list)
            result.append(s +  " ");
        result.deleteCharAt(result.length()-1);
        return result;
    }
    
    public static boolean checker(ArrayList<String> list)
    {
        for (int i = 0; i < list.size()-1; i++)
        {
            String x = list.get(i);
            String y = list.get(i+1);
            
            
            x = x.toLowerCase();
            y = y.toLowerCase();

            if (x.charAt(x.length()-1) != y.charAt(0))
                return false;
        }
        return true;
    }
}