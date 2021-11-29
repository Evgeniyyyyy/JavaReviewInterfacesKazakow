public class AirCraft implements IFly{
    @Override
    public String doAction() {
        return "I AIRPLANE and I can fly too";
    }

    @Override
    public String fuelForFly() {
        return "I'm method fuel";
    }
}
