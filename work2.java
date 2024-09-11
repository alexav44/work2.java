public class work2
{ 
    public static void main(String[] args)
    {
        String animal = "cat";
        double weight = 13.0;
        int weightGained = 4;
        weight = weight + weightGained;
        final double goal = 11;
        if(weight > 12){
            System.out.println("Your " + animal + " is overweight, and currently weighs " + weight + " lbs");
            System.out.print("Try to aim for " + goal + "lbs");
        }
        else{
            System.out.println("Your" + animal + "is purrfect, and currently weighs" + weight);
        }

    }

}

 // int w = 13;
        // final double c = 2.50;
        // String l = (" lbs should eat ");
        // System.out.println("cats " + w + l + c + " cans");
        // w = 14;
        // double s =3.5;
        // s = w + s ;
        // boolean y = true;
        // System.out.println("cats " + s + l + "much less");
        // System.out.println("Fat cats are not cute" );
        // System.out.print("It's "+y);