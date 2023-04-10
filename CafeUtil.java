public class CafeUtil{
    public int getStreakGoal(){
        int sum = 0;
        for(int i=1;i<11;i++){
            sum += i;
            return sum;
        }
    }
    public double getOrderTotal(double[] prices){
        double total = 0;
        for(int i=0;i<prices.length;i++){
            total += prices[i];
        }
        return total;
    }
    public void displayMenu(ArrayList<String> menuItems){
        for(int i=0;i<menuItems.size();i++){
        System.out.println( String(i) +""+ menuItems.get(i));
        }
    }
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name");
        String userName = System.console().readLine();
        System.out.println("Hello"+userName)
        System.out.println("There are "+ String(customers.size()) +"people in front of you")
        customers.add(userName)
        for(int i=0;i<customers.size();i++){
            System.out.println(String(i) +" "+ customers.get(i));
        }
    }
}