package com.payment.paymentservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "PAYMENT_TBL")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Payment {
    @Id
    @GeneratedValue
private int paymentId;
private String paymentStatus;
private String transactionId;
}
