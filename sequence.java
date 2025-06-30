import java.util.*;


public class sequence{

    public static void main(String args[]){

        int[] arr = {3,1,4,5,6,7,90,100};
        int id = 0;
        
        HashMap<Integer, List<Integer>> hm = new HashMap<>();
        int n= arr.length;
        ArrayList<Integer> al = new ArrayList<>();
        int count =0;

        for(int i= 0 ;i<n-1;i++){
            if(al.isEmpty()){ 
                al.add(arr[i]);
            } else if(arr[i + 1] == arr[i] + 1){
                al.add(arr[i+1]);
            } else{
                if (!al.isEmpty()) {
                    hm.put(id++, new ArrayList<>(al)); 
                    al.clear();
                }
            }
            if (!al.isEmpty()) {
                hm.put(id, new ArrayList<>(al));
            }
        }
        int maxKey =0;
            int maxSize = 0;

            for (Integer key : hm.keySet()) {
                List<Integer> value = hm.get(key);
                if (value.size() > maxSize) {
                    maxSize = value.size();
                    maxKey = key;
                }
            }
            System.out.println("Longest list: " + hm.get(maxKey));
               
    
    }

}