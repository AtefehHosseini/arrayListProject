import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        ArrayList<Integer> listName= new ArrayList<>();

        //add element in the list => [10,20,30]
        listName.add(10);
        listName.add(20);
        listName.add(30);

        System.out.println(listName);

        //remove element from the list => [20,30]
        listName.remove(1);

        System.out.println(listName);

        //find index of an element => 2
        System.out.println(listName.indexOf(30));

        //investigate is the element in the list? => True/Fale
        System.out.println(listName.contains(40));

        //find the size of the list => 2
        System.out.println(listName.size());

        //change the array to a normal list => [Ljava.lang.Object;@726f3b58
        System.out.println(listName.toArray());
        
    }
}
