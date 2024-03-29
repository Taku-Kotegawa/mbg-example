package com.example.mbgexample.domain.model;

import java.io.Serializable;

/**
 * Database Table Remarks:
 *   複合主キー
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table complexkey_table
 */
public class ComplexkeyTableKey implements Serializable {
    /**
     * Database Column Remarks:
     *   ユーザid
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column complexkey_table.username
     *
     * @mbg.generated
     */
    private String username;

    /**
     * Database Column Remarks:
     *   ステータス
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column complexkey_table.status
     *
     * @mbg.generated
     */
    private String status;

    /**
     * Database Column Remarks:
     *   バージョン
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column complexkey_table.version
     *
     * @mbg.generated
     */
    private Long version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table complexkey_table
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column complexkey_table.username
     *
     * @return the value of complexkey_table.username
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column complexkey_table.username
     *
     * @param username the value for complexkey_table.username
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column complexkey_table.status
     *
     * @return the value of complexkey_table.status
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column complexkey_table.status
     *
     * @param status the value for complexkey_table.status
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column complexkey_table.version
     *
     * @return the value of complexkey_table.version
     *
     * @mbg.generated
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column complexkey_table.version
     *
     * @param version the value for complexkey_table.version
     *
     * @mbg.generated
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complexkey_table
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ComplexkeyTableKey other = (ComplexkeyTableKey) that;
        return (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complexkey_table
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complexkey_table
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", username=").append(username);
        sb.append(", status=").append(status);
        sb.append(", version=").append(version);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}