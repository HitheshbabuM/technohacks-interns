import java.util.ArrayList;
import java.util.Scanner;
public class Todolist {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> Todolist=new ArrayList<>();
        while(true){
            System.out.println("HI USER TO DO LIST OF TODAY:");
            System.out.println("Enter your choice:");
            System.out.println("A.Add the items");
            System.out.println("R.Remove the items");
            System.out.println("V.View the items");
            System.out.println("X.Exit the program");
            String choice=sc.nextLine().toUpperCase();
            switch(choice){
                case "A":
                System.out.println("ENTER THE ITEM TO ADD:");
                String newitem=sc.nextLine();
                Todolist.add(newitem);
                break;
                case "R":
                System.out.println("ENTER THE ITEM TO REMOVE:");
                String removeitem=sc.nextLine();
                if(Todolist.remove(removeitem)){
                    System.out.println("ITEM IS REMOVED");
                }else{
                    System.out.println("ITEM NOT FOUND");
                }
                break;
                case "V":
                if(Todolist.isEmpty()){
                    System.out.println("The list is empty");
                }else{
                    for(int i=0;i<Todolist.size();i++){
                        System.out.println("The Items are:"+(i+1)+Todolist.get(i));
                    }
                }
                break;
                case "X":
                System.out.println("Exiting the program");
                break;
                default:
                System.out.println("The Option you choose is Invalid..Try again..");

            }
        }

    
    
    
    }
    
}
