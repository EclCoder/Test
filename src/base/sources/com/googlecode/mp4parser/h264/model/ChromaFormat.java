package com.googlecode.mp4parser.h264.model;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class ChromaFormat {
    public static ChromaFormat MONOCHROME = new ChromaFormat(0, 0, 0);
    public static ChromaFormat YUV_420 = new ChromaFormat(1, 2, 2);
    public static ChromaFormat YUV_422 = new ChromaFormat(2, 2, 1);
    public static ChromaFormat YUV_444 = new ChromaFormat(3, 1, 1);

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f22496id;
    private int subHeight;
    private int subWidth;

    public ChromaFormat(int i10, int i11, int i12) {
        this.f22496id = i10;
        this.subWidth = i11;
        this.subHeight = i12;
    }

    public static ChromaFormat fromId(int i10) {
        ChromaFormat chromaFormat = MONOCHROME;
        if (i10 == chromaFormat.f22496id) {
            return chromaFormat;
        }
        ChromaFormat chromaFormat2 = YUV_420;
        if (i10 == chromaFormat2.f22496id) {
            return chromaFormat2;
        }
        ChromaFormat chromaFormat3 = YUV_422;
        if (i10 == chromaFormat3.f22496id) {
            return chromaFormat3;
        }
        ChromaFormat chromaFormat4 = YUV_444;
        if (i10 == chromaFormat4.f22496id) {
            return chromaFormat4;
        }
        return null;
    }

    public int getId() {
        return this.f22496id;
    }

    public int getSubHeight() {
        return this.subHeight;
    }

    public int getSubWidth() {
        return this.subWidth;
    }

    public String toString() {
        return "ChromaFormat{\nid=" + this.f22496id + ",\n subWidth=" + this.subWidth + ",\n subHeight=" + this.subHeight + '}';
    }
}
