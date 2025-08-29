public class myNewException {
    public static void main(String[] args) {
        userdefinedexception udf=new userdefinedexception();
        try {
            udf.validate(10);
        }
        catch(myException myEx) {
            System.out.println(myEx.getMessage());
        }
        }
    }

