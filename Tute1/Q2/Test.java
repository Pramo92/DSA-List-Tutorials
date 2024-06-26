package Q2;

public class Test {
    public static void main(String[] args){
        char[] name={'A','B','C','D','E'};
        int[] galle = {45263,25465,12546,125,23};
        int[] matara={12546,45236,25648,154,17};
        int[] hamba={45879,52136,45263,189,238};

        ListC n = new ListC(name.length);
        List g = new List(galle.length);
        List m = new List(matara.length);
        List h = new List(hamba.length);

        for(char x:name)
            n.InsertLast(x);

        for(int x:galle)
            g.InsertLast(x);

        for(int x:matara)
            m.InsertLast(x);

        for(int x:hamba)
            h.InsertLast(x);

        int max = 0;
        char party=' ';

        for(int i=0;i<galle.length;i++){
            if(g.RetrieveList(i)>max) {
                max = g.RetrieveList(i);
                party =  n.RetrieveList(i);
            }
        }
        System.out.println("Winning party of galle is "+party);

        max = 0;
        for(int i=0;i<matara.length;i++){
            if(m.RetrieveList(i)>max) {
                max = m.RetrieveList(i);
                party =  n.RetrieveList(i);
            }
        }
        System.out.println("Winning party of Matara is "+party);

        max = 0;
        for(int i=0;i<hamba.length;i++){
            if(h.RetrieveList(i)>max) {
                max = h.RetrieveList(i);
                party =  n.RetrieveList(i);
            }
        }
        System.out.println("Winning party of Hambanthota is "+party);

        max = g.RetrieveList(0)+m.RetrieveList(0)+h.RetrieveList(0);
        party=n.RetrieveList(0);

        for(int i=0;i<name.length;i++){
            if(max<g.RetrieveList(i)+m.RetrieveList(i)+h.RetrieveList(i)) {
                max = g.RetrieveList(i) + m.RetrieveList(i) + h.RetrieveList(i);
                party = n.RetrieveList(i);
            }
        }

        System.out.println("Winning party of southern province is "+party);

    }
}
