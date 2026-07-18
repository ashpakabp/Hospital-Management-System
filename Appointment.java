///package com.hospital;
public class Appointment {
    private Patient patient; private Doctor doctor; private String date;
    public Appointment(Patient p,Doctor d,String date){
        this.patient=p;this.doctor=d;this.date=date;
    }
    public String toString(){return patient.getName()+" -> "+doctor+" on "+date;}
}
