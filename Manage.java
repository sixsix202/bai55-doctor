
import java.util.ArrayList;

public class Manage {
    Inputer in = new Inputer();
    BoDoctor bo = new BoDoctor();
    ArrayList<Doctor> doctor = new ArrayList<>();
    public void menu(){
        System.out.println("======== Doctor Management ==========");
        System.out.println("1. Add Doctor");
        System.out.println("2. Update Doctor");
        System.out.println("3. Delete Doctor");
        System.out.println("4. Search Doctor");
        System.out.println("5. Exit");
    }
    public void addDoctor(){
        System.out.println("------------ Add Doctor ---------");
        String code = in.getCode("Enter Code: ");
        String name = in.getName("Enter Name: ");
        String spec = in.getName("Enter Specialization: ");
        int avail = in.getIntInput("Enter Availability: ", 1, Integer.MAX_VALUE);
        if (!bo.checkDuplicate(doctor, code)){
            System.err.println("Duplicated !!!");
            return;
        }
        bo.addDoctor(new Doctor(code, name, spec, avail));
    }
    public void updateDoctor(){
        System.out.println("----------- Update Doctor -------------");
        String code = in.getCode("Enter Code: ");
        Doctor d = bo.getDoctorByCode(code);
        if (d != null){
            String name = in.getName("Enter Name: ");
            String spec = in.getName("Enter Specialization: ");
            int avail = in.getIntInput("Enter Availability: ", 1, Integer.MAX_VALUE);
            d.setName(name);
            d.setSpec(spec);
            d.setAvail(avail);
        } else
            System.err.println("Doctor code not found");
    }
    public void deleteDoctor(){
        System.out.println("------- Delete Doctor ------------");
        String code = in.getCode("Enter Code: ");
        Doctor d = bo.getDoctorByCode(code);
        if (d!= null)
            bo.deleteDoctor(d);
        else
            System.err.println("Code not found");
    }
    public void searchDoctor(){
        System.out.println("---------- Search Doctor ------------");
        String input = in.getName("Enter Text: ");
        ArrayList<Doctor> searchName = bo.getNameSearch(input);
        if (searchName.isEmpty())
            System.err.println("List Empty !");
        else{
        System.out.printf("%-10s%-15s%-25s%-20s\n", "Code", "Name",
                    "Specialization", "Availability");
        for (Doctor d : searchName){
            System.out.printf("%-10s%-15s%-25s%-20s\n",d.getId(),d.getName(),d.getSpec(),d.getAvail());
        }
    }
    }
   }
