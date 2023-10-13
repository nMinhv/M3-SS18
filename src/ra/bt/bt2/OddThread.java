package ra.bt.bt2;

public class OddThread extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i <10 ; i++) {
            if(i%2!=0){
                System.out.printf("Odd num: %d\n",i);
            }
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
