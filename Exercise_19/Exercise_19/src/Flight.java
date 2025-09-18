import java.util.Scanner;

public class Flight
{
    public static void main(String[] args)
    {
        //Maximum 10 seats
        boolean[] seats = new boolean[9];
        for (int i = 0; i < seats.length; i++)
        {
            seats[i] = false;
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("         Welcome to the Haseeb AirLine   ");

        System.out.print("Enter the number of seats you want to book : ");
        int seat = sc.nextInt();

        for (int i = 0; i < seat; i++)
        {
            System.out.println("Which class seat you want ");
            System.out.println("Press 1 for bussiness class and 2 for economy class ");
            int choice1 = sc.nextInt();

            if (choice1 == (1))
            {
                for (i = 0; i < (seats.length/2); i++)
                {
                    if (seats[i] == false)
                    {
                        seats[i] = true;
                    } else {
                        System.out.println("Bussiness class seats are booked ");
                        System.out.println("If you want to take economy class press Y and y");
                        System.out.println("If don't want then press 'N' or 'n'");

                        String choice2 = sc.nextLine();

                        if (choice2 == "Y" || choice2 == "y")
                        {
                            for (i = (seats.length / 2); i < seats.length; i++)
                            {
                                if(seats[i] == false)
                                {
                                    seats[i] = true;
                                }
                                else
                                {
                                    System.out.println("Thnaks for arrival...Next Flight in 3 hours");
                                }
                            }
                        }
                        else
                        {
                            System.out.println("Thnaks for arrival...Next Flight in 3 hours");
                            break;
                        }
                    }

//For choice 2 of economy class flight

                    if (choice1 == 2)
                    {
                        for (i = (seats.length / 2); i < seats.length; i++)
                        {
                            if (seats[i] == false)
                            {
                                seats[i] = true;
                            }
                            else
                            {
                                System.out.println("Economy class seats are booked ");
                                System.out.println("If you want to take bussiness class ticket... press 'Y' and 'y'");
                                System.out.println("If don't want then press 'N' or 'n'");

                                String choice3 = sc.nextLine();

                                if (choice3 == "Y" || choice3 == "y")
                                {
                                    for (i = 0; i < (seats.length / 2); i++)
                                    {
                                        if(seats[i] == false)
                                        {
                                            seats[i] = true;
                                        }
                                        else
                                        {
                                            System.out.println("Seats are booked ...Next Flight in 3 hours");
                                            break;
                                        }

                                    }
                                }
                                else
                                {
                                    System.out.println("Thnaks for arrival...Next Flight in 3 hours");
                                    break;
                                }
                            }

                        }
                    }
                }
            }

        }
    }
}
