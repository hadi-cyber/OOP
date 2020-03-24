public class anjing extends Hewan {
    @override
    public void info() {
        system.out.println("id anjing : 1");
        system.out.println("siapa pemiliknya ? :Hadi ");
    }

    String gantistatus;
    gantistatus="Suntik Rabies";
    public void SuntikRabies(String hewan, Boolean status){
        if(status==true) {
            system.out.println(hewan+ "" +suntik);
        }else {
            status=false;
        }
    }
}