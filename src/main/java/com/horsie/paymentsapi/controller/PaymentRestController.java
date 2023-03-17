package com.horsie.paymentsapi.controller;

import com.horsie.paymentsapi.model.Payment;
import com.horsie.paymentsapi.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/payments")
public class PaymentRestController {
    @Autowired
    private PaymentRepository repository;

    @GetMapping("/")
    public List<Payment> allPayments(){
        return repository.findAll();
    }

    @GetMapping("/payment/{payer}")
    public List<Payment> findByPayer(@PathVariable("payer") String payer){
        return repository.findByPayer(payer);
    }

    @PostMapping("/payment")
    public Payment createPayment(@RequestBody Payment payment) {
        return repository.save(payment);
    }

    @PutMapping("/payment/{id}")
    public Payment updatePayment(@PathVariable int id ,@RequestBody Payment payment) {
        return repository.save(payment);
    }

    @DeleteMapping("/payment/{id}")
    public void deletePayment(@PathVariable("id") Long id) {
        repository.deleteById(id);
    }
}
