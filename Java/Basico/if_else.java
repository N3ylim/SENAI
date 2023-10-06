package Java;

public class if_else {
    public static void main(String[] args) {
        int grade = 85;

        if (grade >= 90) {
            System.out.println("Excelente!");

        } else if (grade >= 80) {
            System.out.println("Muito Bom");

        } else if (grade >= 70) {
            System.out.println("Bom");

        } else if (grade >= 60) {
            System.out.println("Satisfatório");

        } else {
            System.out.println("Precisa de melhorar");
        
        }
    }
}
