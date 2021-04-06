Assignment #9 Mattson

For this assignment you will create new programs to demonstrate your knowledge of Graphics, specifically with JFrame and JPanel.  You will create a non functioning checkerboard with pieces.   (use the following UML class diagram)

  checkerUML.PNG    

CheckerGUI

    Create your start program with a JFrame -- you can use some of the examples I have shown you throughout this week.  
    I would recommend setting a size to start so you have something to work with, but when you are finished, remove the setSize() and use pack().
    You should have an icon on the top left corner of your window.  Download an appropriate icon and include it in your files.
    You will get the size from the panel, but ultimately each square will be 100 x 100 so it will be somewhere around 800 x 800 until you use pack. You will lose points for not using the pack() method. 
    Build your 64 CheckerPanel objects here.  You can store them in Array if you wish but its not necessary since you won't need to interact with them.  This is up to you.  
    You must use a loop to build your 64 panels.  You cannot use 64 lines of code to build your panels.  When constructing your Checkerboard I recommend looking at a checkerboard and make the following observations:
        What are the dimensions
        Is the top left corner dark or light
        Are the checkers on the dark or light color
        What is the pattern of the board. light, dark, light, dark etc..
        Look carefully at the square on the end of each row vs. the square at the beginning of the next row.
    You may pick any colors you want for the board.  I used black and white, but you can be creative
    Extra Credit: Randomize the colors of your panels, so each time the program is run, you get different colors. In your submission state, "I want extra credit  points." 
    Change your LayoutManager to GridLayout
    I strongly recommend you build all 64 squares at once and test. Don't try building a row at a time, the layout doesn't like that
    Modulus can be your friend here if you use it properly for row changes
    Determine the color of the CheckerPanel here and pass it to the constructor
    My entire loop to add the panels was 8 lines of code (including curly braces) so it doesn't need to be complicated.  You can do this with as many lines as you need, as long as you use a loop
    Set all other properties appropriately.

CheckerPanel

    You must extend the JPanel class
    Your CheckerPanel should have a constructor that receives a color so you can set the panel's backColor. You can modify the constructor to receive whatever you need for your program -- A Color is the minimum.
    Your constructor must set the preferred size of each panel to 100 x 100.
    You will need to set your two images somewhere in your program -- the checkers
    You can use my images, or download and use your own.  I found 84 x 84 pixels works well. They must be positioned appropriately
    You should have a paintComponent() in your program. Use this to paint the images on top of the squares

Files

cream.png    PinkTransparent.png    

Methods Required

See UML

Analysis

The requirements were broken down above; here is a short list:

1) Create a basic CheckerPanel

2) Create the GUI and build the checkerboard

3) After you finish the board, go back to the CheckerPanel and work out the images

4) Refine and tune your program as needed

Sample Session: When you run the CheckerGUI class, your GUI output should look like something like this.

checkerBoardProgram.PNG  

 

Deliverable

For this assignment, you will need to zip all appropriate files for the project into one .zip file.  Your file name should be <lastnameAssignment09.zip> You will only submit your ZIP file. 

Documentation

Make sure that you use comments for  all assignments.  As a minimum you should have comments for Author, Date, and Notes. Put this above your code and above the class declaration.

Not applicable for this assignment. Name it Student.java

Attach the.zip file and submit the program through Canvas.

NOTE: Proper indentation, commenting, Java programming conventions, and general readability are an important part of programming that can set apart a good programmer from an excellent programmer. Part of your score on each assignment (approximately 10%) will be based on those readability elements.
