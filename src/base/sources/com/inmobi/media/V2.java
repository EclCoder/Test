package com.inmobi.media;

import java.util.Map;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class V2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f25871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f25872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f25873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f25875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f25876h;

    public V2(int i10, String url, Map map, boolean z10, boolean z11, int i11, long j10, long j11) {
        kotlin.jvm.internal.s.h(url, "url");
        this.f25869a = i10;
        this.f25870b = url;
        this.f25871c = map;
        this.f25872d = z10;
        this.f25873e = z11;
        this.f25874f = i11;
        this.f25875g = j10;
        this.f25876h = j11;
    }

    public /* synthetic */ V2(String str, boolean z10, boolean z11, int i10, int i11) {
        this(new Random().nextInt() & Integer.MAX_VALUE, str, null, z10, z11, i10, System.currentTimeMillis(), System.currentTimeMillis());
    }
}
