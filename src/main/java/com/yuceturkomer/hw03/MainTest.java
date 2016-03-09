package com.yuceturkomer.hw03;

/**
 * This is the main test class of SpecList class.
 */
public class MainTest {
    public static final char INCREASED = 'i';
    public static final char DECREASED = 'd';

    public static void main(String[] args) {
        SpecList<Integer> testList1 = new SpecList<>();
        SpecList<Integer> testList2 = new SpecList<>();
        SpecList<Character> charTestList = new SpecList<>();
        //Adding elements at SpecLists
        testList1.add(1);
        testList1.add(3);
        testList1.add(2);
        testList1.add(5);
        //Adding elements at SpecLists
        testList2.add(1);
        testList2.add(3);
        testList2.add(3);
        testList2.add(6);
        testList2.add(3);
        testList2.add(4);
        //Adding elements at SpecLists
        charTestList.add('c');
        charTestList.add('a');
        charTestList.add('b');
        charTestList.add('e');
        charTestList.add('g');

        System.out.println("The integer test list1 -> " + testList1);
        System.out.println("The integer test list2 -> " + testList2);
        try {
            System.out.println("The intersection of those 2 lists: " + testList1.getIntersectList(testList2));
        } catch (NullPointerException e) {
            System.err.println("Given Collection is a null pointer." + e.getMessage());
        }
        try {
            testList2.sortList(INCREASED);
            System.out.println("The increased format of sortList for integer test list 2 -> " + testList2);
            testList2.sortList(DECREASED);
            System.out.println("The decreased format of sortList for integer test list 2 -> " + testList2);
            charTestList.sortList(INCREASED);
            System.out.println("The increased format of sortList for char test list 2 -> " + charTestList);
            charTestList.sortList(DECREASED);
            System.out.println("The decreased format of sortList for char test list 2 -> " + charTestList);
        }catch (NullPointerException e){
            System.err.println("Given Collection is a null pointer." + e.getMessage());
        }
    }
}

