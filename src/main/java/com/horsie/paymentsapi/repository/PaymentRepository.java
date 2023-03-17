package com.horsie.paymentsapi.repository;

import java.util.List;
import com.horsie.paymentsapi.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{
    List<Payment> findByPayer(@Param("payer") String payer);


}
