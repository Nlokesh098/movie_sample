import java.util.*;


public class movielist {

    //Scanner s = new Scanner(System.in);

    static ArrayList<List<String>> mainlist = new ArrayList<>();
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("What do you like to do here: \n Click 1 to add a movie \n click 2 to update a movie details \n click 3 to remove a movie");
        int input = s.nextInt();

        switch(input){
            case 1: add();
            break;
            case 2: update();
            break;
            case 3: delete();
            break;
            default: 
            System.out.println("enter a valid input");
        }
    }

    public static void delete() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    public static void update() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the movie name to update the details from the below movies:");
        System.out.println("Movies list available:"); 
        for(int i=0;i<mainlist.size(); i++) {
            System.out.println(mainlist.get(i));
        }
        String moviename = s.nextLine();
        for(int i =0;i<mainlist.size();i++){
                if(mainlist.get(i).get(0).equals(moviename)){
                    System.out.println("you are about to update the below movie details");
                    System.out.println(mainlist.get(i));
                    System.out.println("what do you want to update \n 1. moviename \n2. director \n 3. actor\n 4. summary");
                    String input = s.nextLine();
                    if(input.equals("moviename")){
                        System.out.println("enter the new moviename");
                        String newmoviename = s.nextLine();
                        mainlist.get(i).set(0, newmoviename);
                        System.out.println("successfully updated new movie name");
                    }
                    if(input.equals("director")){
                        System.out.println("enter the new director name");
                        String newdirector = s.nextLine();
                        mainlist.get(i).set(1, newdirector);
                        System.out.println("successfully updated new director name");
                    }
                    if(input.equals("actor")){
                        System.out.println("enter the new actor name");
                        String newactor = s.nextLine();
                        mainlist.get(i).set(2, newactor);
                        System.out.println("successfully updated new actor name");
                    }
                    if(input.equals("summary")){
                        System.out.println("enter the new summary for the movie");
                        String newsummary = s.nextLine();
                        mainlist.get(i).set(3, newsummary);
                        System.out.println("successfully updated new summary for the movie");
                    }
                    System.out.println("update movie details are: \n" + mainlist.get(i));
                    // for(int j = 0;j<mainlist.size();j++){
                    //     System.out.println(mainlist.get(j));
                    // }
                }
        }


    }

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
        mainlist.add(moviedetails); 
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
        for(int i=0;i<mainlist.size(); i++) {
            System.out.println(mainlist.get(i));
        }
        System.out.println("do want to perform any other operation?? like update or delete \n click 2 to update \n click 3 to delete \n 0 to Exit");
        //Scanner s = new Scanner(System.in);
        int number =  s.nextInt();
        if(number == 2){
            update();
        }else if(number == 3){
            delete();
        }else if(number == 0){
            System.out.println("thank you!!");
        }
    }
}
