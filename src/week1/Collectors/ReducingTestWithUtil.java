package week1.Collectors;

import java.util.*;
import java.util.stream.Collectors;

public class ReducingTestWithUtil {

    public static void main(String[] args) {

        List<PersonUtil> personUtilList = new ArrayList<PersonUtil>() {{
            add(new PersonUtil("Dipak","Male",25));
            add(new PersonUtil("Shweta","Female",25));
            add(new PersonUtil("Ankit","Male",32));
            add(new PersonUtil("Rajat","Male",28));
            add(new PersonUtil("Rahul","Male",24));
            add(new PersonUtil("Anshika","Female",22));
            add(new PersonUtil("Shubhashree","Female",25));
            add(new PersonUtil("Kuldeep","Male",26));
        }};

        // Groupby Gender
        Map<String, List<String>> GroupdByGender = personUtilList.stream().collect(Collectors.groupingBy(
                x -> x.gender,
                Collectors.mapping(
                        x -> x.name,
                        Collectors.toList()
                )
        ));

        // get list of Males above 27
        List<String> maleAbove27 = personUtilList.stream()
                .filter(x -> x.age >= 27 & x.gender.equals("Male"))
                .map(m -> m.name).collect(Collectors.toList());
        //System.out.println(maleAbove27);

        // get average age of all
        IntSummaryStatistics collect = personUtilList.stream().map(m -> m.age).collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(collect.toString());

        //get average age of females
        Double femaleAverage = personUtilList.stream().filter(x -> x.gender.equalsIgnoreCase("Female"))
                .collect(Collectors.averagingInt(x -> x.age));
        System.out.println(femaleAverage);

        //get average age of females
        Double maleAverage = personUtilList.stream().filter(x -> x.gender.equalsIgnoreCase("male"))
                .collect(Collectors.averagingInt(x -> x.age));
        System.out.println(maleAverage);


    }
}
