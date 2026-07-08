package com.hospital;
import java.util.*;
public class Hospital{
    private List<Patient> patients=new ArrayList<>();
    private List<Doctor> doctors=new ArrayList<>();
    private List<Appointment> appointments=new ArrayList<>();
    public void addPatient(Patient p){patients.add(p);}
    public void addDoctor(Doctor d){doctors.add(d);}
    public void bookAppointment(Appointment a){appointments.add(a);}
    public void showPatients(){patients.forEach(System.out::println);}
    public void showDoctors(){doctors.forEach(System.out::println);}
    public void showAppointments(){appointments.forEach(System.out::println);}
}
