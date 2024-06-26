package Q2;

public class ListC {
    int maxSize;
    int position;
    char[] listArray;

    ListC(int size){
        maxSize=size;
        position=-1;
        listArray = new char[maxSize];
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

    void InsertLast(char x){
        if(IsListFull()){
            System.out.println("List is empty");
        }
        else{
            listArray[++position]=x;
        }
    }

    void InsertList(char x , int p){
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

    char DeleteList(int p){
        if(IsListEmpty()){
            System.out.println("list is empty");
        }
        else if(p<0||p>ListSize()){
            System.out.println("attempt to delete an entry st position is not in list");
        }
        else{
            char element = listArray[p];
            for(int i =p;i<ListSize();i++)
                listArray[i]=listArray[i+1];
            position--;
            return element;
        }
        return 0;
    }

    char RetrieveList(int p ){
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

    void ReplaceList(char x,int p){
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
