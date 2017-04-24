import cs1.Keyboard;

public class HelpDesk{

    private static ArrayPriorityQueue<Ticket> customers;
    private static int ID;

    public HelpDesk(){
	customers = new ArrayPriorityQueue<Ticket>();
	ID = 0;
    }



    public static void addTicket(String name, String summary, int vip,int id){
	Ticket tick = new Ticket();
	tick.setVip(vip);
	tick.setName(name);
	tick.setSummary(summary);
	tick.setId(id);
	customers.add(tick);
    }

    public static String solve(){
	
	for(int i = 0; i < customers.size();i++){
	    System.out.println("Did you try turning it on and off?");
	}
	return "Your Wlecome";
    }
    
    public static void main (String [] args){
	HelpDesk hd = new HelpDesk();

	boolean loop = true;
	//	Ticket tick = new Ticket();
	//customers.add(tick);
	while(loop == true){
	System.out.println("Hello, I see you seek assistance.\nWhat is your name?");
	String name = Keyboard.readString();	
	System.out.println("Thank you. Now please explain the problem.");
	String summary = Keyboard.readString();
	int vipness = (int)(Math.random() * 5);
	addTicket(name,summary,vipness,ID);

	
	    System.out.println("Would you like to add another request?\nSelect (1) for YES\nSelect (2) for NO");
	    
	    int choice =  Keyboard.readInt();
	    if(choice == 1){
		ID+=1;
	    }
	    else{
		solve();
		loop = false;
	    }
	    
	}
	System.out.println("Thank You");

    }
}
