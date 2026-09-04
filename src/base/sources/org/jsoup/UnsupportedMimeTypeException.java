package org.jsoup;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class UnsupportedMimeTypeException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f49436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f49437b;

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + ". Mimetype=" + this.f49436a + ", URL=" + this.f49437b;
    }
}
