package Collections;

import java.util.*;

enum RoleApk {
    ADMIN("Admin"),
    STUDENT("student");
   public final String role;

    RoleApk(String role){
        this.role = role;
    }

    public String getName(){
        return this.role;
    }
}
public class People {


    public static enum Role {
    STUDENT , TEACHER , NORMAL_USER



}

    public Role role;
    public RoleApk roleApk;

    public  void setRole(Role role){
        this.role = role;
    }

    public  Role getRole(){
        RoleApk  roleApk = RoleApk.ADMIN;
        System.out.println("Role apk :"+ roleApk.getName());
        return this.role;
    }


    /**
     * A List (sometimes called a sequence) is an ordered Collection that can contain duplicate
     * elements
     */
    public void getPeople(){


        String[] names = { "amina" , "Bakary"};
//        arraylist and iterator
        List<String> list1 = new ArrayList<String>();
        for(String name : names)
               list1.add(name);

        for(String  name : list1)
            System.out.printf("Name :%s%n" , name);

//        alternative
        List<String> list2 = new ArrayList<String>();
        Collections.addAll(list2,names);
        System.out.println("List 2 with Collections.addAll but Amina removed");
        list2.remove("amina");
        for(String name : list2)
            System.out.printf("Name :%s%n" , name);

        this.Operations();

    }

    public void Operations(){

        String[] colors ={"black", "yellow", "green", "blue", "violet", "silver","Long Color"};
        List<String> listA = new LinkedList<String>();
        Collections.addAll(listA,colors);
        String minString = Collections.min(listA);
        System.out.printf("%nMinimum String from the List is :%s%n", minString);
        Collections.shuffle(listA);
        for(String color : listA)
            System.out.printf("color :%s%n" , color);

        this.StackOperations();


    }

    public  void StackOperations(){
        Stack<Number> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4.6);
        for(Number num : stack)
            System.out.printf("Number :%s%n" , num);

        System.out.println("Stack :"+stack);

        this.PeopleFromQueue();

    }

    public void PeopleFromQueue(){
        PriorityQueue<Integer> rates = new PriorityQueue<>();
        rates.offer(10);rates.offer(207);rates.offer(20);
        rates.offer(50);rates.offer(310);rates.offer(150);rates.offer(30);rates.offer(40);rates.offer(40);

//        Remove duplicates from rates
        Set<Integer> setRates = new HashSet<>(rates);
        System.out.print("Unique Rates after Set :"+ setRates);


        System.out.println("Pulling rates from queue :"+rates);
        while(!rates.isEmpty())
        {
            System.out.printf("%d : Poll :%d%n",rates.peek(),rates.poll());
        }
        System.out.println("After polling "+ rates);


        Set<String> gender = new HashSet<>();
        gender.add("M");
//        gender.add("M");
        gender.add("F");
        //it will pick only F and M
        System.out.println("Gender :"+gender);

        String[] regions = {"Arusha" , "Dar" , "Mbeya"};
        List<String> listtest = Arrays.asList(regions);
        System.out.println("Array :"+ regions);
        System.out.println("List :"+ listtest);

        this.KeyValuePair();
    }

    public  void KeyValuePair(){
        Map<String, String> user = new HashMap<>();
        user.put("name" , "Amina");
        user.put("age" , "20");
        Set<String> keys = user.keySet();
        System.out.println("Keys :"+keys);
        System.out.println("is 20 value  present ? " +user.containsValue("20"));
        System.out.println("User from Map-Key-value pair  :"+user);
    }



}
