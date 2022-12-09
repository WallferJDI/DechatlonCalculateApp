# Dechatlon 
### Completed task code. The assignment can be read below.
#### INPUT 
A CSV file contains the raw results of the competition (see ‘results.csv’ file in attachment).

#### OUTPUT
An XML with calculation results should be sent to an standard output stream. It should contain all the athletes in ascending order of their places. Athletes should have all the result data from the CSV file plus calculated total score and the place in the competition. In case of equal scores, athletes must share the places, e.g. 3-4 and 3-4 instead of 3 and 4.
The rules for the point calculation can be found here: http://en.wikipedia.org/wiki/Decathlon (see formulas at the end of the page).

#### TECHNICAL REQUIREMENTS

* JDK 1.8 should be used
* The program should not use any external libraries in addition to the Java standard API
* The tests can use external libraries (Junit, Mockito, etc)
* Your project should be build using Maven
