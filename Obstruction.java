/**
 * Obstruction
 * Represents an unpassable block.
 */
abstract class Obstruction {
  
  //Coordinates of this obstruction
  private int x;
  private int y;
  
  /**
   * Creates an obstruction with a position of (0,0)
   * This constructor should not be used.
   */
  Obstruction() {
    this.x = 0; 
    this.y = 0;
  }
  
  /**
   * Creates an obstruction with the specified coordinates.
   * @param setX The X-position of the obstruction.
   * @param setY The Y-position of the obstruction.
   */
  Obstruction(int setX, int setY) {
    this.x = setX;
    this.y = setY;
  }
  
  /**
   * getX
   * This method returns the X-position of this obstruction.
   * @return The integer value of this obstruction's X-position.
   */
  int getX() {
    return this.x;
  }
  
  /**
   * setX
   * This method sets the X-position of this obstruction.
   * @param The integer value that this obstruction's X-position should be set to.
   */
  void setX(int newX) {
    this.x = newX;
  }
  
  /**
   * getY
   * This method returns the Y-position of this obstruction.
   * @return The integer value of this obstruction's Y-position.
   */
  int getY() {
    return this.y;
  }
  
  /**
   * setX
   * This method sets the Y-position of this obstruction.
   * @param The integer value that this obstruction's Y-position should be set to.
   */
  void setY(int newY) {
    this.y = newY;
  }
}