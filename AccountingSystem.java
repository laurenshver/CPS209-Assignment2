import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AccountingSystem {

    ArrayList<Transaction> transactionList;
    SalesTeam salesTeam = new SalesTeam();

    //default constructor
    /**
     * 
     * @param arraylist of transactions
     */
    public AccountingSystem(ArrayList<Transaction> transactions){
        transactionList = transactions;
    }

    /**
     * adds trnasaction list to accounting system
     * @param newTransactions
     */
    public void addToSales(ArrayList<Transaction> newTransactions){
        transactionList = newTransactions;
    }


    /**
     * @return displays the transaction string of last bought car
     */
    public String returnLastCar(){
        Transaction lastTransaction= transactionList.get(transactionList.size()-1);
        System.out.print(lastTransaction.display());
        transactionList.remove(transactionList.size()-1);
        return "";
    }

    /**
     * 
     * @param SalesType
     * @return different string depending on sales type inputted
     * @throws NumberFormatException
     */
    public String displaySpecialSales(String SalesType) throws NumberFormatException{
        if(SalesType.equals("TOPSP")){
            return displayTopSalesPerson();
        }
        else if (SalesType.equals("STATS")){
            return displaySalesStats();
        } 
        else if (SalesType.equals("TEAM")){
            salesTeam.display();
        }
        else {
            int SalesasINT = Integer.parseInt(SalesType);
            if (SalesasINT < 12){
                return displayMonthlySales(SalesasINT);
            }
            if (SalesasINT >= 12){
                System.out.println("Invalid Month. Please Try Again.");
            }
        }

        return "";
    }

    /**
     * display the top sales person
     * @return
     */
    private String displayTopSalesPerson(){
        HashMap <String, Integer> SalesMap = new HashMap<String, Integer>();
        int ChipSales=0;
        int StellaSales = 0;
        int JamesSales = 0;
        int MadelineSales = 0;
        int MargaretSales = 0;
        String [] sellers = {"Chip", "Stella", "James", "Madeline","Margaret"};
        for (int i = 0; i < transactionList.size(); i++)
            for(int s=0; s < sellers.length; s++){
                if(transactionList.get(i).getSeller().equals("Chip")){
                    ChipSales++;
                }
                if (transactionList.get(i).getSeller().equals("Stella")){
                    StellaSales++;
                }
                if (transactionList.get(i).getSeller().equals("James")){
                    JamesSales++;
                }
                if (transactionList.get(i).getSeller().equals("Madeline")){
                    MadelineSales++;
                }
                if (transactionList.get(i).getSeller().equals("Margaret")){
                    MargaretSales++;
                }
            }

            ChipSales = ChipSales/5;
            StellaSales = StellaSales/5;
            JamesSales = JamesSales/5;
            MadelineSales = MadelineSales/5;
            MargaretSales = MargaretSales/5;

            //fills a map with the seller and their number of sales

            SalesMap.put(sellers[0], ChipSales);
            SalesMap.put(sellers[1], StellaSales);
            SalesMap.put(sellers[2], JamesSales);
            SalesMap.put(sellers[3], MadelineSales);
            SalesMap.put(sellers[4], MargaretSales);

            Set<String> keySet = SalesMap.keySet();
            int maxValue = 0;
            for (String key : keySet){
                int value = SalesMap.get(key);
                if (value >= maxValue){
                    maxValue = value;
                }
            }
            for (String key : keySet){
                int value = SalesMap.get(key);
                if(value == maxValue){
                    System.out.println("TOPSP: " +key+ " "+ value);
                }
            }
        return "";
    }

    /**
     * all the sales stats 
     * average sales, total sales, top month, number of sales in top month
     */
    private String displaySalesStats(){
        int [] monthlySales = new int [12];
        String [] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int numberofSales = 0;
        Double allCarPricesSum = 0.0;
        for (int i = 0; i < transactionList.size(); i++){
            allCarPricesSum = allCarPricesSum + transactionList.get(i).getCarPrice();
        }
        Double averageOfCarSales = allCarPricesSum/transactionList.size(); // format to 2 decimal points
        String formatAverageSales = String.format("%.2f", averageOfCarSales);
        int numberOfCarsSold = transactionList.size();

        for ( int i = 0; i < 12; i++ ){
            numberofSales = 0;
            for( int s = 0; s < transactionList.size(); s++){
                if (transactionList.get(s).getMonth() == i){
                    numberofSales++;
                }
                monthlySales[i] = numberofSales;
            }
        }

        int maxMonthValue = 0;
        int monthIndex = 0;
        for ( int i = 0; i < monthlySales.length; i++){
            if (monthlySales[i] > maxMonthValue){
                maxMonthValue = monthlySales[i];
                monthIndex = i;
            }
        }
        String bestMonth = month[monthIndex];
        System.out.println("Total Sales: " + allCarPricesSum + " Total Sold: " +numberOfCarsSold+ " Avg Sales: " + formatAverageSales + " Best Month: " +bestMonth + " Cars Sold - " +maxMonthValue);
        return "";
    }

    /**
     * displays month and the transactions from that month
     */
    private String displayMonthlySales(int month){
        for(int i = 0; i < transactionList.size(); i++){
            if(transactionList.get(i).getMonth() == month){
                System.out.print(transactionList.get(i).display());
            }
        }
        return "";
    }

    /**
     * displays all the sales
     */
    public void displaySales(){
        for( int i=0; i< transactionList.size(); i++){
            System.out.print(transactionList.get(i).display());
        }
    }

}