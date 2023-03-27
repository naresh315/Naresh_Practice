package com.programs;
import java.util.*;


class Student  {
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
	 
	public int compareTo(Student that) {
		int i = Double.compare(this.cgpa, that.cgpa);
		if (i != 0)
			return i;
		i = this.fname.compareTo(that.fname);
		if (i != 0)
			return i;
		return Integer.compare(this.id, that.id);

	}
	  
   /* @Override
    public int compareTo(Student that) {
        if (this.cgpa != that.cgpa) {
            return Double.compare(that.cgpa, this.cgpa); // sort by CGPA in decreasing order
        } else if (!this.fname.equals(that.fname)) {
            return this.fname.compareTo(that.fname); // sort by first name in alphabetical order
        } else {
            return Integer.compare(this.id, that.id); // sort by ID in increasing order
        }
    }*/
}

//Complete the code
public class AccountComparatorDemo
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
  //studentList.stream().sorted(Collections.reverseOrder()).map(key->key.getFname()).forEach(System.out::println);
		Comparator<Student> groupByComparator = Comparator.comparing(Student::getCgpa)
                .thenComparing(Student::getFname)
                .thenComparing(Student::getId);
		  Collections.sort(studentList,groupByComparator);

		  Collections.sort(studentList,groupByComparator.reversed());

  studentList.stream().map(key->key.getFname()).forEach(System.out::println);

  
	}
}
