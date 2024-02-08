/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pradi
 */
import java.util.Scanner;

public class Person {
    String fName;
    String iName;
    String stuId;
    String stuStatus;
    
    public void setPerson(String fName,String iName, String stuId, String stuStatus){
         this.fName = fName;
         this.iName = iName;
         this.stuId = stuId;
         this.stuStatus = stuStatus;
    }
    
    public void showPerson(){
        System.out.println("                Data Mahasiswa");
        System.out.println("------------------------------------------------");
        System.out.println("Nama Lengkap        = "+ fName);
        System.out.println("Nama Panggilan      = "+ iName);
        System.out.println("NIM                 = "+ stuId);
        System.out.println("Status Mahasiswa    = "+ stuStatus);
        System.out.println("------------------------------------------------");
    }
    public static void main(String[] args){
            Person personOfStudent= new Person();
            personOfStudent.setPerson("Praditya Ivan Rahmadhani","Ivan", "E41230457", "Aktif");
            personOfStudent.showPerson();
//            Scanner sc = new Scanner(System.in);
//            String namaLengkap;
//            String namaPanggilan;
//            String NIM;
//            String status;
//            
//            do{
//               System.out.println(" ");
//               System.out.print("Nama Lengkap      : ");
//               namaLengkap = sc.nextLine();
//
//                if(namaLengkap.length() >0){
//                    System.out.print("Nama Panggilan    : ");
//                    namaPanggilan = sc.nextLine();
//
//                    if(namaPanggilan.length() >0){
//                        System.out.print("NIM               : ");
//                        NIM = sc.nextLine();
//
//                        if(NIM.length() >0){
//                            System.out.print("Status            : ");
//                            status = sc.nextLine();
//
//                            if(status.length() >0){
//                                Person personOfStudent= new Person();
//                                personOfStudent.setPerson(namaLengkap,namaPanggilan, NIM, status);
//                                personOfStudent.showPerson();
//
//                                System.out.print("Masukkan data lagi? Y/N :" );
//                                
//                            } else{
//                                System.out.println("status kosong");
//                            }
//                        }else{
//                            System.out.println("NIM kosong");
//                        }
//                    }else{
//                        System.out.println("nama kosong");
//                    }
//                }else{
//                    System.out.println("nama kosong");
//                } 
//                
//            }
//            while(sc.nextLine().equalsIgnoreCase("Y"));
        }
}
