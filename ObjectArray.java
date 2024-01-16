class Student{
    int Roll_No;
    String name ;
    int marks;

}

public class ObjectArray {
    public static void main(String [] a){

 Student obj1 = new Student();
 obj1.name= "pankaj";
 obj1.Roll_No=20200361;
 obj1.marks=98;

Student obj2 = new Student();
 obj2.name= "Rahul";
 obj2.Roll_No=20200362;
 obj2.marks=68;
 
Student obj3 = new Student();
 obj3.name= "anshul";
 obj3.Roll_No=20200363;
 obj3.marks=78;
 
Student Students[] = new Student[3];
Students[0]=obj1;
Students[1]=obj2;
Students[2]=obj3;

for(int i=0;i<Students.length;i++){

    System.out.println(Students[i].name +" : "+ Students[i].Roll_No+" : "+Students[i].marks );
}


    }


}
