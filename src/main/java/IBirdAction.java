public interface IBirdAction extends IFly, IEat{
    @Override
    default String doAction(){
        return IEat.super.doAction() + '\n' +
               IFly.super.doAction();
    }
}
