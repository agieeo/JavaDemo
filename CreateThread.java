public class CreateThread {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();//start a new thread
    }
}
class MyThread extends Thread {
    public void run() {
        System.out.println("Start a new thread");
    }
}
