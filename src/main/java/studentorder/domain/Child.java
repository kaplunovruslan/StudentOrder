package studentorder.domain;

import java.time.LocalDate;

public class Child extends Person{
    private String certificate;
    private LocalDate issueDate;
    private String issueDepartment;

    public String getCertificate() {
        return certificate;
    }
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }
    public LocalDate getIssueDate() {
        return issueDate;
    }
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }
    public String getIssueDepartment() {
        return issueDepartment;
    }
    public void setIssueDepartment(String issueDepartment) {
        this.issueDepartment = issueDepartment;
    }
}
