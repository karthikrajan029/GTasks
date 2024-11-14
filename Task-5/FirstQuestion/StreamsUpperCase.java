import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsUpperCase {
    public static void main(String[] args)
    {
       List<String> list= new ArrayList<>();
        Stream<String> stream=Stream.of("aBc","d","ef");
       list=stream.map(s->s.toUpperCase()).collect(Collectors.toList());
       System.out.println(list);
    }
}
