package cn.itcast.travel.demo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectSortDemo {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        for (int i = 0; i < 4; i++) {
            int  minIndex=i;
            for (int j = i+1; j < 5; j++) {
                if(arr[j]<arr[minIndex]){
                    minIndex=j;  //找出数组中最小数的索引
                }
            }
            if(minIndex !=i){//交换当前索引元素和最小元素位置
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
