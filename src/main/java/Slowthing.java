public class Slowthing extends Thing {

    public Slowthing(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
