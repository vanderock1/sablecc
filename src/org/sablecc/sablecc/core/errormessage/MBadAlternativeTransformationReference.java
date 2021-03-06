/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.sablecc.core.errormessage;

public class MBadAlternativeTransformationReference {

    private final String pReferenceText;

    private final String pProdName;

    private final String pLine;

    private final String pChar;

    private final MBadAlternativeTransformationReference mBadAlternativeTransformationReference = this;

    public MBadAlternativeTransformationReference(
            String pReferenceText,
            String pProdName,
            String pLine,
            String pChar) {

        if (pReferenceText == null) {
            throw new NullPointerException();
        }
        this.pReferenceText = pReferenceText;
        if (pProdName == null) {
            throw new NullPointerException();
        }
        this.pProdName = pProdName;
        if (pLine == null) {
            throw new NullPointerException();
        }
        this.pLine = pLine;
        if (pChar == null) {
            throw new NullPointerException();
        }
        this.pChar = pChar;
    }

    String pReferenceText() {

        return this.pReferenceText;
    }

    String pProdName() {

        return this.pProdName;
    }

    String pLine() {

        return this.pLine;
    }

    String pChar() {

        return this.pChar;
    }

    private String rLine() {

        return this.mBadAlternativeTransformationReference.pLine();
    }

    private String rChar() {

        return this.mBadAlternativeTransformationReference.pChar();
    }

    private String rReferenceText() {

        return this.mBadAlternativeTransformationReference.pReferenceText();
    }

    private String rProdName() {

        return this.mBadAlternativeTransformationReference.pProdName();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(new MSemanticErrorHead().toString());
        sb.append(System.getProperty("line.separator"));
        sb.append("Line: ");
        sb.append(rLine());
        sb.append(System.getProperty("line.separator"));
        sb.append("Char: ");
        sb.append(rChar());
        sb.append(System.getProperty("line.separator"));
        sb.append("\"");
        sb.append(rReferenceText());
        sb.append("\" refers ton an element of the production transformation of \"");
        sb.append(rProdName());
        sb.append("\".");
        sb.append(System.getProperty("line.separator"));
        sb.append("But this transformation is not defined. You can use those 2 syntax :");
        sb.append(System.getProperty("line.separator"));
        sb.append("        [production].[element] refers to an element of the production transformation.");
        sb.append(System.getProperty("line.separator"));
        sb.append("        [element] refers to an element of the parser production.");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
