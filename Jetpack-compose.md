# Jetpack Compose Notes:

1. When a function is passed as an argument, it can also be referred to as a " callback".
```kotlin
Button(onClick = { /*TODO*/ }) // Button composible lambda body
```

2. Composables are stateless by default, which means that they don't hold a value and can be recomposed any time by the system, which results in the value being reset. To avoid this. Composable functions can store an object in memory using the "remember" composable.
```kotlin
var result by remember { mutableStateOf(1) }
``` 
3. The mutableStateOf() function returns an observable. this basically means that when the value of the result variable changes, a recomposition is triggered, the value of the result is reflected, and the UI refreshes.

4.  To make your app accessible for more users, remember to set content descriptions on the images to describe what the image contains.
5. When Compose runs your composables for the first time during initial composition, it keeps track of the composables that you call to describe your UI in a Composition. Recomposition is when Compose re-executes the composables that may have changed in response to data changes and then updates the Composition to reflect any changes.
6. You use the State and MutableState types in Compose to make state in your app observable, or tracked, by Compose. The State type is immutable, so you can only read the value in it, while the MutableState type is mutable. You can use the mutableStateOf() function to create an observable MutableState. It receives an initial value as a parameter that is wrapped in a State object, which then makes its value observable.
7. A stateless composable is a composable ​​that doesn't store its own state. It displays whatever state it's given as input arguments.
8. "Stateless Composable" : When you extract state from a composable function, the resulting composable function is called stateless. That is, composable functions can be made stateless by extracting state from them. It doesn't have a state, meaning it doesn't hold, define, or modify a new state.
9. A "stateful composable" is a composable that owns a piece of state that can change over time.
10. "State hoisting" is a pattern of moving state to its caller to make a component stateless.
11. The Composition is a description of the UI built by Compose when it executes composables. Compose apps call composable functions to transform data into UI.
12. "State" in an app is any value that can change over time


## Automated Testing App:
1. Remember that automated tests are tests executed through software, as opposed to manual tests, which are carried out by a person who directly interacts with a device.
2. Automated tests are essential for ensuring the quality of your app, as they can run quickly andreliably, catching bugs and regressions early in the development process.
### Type of automated tests : 
1. **Local Tests**: Local tests are a type of automated test that directly test a small piece of code to ensure that it functions properly. With local tests, you can test functions, classes, and properties. Local tests are executed on your workstation, which means they run in a development environment.
2. **Instrumentation Tests** :  an instrumentation test is a UI test. Instrumentation tests let you test parts of an app that depend on the Android API, and its platform APIs and services. When you run an instrumentation test on Android, the test code is actually built into its own Android Application Package (APK) like a regular Android app. The test APK is installed on the device or emulator along with the regular app APK. The test APK then runs its tests against the app APK.