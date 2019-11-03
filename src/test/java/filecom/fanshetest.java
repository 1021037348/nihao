package filecom;

public class fanshetest {
    public static void main(String[] args) {
        ClassLoader fileTest01Class = FileTest01.class.getClassLoader();
        System.out.println(fileTest01Class);
    }
}
