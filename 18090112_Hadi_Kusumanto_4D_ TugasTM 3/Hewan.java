 class Hewan {
    String id;
    String pemilik;
    boolean status;

    String status_pewarisan="hewan daratan";
    public void hewan_daratan (String hewan, Boolean status) {
        if (status ==true) {
            System.out.println(hewan"" +status_pewarisan)
        }else {
            status=false;
        }

    public void info(String id, String pemilik) {
        System.out.println("id :" + id );
        System.out.println( "Siapa pemiliknya ? : " + pemilik);
    }
 }