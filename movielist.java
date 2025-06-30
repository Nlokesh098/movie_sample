import java.util.*;


public class movielist {

    //Scanner s = new Scanner(System.in);

    public static ArrayList<List<String>> mainlist = new ArrayList<>();
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("git");

        System.out.println("What do you like to do here: \n Click 1 to add a movie \n click 2 to update a movie details \n click 3 to remove a movie");
        int input = s.nextInt();

        switch(input){
            case 1: add.add();
            break;
            case 2: update.update();
            break;
            case 3: delete();
            break;
            default: 
            System.out.println("enter a valid input");
        }
    }

    public static void delete() {
        Scanner s = new Scanner(System.in);
        int test =0;
        System.out.println("enter the movie name to delete:");
        String input = s.nextLine();
        for(int i=0;i<mainlist.size(); i++){
            if(mainlist.get(i).get(0).equals(input)){
                mainlist.remove(i);
                System.out.println("movie deleted successfully");
                test =1;
            }
            //System.out.println("all movie details:" + mainlist.get(i));
        }
        //System.out.println("movie deleted successfully");
        System.out.println("all movie details:");
        for(int i=0;i<mainlist.size(); i++){
            // System.out.println("all movie details:");
            System.out.println(mainlist.get(i));
        }
        if(test == 0){
            System.out.println("enter correct movie name");
        }
    }


    
}
