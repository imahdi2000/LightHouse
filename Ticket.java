/*
LightHouse - Ishtiaque Mahdi,Iris Tao, Angela Kim
APCS pd 2
Lab 3 - RUVIP?
2017 - 04 - 23
 */


public class Ticket{

    //instance variables
    private int id, vip;
    private String name, summary;
    private boolean solved;
    
    //default constructor
    public Ticket(){
	name = "John Doe";
	vip = 0;
	summary = "No problems, us sayin hi";
	id = (int)(Math.random() * 10000);
        solved = false;
    }
    
public Ticket(String mingzi, int VIP, String summ, int ID){
	name = "John Doe";
	vip = 0;
	summary = "No problems, us sayin hi";
	id = (int)(Math.random() * 10000);
    }

    public void setVip(int num){
	vip = num;
    }
    public void setSummary(String s){
	summary = s;
    }
    public void setName(String s){
	name = s;
    }
    public void setId(int num){
	id = num;
    }

    //-----------------------------------
    public int getVip(){
	return vip;
    }
    public String getSummmary(){
	return summary;
    }
    public String getName(){
	return name;
    }
    public int getId(){
	return id;
    }


    public boolean equals(Ticket x ){
	return this.getVip() > x.getVip();
    }
    
    
}
