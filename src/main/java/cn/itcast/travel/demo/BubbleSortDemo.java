package cn.itcast.travel.demo;

import java.util.Arrays;

public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int temp;
        for (int i = 0; i < arr.length-1; i++) {//趟数
            boolean flag=false;
            for (int j = arr.length-1; j >i ; j--) {//从后往前，每一次确定一个最小的
                if (arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    flag=true;
                }
            }
            if(!flag){//如果没有发生顺序的变动，那么说明已经冒泡排序完成了，不需要再次排序了
                break;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
