package com.example.batch.service;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

@Service
public class BatchService {

    private final ExecutorService executor = Executors.newFixedThreadPool(4);

    public List<String> processBatch(List<Integer> items) {
        var futures = items.stream()
                .map(i -> executor.submit(() -> {
                    // simulate processing
                    if (i % 7 == 0) throw new RuntimeException("simulated failure");
                    return "OK-" + i;
                })).collect(Collectors.toList());

        return futures.stream().map(f -> {
            try {
                return f.get();
            } catch (Exception e) {
                return "FAILED";
            }
        }).collect(Collectors.toList());
    }
}