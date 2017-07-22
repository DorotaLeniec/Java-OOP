package collections.list.set;

/**
 * Created by dorka on 17.07.2017.
 */
public class NumberPair {
    int a;
    int b;

    public NumberPair(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void print(){
        System.out.println("("+a+","+b+")");
    }

    @Override
    public boolean equals(Object obj) {
        NumberPair pair = (NumberPair) obj;
        return  (this.a == pair.a && this.b == pair.b);

    }

//    @Override
//    public int hashCode() {
//        return 100*a +b;
//    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
