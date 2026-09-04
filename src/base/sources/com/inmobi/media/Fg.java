package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Fg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2975fo f24779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hm.w f24780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final em.o0 f24781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Hg f24782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public em.z1 f24783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f24784f;

    public Fg(em.o0 coroutineScope, Hg pollingVisibilityTrackerConfig, InterfaceC2975fo visibilityTrackedView) {
        kotlin.jvm.internal.s.h(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.s.h(pollingVisibilityTrackerConfig, "pollingVisibilityTrackerConfig");
        kotlin.jvm.internal.s.h(visibilityTrackedView, "visibilityTrackedView");
        kotlin.jvm.internal.s.h(visibilityTrackedView, "visibilityTrackedView");
        this.f24779a = visibilityTrackedView;
        this.f24780b = hm.k0.a(EnumC2949eo.HIDDEN);
        this.f24781c = coroutineScope;
        this.f24782d = pollingVisibilityTrackerConfig;
        this.f24784f = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0061 -> B:17:0x003b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(com.inmobi.media.Fg r7, kotlin.coroutines.jvm.internal.d r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof com.inmobi.media.Dg
            if (r0 == 0) goto L16
            r0 = r8
            com.inmobi.media.Dg r0 = (com.inmobi.media.Dg) r0
            int r1 = r0.f24660c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f24660c = r1
            goto L1b
        L16:
            com.inmobi.media.Dg r0 = new com.inmobi.media.Dg
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.f24658a
            java.lang.Object r1 = ll.b.f()
            int r2 = r0.f24660c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            goto L38
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            fl.s.b(r8)
            goto L56
        L38:
            fl.s.b(r8)
        L3b:
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.f24784f
            boolean r8 = r8.get()
            if (r8 != 0) goto L64
            em.i2 r8 = em.c1.c()
            com.inmobi.media.Eg r2 = new com.inmobi.media.Eg
            r5 = 0
            r2.<init>(r7, r5)
            r0.f24660c = r4
            java.lang.Object r8 = em.i.j(r8, r2, r0)
            if (r8 != r1) goto L56
            goto L63
        L56:
            com.inmobi.media.Hg r8 = r7.f24782d
            int r8 = r8.f24948a
            long r5 = (long) r8
            r0.f24660c = r3
            java.lang.Object r8 = em.y0.a(r5, r0)
            if (r8 != r1) goto L3b
        L63:
            return r1
        L64:
            fl.g0 r7 = fl.g0.f38750a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Fg.a(com.inmobi.media.Fg, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public final void a() {
        if (this.f24784f.get() || this.f24783e != null) {
            return;
        }
        this.f24783e = em.k.d(this.f24781c, null, null, new Cg(this, null), 3, null);
    }
}
