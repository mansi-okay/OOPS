package Interface;

public class Group {
    private Job job;
    private Hobby hobby;
    private Personality personality;

    public Group(Job job, Hobby hobby, Personality personality){
        this.job = job;
        this.hobby = hobby;
        this.personality = personality;
    }

    public void routine(){
        job.work();
        hobby.relax();
        personality.joke();
    }

    public void reaction(){
        hobby.react();
    }

    public void upgradePersonality(Personality NewPersonality){
        this.personality = NewPersonality;
    }
}