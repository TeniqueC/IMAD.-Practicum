# ImadPractium App
The app that I have created in android stuidos is a weekly weather tracker app and it is designed to help users input and manage daily weather information including days, minimum and maximum temperatures, and weather conditions. It provides a seamless way to view detailed weather summaries and calculate average temperatures over a period.

## Features

1. **Edge-to-Edge Display Support**: The app adjusts to fit the screen perfectly by handling system window insets for a modern, edge-to-edge display.
2. **Data Input**: Users can enter the day, minimum and maximum temperatures, and weather conditions for multiple days.
3. **Data Management**: Users can clear input fields easily or save the data for later use.
4. **Detailed Summary**: The app provides a detailed view of the saved data, including individual day details and calculated average temperature.
5. **Navigation**: Simple navigation between the main screen, data input screen, and detailed view screen.

## Requirements

- **Android Device**: The app requires a device running Android 5.0 (Lollipop) or higher.
- **Development Tools**: To modify or build the app from source, Android Studio is required.

## Installation 
Getting started: before embarking on your weekly weather tracking journey, ensure you have the following:
Android studio: download and install the latsest version from the official Andriod developer website: https://developer.android.com/studio 

1. **Clone the Repository**: 
   ```sh
   git clone https://github.com/your-repo/imadpractium.git
   ```
2. **Open in Android Studio**: Open the cloned project in Android Studio.
3. **Build the Project**: Use the `Build` menu in Android Studio to build the project.
4. **Run on Emulator/Device**: Connect an Android device or use an emulator, then run the project.

### Pre-built APK

1. **Download the APK**: Obtain the APK file from the releases section or a provided link.
2. **Install the APK**: Transfer the APK to your Android device and install it directly.

### Main Activity

- **Start the App**: Launch the app to see the main screen with an option to start entering data.
- **Navigation**: Click the "Start" button to navigate to the Home Activity where data can be entered.
![image](https://github.com/TeniqueC/IMAD.-Practicum/assets/163857386/049e9681-baf7-48a1-8d25-90cc05830754)

### Home Activity
The HomeActivity class efficiently organizes the code for user input, validation, and navigation within the app. The structured approach includes:
•	View Initialization: Binding UI elements to member variables.
•	Data Management: Handling user input and storing it in mutable lists.
•	Event Handling: Providing clear and save functionalities with validation and exception handling.
•	Navigation: Passing data to the next activity through intents for detailed viewing.
This design promotes a clean, maintainable, and user-friendly interface, ensuring smooth interactions for users managing their weather data.

- **Enter Data**: Fill in the day, minimum temperature, maximum temperature, and weather condition in the provided fields.
- **Clear Data**: Use the "Clear" button to reset the input fields.
- **Save Data**: Click the "Save" button to store the input data.
- **Next**: Use the "Next" button to proceed to the detailed view screen with all saved data.
  ![image](https://github.com/TeniqueC/IMAD.-Practicum/assets/163857386/3b5b6c63-147c-424b-ab95-3f073326c515)


### Detailed View Activity

- **View Details**: See a detailed summary of all entered data including days, temperatures, and weather conditions.
- **Average Temperature**: Check the calculated average temperature for the period.
- **Back**: Use the "Back" button to return to the Home Activity.
  ![image](https://github.com/TeniqueC/IMAD.-Practicum/assets/163857386/35beb07a-4624-4bbf-a259-b1b9849a77b9)


## Code Structure

### MainActivity.kt

Handles the initial setup and navigation to `HomeActivity`. Adjusts layout for edge-to-edge display.
![image](https://github.com/TeniqueC/IMAD.-Practicum/assets/163857386/f4e2b1ee-4ebc-43a7-95e6-876203a07c2c)
![image](https://github.com/TeniqueC/IMAD.-Practicum/assets/163857386/bc74fc18-fc7e-434f-ac7c-a9510e4dadb5)


### HomeActivity.kt

Manages user inputs for days and temperatures. Provides functionality to clear and save data, and navigate to the detailed view.
![image](https://github.com/TeniqueC/IMAD.-Practicum/assets/163857386/de9033ac-184f-4782-ad51-4caabc149dbf)
![image](https://github.com/TeniqueC/IMAD.-Practicum/assets/163857386/553f158c-3aff-40ca-935c-7dbcaf89415b)


### DetailedViewActivity.kt
he DetailedViewActivity class is structured to provide a clear and effective way to display weather details:
•	View Initialization: Binds UI elements to member variables for interaction.
•	Data Handling: Retrieves and processes data passed from HomeActivity to construct detailed weather reports.
•	String Construction: Builds and formats detailed strings for individual days, temperatures, and weather conditions.
•	Calculation: Computes and displays the average temperature for the given data.
•	Navigation: Implements a back button to allow users to return to the Home Screen.
This code structure ensures a seamless transition between data entry and detailed display, enhancing the user experience with well-organized and readable weather information.
Displays the detailed summary of all entered data. Calculates and shows the average temperature.
![image](https://github.com/TeniqueC/IMAD.-Practicum/assets/163857386/b01f9092-8502-4421-a12a-bacd4acf2d8e)
![image](https://github.com/TeniqueC/IMAD.-Practicum/assets/163857386/fea53f4d-0067-44ec-a4e5-ea352b04a54b)


### XML Layouts

- **activity_main.xml**: Layout for the main screen.
- **activity_home.xml**: Layout for the data input screen.
- **activity_detailed_view.xml**: Layout for the detailed view screen.

## Contributing

1. **Fork the Repository**: Create your fork of the repository.
2. **Create a Branch**: Create a new feature or fix branch.
3. **Make Changes**: Implement your changes in the new branch.
4. **Submit a Pull Request**: Push your changes to your fork and create a pull request to the main repository.

### **7. Troubleshooting**

- **Build Errors**: Ensure all dependencies are properly resolved and that your Gradle build files are up-to-date.
- **Device Connection Issues**: Verify that USB Debugging is enabled and that the device is recognized by Android Studio.

##PSEUCODE FOR THE APP

##Main Activity
0.START
1.INITIALIZE VARIABLES
    openButton : Button

2.METHOD onCreate
    CALL super.onCreate with savedInstanceState
    SET content view to activity_main layout

  3. HANDLE system insets for edge-to-edge display using ViewCompat
        SET onApplyWindowInsetsListener for main view
        GET systemBars insets from WindowInsetsCompat
        APPLY padding to main view based on systemBars insets

   4.INITIALIZE openButton with findViewById for startButton

    5.SET openButton onClickListener
        CREATE Intent to start HomeActivity

6. START HomeActivity using Intent 

##Home Activity
0.START
1.INITIALIZE VARIABLES
    buttonNext : Button
    dayArray : Array of String
    minTempArray : Array of Float
    maxTempArray : Array of Float
    weatherConditionArray : Array of String

2.DECLARE VIEWS
    etDay : EditText
    etMinTemp : EditText
    etMaxTemp : EditText
    etWeatherCondition : EditText
    tvMessage : TextView
    buttonSave : Button
    buttonClear : Button

3.METHOD onCreate
    SET content view to activity_home
    INITIALIZE buttonClear with findViewById
    INITIALIZE buttonNext with findViewById
    INITIALIZE etDay with findViewById
    INITIALIZE etMinTemp with findViewById
    INITIALIZE etMaxTemp with findViewById
    INITIALIZE etWeatherCondition with findViewById
    INITIALIZE buttonSave with findViewById
    INITIALIZE tvMessage with findViewById

    4.SET buttonClear onClickListener
        CLEAR etDay text
        CLEAR etMinTemp text
        CLEAR etMaxTemp text
        CLEAR etWeatherCondition text

    5.SET buttonSave onClickListener
        day = GET etDay text
        minTemp = GET etMinTemp text
        maxTemp = GET etMaxTemp text
        weatherCondition = GET etWeatherCondition text

     6. IF day is not empty AND minTemp is not empty AND maxTemp is not empty
            TRY
                ADD day to dayArray
                ADD minTemp.toFloat() to minTempArray
                ADD maxTemp.toFloat() to maxTempArray
                ADD weatherCondition to weatherConditionArray

                CLEAR etDay text
                CLEAR etMinTemp text
                CLEAR etMaxTemp text
                CLEAR etWeatherCondition text
                SET tvMessage text to ""
            CATCH NumberFormatException
                SET tvMessage text to "Please enter valid numbers for temperatures"
        ELSE
            SET tvMessage text to "Input cannot be empty"

   7. SET buttonNext onClickListener
        9.CREATE intent for DetailedViewActivity
        ADD dayArray to intent as "DayArray"
        ADD minTempArray to intent as "MinTempArray"
        ADD maxTempArray to intent as "MaxTempArray"
        ADD weatherConditionArray to intent as "WeatherConditionArray"

 10. START DetailedViewActivity with intent

##Detailed View Activity 
0.START
1.INITIALIZE VARIABLES
    tvDetails : TextView
    tvMinTemp : TextView
    tvMaxTemp : TextView
    tvWeatherCondition : TextView
    tvAverageTemperature : TextView
    btnBack : Button

2.METHOD onCreate
    SET content view to activity_detailed_view
    INITIALIZE btnBack with findViewById
    INITIALIZE tvDetails with findViewById
    INITIALIZE tvMinTemp with findViewById
    INITIALIZE tvMaxTemp with findViewById
    INITIALIZE tvWeatherCondition with findViewById
    INITIALIZE tvAverageTemperature with findViewById

   3. RETRIEVE dayArray from intent extras, convert to list or set to empty list
    RETRIEVE minTempArray from intent extras, convert to list or set to empty list
    RETRIEVE maxTempArray from intent extras, convert to list or set to empty list
    RETRIEVE weatherConditionArray from intent extras, convert to list or set to empty list

    4.BUILD dayDetails string
        FOR each index, day in dayArray
            APPEND "Day index + 1: day" to dayDetails

    5.BUILD minTempDetails string
        FOR each index, temp in minTempArray
            APPEND "Min Temperature index + 1: temp°C" to minTempDetails

   6. BUILD maxTempDetails string
        FOR each index, temp in maxTempArray
            APPEND "Max Temperature index + 1: temp°C" to maxTempDetails

    7.BUILD weatherConditionDetails string
        FOR each index, condition in weatherConditionArray
            APPEND "Condition index + 1: condition" to weatherConditionDetails

    8.SET tvDetails text to dayDetails string
    SET tvMinTemp text to minTempDetails string
    SET tvMaxTemp text to maxTempDetails string
    SET tvWeatherCondition text to weatherConditionDetails string

   9. CALCULATE totalTemps as sum of sizes of minTempArray and maxTempArray
    CALCULATE totalTempSum as sum of all values in minTempArray and maxTempArray
    CALCULATE averageTemperature as totalTempSum / totalTemps
        IF totalTemps is 0, SET averageTemperature to 0

    10.SET tvAverageTemperature text to "Average Temperature: averageTemperature°C" (formatted to 2 decimal places)

    11.SET btnBack onClickListener

 12. FINISH activity
  13.STOP 

 
