/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.errormessage;

public class MUnusedTextBlock {

    private final String pName;

    private final String pLine;

    private final String pChar;

    private final MUnusedTextBlock mUnusedTextBlock = this;

    public MUnusedTextBlock(
            String pName,
            String pLine,
            String pChar) {

        if (pName == null) {
            throw new NullPointerException();
        }
        this.pName = pName;
        if (pLine == null) {
            throw new NullPointerException();
        }
        this.pLine = pLine;
        if (pChar == null) {
            throw new NullPointerException();
        }
        this.pChar = pChar;
    }

    String pName() {

        return this.pName;
    }

    String pLine() {

        return this.pLine;
    }

    String pChar() {

        return this.pChar;
    }

    private String rLine() {

        return this.mUnusedTextBlock.pLine();
    }

    private String rChar() {

        return this.mUnusedTextBlock.pChar();
    }

    private String rName() {

        return this.mUnusedTextBlock.pName();
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
        sb.append("The \"");
        sb.append(rName());
        sb.append("\" text block is not useful.");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}
