# Hospital Alarm System

The **Hospital Alarm System** is a console-based Java application designed to monitor patient conditions and trigger alarms in case of emergencies. The system allows for tracking patient data, managing different types of alarms (medical emergency alarms, fire alarms), and offers functionality for logging and resetting alarms.

## Features
- Add and manage patients with their current condition.
- Trigger alarms based on patient conditions (critical condition).
- Reset alarms once resolved.
- Log detailed information about alarm triggers and resets.
- Unit tests to ensure functionality.

---

## Table of Contents
- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Testing](#testing)
- [Contributing](#contributing)
- [License](#license)

---

## Installation

### Prerequisites
Ensure you have the following installed:
- **Java JDK 11+**
- **IntelliJ IDEA** (or any other Java IDE)
- **JUnit** (for testing)

### Steps
1. Clone the repository:
    ```bash
    git clone https://github.com/abdelillahbel/hospital-alarm-system.git
    ```
2. Open the project in **IntelliJ IDEA**:
    - Go to `File` -> `Open` and select the cloned project folder.

3. Build the project:
    - Make sure all dependencies are properly imported.

4. Run the main class (`Main.java`) to start the application.

---

## Usage

The application works by adding patients to the system, associating alarms with them, and triggering alarms based on their condition.

### Example Usage:

1. **Add Patients**:
    - Patients can be added by instantiating `Patient` objects with their ID, name, and condition.
    - The `AlarmSystem` class handles adding patients and assigning alarms.

2. **Trigger Alarms**:
    - Alarms are triggered manually or based on a patient's condition.
    - If a patient’s condition is "Critical", an alarm will be triggered automatically using the `checkAndTriggerAlarm()` method.

3. **Reset Alarms**:
    - Alarms can be reset after they’ve been triggered.
