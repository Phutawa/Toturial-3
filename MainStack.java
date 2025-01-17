package Test;
public class MainStack {
    public static void main(String[] args) {
        Stack StudentIDArray = new Stack(7);

        StudentIDArray.push(new StudentClass("672115037", "Phutawan", "3.53"));
        StudentIDArray.push(new StudentClass("672115042", "Fahsai", "3.89"));
        StudentIDArray.push(new StudentClass("672115016", "kao-Oat", "3.63"));
        StudentIDArray.push(new StudentClass("672115039", "May", "3.83"));
        StudentIDArray.push(new StudentClass("672115019", "Namo", "3.50"));
        StudentIDArray.push(new StudentClass("672115050", "Guy", "3.96"));
        StudentIDArray.push(new StudentClass("672115007", "Yanin", "3.83"));

        System.out.println("Element at top is : " + StudentIDArray.peek());

        for (int i = 0; i < 3; i++) {
            System.out.println("Popped : " + StudentIDArray.pop());
        }

        System.out.println("Stack size is : " + StudentIDArray.max());
    }
}