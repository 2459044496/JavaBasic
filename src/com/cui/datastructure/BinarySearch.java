package com.cui.datastructure;

import java.util.Arrays;

/**
 * 二分查找法
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 11, 18};
        Arrays.sort(arr);
        System.out.println(binarySearchUseCycle(7, arr));
        System.out.println(binarySearchUseCycle(11, arr));
        System.out.println(binarySearchUseCycle(2, arr));

        System.out.println(binarySearchUseRecursion(7, arr, 0, arr.length - 1));
        System.out.println(binarySearchUseRecursion(11, arr, 0, arr.length - 1));
        System.out.println(binarySearchUseRecursion(2, arr, 0, arr.length - 1));
    }

    // 使用循环
    public static int binarySearchUseCycle(int key, int[] arr) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (key < arr[mid]) {
                hi = mid - 1;
            } else if (key > arr[mid]) {
                lo = mid + 1;
            } else {
                return mid;// 如果key存在数组arr中，返回其索引值
            }
        }
        return -1;
    }

    // 使用递归实现
    public static int binarySearchUseRecursion(int key, int[] arr, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (key < arr[mid]) {
            return binarySearchUseRecursion(key, arr, lo, mid-1);
        } else if (key > arr[mid]) {
            return binarySearchUseRecursion(key, arr, mid + 1, hi);
        } else {
            return 1;
        }
    }
}
