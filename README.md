![Screenshot 2024-06-10 133443](https://github.com/ST10450853-NKOSINATHIMAQUNGELA/10450853_IMAD5112_Practicum/assets/164514993/56104f78-c852-4359-8682-4f82172904ae)Nkosinathi Maqungela
ST10450852

Link to repository 
https://github.com/ST10450853-NKOSINATHIMAQUNGELA/10450853_IMAD5112_Practicum

pseudocode

//………………………………………………………………………………………………………………………
start
declarations

string strDays 

num intMinTemperature

num intMaxTemperature

string strWeatherConditions

num intTotalTemperature

num intAverageTemperature 

//prompting the user to input the date

output “Please enter the date”

input strDays

//prompting the user to input the minimum temperature

output “Please enter the minimum temperature”

input intMinTemperature

//prompting the user to input the maximum temperature

output “please enter the maximum temperature”

input intMaxTemperature

//prompting the user to input the weather conditions

output “Please enter the weather conditions”

input strWeatherConditions

information()

getAverage()

displayAverage()
//………………………………………………………………………………………………………………………
information()
output “The date is: “ + strDays 

output “The minimum temperature is: “ + intMinTemperature

output "The maximum temperature is: “ + intMaxTemperature

return


 
DEMONSTRATION

When users enter the app, they are greeted by a landing page/splash screen where they can press a button that leads them to the main screen.
 
We start by declaring out variables, which are our home page button and our exit button. The home page button’s code is set to detect when is being pressed, and when it is, the user is taken to the second screen. When the exit button is pressed, the user is application stop and the user returns to their phone’s home screen.
![Screenshot 2024-06-10 142845](https://github.com/ST10450853-NKOSINATHIMAQUNGELA/10450853_IMAD5112_Practicum/assets/164514993/d19d9547-51da-4f51-a364-281660722e90)

On the second page of my app, the user must enter in values that go into an array. If a user does not fill in all the information, the app prompts them to do so by giving them an error message. This allows users to see their error and rectify it.
![Screenshot 2024-06-10 133419](https://github.com/ST10450853-NKOSINATHIMAQUNGELA/10450853_IMAD5112_Practicum/assets/164514993/6f661d38-ad9c-4976-98b4-378acecff051)


Users also get a message when they enter in the correct amount of information.
 ![Screenshot 2024-06-10 133443](https://github.com/ST10450853-NKOSINATHIMAQUNGELA/10450853_IMAD5112_Practicum/assets/164514993/f75a6bec-0d8e-4ec9-ab87-cc9887237a33)

we check for this using an if statement that makes sure no field is left empty. In the if statement, we used a method to take the values that the user inputted and temporarily store them where they will be put the array we declared on the second screen and be dispalyed oon the third screen
![Screenshot 2024-06-10 142925](https://github.com/ST10450853-NKOSINATHIMAQUNGELA/10450853_IMAD5112_Practicum/assets/164514993/b78996f2-c82a-4dee-aff0-d256a2742fec)

when we want to calculate the average of the temperatures, we declare a variable for the total amount of the temperatures. This will allow us to divide by the number of temperatures entered.

to calculate the average, we have to make a function for that checks the total number of instances that the values were enteres. In this function, we also display the Dates, temperatures, and theweather conditions entered by the user

![image](https://github.com/ST10450853-NKOSINATHIMAQUNGELA/10450853_IMAD5112_Practicum/assets/164514993/66c1d6ad-0af6-4ecf-be83-f9b0b7f09b28)


That is the basic premise of my app.

Thank you
