/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.codegeneration.java.macro;

public class MListElementDeclaration {

    private final String pListType;

    private final String pElementName;

    private final MListElementDeclaration mListElementDeclaration = this;

    MListElementDeclaration(
            String pListType,
            String pElementName) {

        if (pListType == null) {
            throw new NullPointerException();
        }
        this.pListType = pListType;
        if (pElementName == null) {
            throw new NullPointerException();
        }
        this.pElementName = pElementName;
    }

    String pListType() {

        return this.pListType;
    }

    String pElementName() {

        return this.pElementName;
    }

    private String rListType() {

        return this.mListElementDeclaration.pListType();
    }

    private String rElementName() {

        return this.mListElementDeclaration.pElementName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("  private final NodeList<N");
        sb.append(rListType());
        sb.append("> e");
        sb.append(rElementName());
        sb.append(";");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
