package JavaAssessmentPractice;

public class PetDog extends Pet implements Companion{

    private boolean trained;

    public boolean isTrained() {
        return trained;
    }

    public PetDog(String name, String type, boolean trained) {
        super(name, type);
        this.trained = trained;
    }

    @Override
    public String snuggle() {
        return this.getName() + " wants to snuggle";
    }
}
