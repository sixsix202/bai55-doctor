/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Manage m = new Manage();
        Inputer i = new Inputer();
        while(true){
            m.menu();
            int choice = i.getIntInput("Enter choice: ", 1, 5);
            switch(choice){
                case 1:
                    m.addDoctor();
                    break;
                case 2:
                    m.updateDoctor();
                    break;
                case 3:
                    m.deleteDoctor();
                    break;
                case 4:
                    m.searchDoctor();
                    break;
                case 5:
                    return;
                
            }
        }
    }
}
