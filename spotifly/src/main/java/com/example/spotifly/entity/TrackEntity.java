package com.example.spotifly.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "track")
public class TrackEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //автоинкрементный id
    private Long id;
    private String name;
    private String title;
    private String image;
    private Double length;

    @ManyToOne
    @JoinColumn(name = "album_id")
    private AlbumEntity album;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "track")
    private List<ArtistEntity> artists;

    public TrackEntity() {
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public AlbumEntity getAlbum() {
        return album;
    }

    public void setAlbum(AlbumEntity album) {
        this.album = album;
    }

    public List<ArtistEntity> getArtists() {
        return artists;
    }

    public void setArtists(List<ArtistEntity> artists) {
        this.artists = artists;
    }
}
