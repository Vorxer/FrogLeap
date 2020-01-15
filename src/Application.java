import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter command \n 1 = get time \n 2 = get distance");
        int option = input.nextInt();


        Frog frog = new Frog();
        if(option == 1){
            System.out.println("Enter the distance");
            int distance = input.nextInt();
            while(frog.getDistance() < distance){
                frog.jump();
            }

            System.out.println("The frog takes " + frog.getTime() + " seconds to jump " + distance + " meters");
        }

        if(option == 2){
            System.out.println("Enter the time");
            int time = input.nextInt();
            if (time == 0){
                frog.jump();
            }
            while(time > frog.getTime()){
                frog.jump();
            }

            System.out.println("The frog can jump " + frog.getDistance() + " meters in " + frog.getTime() + " seconds");
        }
    }
}
