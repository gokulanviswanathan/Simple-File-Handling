# Simple-File-Handling

## Objective

Repository to demonstrate simple file handling in Spring Boot Application

## Why do we need to handle files

Reason is very simple. Normally, webserver handles the files present in it and renders into the web browser with a 
default content/MIME type as 'text/html'

When it comes to a file of different extension type (say xlsx/docx/jpg/png) then, we need to set the content-type manually. So that file can be made available to download in any supported modern/legacy web browsers.

For Demo purpose, we are using "Expenses.xlsx" file and setting it's content-type as 'application/vnd.ms-excel' in [FileHandleController.java](https://github.com/gokulanviswanathan/Simple-File-Handling/blob/master/src/main/java/com/filehandle/controller/FileHandleController.java)

## Note

Please make sure the file [Expenses.xlsx](https://github.com/gokulanviswanathan/Simple-File-Handling/blob/master/Expenses.xlsx) present in a directory "/expenses" of Local machine

After running the project as Spring Boot application, please hit the following URL in web browser
http://localhost:8080/fileHandler/getFile?source=Expenses.xlsx

## Contact

Having queries in setting up this project? - No worries. Please contact project maintainer [Gokulan Viswanathan](mailto:gokulan90@yahoo.com?subject=[GitHub]%20Source%20Spring%20Boot%20FileHandling)
