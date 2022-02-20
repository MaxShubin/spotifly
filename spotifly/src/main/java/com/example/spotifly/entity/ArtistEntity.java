package com.example.spotifly.entity;

import javax.persistence.*;

@Entity
@Table(name = "artist")
public class ArtistEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //автоинкрементный id
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "track_id")
    private TrackEntity track;

    public ArtistEntity() {
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

    public TrackEntity getTrack() {
        return track;
    }

    public void setTrack(TrackEntity track) {
        this.track = track;
    }
}
