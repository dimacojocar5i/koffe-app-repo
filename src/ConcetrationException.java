public class ConcetrationException  extends Exception{
    // props
    int c;

    public ConcetrationException(int t, String msg) {
        super(msg);
        this.c = c;
    }

    public int getC() {
        return c;
    }
}
