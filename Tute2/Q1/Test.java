package Q1;

public class Test {
    public static void main(String[] args){
        char[] sname ={ 'A','B','C','D','E','F'};
        int[] sr1= {95,78,85,62,72,88};
        int[] sr2 = {90,85,88,75,80,92};


        List list = new List(6);

        for(int i=0;i<6;i++){
            Student st = new Student();
            st.name=sname[i];
            st.r1 = sr1[i];
            st.r2 = sr2[i];

            list.InsertLast(st);
        }

        System.out.println("Student Round 1 Round 2");
        for(int i=0;i<6;i++){
            System.out.printf("%c \t %d \t %d \n",list.RetrieveList(i).name , list.RetrieveList(i).r1,list.RetrieveList(i).r2);

        }

        int max  =list.RetrieveList(0).r1;
        char tName = list.RetrieveList(0).name;;
        for(int i=0;i<6;i++){
            int x =list.RetrieveList(i).r1;
            if(x>max){
                max=x;
                tName= list.RetrieveList(i).name;
            }
        }

        System.out.println("Top scorer: "+tName);

        max  =list.RetrieveList(0).r2;
        tName = list.RetrieveList(0).name;;
        for(int i=0;i<6;i++){
            int x =list.RetrieveList(i).r2;
            if(x>max){
                max=x;
                tName= list.RetrieveList(i).name;
            }
        }

        System.out.println("Top scorer: "+tName);

        DisplayImprovedScores(list);

        max  =list.RetrieveList(0).r1+list.RetrieveList(0).r2;
        tName = list.RetrieveList(0).name;;
        for(int i=0;i<6;i++){
            int x = list.RetrieveList(i).r1 +list.RetrieveList(i).r2;
            if(x>max){
                max=x;
                tName= list.RetrieveList(i).name;
            }
        }

        System.out.println("Coding Champion title: "+tName);
    }

    public static void DisplayImprovedScores(List list){

        for(int i =0;i<6;i++){
            int x = list.RetrieveList(i).r1;
            int y = list.RetrieveList(i).r2;

            System.out.println("Improved score of Student "+ list.RetrieveList(i).name +": "+ (y-x));
        }

    }


}




