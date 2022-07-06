package labs_examples.objects_classes_methods.labs.oop.A_inheritance.exerciseone;

public class SSController {
    public static void main(String[] args) {
        DwarfPlanet pluto = new DwarfPlanet(false, true);
        pluto.setHasAtmosphere(true);
        pluto.setHasLife(false);
        pluto.setNumberOfMoons(5);
        pluto.setHasWater(true);
        pluto.setNumberFromSun(9);
        pluto.setHasRings(false);
        pluto.setDiameter(1477);
        pluto.setMass("1.3 * 10^22");
        pluto.setName("Pluto");
        System.out.println(pluto.toString());

        InnerPlanet earth = new InnerPlanet(true);
        earth.setHasAtmosphere(true);
        earth.setHasLife(true);
        earth.setNumberOfMoons(1);
        earth.setHasWater(true);
        earth.setNumberFromSun(3);
        earth.setHasRings(false);
        earth.setDiameter(7917);
        earth.setMass("5.972 * 10^24");
        earth.setName("Earth");
        System.out.println(earth.toString());

    }
}
