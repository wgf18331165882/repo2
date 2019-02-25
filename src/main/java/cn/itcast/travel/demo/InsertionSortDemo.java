package cn.itcast.travel.demo;

public class InsertionSortDemo {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int temp;
        for (int i = 0; i < 5-1; i++) {
            for (int j = i+1; j >0 ; j--) {//先前两个比较 再前三个比较 再前四个比较
                if(arr[j]<arr[j-1]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }else{  //不用交换
                    break;
                }
            }
        }
    }
}
