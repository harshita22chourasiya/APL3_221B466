public class Main
{
	public static void main(String[] args) {
		Singleton x = Singleton.getInstance();
	    	Singleton y = Singleton.getInstance();
		System.out.println(x.hashCode()) ; 
		System.out.println(y.hashCode()) ; 
	}
}
