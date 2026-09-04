package com.google.android.exoplayer2.source;

import android.net.Uri;
import java.util.Map;
import p9.s1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface t {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        t a(s1 s1Var);
    }

    void a();

    long b();

    void c(nb.h hVar, Uri uri, Map map, long j10, long j11, u9.m mVar);

    int d(u9.y yVar);

    void release();

    void seek(long j10, long j11);
}
