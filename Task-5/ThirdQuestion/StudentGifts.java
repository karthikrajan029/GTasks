import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StudentGifts {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        List<String> studentList=new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            studentList.add(sc.next());
        }
        //Using Functional Interface
        /*Consumer<List<String>> filter=new Consumer<List<String>>() {
            @Override
            public void accept(List<String> s) {
                System.out.println(s.stream().filter(x->x.startsWith("A")).collect(Collectors.toList()));
            }
        };*/
        //Using Lambda Expression
        Consumer<List<String>> filter=(s)->System.out.println(s.stream().filter(x->x.startsWith("A")).collect(Collectors.toList()));
        filter.accept(studentList);
    }
}
