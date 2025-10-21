public class Test1 {
    public static void main(String[] args) {
        int i = 0;
        int j = i++ + i*5; //0 först läses in och sen ökar i med ett, och eftersom i * 5 är efter i++, kommer ökningen appliceras till i * 5
        System.out.println(j);
    }
}
