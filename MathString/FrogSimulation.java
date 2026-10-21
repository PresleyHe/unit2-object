public class FrogSimulation {
    private int goalDistance;
    private int maxHops;
    public FrogSimulation(int dist, int numHops){
        this.goalDistance = dist;
        this.maxHops = numHops;
    }
    private int hopDistance(){
        int hop = 0;
        hop = (int)(Math.random()*10)+1;
        if(Math.random()>0.9){
            hop = -hop;
        }
        return hop;
    }
    public boolean simulate(){
        boolean result = false;
        int num = 0;
        for(int i = 0; i<=this.maxHops;i ++){
            num += hopDistance();
            // System.out.println(num);
        }
        if (num >= this.goalDistance){
            result = true;
        }
        return result;
    }
}
