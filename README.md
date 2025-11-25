👋 Hi, I'm M. Kharl Parizka Yudha
Senior Backend Engineer — Banking & Financial Systems

I specialize in backend development, high-volume transaction processing, microservices, and enterprise API engineering, with 6+ years of experience building mission-critical systems in the banking and port operations sectors.

My expertise includes developing secure and scalable backend services using Java 17, Spring Boot 3.x, and enterprise-grade databases such as Oracle and PostgreSQL.

🔥 Core Focus Areas

Backend Engineering (Java, Spring Boot, Microservices)

High-Volume Transaction Processing

API Engineering (Payment Systems, Corporate Banking, VA Systems)

Distributed Systems & Messaging (Kafka)

Regulatory Modules (SNAP, DJP)

Performance Engineering & Query Optimization

System Reliability, Logging & Error Handling

Database Design & SQL Tuning (Oracle, PostgreSQL)

🧩 Tech Stack
Languages & Frameworks

Java 17+, Spring Boot 3.x

Python (Utility scripts)

PHP (Legacy support)

Databases

Oracle, PostgreSQL, MySQL, MongoDB

Messaging & Integration

Apache Kafka

WebMethods

Internal enterprise ESB

Tools

Git, Jenkins, Docker

Postman, JMeter

Linux, CI/CD Pipelines

🚀 Highlighted Enterprise Projects (Simplified & anonymized)
1. Virtual Account Service (SNAP-compliant)

Tech: Java 17, Spring Boot, Oracle
Summary:
Developed inquiry & payment services for virtual accounts under national SNAP standard.
Impact:

Improved VA inquiry performance

Lowered timeout incidents during peak traffic

Strengthened validation & error handling layer

2. Corporate Disbursement Engine

Tech: Java, Spring Boot, Oracle
Summary:
Payment engine handling thousands of corporate payout transactions daily.
Impact:

Reduced processing latency

Improved throughput with optimized batching

3. DJP Freezing / Unfreezing Module

Tech: Java, Spring Boot
Summary:
Account lock/unlock module aligned with regulatory requirements.
Impact:

Increased compliance accuracy

Reduced manual intervention for Ops team

4. Bulk Virtual Account Lifecycle

Tech: Java, Spring Boot, Oracle
Summary:
Managed thousands of VA creation / update flows in batch mode.
Impact:

Higher stability in batch operations

Reduced error rates in VA lifecycle processes

5. Payroll & Internal Systems — Port Operations

Tech: Java, PHP, Oracle, MySQL
Summary:
Maintained payroll, payment, and reporting systems for port operations.
Impact:

Reduced manual errors

Improved system stability via refactoring

🧪 Sample Projects (Public & Safe)
1. Payment API Simulation (Dummy Microservice)

🔗 Repo: /payment-api-simulator
A minimal microservice that simulates VA inquiry, payment posting, and error responses.
Tech: Java 17, Spring Boot, H2
Features:

Mock inquiry endpoint

Simulated error codes

Configurable channel mapping

Docker-ready

2. Batch Processing Engine (Dummy)

🔗 Repo: /batch-processing-demo
Simulates high-volume batch transaction processing similar to corporate disbursement engines.
Tech: Spring Boot, PostgreSQL
Features:

Parallel processing

Retry & DLQ simulation

Query optimization samples

3. API Logging & Monitoring Layer

🔗 Repo: /api-observability-layer
Reusable module for structured logging, tracing, and error handling.
Tech: Spring Boot AOP
Features:

Request/response logging

Exception handler pattern

MDC tracing

📌 Sample Code Snippets (You can include these in repos)
Spring Boot – VA Inquiry Dummy
@GetMapping("/va/{vaNumber}")
public ResponseEntity<ApiResponse> inquiry(@PathVariable String vaNumber) {

    if (vaNumber.startsWith("999")) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(new ApiResponse("99", "Invalid VA", null));
    }

    VaData data = new VaData(vaNumber, "John Doe", 1500000L);
    return ResponseEntity.ok(new ApiResponse("00", "Success", data));
}

📫 Contact

Email: yudhafhariz@gmail.com

LinkedIn: linkedin.com/in/m-kharl-parizka-yudha

Location: Jakarta, Indonesia

⭐ If you'd like to collaborate or need backend help, feel free to reach out!
