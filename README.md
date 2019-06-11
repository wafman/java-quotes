# Java Random Quotes

## Description
- In this application. The function will take in a file path of JSON data and convert it into Java through GSON. The application has a random function designed to present to the user a random quote.

## API
- ```randomQuoteFile()```
  - will take in a path and convert the JSON data through GSON into JAVA compatiable data and then run that data through a class constructor and call ```randomNumber(User[] arr)``` to determine what quote to present to a user. 
- ```randomNumber(User[] arr)```
  - generates a random number between 1 and the length of the User array. 
- ```readFile(User user)```
  - takes the user generated from ```randomQuote()``` and reads the json file in resources, turning each quote into an object and adding that object to the array list which it returns.
- ```writeFile(ArrayList<User> arr)```
  - accepts an arrayList and overwrites the json file in resources while looping through the arrayList so the new quote from the api can be included in the json file.
- ```randomQuote()```
  - api call to game of thrones api (https://github.com/wsizoo/game-of-thrones-quotes) will return a random quote from a random character.

## Directions
- from IntelliJ
  - open application
  - run the App.java
  - should return a random quote in the text box
- from Command Line
  - ```./gradlew run```