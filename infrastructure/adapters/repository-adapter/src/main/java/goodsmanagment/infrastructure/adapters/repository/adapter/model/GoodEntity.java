package goodsmanagment.infrastructure.adapters.repository.adapter.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "goods")
public class GoodEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false, unique = true, updatable = false)
  private UUID uuid;

  private String name;
  private String description;
  private String barcode;
  private BigDecimal price;

  // Getters and setters
}
