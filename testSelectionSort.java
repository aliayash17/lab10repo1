package lab10part2;

import static org.junit.Assert.*;
import org.junit.Test;

public class testSelectionSort {
    private SelectionSort sorter = new SelectionSort();

    @Test
    public void test() {
        testPositive();
        testNegative();
        testMixed();
        testDuplicates();
    }

    public testSelectionSort() {
    }

    private void printArray(String testName, int[] arr) {
        System.out.print(testName + ": ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public void testPositive() {
        int[] arr = {8, 9, 7, 10, 2};
        int[] Sortedarr = {2, 7, 8, 9, 10};

        printArray("Positive Before Sorting", arr);
        sorter.basicSelectionSort(arr);
        printArray("Positive After Sorting", arr);

        try {
            assertArrayEquals(Sortedarr, arr);
            System.out.println("Positive Test Passed\n");
        } catch (AssertionError e) {
            System.out.println("Positive Test Failed\n");
        }
    }

    public void testNegative() {
        int[] arr = {-8, -9, -7, -10, -2};
        int[] Sortedarr = {-10, -9, -8, -7, -2};

        printArray("Negative Before Sorting", arr);
        sorter.basicSelectionSort(arr);
        printArray("Negative After Sorting", arr);

        try {
            assertArrayEquals(Sortedarr, arr);
            System.out.println("Negative Test Passed\n");
        } catch (AssertionError e) {
            System.out.println("Negative Test Failed\n");
        }
    }

    public void testMixed() {
        int[] arr = {3, -2, 0, 1, -1};
        int[] Sortedarr = {-2, -1, 0, 1, 3};

        printArray("Mixed Before Sorting", arr);
        sorter.basicSelectionSort(arr);
        printArray("Mixed After Sorting", arr);

        try {
            assertArrayEquals(Sortedarr, arr);
            System.out.println("Mixed Test Passed\n");
        } catch (AssertionError e) {
            System.out.println("Mixed Test Failed\n");
        }
    }

    public void testDuplicates() {
        int[] arr = {4, 2, 2, 4, 3, 3};
        int[] Sortedarr = {2, 2, 3, 3, 4, 4};

        printArray("Duplicates Before Sorting", arr);
        sorter.basicSelectionSort(arr);
        printArray("Duplicates After Sorting", arr);

        try {
            assertArrayEquals(Sortedarr, arr);
            System.out.println("Duplicates Test Passed\n");
        } catch (AssertionError e) {
            System.out.println("Duplicates Test Failed\n");
        }
    }
}
