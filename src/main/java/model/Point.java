package model;

import jakarta.validation.constraints.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "dots")
public class Point implements Serializable {

    //    @GenericGenerator(name="seq" , strategy="increment")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "x")
    @NotNull
    private Double x;

    @Column(name = "y")
    @NotNull
    private Double y;

    @Column(name = "r")
    @NotNull
    private Double r;

    @NotNull
    @Column(name = "status")
    private boolean status;

    public Point() {

    }

    public Point(Double x, Double y, Double r, boolean status) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        double a = 0.5;
        double x = this.x / r * 3.46;
        double y = this.y / r * 3.46;
        this.status = (Math.pow(x, 2) / (49 * Math.pow(a, 2)) + Math.pow(y, 2) / (9 * Math.pow(a, 2)) - 1 <= 0 && Math.abs(x / a) >= 4 && -(3 * Math.sqrt(33)) / 7 <= y / a && y / a <= 0 || Math.abs(x / a) >= 3 && y >= 0 || -3 <= y / a && y / a <= 0 && -4 <= x / a && x / a <= 4 && -((3 * Math.sqrt(33) - 7) * Math.pow(x, 2)) / (112 * Math.pow(a, 2)) + Math.abs(x / a) / 2 + Math.sqrt(1 - Math.pow(Math.abs(Math.abs(x / a) - 2) - 1, 2)) - y / a - 3 <= 0 || y >= 0 && 0.75 <= Math.abs(x / a) && Math.abs(x / a) <= 1 && -8 * Math.abs(x / a) - y / a + 9 >= 0 || 0.5 <= Math.abs(x / a) && Math.abs(x / a) <= 0.75 && 3 * Math.abs(x / a) - y / a + 0.75 >= 0 && y >= 0 || Math.abs(x / a) <= 0.5 && y >= 0 && 2.25 - y / a >= 0 || 1 <= Math.abs(x / a) && Math.abs(x / a) <= 3 && y >= 0 && -Math.abs(x / a) / 2 - 0.428 * Math.sqrt(10) * Math.sqrt(4 - Math.pow(Math.abs(x / a) - 1, 2)) - y / a + (6 * Math.sqrt(10)) / 7 + 1.5 >= 0) && Math.pow(x, 2) / a*a/4 + Math.pow(y, 2) / a*a < 3;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getR() {
        return r;
    }

    public void setR(Double r) {
        this.r = r;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}