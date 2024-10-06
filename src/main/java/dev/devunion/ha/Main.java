package dev.devunion.ha;

import dev.devunion.ha.models.Alarm;
import dev.devunion.ha.models.Patient;
import dev.devunion.ha.system.AlarmSystem;

public class Main {
    public static void main(String[] args) {
        AlarmSystem system = new AlarmSystem();

        Patient patient1 = new Patient("John Doe", 1, "Critical");
        Patient patient2 = new Patient("Jane Smith", 2, "Stable");

        system.addPatient(patient1);
        system.addPatient(patient2);

        Alarm alarm1 = new Alarm("Medical Emergency");
        system.addAlarm(1, alarm1);

        system.triggerAlarm(1); // Should trigger the alarm for John Doe
        system.resetAlarm(1);   // Should reset the alarm for John Doe
    }
}