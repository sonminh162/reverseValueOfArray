package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int size;
        int i;
        int temp;
        do{
            System.out.print("Nhap vao so phan tu trong mang:");
            size = scanner.nextInt();
            if(size > 20)
                System.out.print("So luong phan tu khong duoc vuot qua 20");
        }while(size > 20);
        array = new int[size];
        for(i = 0;i<array.length;i++)
        {
            System.out.print("nhap vao cac phan tu trong mang:");
            array[i]=scanner.nextInt();
        }
        temp = array[0];
        for(i = 0; i < array.length/2; i++)
        {
            temp = array[i];
            array[i]=array[size-1-i];
            array[size-1-i]= temp;
        }
        System.out.print("in ra danh sach dao nguoc:");
        for(i = 0; i < array.length;i++)
            System.out.print("\t"+array[i]+"\t");

    }
}
