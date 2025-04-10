public class Main
{
	public static void main(String[] args) {
	    Offering offering =new Coffee();
	    offering=new Rum(offering);
	    offering = new Gin(offering);
		System.out.println(offering.getName());
		System.out.println("Total Bill = Rs"+offering.getPrice());
	    offering =new Tea();
	    offering = new Gin(offering);
	//offering=new Rum(offering);
		System.out.println(offering.getName());
		System.out.println("Total Bill = Rs"+offering.getPrice());
		offering =new Coldcoffee();
		offering = new Gin(offering);
		offering = new Rum(offering);
		System.out.println(offering.getName());
		System.out.println("Total Bill = Rs"+offering.getPrice());
	}
}
