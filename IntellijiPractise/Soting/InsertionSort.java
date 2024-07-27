public class InsertionSort {
    public static void main(String[] args) {
        int a[]={1,6,3,8,2,9,7};
        int current;
        for (int i = 1; i <a.length ; i++) {
            current=a[i];
            int j = i-1;
            for (; j >=0&&current<a[j] ;) {
                a[j+1]=a[j];
                j--;
            }
                 a[j+1]=current;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"  ");
        }
    }
}
