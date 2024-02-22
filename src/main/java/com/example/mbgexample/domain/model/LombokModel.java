package com.example.mbgexample.domain.model;

import java.io.Serializable;

public class LombokModel implements Serializable {

    String field1;

    public LombokModel() {
    }

    public String toString() {
        return "LombokModel(field1=" + this.field1 + ")";
    }

    public String getField1() {
        return this.field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LombokModel)) return false;
        final LombokModel other = (LombokModel) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$field1 = this.getField1();
        final Object other$field1 = other.getField1();
        if (this$field1 == null ? other$field1 != null : !this$field1.equals(other$field1)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LombokModel;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $field1 = this.getField1();
        result = result * PRIME + ($field1 == null ? 43 : $field1.hashCode());
        return result;
    }
}
