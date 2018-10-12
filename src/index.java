
import java.util.*;
public class index {

        public static void main(String[] args)
        {
            Scanner reader = new Scanner(System.in);
            Scanner scanner = new Scanner(System.in);

//            int[] getallen = new int[5];
//
//            getallen[0] = 678976543;
//            getallen[1] = 456788765;
//            getallen[2] = 45678;
//            getallen[3] = 423354;
//            getallen[4] = 67543;
//
//            String[] lijstjegetallen = {"AAA", "BBB", "CCC", "DDD", "EEE"};
//            System.out.println(Arrays.toString(lijstjegetallen));
//
//
//            lijstjegetallen = Arrays.copyOf( lijstjegetallen, lijstjegetallen.length + 1 );
//
//            Scanner input = new Scanner(System.in);
//
//
//            System.out.println(Arrays.toString(lijstjegetallen));
            String[] personages = new String[8];

            personages[0] = "Batman";
            personages[1] = "Spiderman";
            personages[2] = "Sonic";
            personages[3] = "Metroman";
            personages[4] = "Joker";
            personages[5] = "Stalin";
            personages[6] = "Mark";
            personages[7] = "Elon Musk";



                System.out.println(Arrays.toString(personages));
                System.out.println("enter the index number of the array you want to change!");
                String Answer = scanner.nextLine();

                if (Answer.equals("0")) {
                    System.out.println("You have chosen " + personages[0]);
                    System.out.println("What do you want to change ?");
                    String chAnge = scanner.nextLine();
                    personages[0] = chAnge;
                    System.out.println("now it is");
                    System.out.println(Arrays.toString(personages));
                }
                if (Answer.equals("1")) {
                    System.out.println("You have chosen " + personages[1]);
                    System.out.println("What do you want to change ?");
                    String chAnge = scanner.nextLine();
                    personages[1] = chAnge;
                    System.out.println("now it is");
                    System.out.println(Arrays.toString(personages));
                }
                if (Answer.equals("2")) {
                    System.out.println("You have chosen " + personages[2]);
                    System.out.println("What do you want to change ?");
                    String chAnge = scanner.nextLine();
                    personages[2] = chAnge;
                    System.out.println("now it is");
                    System.out.println(Arrays.toString(personages));
                }
                if (Answer.equals("3")) {
                    System.out.println("You have chosen " + personages[3]);
                    System.out.println("What do you want to change ?");
                    String chAnge = scanner.nextLine();
                    personages[3] = chAnge;
                    System.out.println("now it is");
                    System.out.println(Arrays.toString(personages));
                }
                if (Answer.equals("4")) {
                    System.out.println("You have chosen " + personages[4]);
                    System.out.println("What do you want to change ?");
                    String chAnge = scanner.nextLine();
                    personages[4] = chAnge;
                    System.out.println("now it is");
                    System.out.println(Arrays.toString(personages));
                }
                if (Answer.equals("5")) {
                    System.out.println("You have chosen " + personages[5]);
                    System.out.println("What do you want to change ?");
                    String chAnge = scanner.nextLine();
                    personages[5] = chAnge;
                    System.out.println("now it is");
                    System.out.println(Arrays.toString(personages));
                }
                if (Answer.equals("6")) {
                    System.out.println("You have chosen " + personages[6]);
                    System.out.println("What do you want to change ?");
                    String chAnge = scanner.nextLine();
                    personages[6] = chAnge;
                    System.out.println("now it is");
                    System.out.println(Arrays.toString(personages));
                }
                if (Answer.equals("7")) {
                    System.out.println("You have chosen " + personages[7]);
                    System.out.println("What do you want to change ?");
                    String chAnge = scanner.nextLine();
                    personages[7] = chAnge;
                    System.out.println("now it is");
                    System.out.println(Arrays.toString(personages));
                } else {
                    System.out.println("You should listen more");
                }


                                }

                            }