package org.aakash.collections.List;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Employee{
    String name;
    String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}

public class Listnew {
    public static void main(String[] args) {


        List<Employee> list= new ArrayList<Employee>();
        list.add(new Employee("aakash","IT"));
        list.add(new Employee("swaraj","HR"));

        list.add(new Employee("veera","IT"));

        list.add(new Employee("amruta","HR"));

        List<Employee> collect = list.stream().filter(n -> n.department.equals("IT")).map(n -> {
            n.name = n.name.toUpperCase();
            return n;
        }).collect(Collectors.toList());
        System.out.println(collect);

//        ArrayList<String> list= new ArrayList<String>();
//        list.add("Aakash");
//        list.add("swaraj");
//        list.add("test");

//        list.stream().filter(c->!c.startsWith("A")).collect(Collectors.toList()).forEach(n-> System.out.println(n));

//        List<Integer> ll= Arrays.asList(1,2,3,4,7);
//        ArrayList<Integer> l= new  ArrayList<>(Arrays.asList(1,88,2,2,8,2,3,4,22));
//        l.stream().distinct().sorted(Comparator.reverseOrder()).toList().forEach(System.out::println);
//        HashSet<Integer> hs= new HashSet<>();
//        for(Integer i:l){
//            hs.add(i);
//        }

//        System.out.println(hs);




//        Map<Integer, Long> collect = ll.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
//        System.out.println(collect);
//
        List<String> sl= Arrays.asList("aakash","solanke","solanke","swaraj");
         sl.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting())).entrySet().stream().filter(n->n.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
//        System.out.println(collect1);
//        Set<String > newSet= new HashSet<>();
//        Set<String> collect2 = sl.stream().filter(n -> !newSet.add(n)).collect(Collectors.toSet());
//        System.out.println(collect2);
//        sl.stream().distinct().forEach(s-> System.out.println(s));

//        Map<Integer, Long> collect = l.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
//        System.out.println(collect);

//        int[] arr = {1,0,3,0,2,0};
//        IntStream.stream(arr).collect(Collectors.toList());


    }
}
