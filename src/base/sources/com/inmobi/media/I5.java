package com.inmobi.media;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class I5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f24983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public H5 f24985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L5 f24986e;

    public I5(L5 l10, String str) {
        this.f24986e = l10;
        this.f24982a = str;
        this.f24983b = new long[l10.f25183h];
    }

    public final File a(int i10) {
        return new File(this.f24986e.f25177b, this.f24982a + "." + i10);
    }

    public final File b(int i10) {
        return new File(this.f24986e.f25177b, this.f24982a + "." + i10 + ".tmp");
    }
}
