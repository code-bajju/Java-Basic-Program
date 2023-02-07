public class Array_practice {
    public static void main(String[] args) {
        // float[] arr = { 1.2f, 1.6f, 1.9f };
        // float sum = 0;
        // boolean isInArray=false;

        // float num = 1.5f;
        // for (float element : arr) {
        // if (num == element) {
        // isInArray = true;
        // break;
        // }
        // }
        // if (isInArray) {
        // System.out.println("Hai bhA U");
        // }
        // else{
        // System.out.println("Nahi Hai Yahan");
        // }

        // int [][] flats0 ={{1,2,3},{4,5,6}};
        // int [][] flats1 ={{1,2,3},{4,5,6}};
        // int [][] sum ={{0,0,0},{0,0,0}};
        // for(int i=0;i<flats0.length;i++){
        // for(int j=0;j<flats0 [i].length;j++){
        // sum[i][j]=flats0[i][j] + flats1[i][j];
        // System.out.print(sum[i][j]+" ");
        // }
        // System.out.println("");

        // problem reverse array
        // int [] arr = {1,2,3,4,5,6,7,9};
        // int l = arr.length;
        // int temp;
        // int n = Math.floorDiv(l,2);
        // for(int i=0;i<n;i++){
        // //swap a[i] and a[l-1-i]
        // temp = arr[i];
        // arr[i]=arr[l-i-1];
        // arr[l-i-1]=temp;
        // }
        // for (int element : arr){
        // System.out.print(element);
        // System.out.print(" ");

        // int [] arr = {1,2,3,- 45,5,6,7,9};
        // int min=Integer.MAX_VALUE;
        // for (int e:arr){
        // if(e<min){
        // min = e;
        // }
        // }
        // System.out.println(min);

        //solution 7
        boolean sorted=true;
        int [] arr = {1,2,3,- 45,5,6,7,9};
        for(int i=0;i<arr.length-1;i++){
        if(arr[i]>arr[i+1]){
            sorted=false;
            break;
        }
    }
    if(sorted){
        System.out.println("Array is sorted");
    }
    else{
        System.out.println("array is not sorted");
    }

    }

}
