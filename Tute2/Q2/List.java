package Q2;

public class List {
    private Node head;
    private int count;

    List(){
        head = null;
        count=0;
    }

    boolean IsListEmpty(){
        return head==null;
    }

    int ListSize(){
        return count;
    }

    public void InsertLast(int x){
        Node node = new Node();
        node.data=x;
        node.next=null;
        if(head==null){
            head=node;
        }
        else{
            Node n = head;
            while(n.next!=null)
                n=n.next;
            n.next=node;
            count++;
        }
    }

    public void InsertList(int x,int p){
        Node node = new Node();
        node.data=x;
        node.next=null;
        if(p<0||p>ListSize()){
            System.out.println("attempt to insert an entry to the position is not in list");
        }
        else{
            Node n = head;
            for(int i=0;i<p;i++){
                n=n.next;
            }
            node.next=n.next;
            n.next=node;
            count++;
        }
    }

    public void DeleteList(int p) {
        if (IsListEmpty()) {
            System.out.println("List is empty");
        } else if (p < 0 || p > ListSize()) {
            System.out.println("attempt to delete an entry to the position is not in list");
        } else if (p == 0) {
            head = head.next;
        } else {
            Node n = head;
            Node temp = null;
            for (int i = 0; i < p; i++)
                n = n.next;
            temp = n.next;
            n.next = temp.next;
            System.out.println(temp.data);
            temp = null;
            count--;
        }
    }

        public int RetrieveList(int p){
            if(IsListEmpty()){
                System.out.println("List is empty");
            }
            else if(p<0||p>ListSize()){
                System.out.println("attempt to retieve an entry to the position is not in list");
            }
            else{
                Node n = head;
                for(int i=0;i<p;i++) {
                    n = n.next;
                }
                return n.data;
            }
            return -1;
    }

    public void TraverseList(){
        Node n =head;
        while(n.next!=null){
            System.out.println(n.data);
            n =n.next;
        }
        System.out.println(n.data);
    }
}
