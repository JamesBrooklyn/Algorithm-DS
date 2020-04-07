package com.upcode.ArrayAb;

import java.util.ArrayList;

/**
 * 0,1,,n-1这n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字。求出这个圆圈里剩下的最后一个数字。
 *
 * 例如，0、1、2、3、4这5个数字组成一个圆圈，从数字0开始每次删除第3个数字，则删除的前4个数字依次是2、0、4、1，因此最后剩下的数字是3。
 *
 */

public class Sixty_two{
    public int lastRemaining(int n, int m) {

        ArrayList<Integer> arrayList = new ArrayList<>(n);

        for(int i = 0; i < n; i ++){
            arrayList.add(i);
        }
        int index = 0;
        while (n > 1) {
            index = (index + m - 1)%n;
            arrayList.remove(index);
            n --;
        }
        return arrayList.get(0);
    }


    public static void main(String[] args) {
        Sixty_two testModel = new Sixty_two();
        int num = testModel.lastRemaining(5,3);
        System.out.println(num);
    }
}

