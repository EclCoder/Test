package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f22354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f22355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f22356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.firebase.f f22357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final de.e f22358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f f22359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f22360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f22361h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final t f22362i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ScheduledExecutorService f22363j;

    public p(com.google.firebase.f fVar, de.e eVar, m mVar, f fVar2, Context context, String str, t tVar, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f22354a = linkedHashSet;
        this.f22355b = new s(fVar, eVar, mVar, fVar2, context, str, linkedHashSet, tVar, scheduledExecutorService);
        this.f22357d = fVar;
        this.f22356c = mVar;
        this.f22358e = eVar;
        this.f22359f = fVar2;
        this.f22360g = context;
        this.f22361h = str;
        this.f22362i = tVar;
        this.f22363j = scheduledExecutorService;
    }

    private synchronized void a() {
        if (!this.f22354a.isEmpty()) {
            this.f22355b.C();
        }
    }

    public synchronized void b(boolean z10) {
        this.f22355b.z(z10);
        if (!z10) {
            a();
        }
    }
}
