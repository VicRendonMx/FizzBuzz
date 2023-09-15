public class Multiples {
    public static void main(String[] args) {
        double divisionThree = (double) 100/3;
        double divisionFive = (double) 1000/5;
        double divisionBoth = (double) 1000/15;
        double multiplesOfThree = Math.floor(divisionThree);
        double multiplesOfFive = Math.floor(divisionFive);
        double multiplesOfBoth = Math.floor(divisionBoth);
        double Total = multiplesOfThree + multiplesOfFive - multiplesOfBoth;
        System.out.println(Total);
    }
}
