public class point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public point2D() {

    }

    public point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Float[] getXY() {
        return new Float[]{getX(), getY()};
    }

    @Override
    public String toString() {
        return "point2D{" +
                "x=" + getX() +
                ", y=" + getY() +
                '}';
    }
}
