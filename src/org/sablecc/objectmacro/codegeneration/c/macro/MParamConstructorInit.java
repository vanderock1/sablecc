/* This file was generated by SableCC's ObjectMacro. */

package org.sablecc.objectmacro.codegeneration.c.macro;

public class MParamConstructorInit {

    private final String pPname;

    private final MParamConstructorInit mParamConstructorInit = this;

    private final MFile mFile;

    MParamConstructorInit(
            String pPname,
            MFile mFile) {

        if (pPname == null) {
            throw new NullPointerException();
        }
        this.pPname = pPname;
        if (mFile == null) {
            throw new NullPointerException();
        }
        this.mFile = mFile;
    }

    String pPname() {

        return this.pPname;
    }

    private String rName() {

        return this.mFile.pName();
    }

    private String rPname() {

        return this.mParamConstructorInit.pPname();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("  m");
        sb.append(rName());
        sb.append("->_p");
        sb.append(rPname());
        sb.append("_ = _p");
        sb.append(rPname());
        sb.append("_;");
        sb.append(System.getProperty("line.separator"));
        return sb.toString();
    }

}