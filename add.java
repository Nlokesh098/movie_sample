//import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
//import java.util.List;
//import java.util.Scanner;

public class add {
    public static void add() {
        ArrayList<String> moviedetails = new ArrayList<>();

        // ArrayList<String> moviedetails = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Here You will enter the movie details:");
        System.out.println("Enter the movie name:");
        String name = s.nextLine();
        System.out.println("enter movie director:");
        String director = s.nextLine();
        System.out.println("Enter Actor in the movie");
        String actor =  s.nextLine();
        System.out.println("enter some summary about the movie");
        String summary = s.nextLine();
        System.out.println("Movie added succesfully");
        moviedetails.add(name);
        moviedetails.add(director);
        moviedetails.add(actor);
        moviedetails.add(summary);

        movielist.mainlist.add(moviedetails);
        //mainlist.add(moviedetails); 
        System.out.println("current entered details:"); 
        for(int i=0;i<moviedetails.size(); i++) {
            System.out.println(moviedetails.get(i));
        }
        System.out.println("do you want add another movie details? (y/n)");
        String input = s.nextLine();
        if(input.equals("y")){
            add();
        }
        else if(input.equals("n")){
            System.out.println("thank you!!");
        }else{
            System.out.println("please enter either y or n");
        }
        System.out.println("All entered details:");
        for (int i = 0; i < movielist.mainlist.size(); i++) {
            System.out.println(movielist.mainlist.get(i));
        }
        System.out.println("do want to perform any other operation?? like update or delete \n click 1 to add again \n click 2 to update \n click 3 to delete \n 0 to Exit");
        //Scanner s = new Scanner(System.in);
        int number =  s.nextInt();
        if(number == 2){
            update.update();
        }else if(number == 3){
            movielist.delete();
        }else if(number == 1){
            add();}
        else if(number == 0){
            System.out.println("thank you!!");
        }
    }
}
