import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(36, 175, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  //green ground  
  fill(44, 148, 33);
  rect(0, 400, 500, 100);
    
  drawHouse(100, 0, 300, 200);

  drawFlower(150, 400, 30);
  drawFlower(250, 463, 25);
  drawFlower(450, 467, 45);
  drawFlower(75, 425, 28);
  drawFlower(338, 400, 39);

  //orange sun  
  fill(247, 165, 0);
  ellipse(0, 0, 150, 150);

  }

public void drawHouse(float houseX, float houseY, float houseWidth, float houseHeight) {

  //red housing  
  fill(184, 48, 48);
  rect(houseX + 50, houseY + houseHeight, houseWidth - 100, houseHeight);

  //grey roof  
  fill(163, 163, 163);
  triangle(houseX, houseY + houseHeight, houseX + houseWidth / 2, houseY, houseX + houseWidth, houseY + houseHeight);

  //white door  
  fill(255);
  rect(houseX + 100, houseY + houseHeight + 100, 100, 100);

  //orange door handle  
  fill(247, 165, 0);
  ellipse(houseX + 185, houseY + houseHeight + 150, 15, 15);
  
  //light blue window
  fill(153, 219, 255);
  ellipse(houseX + 150, houseY + houseHeight - 75, 75, 75);

  //window line  
  fill(0);
  line(houseX + 150, houseY + houseHeight - 38, houseX + 150, houseY + houseHeight - 113);

  //window line 2  
  fill(0);
  line(houseX + houseHeight - 10, houseY + houseHeight - 75, houseX + houseHeight - 90, houseY + houseHeight - 75);
  
}

  void drawFlower(float flowerX, float flowerY, float petalSize) {
  float petalDistance = petalSize / 2;

  fill(176, 113, 227);

  // upper-left petal
  ellipse(flowerX - petalDistance, flowerY - petalDistance, 
    petalSize, petalSize);

  // upper-right petal
  ellipse(flowerX + petalDistance, flowerY - petalDistance, 
    petalSize, petalSize);

  // lower-left petal
  ellipse(flowerX - petalDistance, flowerY + petalDistance, 
    petalSize, petalSize);

  // lower-right petal
  ellipse(flowerX + petalDistance, flowerY + petalDistance, 
    petalSize, petalSize);

  // center petal
  fill(86, 227, 126);
  ellipse(flowerX, flowerY, 
    petalSize, petalSize);
}
  // define other methods down here.
}