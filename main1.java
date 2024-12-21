import java.util.Scanner;
public class main1{
    public class main{
        public static Candidate getCandidateDetails() throws
    InvalidInternException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the candidate details");

        System.out.println("Name");
        String name = scanner.next();
        System.out.println("Gender");
        String gender = scanner.next();
        System.out.println("Enter percentage in 10th");
        int percentage = scanner.nextInt();

        if (percentage < 50){
            throw new InvalidInternException("Registration Failed. Percentage cannot be less then 50%");
        } else {
            Candidate candidate = new candidate();
            candidate.setname(name);
            candidate.setGender(gender);
            candidate.setPercentage(percentage);

            return candidate;
        }
    }
    public static void main(String[] args){
        System.out.println("Welcome to InterHiring Tool");

        try {
            Candidate candidate = getCandidateDetails();
            System.out.println("Registration Succesful");
        } catch (InvalidInternException e) {
            System.out.println(e.getMessage());

        }
    }
}
public class Candidate {
    private String name;
    private String gender;
    private int percentage;
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getPercentage(){
        return percentage;
    }

    public void setPercentage(int percentage){
        this.percentage = percentage;
    }
}
}