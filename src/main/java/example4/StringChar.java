package example4;

import java.util.*;

public class StringChar {


    public void returnSecondChar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String a = input.nextLine();

        StringBuilder b = new StringBuilder();
        b.append(a);

        List<MyValue> list = new ArrayList<>();

        while (b.length() > 0) {
            int appereance = 0;
            char firstChar = b.charAt(0);

            for (int j = 0; j < b.length(); j++) {
                if (Character.toString(firstChar).equals(Character.toString(b.charAt(j)))) {
                    b.replace(j, j + 1, "");
                    j--;
                    appereance++;
                }
            }
            MyValue saveMyValue = new MyValue();
            saveMyValue.setKey(Character.toString(firstChar));
            saveMyValue.setApprNo(appereance);
            list.add(saveMyValue);
        }

        Collections.sort(list, MyValue.ValueComparator);


        System.out.println(list.toString());
        System.out.println(list.get(1).toString());


    }




}
