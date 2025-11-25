# payment-api-simulator

Minimal Spring Boot microservice that simulates Virtual Account (VA) inquiry and payment endpoints.
Tech: Java 17, Spring Boot (skeleton), H2 (embedded) for demo.

Endpoints:
- GET /api/va/{vaNumber}  -> inquiry
- POST /api/payment       -> payment (simulated)