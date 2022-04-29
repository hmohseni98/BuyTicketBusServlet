package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.base.BaseEntity;
import model.enumeration.City;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "trips")
@Entity
public class Trip extends BaseEntity<Integer> {
    @Column(name = "source")
    @Enumerated(EnumType.STRING)
    private City source;
    @Column(name = "destination")
    @Enumerated(EnumType.STRING)
    private City destination;
    @Column(name = "date")
    private Date date;
    @Column(name = "time")
    private Time time;
}
