public class ConcetrationException  extends Exception{
    // props
    int c;

    public ConcetrationException(int t, String msg) {
        super(msg);
        this.c = t;
    }

    public int getT() {
        return c;
    }
}
