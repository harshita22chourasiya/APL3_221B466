abstract class Beverage {
    void pour(int qty){
        System.out.println("Pour"+qty+"ml of beverage");
    }
    protected abstract void addCondiment();
    protected void stir(){}
    private void serve(){
        System.out.println("Serve through Waiters");
        
    }
    public void templateMethod(int qty){
        pour(qty);
        addCondiment();
        stir();
        serve();
    }
}