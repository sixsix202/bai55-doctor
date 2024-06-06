
import java.util.ArrayList;


public class BoDoctor {
    private ArrayList<Doctor> ld = new ArrayList<>();
     public boolean checkDuplicate(ArrayList<Doctor> doctor, String code){
        for (Doctor d : doctor){
            if (code.equalsIgnoreCase(d.getId()))
                return false;
        }
        return true;
    }
     public Doctor getDoctorByCode( String code) {
         for (Doctor d : ld){
             if (d.getId().contains(code))
                 return d;
         }
         return null;
    }
     public void addDoctor(Doctor d){
         if (d!=null){
             if (checkDuplicate(ld, d)) {
                System.err.println("Doctor with the same details already exists.");
            } else {
                ld.add(d);
                System.out.println("Doctor added successfully.");
            }
         }
     }
     
     public void deleteDoctor(Doctor d){
         if (d!=null)
             ld.remove(d);
     }
     public ArrayList<Doctor> getNameSearch(String name){
         ArrayList<Doctor> searchName = new ArrayList<>();
         for (Doctor d : ld){
             if (d.getName().contains(name))
                 searchName.add(d);
         }
         return searchName;
     }
}
