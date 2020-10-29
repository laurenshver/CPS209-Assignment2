import java.util.LinkedList;
import java.util.Random;

public class SalesTeam{

    public LinkedList<String> salespeople = new LinkedList<>();

    /**
     * list of my sales people
     */
    public SalesTeam(){
        salespeople.add("Chip");
        salespeople.add("Stella");
        salespeople.add("James");
        salespeople.add("Madeline");
        salespeople.add("Margaret");
        
    }

    /**
     * @return name of a random sales person
     */
    public String oneperson(){
        Random r= new Random();
        int index= r.nextInt(5);
        return salespeople.get(index);
    }

    /**
     * 
     * @return TEAM: names names names
     */
    public String display(){
        System.out.print("TEAM: ");
        for(int i=0; i< salespeople.size(); i++){
            System.out.print(salespeople.get(i) +" ");
        }
        System.out.println();
        return "";
    }

}