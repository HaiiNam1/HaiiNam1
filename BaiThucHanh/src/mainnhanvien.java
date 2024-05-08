public class mainnhanvien {
    public static void main(String[] args) throws Exception {
        nhanvien Nv = new nhanvien();
        System.out.print("Nhanvien :");
        Nv.nhapGiaTri();
        Nv.inGiaTri();
        System.out.print("\ntuoi cua Nv la : " + Nv.tinhtuoinhanvien());
        System.out.print("\ntien luong cua nhan vien la : " + Nv.tinhluongnhanvien() + " vnd " );
    }
}