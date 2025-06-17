package brocode;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double calculateArea(){
        return width * height;

    }

    public double calculatePerimeter(){
        return 2 * (width + height);
    }

    public double getWidth(){
        return  width;
    }

    public double getHeight(){
        return height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
    }


    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(20,20);
        System.out.println(myRectangle.getHeight());
        System.out.println(myRectangle.calculateArea());
        myRectangle.setWidth(200);
        System.out.println(myRectangle.calculateArea());
    }


}
