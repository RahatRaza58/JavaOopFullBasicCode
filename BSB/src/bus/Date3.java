package bus;
import java.util.Scanner;
public class Date3{
    String destination;
    int seat;
    int taka;

    int seat1 = 0;
    int seat2 = 0;
    int seat3 = 0;
    int seat4 = 0;
    int seat5 = 0;
    int seat6 = 0;

    private int seat_temp;

    public Date3(String date, int seat1, int seat2, int seat3, int seat4, int seat5, int seat6){
        System.out.println("\n**********Where You want to go:***********");
        System.out.println("Bus available on "+date+ " are:");
        System.out.println("1. Sylhet to Dhaka      --- "+(30 - seat1)+" ---- 500 ");
        System.out.println("2. Dhaka to Sylhet      --- "+(30 - seat2)+" ---- 500 ");
        System.out.println("3. Sylhet to Chittagong --- "+(30 - seat3)+" ---- 500 ");
        System.out.println("4. Chittagong to Sylhet --- "+(30 - seat4)+" ---- 500 ");
        System.out.println("5. Dhaka to Chittagong  --- "+(30 - seat5)+" ---- 500 ");
        System.out.println("6. Chittagong to Dhaka  --- "+(30 - seat6)+" ---- 500 ");
        System.out.println("******************************************");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 6 : ") ; int choice = sc.nextInt();
        System.out.print("Tickets : ");
        seat_temp = sc.nextInt();

        Scanner input = new Scanner(System.in);
        if(seat_temp > 0){
            switch (choice) {
                case 1:
                    if( (30 - seat1) >= seat_temp ){

                        this.destination = "Sy->Dh";
                        this.seat = seat_temp;
                        this.taka = this.seat * 500 ;
                        this.seat1 = seat_temp;

//                        Payment pay = new Payment(this.destination, this.seat, this.taka);
//
//                        this.seat1 = seat_temp;
                        // Asked user to confirm ticket and go to the payment option
                        System.out.println("Are you Confirm ticket (Y/N): ");
                        String ch = input.nextLine();

                        if(ch.equals("Y")){
                            Payment pay = new Payment(this.destination, this.seat, this.taka);
                        }
                        else{
                            return;
                        }
                    }
                    else{
                        System.out.println("we not have enough seat");
                    }
                    break;

                case 2:
                    if( (30 - seat2) >= seat_temp ){

                        this.destination = "Dh->Sy";
                        this.seat = seat_temp;
                        this.taka = this.seat * 500 ;
                        this.seat2 = seat_temp;

//                        Payment pay = new Payment(this.destination, this.seat, this.taka);
//
//                        this.seat2 = seat_temp;
                        // Asked user to confirm ticket and go to the payment option
                        System.out.println("Are you Confirm ticket (Y/N): ");
                        String ch = input.nextLine();

                        if(ch.equals("Y")){
                            Payment pay = new Payment(this.destination, this.seat, this.taka);
                        }
                        else{
                            return;
                        }
                    }
                    else{
                        System.out.println("we not have enough seat");
                    }
                    break;
                case 3:
                    if( (30 - seat3) >= seat_temp ){

                        this.destination = "Sy->Ch";
                        this.seat = seat_temp;
                        this.taka = this.seat * 500 ;
                        this.seat3 = seat_temp;

//                        Payment pay = new Payment(this.destination, this.seat, this.taka);
//
//                        this.seat3 = seat_temp;
                        // Asked user to confirm ticket and go to the payment option
                        System.out.println("Are you Confirm ticket (Y/N): ");
                        String ch = input.nextLine();

                        if(ch.equals("Y")){
                            Payment pay = new Payment(this.destination, this.seat, this.taka);
                        }
                        else{
                            return;
                        }
                    }
                    else{
                        System.out.println("we not have enough seat");
                    }
                    break;
                case 4:
                    if( (30 - seat4) >= seat_temp ){

                        this.destination = "Ch->Sy";
                        this.seat = seat_temp;
                        this.taka = this.seat * 500 ;
                        this.seat4 = seat_temp;

//                        Payment pay = new Payment(this.destination, this.seat, this.taka);
//
//                        this.seat4 = seat_temp;
                        // Asked user to confirm ticket and go to the payment option
                        System.out.println("Are you Confirm ticket (Y/N): ");
                        String ch = input.nextLine();

                        if(ch.equals("Y")){
                            Payment pay = new Payment(this.destination, this.seat, this.taka);
                        }
                        else{
                            return;
                        }
                    }
                    else{
                        System.out.println("we not have enough seat");
                    }
                    break;
                case 5:
                    if( (30 - seat5) >= seat_temp ){

                        this.destination = "Dh->Ch";
                        this.seat = seat_temp;
                        this.taka = this.seat * 500 ;
                        this.seat5 = seat_temp;

//                        Payment pay = new Payment(this.destination, this.seat, this.taka);
//
//                        this.seat5 = seat_temp;
                        // Asked user to confirm ticket and go to the payment option
                        System.out.println("Are you Confirm ticket (Y/N): ");
                        String ch = input.nextLine();

                        if(ch.equals("Y")){
                            Payment pay = new Payment(this.destination, this.seat, this.taka);
                        }
                        else{
                            return;
                        }
                    }
                    else{
                        System.out.println("we not have enough seat");
                    }
                    break;
                case 6:
                    if( (30 - seat6) >= seat_temp ){

                        this.destination = "Ch->Dh";
                        this.seat = seat_temp;
                        this.taka = this.seat * 500 ;
                        this.seat6 = seat_temp;

//                        Payment pay = new Payment(this.destination, this.seat, this.taka);
//
//                        this.seat6 = seat_temp;
                        // Asked user to confirm ticket and go to the payment option
                        System.out.println("Are you Confirm ticket (Y/N): ");
                        String ch = input.nextLine();

                        if(ch.equals("Y")){
                            Payment pay = new Payment(this.destination, this.seat, this.taka);
                        }
                        else{
                            return;
                        }
                    }
                    else{
                        System.out.println("we not have enough seat");
                    }
                    break;
                default:
                    System.out.println("\nplease enter a number between 1 to 6 ");
                    break;
            }
        }
        else{
            System.out.println("Please enter a intiger number seat value");
        }
    }
}
