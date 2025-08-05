package Interface;

public class Main {
    public static void main(String[] args) {
        Job job = new Chandler();
        Hobby hobby = new Phoebe();
        Personality personality = new Chandler();

        Group friends = new Group(job, hobby, personality);

        friends.routine();
        friends.reaction();

        System.out.println("After changing personality: ");
        friends.upgradePersonality(new Joey());

        friends.routine();
    }
}
