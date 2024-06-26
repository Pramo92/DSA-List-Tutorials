package Q1;

public class List {
     int maxSize;
     int position;
     int[] listArray;

     List(int size){
         maxSize=size;
         position=-1;
         listArray = new int[maxSize];
     }

     boolean IsListEmpty(){
         return (position==-1);
     }

     boolean IsListFull(){
         return (position==maxSize-1);
     }

     int ListSize(){
         return position+1;
     }

     void InsertLast(int x){
         if(IsListFull()){
             System.out.println("List is empty");
         }
         else{
             listArray[++position]=x;
         }
     }

     void InsertList(int x , int p){
         if(IsListFull()){
             System.out.println("List is empty");
         }
         else if(p<0||p>ListSize()){
             System.out.println("attempt to insert an entry st position is not in list");
         }
         else{
             for (int i =ListSize();i>p;i--){
                 listArray[i]=listArray[i-1];
             }
             listArray[p]=x;
             position++;
         }
     }

     int DeleteList(int p){
         if(IsListEmpty()){
             System.out.println("list is empty");
         }
         else if(p<0||p>ListSize()){
             System.out.println("attempt to delete an entry st position is not in list");
         }
         else{
             int element = listArray[p];
             for(int i =p;i<ListSize();i++)
                 listArray[i]=listArray[i+1];
             position--;
             return element;
         }
         return 0;
     }

     int RetrieveList(int p ){
         if(IsListEmpty()){
             System.out.println("list is empty");
         }
         else if(p<0||p>ListSize()){
             System.out.println("attempt to retirve an entry st position is not in list");
         }
         else{
             return listArray[p];
         }
         return 0;
     }

     void ReplaceList(int x,int p){
         if(IsListEmpty()){
             System.out.println("list is empty");
         }
         else if(p<0||p>ListSize()){
             System.out.println("attempt to retirve an entry st position is not in list");
         }
         else{
             listArray[p]=x;
         }
     }

     void TraversList(){
         for (int i=0;i<ListSize();i++)
             System.out.println(listArray[i]);
     }
}
