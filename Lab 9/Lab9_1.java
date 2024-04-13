class GoodMorning implements Runnable{
    public void run(){
        try{
            while(true){
                System.out.println("Good Morning");
                Thread.sleep(1000);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
class GoodAfternoon implements Runnable{
    public void run(){
    try{
        while(true){
          System.out.println("Good Afternoon");
          Thread.sleep(3000);


        }
    }catch(Exception e){
      e.printStackTrace();
    }
}
}
public class Lab9_1 {
    public static void main (String[] args){
        GoodMorning r1 = new GoodMorning();
        GoodAfternoon r2 = new GoodAfternoon();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
    
}
