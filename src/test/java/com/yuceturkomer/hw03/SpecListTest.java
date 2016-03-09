package java.com.yuceturkomer.hw03;

import com.yuceturkomer.hw03.SpecList;
import org.junit.Assert;


/**
 *Junit testing
 */
public class SpecListTest {
    private SpecList<Integer> intList1;
    private SpecList<Integer> intList2;
    private SpecList<Integer> intList3;


    @org.junit.Before
    public void setUp() throws Exception {
        System.out.println("SpecList class test method is going to be called");
        intList1 = new SpecList<>();
        intList1.add(2);
        intList1.add(3);
        intList1.add(1);
        intList2 = new SpecList<>();
        intList2.add(2);
        intList2.add(2);
        intList3 = new SpecList<>();
        intList3.add(2);
        intList3.add(5);
        intList3.add(6);
    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("SpecList class test method is called and ended");
    }

    @org.junit.Test
    public void testAddAllAtHead() throws Exception {
        intList2.addAllAtHead(intList3);
        SpecList<Integer> tempList = new SpecList<>();
        tempList.add(2);
        tempList.add(5);
        tempList.add(6);
        tempList.add(2);
        tempList.add(2);
        Assert.assertEquals(tempList, intList2);
    }

    @org.junit.Test
    public void testGetIntersectList() throws Exception {
        SpecList<Integer> tempList1 = new SpecList<>();
        tempList1.add(2);
        Assert.assertEquals(tempList1, intList1.getIntersectList(intList2));
    }

    @org.junit.Test
    public void testSortList() throws Exception {
        intList1.add(4);
        intList1.sortList('i');
        SpecList<Integer> tempList1 = new SpecList<>();

        tempList1.add(1);
        tempList1.add(2);
        tempList1.add(3);
        tempList1.add(4);
        Assert.assertEquals(tempList1, intList1);
    }
}