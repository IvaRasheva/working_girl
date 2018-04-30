package Task0_ClassesB;


public class Car {
    public String brand;
    public String model;
    public int yearOfManufacture;
    public int enginePower;

    public Car(){
        this.brand = "";
        this.model = "";
        this.yearOfManufacture = 0;
        this.enginePower = 0;
    }



    public Car (String brand, String model, int yearOfManufacture, int enginePower) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.enginePower = enginePower;

    }

    public int insuranceCategory() {
        int yearsCount;
        yearsCount = 2016 - yearOfManufacture;
        int category;

        if (yearsCount < 8 && yearsCount >= 0) {
            category = 1;
        } else if (yearsCount  < 15) {
            category = 2;
        } else if (yearsCount <= 25) {
            category = 3;
        } else {
            category = 4;
        }

        return category;
    }

    public double insuranceTax() {
        int tax = 0;
        double userTax;

        if (insuranceCategory() == 1) {
            tax = 150;
        } else if (insuranceCategory() == 2) {
            tax = 200;
        } else if (insuranceCategory() == 3) {
            tax = 300;
        } else if (insuranceCategory() == 4){
            tax = 500;
        }


        if (enginePower < 80){
            userTax = tax * 20/100 + tax;
        } else if (enginePower > 140) {
            userTax = tax * 45/100 + tax;
        } else {
            userTax = tax;
        }

        return userTax;
    }
}


//
//    }

//    public void setBrand(String setBrand){
//        this.brand = brand;
//    }
//
//    public String getBrand(){
//        return this.getBrand();
//    }







