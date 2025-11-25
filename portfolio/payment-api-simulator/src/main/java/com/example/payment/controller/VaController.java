package com.example.payment.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.time.Instant;

@RestController
@RequestMapping("/api")
public class VaController {

    @GetMapping("/va/{vaNumber}")
    public ResponseEntity<Map<String, Object>> inquiry(@PathVariable String vaNumber) {
        if (vaNumber == null || vaNumber.isBlank()) {
            return ResponseEntity.badRequest().body(Map.of("code","99","message","Invalid VA"));
        }
        if (vaNumber.startsWith("999")) {
            return ResponseEntity.badRequest().body(Map.of("code","01","message","VA not found"));
        }
        return ResponseEntity.ok(Map.of(
                "code","00",
                "message","Success",
                "vaNumber", vaNumber,
                "accountName", "Customer Demo",
                "balance", 1500000,
                "timestamp", Instant.now().toString()
        ));
    }

    @PostMapping("/payment")
    public ResponseEntity<Map<String,Object>> payment(@RequestBody Map<String,Object> req) {
        // simulate simple validation & processing
        if (!req.containsKey("vaNumber") || !req.containsKey("amount")) {
            return ResponseEntity.badRequest().body(Map.of("code","99","message","Missing fields"));
        }
        return ResponseEntity.ok(Map.of("code","00","message","Payment accepted", "trxId", "TRX"+System.currentTimeMillis()));
    }
}