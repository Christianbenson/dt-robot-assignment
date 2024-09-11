This is my implementation of the robot assignment issued by Devoteam. The solution consists of a CLI application where a robot can be instructed to either walk forward, turn left or turn right.

## Usage 
In order to run the application, clone the repo and then navigate via the command line into the dt-robot-assignment folder.
While inside, run the application via: >gradlew run or >./gradlew run on mac.

The unit tests can similarly be run by using gradlew, but then instead use >gradlew test or >./gradlew test

## Improvements
As per instructed the project was implemented with a time-restriction of 4 hours, and therefore there are several things I would've liked to improve with the solution. Below are a few listed:
1. Validation for inputs - some is implemented, but there are cases (such as number of inputs) that aren't handled, which can be confusing for the user.
2. Futureproofing the code, currently the robots direction logic operates on a series of if-statements that would be terribly annoying to extend. Here I would suggest a vector-based approach where a map is stored containing the allowed directions + their directional vector  i.e. {N : (0,-1), E : (1,0)} etc
3. Readability cleanup - similarly to the last point the code is unnecessarily hard to follow, and could do with some cleanup such as adding helper classes and/or introducing static variables representing the potential directions of the robot as well as the inputs from the CLI.
4. Error handling is not very cleanly implemented at the moment. This is related to the earlier bullet on validation. An example of this would be when the user enters fewer than expected inputs, which would result in an exception being thrown. This exception however isnt presented very well to the user.
5. Other possible improvements could be allowing rooms to be connected and/or allowing more directions (such as having 45 degree turns instead of 90 degree turns), but for the solution to be extended to this the former bullets should probably be implemented first.

