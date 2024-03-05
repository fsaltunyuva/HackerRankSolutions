import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        boolean emptyCase = false;

        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Student> pq = new PriorityQueue<>();

        int inputSize = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i<inputSize; i++){
            String tempLine = scanner.nextLine();

            if(tempLine.substring(0,5).equals("ENTER")) {
                String[] inputLine = tempLine.split(" ");

                Student student = new Student(Integer.parseInt(inputLine[3]), inputLine[1], Double.parseDouble(inputLine[2]));

                pq.add(student);
            }
            else if (tempLine.substring(0,6).equals("SERVED")) {
                pq.poll();
            }
        }

        if(pq.isEmpty())
            System.out.println("EMPTY");

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }


}

class Student implements Comparable<Student> {

    int id;
    String name;
    double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa  = cgpa;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student o) {

        if(this.cgpa>o.cgpa) {
            return -1;
        }
        else if(this.cgpa == o.cgpa) {
            if(this.name.compareTo(o.name) == 0) {
                return o.id-this.id;
            }
            else{
                return this.name.compareTo(o.name);
            }
        }
        else{
            return 1;
        }
    }
}
