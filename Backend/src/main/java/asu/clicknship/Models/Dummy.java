package asu.clicknship.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dummy {
    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column
    private int x;

    @Column
    private String y;

    @Column
    private float z;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
}
