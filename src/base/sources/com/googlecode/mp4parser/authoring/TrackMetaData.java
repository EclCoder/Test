package com.googlecode.mp4parser.authoring;

import com.googlecode.mp4parser.util.Matrix;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class TrackMetaData implements Cloneable {
    private double height;
    int layer;
    private long timescale;
    private float volume;
    private double width;
    private String language = "eng";
    private Date modificationTime = new Date();
    private Date creationTime = new Date();
    private Matrix matrix = Matrix.ROTATE_0;
    private long trackId = 1;
    private int group = 0;

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Date getCreationTime() {
        return this.creationTime;
    }

    public int getGroup() {
        return this.group;
    }

    public double getHeight() {
        return this.height;
    }

    public String getLanguage() {
        return this.language;
    }

    public int getLayer() {
        return this.layer;
    }

    public Matrix getMatrix() {
        return this.matrix;
    }

    public Date getModificationTime() {
        return this.modificationTime;
    }

    public long getTimescale() {
        return this.timescale;
    }

    public long getTrackId() {
        return this.trackId;
    }

    public float getVolume() {
        return this.volume;
    }

    public double getWidth() {
        return this.width;
    }

    public void setCreationTime(Date date) {
        this.creationTime = date;
    }

    public void setGroup(int i10) {
        this.group = i10;
    }

    public void setHeight(double d10) {
        this.height = d10;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setLayer(int i10) {
        this.layer = i10;
    }

    public void setMatrix(Matrix matrix) {
        this.matrix = matrix;
    }

    public void setModificationTime(Date date) {
        this.modificationTime = date;
    }

    public void setTimescale(long j10) {
        this.timescale = j10;
    }

    public void setTrackId(long j10) {
        this.trackId = j10;
    }

    public void setVolume(float f10) {
        this.volume = f10;
    }

    public void setWidth(double d10) {
        this.width = d10;
    }
}
