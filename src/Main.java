public class Main {
    public static void main (String ... args) {
        int start, end;
        String word, result;
        if (args.length == 3) {
            try {
                word=args[0];
                start=Integer.parseInt(args[1]);
                end=Integer.parseInt(args[2]);
                result=word.substring(start, end+1);
                System.out.println(result);
            } catch (NumberFormatException e) {
                System.out.println("Drugi i trzeci argument muszą być liczbami");
                System.out.println(e.getMessage());
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Podany zakres liczb przekracza długość słowa");
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Niepoprawna liczba argumentów");
        }
    }

}
