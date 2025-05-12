public class CLass {
    public static void main(String[] args) {
     
    Driver driver = new Driver() ;
    addup ad = new addup();
    details det = new details();
    driver.name = "DK";
    driver.drivername();
    ad.age = 40;
    det.vechiclemodel = "Tata";
    ad.driveage();
    ad.name = "JD";
    ad.drivername();
    det.drivervehiclemodel();
    }
}


class Driver {

    String name;
    int phoneno;

    public void drivername() {
        System.out.println("this is parent class "+name);
    }
}

class addup extends Driver{
    int age;
    String address;
    public void driveage(){
        System.out.println("this is first child class "+age);

    }
}

class details extends Driver {
    int vehicleno;
    String vechiclemodel;   
    public void drivervehiclemodel(){
        System.out.println("this is second child class "+vechiclemodel);
    }
}
