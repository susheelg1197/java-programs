package first_tutorial;
import java.util.*;
public class SuggestionsSearch {
    public static void main(String[] args) {

    }

//    static List<List<String>> searchSuggestions(List<String> repository, String customerQuery) {
//        // Write your code here
//        List<List<String>> finalResult=new ArrayList<>();
//        Collections.sort(repository, (t1,t2)->{
//            return t1.toLowerCase().compareTo(t2.toLowerCase());
//        });
//        System.out.println(repository+" and "+customerQuery);
//        for(int i=1;i<customerQuery.length();i++){
//            List<String> suggestions =new ArrayList<>();
//            int count=0;
//            for(int j=0;count<3 && j<repository.size();j++){
//                if(i+1<=repository.get(j).length() && customerQuery.substring(0, i+1).toLowerCase().equals(repository.get(j).substring(0, i+1).toLowerCase())){
//                    suggestions.add(repository.get(j).toLowerCase());
//                    count++;
//                }
//            }
//            finalResult.add(suggestions);
//        }
//
//        return finalResult;
//    }

//}
}