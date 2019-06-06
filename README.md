# Java Random Quotes

## Description
- In this application. The function will take in a file path of JSON data and convert it into Java through GSON. The application has a random function designed to present to the user a random quote.

## API
- ```randomQuote(String path)```
  - will take in a path and convert the JSON data through GSON into JAVA compatiable data and then run that data through a class constructor and call ```randomNumber(User[] arr)``` to determine what quote to present to a user. 
- ```randomNumber(User[] arr)```
  - generates a random number between 1 and the length of the User array. 

## Directions
- open application
- run the App.java
- should return a random quote in the text box