package com.prokopchik.homework2;

public class homeworkTask5 {
    /*���� ����� ����������� 4-� ������� �����. ����� ��, ��� ��� ����� �����
��������?*/
    public static void main(String[] args){
        int n = 2401;
        //��� ������� ����������� ����� �� ������ 4
        int x4 = n / 1000;
        int x3 = (n - x4 * 1000) / 100;
        int x2 = (n - x4 * 1000 - x3 * 100) / 10;
        int x1 = n % 10;

        System.out.print((x1 != x2) & (x1 != x3) & (x1 != x4) & (x2 != x3) & (x2!=x4) & (x3 != x4));

    }
}
