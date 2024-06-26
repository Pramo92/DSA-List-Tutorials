package Q2;

public class Test {
    public static void main(String[] args){
        int[] numbers = {10,9,52,24,35,11,9,12,3,11,25,4,8,11,42};

        List list = new List();
        for(int x : numbers)
            list.InsertLast(x);

        int total = 0;
        for(int i =0;i< list.ListSize();i++){
            int element = list.RetrieveList(i);
            total+=element;
        }

        double mean = total/list.ListSize();

        int median = list.RetrieveList((list.ListSize()/2));

        int max = list.RetrieveList(0);
        for(int i =0;i< list.ListSize();i++){
            int element = list.RetrieveList(i);
            if(max<element ){
                max= element;
            }

        }

        int min = list.RetrieveList(0);
        for(int i =0;i< list.ListSize();i++){
            if(min> list.RetrieveList(i))
                min= list.RetrieveList(i);
        }

        int range = max-min;

        int maxFrequency = 0;
        int mode=list.RetrieveList(0);
        int modeCount = 0;

        for (int i = 0; i < list.ListSize(); i++) {
            int frequency = 0;

            for (int j = 0; j < list.ListSize(); j++) {
                if (list.RetrieveList(j) == list.RetrieveList(i)) {
                    frequency++;
                }
            }

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mode=list.RetrieveList(i);
            }
        }






        System.out.println("Mean: "+mean);
        System.out.println("Median: "+median);
        System.out.println("Range: "+range);
        System.out.println("Mode: "+mode);

    }
}
