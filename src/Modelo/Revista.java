/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Time;

/**
 *
 * @author PC33-B5
 */
public class Revista {

    public Revista(int NumeroRev, String TituloRev, String AyoRev, String IssnRev, Float PrecioRev, Time HoraventaRev) {
        this.NumeroRev = NumeroRev;
        this.TituloRev = TituloRev;
        this.AyoRev = AyoRev;
        this.IssnRev = IssnRev;
        this.PrecioRev = PrecioRev;
        this.HoraventaRev = HoraventaRev;
    }

    public Revista(String TituloRev, String AyoRev, String IssnRev, Float PrecioRev, Time HoraventaRev) {
        this.TituloRev = TituloRev;
        this.AyoRev = AyoRev;
        this.IssnRev = IssnRev;
        this.PrecioRev = PrecioRev;
        this.HoraventaRev = HoraventaRev;
    }

    public int getNumeroRev() {
        return NumeroRev;
    }

    public void setNumeroRev(int NumeroRev) {
        this.NumeroRev = NumeroRev;
    }

    public String getTituloRev() {
        return TituloRev;
    }

    public void setTituloRev(String TituloRev) {
        this.TituloRev = TituloRev;
    }

    public String getAyoRev() {
        return AyoRev;
    }

    public void setAyoRev(String AyoRev) {
        this.AyoRev = AyoRev;
    }

    public String getIssnRev() {
        return IssnRev;
    }

    public void setIssnRev(String IssnRev) {
        this.IssnRev = IssnRev;
    }

    public Float getPrecioRev() {
        return PrecioRev;
    }

    public void setPrecioRev(Float PrecioRev) {
        this.PrecioRev = PrecioRev;
    }

    public Time getHoraventaRev() {
        return HoraventaRev;
    }

    public void setHoraventaRev(Time HoraventaRev) {
        this.HoraventaRev = HoraventaRev;
    }


    private int NumeroRev;
    private String TituloRev;
    private String AyoRev;
    private String IssnRev;
    private Float  PrecioRev;
    private Time HoraventaRev;
}
