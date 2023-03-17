package com.horsie.paymentsapi.model;

import java.sql.Timestamp;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="payments")
@EntityListeners(AuditingEntityListener.class)
public class Payment {

    public Payment() {}
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="payer")
    private String payer;
    @Column(name="concept")
    private String concept;
    @Column(name="referenc")
    private String referenc;
    @Column(name="mont")
    private int mont;
    @Column(name="created")
    @CreatedDate
    private Timestamp created;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public String getReferenc() {
        return referenc;
    }

    public void setReferenc(String referenc) {
        this.referenc = referenc;
    }

    public int getMont() {
        return mont;
    }

    public void setMont(int mont) {
        this.mont = mont;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "Payment [id=" + id + ", user=" + payer + ", mont=" + mont + ", createdAt=" + created + "]";
    }

}