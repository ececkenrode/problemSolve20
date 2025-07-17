import java.awt.Color;

/**
 * This class describes a circle with a given radius and color.
 * This is my private solution to Problem solve 19
 *
 * @author Ethan Eckenode
 * @version July/15/2025
 */

public class Circle {
    // private instance variable, not accessible from outside this class
    private double radius;
    private Color color;
    private double area;

    /*
     * summary: default constructor
     * 
     * @param:null
     * 
     * @return:void
     */

    public Circle() {
        radius = 1.0;
        this.color = new Color(255, 119, 65);
    }

    /*
     * Summary: 2nd construtor
     * 
     * @param: double
     * 
     * @return:void
     */
    public Circle(double r, Color clr) {
        radius = r;
        color = clr;
    }

    /*
     * Summary: radius get method
     * 
     * @param: double
     * 
     * @return:radious
     */
    public double getRadius() {
        return radius;
    }

    /*
     * Summary: color get method
     * 
     * @param: double
     * 
     * @return:color
     */ public Color getColor() {
        return color;
    }

    /*
     * Summary: get area method
     * 
     * @param: double
     * 
     * @return:area
     */ public double getArea() {
        calculateArea();
        return area;
    }

    /*
     * Summary: calculates area
     * 
     * @param: null
     * 
     * @return:void
     */ private void calculateArea() {
        area = radius * radius * Math.PI;
    }
}
