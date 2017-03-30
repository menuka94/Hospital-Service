package org.wso2.service.hospital.daos;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by nadeeshaan on 7/20/16.
 */

@XmlRootElement
public class AppointmentRequest {
    private Patient patient;
    private String doctor;
    private String hospital;
    private String appointmentDate;

    public AppointmentRequest(Patient patient, String doctor, String hospital, String appointmentDate) {
        this.patient = patient;
        this.doctor = doctor;
        this.hospital = hospital;
        this.appointmentDate = appointmentDate;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
}
