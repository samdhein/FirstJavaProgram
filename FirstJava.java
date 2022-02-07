public class FirstJava {
    public static void main(String[] args){
        String firstLine = "My name is Sam Hein";
        String secondLine = "I am 31 years old";
        String thirdLine = "My hometown is Manhattan Beach, CA";

        System.out.println(String.format("%s", firstLine));
        System.out.println(String.format("%s", secondLine));
        System.out.println(String.format("%s", thirdLine));    
    }
}