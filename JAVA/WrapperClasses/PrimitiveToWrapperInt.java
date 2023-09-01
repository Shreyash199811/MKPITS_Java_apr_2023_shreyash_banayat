public class PrimitiveToWrapperInt {
    public int firstValue=56438990;
    public int secondValue=56438999;

    Integer obj=Integer.valueOf(firstValue);      //explicitly making object of primitive variable

    public Integer getFirstValueFromPrimitive(){
        return Integer.valueOf(firstValue);
    }

    public Integer getFirstValueFromExplicitPrimitive1(){
        return Integer.valueOf(obj);
    }

    public String getBinaryFromInt(){
        return Integer.toBinaryString(firstValue);
    }

    public String getHexStringFromIntPrimitive(){
        return  Integer.toHexString(firstValue);
    }

    public String getOctalFromInt(){
        return Integer.toOctalString(firstValue);
    }

    public int CompareInt(){
        return Integer.compare(firstValue,secondValue);
    }
    
    public int maxOfTwoInt(){
        return Integer.max(firstValue,secondValue);
    }
    public int parseIntOfInteger(){
        return Integer.parseInt(getBinaryFromInt());
    }

    public int intBitCount(){
        return Integer.bitCount(secondValue);
    }

    public int intReverse(){
        return Integer.reverse(secondValue);
    }

    public int getIntHashCode(){
        return Integer.hashCode(firstValue);
    }


    


    
}
