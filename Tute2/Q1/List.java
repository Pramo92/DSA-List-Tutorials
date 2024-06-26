package Q1;

import java.rmi.StubNotFoundException;

public class List {
    int maxSize;
    int position;
    Student[] listArray;

    List(int size){
        maxSize=size;
        position=-1;
        listArray = new Student[maxSize];
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

    void InsertLast(Student x){
        if(IsListFull()){
            System.out.println("List is full");
        }
        else{
            listArray[++position]=x;
        }
    }

    void InsertList(int p,Student x){
        if(IsListFull()){
            System.out.println("List is full");
        }
        else if(p<0||p<ListSize()){
            System.out.println("attempt to insert an entry at position is not in list");
        }
        else{
            for(int i=ListSize();p<ListSize();i++){
                listArray[i]=listArray[i-1];
            }
            listArray[p]=x;
            position++;
        }
    }

    Student DeleteList(int p){
        if(IsListEmpty()){
            System.out.println("List is empty");
        }
        else if(p<0||p>ListSize()){
            System.out.println("attempt to delete an entry at position is not in list");
        }
        else{
            Student  ele = listArray[p];
            for(int i=p;i<ListSize();i++){
                listArray[i]=listArray[i+1];
            }
            position--;
            return ele;
        }
        return null;
    }

    Student RetrieveList(int p){
        if(IsListEmpty()){
            System.out.println("List is empty");
        }
        else if(p<0||p>ListSize()){
            System.out.println("attempt to retrieve an entry at position is not in list");
        }
        else{
            return listArray[p];
        }
        return null;
    }

    void traversList(){
        for (int i=0;i<ListSize();i++){
            System.out.println(listArray[i].name);
            System.out.println(listArray[i].r1);
            System.out.println(listArray[i].r2);
        }
    }
}
