package dev.devunion.ha.system;

import dev.devunion.ha.models.Alarm;
import dev.devunion.ha.models.Patient;

import java.util.HashMap;
import java.util.Map;

public class AlarmSystem {
    private final Map<Integer, Alarm> alarms;
    private final Map<Integer, Patient> patients;

    public AlarmSystem() {
        this.alarms = new HashMap<>();
        this.patients = new HashMap<>();
    }

    public void addPatient(Patient patient) {
        patients.put(patient.getId(), patient);
        System.out.println("Added patient: " + patient.getName());
    }

    public void addAlarm(int patientId, Alarm alarm) {
        alarms.put(patientId, alarm);
        System.out.println("Added alarm for patient ID " + patientId);
    }

    public void triggerAlarm(int patientId) {
        Alarm alarm = alarms.get(patientId);
        if (alarm != null) {
            alarm.trigger();
        } else {
            System.out.println("No alarm found for patient ID " + patientId);
        }
    }

    public void resetAlarm(int patientId) {
        Alarm alarm = alarms.get(patientId);
        if (alarm != null) {
            alarm.reset();
        } else {
            System.out.println("No alarm found for patient ID " + patientId);
        }
    }
}
