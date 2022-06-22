package JavaAssessmentPractice;

public class PetDog extends Pet{

    private boolean trained;

    public boolean isTrained() {
        return trained;
    }

    public PetDog(String name, String type, boolean trained) {
        super(name, type);
        this.trained = trained;
    }
}
