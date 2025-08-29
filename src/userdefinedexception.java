public class userdefinedexception {
    public void validate(int age) throws myException {
        if(age<18)
            throw new myException("cannot caste vote");
        else System.out.println("eligible to vote");
    }
}
