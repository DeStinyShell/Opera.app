package my.projects.spring.model;

import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Data;

@Data
@Entity(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    private List<Ticket> tickets;
    private LocalDateTime orderTime;
    @ManyToOne
    private User user;

    public Order() {
    }

    public Order(List<Ticket> tickets, LocalDateTime orderTime, User user) {
        this.tickets = tickets;
        this.orderTime = orderTime;
        this.user = user;
    }
}
