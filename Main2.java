// the Collective framework is definrd in the java.until package
import java.until.ArrayList;

class Main2 {
    public static void main(String[] args) {
    //creating an object of arrylist
    ArrayList<String> animals = new ArrayList<>();
    // Add elements
    animals.add("Lion");
    animals.add("Tiger");
    animals.add("Cheetah");
    System.out.println("============Printing Current Array==========");
    System.out.println(animals);
    animals.clear();
    System.out.println("============Printing Current Array==========");
    System.out.println("Empty Array : " +animals);
    if(animals.isEmpty()){
        System.out.pintln("Array is empty");
    }
    else{
        System.out.println("Array is not empty");
    }
    }
}