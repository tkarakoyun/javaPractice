package day38;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllMethodPractice {

    public static void main(String[] args) {

        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(123);
        nums1.add(100);
        nums1.add(223);
        nums1.add(133);
        nums1.add(125);
        nums1.add(122);
        nums1.add(125);
        nums1.add(122);
        System.out.println("nums1 before removal = " + nums1);
        //I want to remove 100, 133

        nums1.removeAll(Arrays.asList(400, 133));
        System.out.println("nums1 after removal = " + nums1);

        nums1.removeAll(Arrays.asList(125));
        System.out.println("nums1 after removing all 125 = " + nums1);
    }
}
