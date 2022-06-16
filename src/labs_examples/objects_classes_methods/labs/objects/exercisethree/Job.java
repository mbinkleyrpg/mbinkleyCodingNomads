package labs_examples.objects_classes_methods.labs.objects.exercisethree;

public class Job {
    String jobDescription;

    public Job(){
    }

    public Job(String jobDescription){
        this.jobDescription = jobDescription;
    }

    @Override
    public String toString(){
        return jobDescription;
    }
}
