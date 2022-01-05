
# ViewModelPractise
this is to help you the viewer to have an understanding of how ViewModel is used, and works in Kotlin.

ViewModel is a library which is part of Jetpack Framework allows developers to preserve data in a life-cycle aware way in that data doesn't get affected with changes to devices UI or screen settings(potrait or landscape).

ViewModel is not a solution to preserve data persistent data, but it is used for temporary data.
For ViewModel to be supportd in your project, one has to include the android Lifecycle dependancy that supports viewModel
after which you are to sync your build.gradle to have the dependency incoporated into your project.

For efficiencies, create a new class that extends the ViewModel() class and for naming purposes annotate your class with the name ViewModel for ease of recognition:
eg "MyClassViewModel."

your business logic for the activity that you would wish to store its data on to the viewModel should all be in this class.

In your viewModel Class, create a variable to store your data(s) value and a simple function to execute the data.

and in your main activity all you have to do is to crate an instace of your viewmodel class in the on Oncreate.

below are screenshots to show you the working.

<img width="1440" alt="Screenshot 2022-01-05 at 15 43 40" src="https://user-images.githubusercontent.com/30687283/148228712-ee343fb6-2f46-4500-809c-e1702d9a1ba9.png">

<img width="1440" alt="Screenshot 2022-01-05 at 15 43 53" src="https://user-images.githubusercontent.com/30687283/148228812-22960390-ac95-40f6-ad0a-8d83b192c3ba.png">

<img width="1440" alt="Screenshot 2022-01-05 at 15 43 40" src="https://user-images.githubusercontent.com/30687283/148248996-ed56a2d3-3eea-4e57-9cb0-a46857aaadce.png">

<img width="1440" alt="Screenshot 2022-01-05 at 15 43 53" src="https://user-images.githubusercontent.com/30687283/148249022-bd4692c0-9ae9-4f3c-9d55-d19465931317.png">

<img width="1440" alt="Screenshot 2022-01-05 at 16 29 29" src="https://user-images.githubusercontent.com/30687283/148249032-48554813-905f-470a-9e39-e86203f4b1ca.png">
