public class FirstJava {
    public static void main(String[] args){
        String FirstLine = "My name is Sam Hein";
        String SecondLine = "I am 31 years old";
        String ThirdLine = "My hometown is Manhattan Beach, CA";

        System.out.println(String.format("%s", FirstLine));
        System.out.println(String.format("%s", SecondLine));
        System.out.println(String.format("%s", ThirdLine));    
    }
}