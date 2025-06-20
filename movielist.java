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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    public static void add() {
        ArrayList<String> moviedetails = new ArrayList<>();
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
        System.out.println("overall movies list entered:");
        for(int i=0;i<mainlist.size(); i++) {
            System.out.println(mainlist.get(i));
        }
    }
}
