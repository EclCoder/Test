package com.google.android.exoplayer2.drm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class UnsupportedDrmException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16842a;

    public UnsupportedDrmException(int i10) {
        this.f16842a = i10;
    }

    public UnsupportedDrmException(int i10, Exception exc) {
        super(exc);
        this.f16842a = i10;
    }
}
