# LightHouse
## Iris Tao, Ishtiaque Mahdi, Angela Kim</br>

### Our Design
#### Ticket
The Ticket class provides all the features a ticket has, which includes the following instance variables and object methods:

(-) int id</br>
    Each ticket has a unique id, which in this case is ramdomly generated upon each ticket being entered. </br></br>
(-) int vip</br>
    Each ticket also has a vip level, which indicates its importance and determines its priority of being served. </br></br>
(-) String name</br>
    Each ticket has a unique name, which will be recorded in the addTicket() method and be added along with other object variables. </br></br>
(-) int summary</br>
    This user input is ought to provide a brief summary of each ticket's problem</br></br>
    
(+) public Ticket()</br>
    The default constructor. It initializes the instance variables of a ticket and gives them their default values.</br></br>
(+) public Ticket(String mingzi, int VIP, String summ, int ID)</br>
    The overloaded contructor.</br></br>
(+) public void setVip(int num)</br>
    Set the varible vip of the ticket.</br></br>
(+) public void setSummary(String s)</br>
    Set the variable summary of the ticket.</br></br>
(+) public void setName(String s)</br>
    Set the variable name of the ticket.</br></br>
(+) public void setId(int num)</br>
    Set the variable id of the ticket.</br></br>
  
(+) public void setVip, setSummary,setName, setId
    Set the corresponding variables of the ticket.</br></br>
    
(+) public boolean equals(Ticket x )</br>
    Compare two tickets, return true it they are eqaul, false otherwise.</br></br>
    
    
#### HelpDesk
(-) static ArrayPriorityQueue<Ticket> customers; 
    A row of all waiting tickets. 
(-) private static int ID;
    An ID to be used in addTicket().




### Embellishments
We created an option loop that allows for adding another ticket request after the first one is solved.





