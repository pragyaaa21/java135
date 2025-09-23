package unit2;

public class myymain {
    public static void main(String[] args) {
        Thread1 th1 = new Thread1();
        th1.start();
        System.out.println(th1.getName());
        th1.setName("KIET THREAD");
        System.out.println(th1.getName());
        System.out.println(th1.getPriority());
        th1.setPriority(9);
        System.out.println(th1.getPriority());

    }
}
