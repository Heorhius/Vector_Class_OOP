public class Main {

    public static final String VECTOR_LENGTH = "Vector's length is ";
    public static final String SCALAR_VECTOR_PRODUCTS = "Scalar vector products is ";
    public static final String VECTORS_MULTIPLY = "Vectors multiply is ";
    public static final String VECTORS_DIFFERENCE = "Vectors difference is ";
    public static final String VECTORS_SUM = "Vectors sum is ";

    public static void main(String[] args) {
        Vector[] vectors = Vector.getGeneratedVectors(9);
        for(Vector entity : vectors) {
            System.out.println(entity);
        }

        System.out.println(VECTOR_LENGTH + vectors[0].getVectorLength());

        System.out.println(SCALAR_VECTOR_PRODUCTS + vectors[1].getScalarVectorsProducts(vectors[2]));

        System.out.println(VECTORS_MULTIPLY + vectors[3].getVectorsMultiply(vectors[4]));

        System.out.println(VECTORS_DIFFERENCE + vectors[5].getVectorsDifference(vectors[6]));

        System.out.println(VECTORS_SUM + vectors[7].getVectorsSum(vectors[8]));
    }
}
