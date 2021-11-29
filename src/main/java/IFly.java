public interface IFly {
    default String doAction(){
        return "I can FLY";
    };
    default String fuelForFly() {
        return "I'm default implementation for fuel method";
    }
}
