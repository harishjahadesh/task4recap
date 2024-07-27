package voter;
class Voter {
    private int voterId;
    private String name;
    private int age;

    public Voter(int voterId, String name, int age) throws InvalidAgeForVoterException {
        if (age > 18) {
            throw new InvalidAgeForVoterException("Invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Voter [Voter ID: " + voterId + ", Name: " + name + ", Age: " + age + "]";
    }

    public static void main(String[] args) {
        try {
            Voter voter1 = new Voter(1, "Alice", 16);
            System.out.println(voter1);
        } catch (InvalidAgeForVoterException e) {
            System.out.println(e.getMessage());
        }

        try {
            Voter voter2 = new Voter(2, "Bob", 26);
            System.out.println(voter2);
        } catch (InvalidAgeForVoterException e) {
            System.out.println(e.getMessage());
        }
    }
}
