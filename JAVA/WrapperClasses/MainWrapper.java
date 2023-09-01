public class MainWrapper {
    public static void main(String[] args) {
        PrimitiveToWrapperInt primitiveToWrapperInt=new PrimitiveToWrapperInt();

        System.out.println("The Primitive integer is "+primitiveToWrapperInt.getFirstValueFromPrimitive());
        System.out.println("The bit value is "+primitiveToWrapperInt.getBinaryFromInt());
        System.out.println("The Primitive of explicitly "+primitiveToWrapperInt.getFirstValueFromExplicitPrimitive1());
        System.out.println("Hex String of primitive is "+primitiveToWrapperInt.getHexStringFromIntPrimitive());
        System.out.println("Octal of Primitive is "+primitiveToWrapperInt.getOctalFromInt());
        System.out.println("Compare int values="+primitiveToWrapperInt.CompareInt());//1 for not equal, 0 for equal,-1 for arg2>arg1
        System.out.println("Maximum of two integer values is "+primitiveToWrapperInt.maxOfTwoInt());
//        System.out.println("ParseInt method gives="+primitiveToWrapperInt.parseIntOfInteger());
        System.out.println("The bit value is "+primitiveToWrapperInt.getBinaryFromInt());
        System.out.println("Bit Count of secondValue ="+primitiveToWrapperInt.intBitCount());
//        System.out.println("Reverse of first value="+primitiveToWrapperInt.intReverse());//error
        System.out.println("HashCode of firstValue="+primitiveToWrapperInt.getIntHashCode());
    }
}
