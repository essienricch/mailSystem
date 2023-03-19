package api.email_system.data.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Outbox {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long outboxId;
    @OneToOne(fetch = FetchType.EAGER)
    private Mail mails;

    private EmailStatus mailStatus;
}
