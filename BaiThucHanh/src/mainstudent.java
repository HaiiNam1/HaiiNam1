public class mainstudent {
    public static void main(String[] args) throws Exception {
        student Std = new student();
        System.out.println("Sinh vien: ");
        Std.nhapgiatri();
        Std.inGiatri();
        System.out.println("\ntuoi cua ban la : " + Std.Tinhtuoi());
        System.out.println("diem cua mon hoc la : " + Std.Tinhdiem());
        Std.doiDiem();


    }
    
}