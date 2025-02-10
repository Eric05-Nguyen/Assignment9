public class Processor {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        ArrayList<Car> Cars = new ArrayList<>();
        System.out.println("Nhap so luong xe can biet thong tin :");
        int n = nhap.nextInt();
        nhap.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("nhap ten hang xe thu " + (i + 1) + " :");
            String model = nhap.nextLine();
            System.out.println("Nhap nam san xuat :");
            int year = nhap.nextInt();
            nhap.nextLine();
            Car myCar = new Car(model, year);
            Cars.add(myCar);
        }
        System.out.println("--------------Danh sach cac xe--------------");
        for (int i = 0; i < Cars.size(); i++) {
            Cars.get(i).disPlayDetails();
        }
    }
}
