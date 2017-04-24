import cs1.Keyboard;

public class HelpDesk{

    private static ArrayPriorityQueue<Ticket> customers;
    private static int ID;

    public HelpDesk(){
	customers = new ArrayPriorityQueue<Ticket>();
	ID = 0;
    }

    public static void addTick(){
	int vipness = (int)(Math.random() * 5);
	
	String ret = "Hello, I see you seek assistance.\nWhat is your name?";
	System.out.println(ret);
	string name = Keyboard.readString();
	
	ret = "Thank you. Now choose a number, please:\n1. My computer isn't working.\t2. My mouse isn't working My computer isn't working.\t3. I'm not working.";
	System.out.println(ret);
	int summary = Keyboard.readInt();
	
	String sum1 = "My computer isn't working.";
	String sum2 = "My computer isn't working.";
	String sum3 = "I'm not working.";
	
	if(summary == 1){
	    customers.add(new Ticket(name, vipness, sum1, ID)); 
	}
	if(summary == 2){
	    customers.add(new Ticket(name, vipness, sum2, ID));
	}
	if(summary ==3){
	    customers.add(new Ticket(name, vipness, sum3, ID));
	}

	ID+=1;	
    }
    
    public static void main (String [] args){
	addTick();
    }
}
