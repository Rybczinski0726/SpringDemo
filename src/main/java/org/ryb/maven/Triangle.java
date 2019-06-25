package org.ryb.maven;

public class Triangle {

    private Point pointA;
    private Point pointB;
    private Point pointC;

    /**
     * @return the pointA
     */
    public Point getPointA() {
        return pointA;
    }

    /**
     * @return the pointB
     */
    public Point getPointB() {
        return pointB;
    }

    /**
     * @return the pointC
     */
    public Point getPointC() {
        return pointC;
    }

    /**
     * @param pointA the pointA to set
     */
    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    /**
     * @param pointB the pointB to set
     */
    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    /**
     * @param pointC the pointC to set
     */
    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw() {
        System.out.println("Point A: " + getPointA().getX() + "," + getPointA().getY());
        System.out.println("Point B: " + getPointB().getX() + "," + getPointB().getY());
        System.out.println("Point C: " + getPointC().getX() + "," + getPointC().getY());
    }

}