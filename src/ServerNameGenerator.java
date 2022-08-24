public class ServerNameGenerator {
    private String[] adjectives = {"Ambitious", "Proud" , "Smart", "Stupid", "Clumsy", "Forgetful", "Strong", "Weak", "Fast", "Slow"};

    private String[] nouns = {"Dog", "Cat", "Ball", "Shoe", "Car", "Computer", "Phone", "Food", "Water", "Air"};

    public String [] getAdjectives() {
        return adjectives;
    }

    public void setAdjectives(String[] adjectives) {
        this.adjectives = adjectives;
    }

    public String[] getNouns() {
        return nouns;
    }

    public void setNouns(String[] nouns) {
        this.nouns = nouns;
    }

    private static String getStringInArray(String[] arrayOfStrings) {
        return arrayOfStrings[(int) Math.ceil(Math.random() * arrayOfStrings.length - 1)];
    }

    public static void main(String[] args) {
        ServerNameGenerator serverNameGenerator = new ServerNameGenerator();
        System.out.println("This is your server name: ");
        String noun = getStringInArray(serverNameGenerator.getAdjectives());
        System.out.printf("%s-%s%n, adjective, noun");
    }

}
