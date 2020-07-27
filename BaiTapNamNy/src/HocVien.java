import java.util.Comparator;

public class HocVien {
    private String name,gioiTinh;
    private Integer tuoi;


    public String getName() {
        return name;
    }

    public HocVien(String name, String gioiTinh, Integer tuoi) {
        this.name = name;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    @Override
    public String toString(){
        return "Ten= "+this.getName()+" Gioi Tinh= "+this.getGioiTinh()+" Tuoi= "+this.getTuoi()+"\n";
    }


//    @Override
//    public int compareTo(HocVien hocvien) {
//        int soSanhTen=this.getName().compareTo(hocvien.getName());
//        int soSanhTuoi=this.getTuoi()-hocvien.getTuoi();
//        int soSanhGioiTinh=this.getGioiTinh().compareTo(hocvien.getGioiTinh());
//        if(soSanhGioiTinh==0){
//            if(soSanhTuoi==0){
//                if (soSanhTen==0){
//                    return 0;
//                }
//                else if (soSanhTen>0){
//                    return 1;
//                }
//                else if (soSanhTen<0){
//                    return -1;
//                }
//            }
//            else if(soSanhTuoi<0){
//                return -1;
//            }
//            else if(soSanhTuoi>0){
//                return 1;
//            }
//        } else if (soSanhGioiTinh>0){
//            return 1;
//        }
//        else {
//            return -1;
//        }
//        return 0;
//    }


}
