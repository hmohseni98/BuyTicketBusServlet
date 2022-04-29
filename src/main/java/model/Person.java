package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "persons")
@Entity
public class Person extends BaseEntity<Integer> {
    @Column(name = "username" , nullable = false)
    private String username;
    @Column(name = "password" , nullable = false)
    private String password;
    @Column(name = "phone_number" , nullable = false)
    private String phoneNumber;
    @Column(name = "address" , nullable = false)
    private String address;
}

