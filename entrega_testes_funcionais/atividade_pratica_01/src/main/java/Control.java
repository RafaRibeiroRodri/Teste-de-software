import java.util.Scanner;

public class Control {
    public Scanner scanner;

    public Control() {
        scanner = new Scanner(System.in);
    }

    public int nextInt() {
        int op = scanner.nextInt();
        return op;
    }

    @Override
    protected void finalize() throws Throwable {
        scanner.close();
    }

    public float nextFloat() {
        int o = (int) scanner.nextFloat();
        return o;
    }

}
