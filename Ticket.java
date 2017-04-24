/*
LightHouse - Ishtiaque Mahdi,Iris Tao, Angela Kim
APCS pd 2
Lab 3 - RUVIP?
2017 - 04 - 23
 */


public class Ticket{

    private int id;
    private int vip;
    private String name;
    private String summary;
    
    public Ticket(){
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
