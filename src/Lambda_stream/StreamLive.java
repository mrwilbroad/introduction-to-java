package Lambda_stream;

import Lambda_stream.model.Gender;
import Lambda_stream.model.User;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Streams move elements through a sequence of processing steps—known as a stream pipeline—that
 * begins with a data source (such as an array or collection), performs various
 * intermediate operations on the data source’s elements and ends with a terminal operation.
 * A stream pipeline is formed by chaining method calls
 */
public class StreamLive {


    public List<User> getUser(){
        return List.of(
                  new User("Wilbroad Mark","mrwilbroadmark@gmail.com", Gender.MALE,23),
                new User("baraka isack","baraka@gmail.com", Gender.MALE,18),
                new User("Anastazia Omary","Anastazia@gmail.com", Gender.FEMALE,26),
                new User("Ubuyu Omary","ubuyu@gmail.com", Gender.FEMALE,45),
                new User("Mwajuma Omary","mwajuma@gmail.com", Gender.FEMALE,26),
                new User("Glory Omary","glory@gmail.com", Gender.FEMALE,29),
                new User("Aisha Omary","Aisha@gmail.com", Gender.FEMALE,30)
        );
    }


      public  void Stream(){
          int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
          IntStream.of(values)
                  .forEach(value -> System.out.printf("%d\t", value));
          System.out.printf("%n");

          //Filter
          List<User> userFemale =  this.getUser().stream()
                  .filter( user -> user.getGender().equals(Gender.FEMALE))
                  .toList();
          userFemale
                  .forEach(user -> {
                         System.out.printf("Fullname :%s%nEmail :%s%nGender :%s%nAge : %s%n%n", user.getFullname(), user.getEmail(), user.getGender(), user.getAge());
                  });

          //Sort
          List<User> sortedFemale = userFemale.stream()
                  .sorted(
                          Comparator.comparing(User::getFullname)
                                  .thenComparing(User::getAge)
                                  .thenComparing(User::getEmail)
                  )
                  .toList();

          sortedFemale
                  .forEach(user -> {
                      System.out.printf("Fullname :%s%nEmail :%s%nGender :%s%nAge : %s%n%n", user.getFullname(), user.getEmail(), user.getGender(), user.getAge());
                  });


          Map<Gender, List<User>> userGroupByGender=
                  this.getUser()
                  .stream()

                  .collect(Collectors.groupingBy(User::getGender));

          System.out.printf("%nUser with max Age %n");
    this.getUser()
                  .stream()
                  .max(Comparator.comparing(User::getAge))
                  .ifPresent(user -> {
                      System.out.println(user.getFullname());
                  });





//          allMatch but it return boolean showing all user have age above 40
//          .allMatch(user -> user.getAge() > 40)


          System.out.printf("%n%nPRINT BY GENDER%n");
          userGroupByGender.forEach((gender, users) -> {
              String genderBy = gender.equals(Gender.MALE)? "Male" : "Female";
              System.out.printf("%s :%n",genderBy);
              for(User user : users){
                  System.out.printf("%s -Email: %s%n",user.getFullname(),user.getEmail());
              }
              System.out.printf("%n%n");
          });
          System.out.println(userGroupByGender);


      }
}
