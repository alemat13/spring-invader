package fr.olivex.invader.restservice;

import java.util.List;

public class Invader {
    private Long id;
    private String name;
    private City city;
    private Byte status;
    private Byte points;
    private String location;
    private String gMapsUrl;
    private Double latitude;
    private Double longitude;
    private List<User> flashedBy;
    public Invader(String name) {
        this.name = name;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public City getCity() {
        return city;
    }
    public void setCity(City city) {
        this.city = city;
    }
    public Byte getStatus() {
        return status;
    }
    public void setStatus(Byte status) {
        this.status = status;
    }
    public Byte getPoints() {
        return points;
    }
    public void setPoints(Byte points) {
        this.points = points;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getgMapsUrl() {
        return gMapsUrl;
    }
    public void setgMapsUrl(String gMapsUrl) {
        this.gMapsUrl = gMapsUrl;
    }
    public Double getLatitude() {
        return latitude;
    }
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
    public Double getLongitude() {
        return longitude;
    }
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
    public List<User> getFlashedBy() {
        return flashedBy;
    }
    public void setFlashedBy(List<User> flashedBy) {
        this.flashedBy = flashedBy;
    }
}
