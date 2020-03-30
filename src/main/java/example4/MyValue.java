package example4;

import lombok.Getter;
import lombok.Setter;

import java.util.Comparator;

@Getter
@Setter
public class MyValue {
        String key;
        Integer apprNo;

        public static Comparator<MyValue> ValueComparator = new Comparator<MyValue>() {
                @Override
                public int compare(MyValue o1, MyValue o2) {
                        Integer value1 = o1.getApprNo();
                        Integer value2 = o2.getApprNo();

                        return value2.compareTo(value1);
                }
        };

        @Override
        public String toString() {
                return "[ key=" + key + ", value=" + apprNo + "]";
        }


}
