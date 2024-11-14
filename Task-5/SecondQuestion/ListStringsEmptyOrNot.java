import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListStringsEmptyOrNot {
    public static void main(String[] args)
    {
        long count=0;
        List<String> slist= Arrays.asList("abc","","bc","efg","abcd","","jkl"); //list having non-empty strings
        count=slist.stream().filter(s-> s.isEmpty()).count();
        if(count==0)
        {
            System.out.println(slist);
        }
        List<String> slist1= Arrays.asList("xy","zz","fg","cd","lkj"); //list having no empty strings
        count=slist1.stream().filter(s-> s.isEmpty()).count();
        if(count==0)
        {
            System.out.println(slist1);
        }

    }
}
