package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

import javafx.beans.property.StringProperty;

public class PolymorphismControllerOne {
    public static void main(String[] args) {
        Football football = new Football();
        String[] equipmentArray = {"pads", "ball", "cleats", "helmet", "goal post", "field", "jockstrap"};
        football.setEquipmentNeeded(equipmentArray);
        Football footballTwo = new Football(15, 0, 0, false, false);
        footballTwo.setEquipmentNeeded(new String[]{"pads", "ball", "cleats"});

        CollegeBasketball collegeBasketball = new CollegeBasketball();
        collegeBasketball.setEquipmentNeeded(new String[]{"ball", "court", "basket", "shoes"});

        ProBasketball proBasketball = new ProBasketball();
        proBasketball.setEquipmentNeeded(new String[]{"ball", "court", "basket", "shoes", "headband"});
        PlayASport playASport = new PlayASport(proBasketball);
        playASport.startGame();
        playASport.setSport(collegeBasketball);
        playASport.startGame();
        playASport.setSport(football);
        playASport.startGame();
    }
}
