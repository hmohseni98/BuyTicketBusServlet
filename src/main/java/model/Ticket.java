package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.base.BaseEntity;
import model.enumeration.Gender;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "tickets")
@Entity
public class Ticket extends BaseEntity<Integer> {
    @ManyToOne
    @JoinColumn(name = "trip_id")
    private Trip trip;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;
}
