1.Use of Scanner:
To take input from the user (get the not from the console).
2.fileName="notes.txt":
A file is created to store the notes.
3.FileWriter(append mode):
FileWriter is used with true to avoid old notes. It adds new notes at tthe end of the file (append mode).
4.Try-with-rersources:
FileWriter and BufferedReader are used inside the  try block to auto-close the files-prevents memory leaks.
5.writer.write(note+"\n):
writes the user's note to the file with a new line.
6. User of BufferedReader:
Used for efficiently reading the file line by line.
7. while((line=reader.readLine()) !=null):
 Loops trough and prints each line until no more lines are found in the file.
 8.catch(IOException e):
 Handles any errors that occur while writing or reading the file(checked exception).
