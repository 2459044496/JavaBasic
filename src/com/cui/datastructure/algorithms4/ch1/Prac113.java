package com.cui.datastructure.algorithms4.ch1;

/**
 * 	编写一个程序，从命令行得到三个整数参数。如果它们都相等则打印equal，否则打印not equal。
 */
public class Prac113 {
    public static void main(String[] args) {
        if (args.length !=3) {
            System.out.println("参数长度不是3");
            return;
        }
        Integer integer1 = null;
        Integer integer2 = null;
        Integer integer3 = null;
        try {
            integer1 = Integer.valueOf(args[0]);
            integer2 = Integer.valueOf(args[1]);
            integer3 = Integer.valueOf(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("类型转换异常" + e.getMessage());
            return;
        }

        if (integer1.equals(integer2)) {
            if (integer1.equals(integer3)) {
                System.out.println("equal");
                return;
            }
        }
        System.out.println("not equal");
    }
}
