package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.Key;
import java.math.BigInteger;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoFileDetails extends GenericJson {

    @Key
    private List<VideoFileDetailsAudioStream> audioStreams;

    @JsonString
    @Key
    private BigInteger bitrateBps;

    @Key
    private String container;

    @Key
    private String creationTime;

    @JsonString
    @Key
    private BigInteger durationMs;

    @Key
    private String fileName;

    @JsonString
    @Key
    private BigInteger fileSize;

    @Key
    private String fileType;

    @Key
    private List<VideoFileDetailsVideoStream> videoStreams;

    public List<VideoFileDetailsAudioStream> getAudioStreams() {
        return this.audioStreams;
    }

    public BigInteger getBitrateBps() {
        return this.bitrateBps;
    }

    public String getContainer() {
        return this.container;
    }

    public String getCreationTime() {
        return this.creationTime;
    }

    public BigInteger getDurationMs() {
        return this.durationMs;
    }

    public String getFileName() {
        return this.fileName;
    }

    public BigInteger getFileSize() {
        return this.fileSize;
    }

    public String getFileType() {
        return this.fileType;
    }

    public List<VideoFileDetailsVideoStream> getVideoStreams() {
        return this.videoStreams;
    }

    public VideoFileDetails setAudioStreams(List<VideoFileDetailsAudioStream> list) {
        this.audioStreams = list;
        return this;
    }

    public VideoFileDetails setBitrateBps(BigInteger bigInteger) {
        this.bitrateBps = bigInteger;
        return this;
    }

    public VideoFileDetails setContainer(String str) {
        this.container = str;
        return this;
    }

    public VideoFileDetails setCreationTime(String str) {
        this.creationTime = str;
        return this;
    }

    public VideoFileDetails setDurationMs(BigInteger bigInteger) {
        this.durationMs = bigInteger;
        return this;
    }

    public VideoFileDetails setFileName(String str) {
        this.fileName = str;
        return this;
    }

    public VideoFileDetails setFileSize(BigInteger bigInteger) {
        this.fileSize = bigInteger;
        return this;
    }

    public VideoFileDetails setFileType(String str) {
        this.fileType = str;
        return this;
    }

    public VideoFileDetails setVideoStreams(List<VideoFileDetailsVideoStream> list) {
        this.videoStreams = list;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public VideoFileDetails set(String str, Object obj) {
        return (VideoFileDetails) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public VideoFileDetails clone() {
        return (VideoFileDetails) super.clone();
    }
}
