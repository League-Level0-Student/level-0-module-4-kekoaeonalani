package _02_boolean._5_googly_eyes;

import processing.core.PApplet;
import processing.core.PImage;



/*
 * Goal: Put googly eyes on a face!
 * 
 * Instructions:
 * 1. Find an image on the Internet and drop it into the /images folder at the
 *    top level of this module. It can be anything as long as it has large eyes!
 * 
 * 2. Declare a variable for the image:
 *    PImage face;
 * 
 * 3. In your setup() method, import your image using the following code:
 *    frog = loadImage("frog.jpg");
 * 
 * 4. Resize your face image to the size of the window using the resize() method.
 * 4.5. in draw method
 * 5. In the draw() method, place a white ellipse over the left eye of your image.
      HINT: To find out where to put it, add code to print the mouseX and
      mouseY where you click the mouse.
      

       
      156,206 (left)
       670,201 (right)
      
      
      
      
 
  6. Now add a pupil (the black part) to the left eye.
 * 
 * 7. Use mouseX and mouseY to move the left pupil where the mouse moves.
 * 
 * 8. Repeat the same steps for the right eye.
 * 
 * 9. Add a right pupil and make it move by using
 *    mouseX + [distance from left eye] and mouseY + [distance from left eye].
 * 
 * 10.Here’s the tricky part: stop the pupils from going outside of the white
 *    circles! To do this, imagine a rectangle that the pupil should stay
 *    within. When mouseX and mouseY goes outside of these bounds, set it back
 *    to the boundary. Put this code before you draw the pupils.
 */

/// left eye boundaries
///
///
///
///
///right eye boundaries
///
///
///
public class GooglyEyes extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    
    PImage face;
    int x;  
    int y;
    
    
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }
    
    @Override
    public void setup() {
    	face = loadImage("frog.jpeg");
    	face.resize(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
background(face);
if (mousePressed) {
	System.out.println(mouseX +" , "+ mouseY);
}
fill(255,255,255);
/// left eye white
ellipse(156,206, 150,300);
///right eye white
ellipse(665,201, 150,300);
///left eye pupil

x = mouseX;
y = mouseY;

if (x > 182) {
	x = 182;
}
if (x< 132) {
	x = 132;
}

if (y> 306) {
	y = 306;
}
if (y < 104) {
	y = 104;
}
fill(0,0,0);
ellipse(x,y, 100,100);
///right eye pupil
ellipse(x + 509, y, 100,100);








    }

    static public void main(String[] args) {
        PApplet.main(GooglyEyes.class.getName());
    }
}
