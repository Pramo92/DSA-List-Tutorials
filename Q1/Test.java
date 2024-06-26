package Q1;

public class Test {
    public static void main(String[] args){
        int arr[] = {21,87,56,33,15,45,64,72,29};

        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        List list = new List(arr.length);
        for(int x:arr){
            list.InsertLast(x);
        }

        int stem;
        int leaf;
        int y=0;
        for(int i =0;i<arr.length;i++){
            int x= list.RetrieveList(i);
            stem = x/10;
            leaf= x%10;
            if(stem==y){
                System.out.print(" "+leaf);
                continue;
            }
            else {
                System.out.println();
            }
            System.out.print(stem+" | "+leaf);
            y=stem;
        }


    }
}
