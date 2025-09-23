package unit3;

public class Sstudent implements Comparable<Sstudent> {
    int age;
    String name;
    int roll;
    public Sstudent (int age,String name,int roll ){
        this.age=age;
        this.name=name;
        this.roll=roll;
    }
    public int compareTo(Sstudent st){
        if(age==st.age){
            return 0;
        }
        else if(age>st.age){
            return 1;
        }else{
            return -1;

        }
    }

}
