public class startRun implements Runnable {
    public void run(){
        System.out.println("thread is running......");
    }

}

class ThreadClass{
    public static void main(String[] args){
        startRun obj = new startRun();
        Thread tOne = new Thread(obj);
        tOne.start();
    }
}