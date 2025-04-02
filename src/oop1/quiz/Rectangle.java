package oop1.quiz;

/**
 * Rectangle
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-02
 * @version 1.0
 */
public class Rectangle {

	int width;
	int height;

	int calculateArea() {
		return width * height;
	}

	int calculatePerimeter() {
		return 2 * (width + height);
	}

	boolean isSquare() {
		return this.width == this.height;
	}
}