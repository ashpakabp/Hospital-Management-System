/
package com.hospital;
public class Main{
    public static void main(String[] args){
        Hospital h=new Hospital();
        Patient p=new Patient(1,"Ashpak",25);
        Doctor d=new Doctor(101,"Sharma","Cardiology");
        h.addPatient(p);
        h.addDoctor(d);
        h.bookAppointment(new Appointment(p,d,"01-07-2026"));
        System.out.println("Patients:");
        h.showPatients();
        System.out.println("\nDoctors:");
        h.showDoctors();
        System.out.println("\nAppointments:");
        h.showAppointments();
    }
}
