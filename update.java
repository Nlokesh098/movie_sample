//import java.util.ArrayList;
import java.util.Scanner;
//import java.util.List;
//import java.util.*;

public class update {
    

    public static void update() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the movie name to update the details from the below movies:");
        System.out.println("Movies list available:"); 
        for(int i=0;i<movielist.mainlist.size(); i++) {
            System.out.println(movielist.mainlist.get(i));
        }
        String moviename = s.nextLine();
        for(int i =0;i<movielist.mainlist.size();i++){
                if(movielist.mainlist.get(i).get(0).equals(moviename)){
                    System.out.println("you are about to update the below movie details");
                    System.out.println(movielist.mainlist.get(i));
                    System.out.println("what do you want to update \n 1. moviename \n2. director \n 3. actor\n 4. summary");
                    String input = s.nextLine();
                    if(input.equals("moviename")){
                        System.out.println("enter the new moviename");
                        String newmoviename = s.nextLine();
                        movielist.mainlist.get(i).set(0, newmoviename);
                        System.out.println("successfully updated new movie name");
                    }
                    if(input.equals("director")){
                        System.out.println("enter the new director name");
                        String newdirector = s.nextLine();
                        movielist.mainlist.get(i).set(1, newdirector);
                        System.out.println("successfully updated new director name");
                    }
                    if(input.equals("actor")){
                        System.out.println("enter the new actor name");
                        String newactor = s.nextLine();
                        movielist.mainlist.get(i).set(2, newactor);
                        System.out.println("successfully updated new actor name");
                    }
                    if(input.equals("summary")){
                        System.out.println("enter the new summary for the movie");
                        String newsummary = s.nextLine();
                        movielist.mainlist.get(i).set(3, newsummary);
                        System.out.println("successfully updated new summary for the movie");
                    }
                    System.out.println("update movie details are: \n" + movielist.mainlist.get(i));
                    // for(int j = 0;j<mainlist.size();j++){
                    //     System.out.println(mainlist.get(j));
                    // }
                }
        }


    }

}
