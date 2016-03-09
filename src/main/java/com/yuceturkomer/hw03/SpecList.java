package com.yuceturkomer.hw03;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * This class is extended from LinkedList which is generic. And also declared
 * that the class should have been implemented the Comparable interface to use this data structure.
 */
public class SpecList<E extends Comparable<E>> extends LinkedList<E> {
    /**
     * No param constructor for SpecList. Calls super's constructor.
     */
    public SpecList() {
        super();
    }

    /**
     * 1 param constructor that calls the super's constructor with a Collection reference.
     * @param c The collection reference that will be passed as.
     */
    public SpecList(Collection<? extends E> c) {
        super(c);
    }

    /**
     * This method adds all the data to the head of the data structure. Throws NullPointerException if c == null
     * @param c The Collection that will be added.
     * @return always true.
     * @throws NullPointerException if c == null.
     */
    public Boolean addAllAtHead(Collection<? extends E> c) throws NullPointerException {
        if (c == null)
            throw new NullPointerException();
        if (isEmpty()) {
            addAll(c);
        }
        addAll(0, c);
        return true;
    }

    /**
     * Returns an intersection List of given collection and main one. Throws NullPointerException if c==0.
     * @param c The Collection that will be compared and intersected.
     * @return Returns new List of intersection .
     * @throws NullPointerException if c == null.
     */
    @SuppressWarnings("unchecked")
    public List<E> getIntersectList(Collection<? extends E> c) throws NullPointerException {
        if (c == null)
            throw new NullPointerException();
        List<E> listToReturn = new SpecList<>();
        for (Object obj1 : c) {
            for (Object obj2 : this) {
                if (obj1.equals(obj2) && !listToReturn.contains(obj1))
                    listToReturn.add((E) obj1);
            }
        }
        return listToReturn;
    }

    /**
     * Sorts and returns the list according to given sortStyle. (Increasing or decrasing order).
     * The coctail-shaker-sort tactic is used.
     * @param sortStyle the character for deciding sort style.
     * @return returns the same List that sorted.
     */
    public List<E> sortList(char sortStyle) {
        boolean swapped;
        if (sortStyle == 'd' || sortStyle == 'D') {
            do {
                swapped = false;
                for (int i = 0; i < size() - 2; ++i) {
                    if (get(i).compareTo(get(i + 1)) < 0) {
                        E temp = get(i);
                        set(i, get(i + 1));
                        set(i + 1, temp);
                        swapped = true;
                    }
                }
                if (!swapped) {
                    break;
                }
                swapped = false;
                for (int i = size() - 2; i >= 0; --i) {
                    if (get(i).compareTo(get(i + 1)) < 0) {
                        E temp = get(i);
                        set(i, get(i + 1));
                        set(i + 1, temp);
                        swapped = true;
                    }
                }
            } while (swapped);
        } else if (sortStyle == 'i' || sortStyle == 'I') {
            do {
                swapped = false;
                for (int i = 0; i < size() - 2; ++i) {
                    if (get(i).compareTo(get(i + 1)) > 0) {
                        E temp = get(i);
                        set(i, get(i + 1));
                        set(i + 1, temp);
                        swapped = true;
                    }
                }
                if (!swapped) {
                    break;
                }
                swapped = false;
                for (int i = size() - 2; i >= 0; --i) {
                    if (get(i).compareTo(get(i + 1)) > 0) {
                        E temp = get(i);
                        set(i, get(i + 1));
                        set(i + 1, temp);
                        swapped = true;
                    }
                }
            } while (swapped);

        }
        return this;
    }
}
