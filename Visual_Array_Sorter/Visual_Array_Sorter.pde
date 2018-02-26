//1. create int variables for the width and height

//2. create an array of ints that contain the same
//   number of ints as the size of your width variable
int[] arrayOfInts = new int[400];
void setup(){
 //3.set the size of your window
size(400,400); 
 //4. initialize the int array with random numbers
 //   from 0 to your height variable
 for(int i = 0; i < width; i++) {
   arrayOfInts[i] = (int)random(height);
 }  

 //5. call the noStroke() method
noStroke();
}

void draw(){
 //6. set the background color with background(r, g, b);
 background(100,60,300);
 //7. set the color for your graph
fill(200,300,2);
 //8. draw a rectangle for each int in your array.
 
 //   the x value will be the element of the int
 //   the y value will be your height variable
 //   the width is 1
 //   the height is negative the value of the int at that element in the array

for(int i = 0; i < arrayOfInts.length; i++) {
   rect(i,height,1,-arrayOfInts[i]);
 }
 
 //9. go through the array and swap any two values that are out of order
 //   Do a search for bubble sort for better clarification
 int temp = 0;
 for(int i = 0; i < arrayOfInts.length-1; i++) { 
     if(arrayOfInts[i+1] < arrayOfInts[i]) {
        temp = arrayOfInts[i+1];
        arrayOfInts[i+1] = arrayOfInts[i];
        arrayOfInts[i] = temp;
     }
   
 }  
 
 //10. reset the values of the array to a new random value
 //      whenever the mouse is clicked

 //11. try using different sorting algorithms the see which ones are the fastest.

}

void mouseClicked(){
   System.out.println("worked");
    for(int i = 0; i < width; i++) {
   arrayOfInts[i] = (int)random(height);
 }  
 } 