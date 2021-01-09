public class Vector {

    private int xPoint;
    private int yPoint;
    private int zPoint;

    public Vector() {
    }

    public Vector(int x, int y, int z) {
        xPoint = x;
        yPoint = y;
        zPoint = z;
    }

    public double getVectorLength() {
        return Math.sqrt(Math.pow(xPoint,2) + Math.pow(yPoint,2) + Math.pow(zPoint,2));
    }

    public int getScalarVectorsProducts(Vector vector) {
        return this.xPoint * vector.xPoint + this.yPoint * vector.yPoint + this.zPoint * vector.zPoint;
    }

    public Vector getVectorsMultiply(Vector vector) {
        Vector newVector = new Vector();
        newVector.setXPoint(this.yPoint * vector.zPoint - this.zPoint * vector.yPoint);
        newVector.setYPoint(this.zPoint * vector.xPoint - this.xPoint * vector.zPoint);
        newVector.setZPoint(this.xPoint * vector.yPoint - this.yPoint * vector.xPoint);

        return newVector;
    }

    public Vector getVectorsDifference(Vector vector) {
        Vector newVector = new Vector();
        newVector.setXPoint(this.xPoint - vector.xPoint);
        newVector.setYPoint(this.yPoint - vector.yPoint);
        newVector.setZPoint(this.zPoint - vector.zPoint);

        return newVector;
    }

    public Vector getVectorsSum(Vector vector) {
        Vector newVector = new Vector();
        newVector.setXPoint(this.xPoint + vector.xPoint);
        newVector.setYPoint(this.yPoint + vector.yPoint);
        newVector.setZPoint(this.zPoint + vector.zPoint);

        return newVector;
    }

    public static Vector[] getGeneratedVectors(int quantity) {
        Vector[] vectors = new Vector[quantity];
        for(int i = 0; i < vectors.length; i++) {
            vectors[i] = new Vector();
            vectors[i].setXPoint((int) (Math.random() * 10));
            vectors[i].setYPoint((int) (Math.random() * 10));
            vectors[i].setZPoint((int) (Math.random() * 10));
        }
        return vectors;
    }

    public int getXPoint() {
        return xPoint;
    }

    public void setXPoint(int xPoint) {
        this.xPoint = xPoint;
    }

    public int getYPoint() {
        return yPoint;
    }

    public void setYPoint(int yPoint) {
        this.yPoint = yPoint;
    }

    public int getZPoint() {
        return zPoint;
    }

    public void setZPoint(int zPoint) {
        this.zPoint = zPoint;
    }

    @Override
    public String toString() {
        return "Vector: " + "xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint;
    }
}
