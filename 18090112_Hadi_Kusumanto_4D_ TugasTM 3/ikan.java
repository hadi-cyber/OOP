   public class ikan  extends Hewan {
    @override
    public void info() {
        system.out.println("id ikan : 2");
        system.out.println("siapa pemiliknya ? : Hadi ");
    }

    gantistatus="GantiAir";
    public void  GantiAir (String hewan, Boolean status){
        if(status==true) {
            system.out.println(hewan+ "" + gantistatus);
        }else {
            status=false;
        }
    }
}