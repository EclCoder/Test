package com.inmobi.media;

import android.content.Context;
import android.webkit.URLUtil;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ej extends X3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3348u9 f24729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24730c;

    public Ej(Context context, C3348u9 c3348u9) {
        kotlin.jvm.internal.s.h(context, "context");
        this.f24728a = context;
        this.f24729b = c3348u9;
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        this.f24730c = "Static-Companion-" + string;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        if (em.i.j(r13, r6, r0) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.inmobi.media.Ej r12, java.lang.String r13, com.inmobi.media.Tj r14, kotlin.coroutines.jvm.internal.d r15) {
        /*
            r12.getClass()
            boolean r0 = r15 instanceof com.inmobi.media.Bj
            if (r0 == 0) goto L16
            r0 = r15
            com.inmobi.media.Bj r0 = (com.inmobi.media.Bj) r0
            int r1 = r0.f24559e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f24559e = r1
            goto L1b
        L16:
            com.inmobi.media.Bj r0 = new com.inmobi.media.Bj
            r0.<init>(r12, r15)
        L1b:
            java.lang.Object r15 = r0.f24557c
            java.lang.Object r1 = ll.b.f()
            int r2 = r0.f24559e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            fl.s.b(r15)
            goto L76
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L38:
            com.inmobi.media.Tj r14 = r0.f24556b
            java.lang.String r13 = r0.f24555a
            fl.s.b(r15)
        L3f:
            r9 = r13
            r7 = r14
            goto L5b
        L42:
            fl.s.b(r15)
            em.i2 r15 = em.c1.c()
            com.inmobi.media.Dj r2 = new com.inmobi.media.Dj
            r2.<init>(r12, r5)
            r0.f24555a = r13
            r0.f24556b = r14
            r0.f24559e = r4
            java.lang.Object r15 = em.i.j(r15, r2, r0)
            if (r15 != r1) goto L3f
            goto L75
        L5b:
            r10 = r15
            android.graphics.Bitmap$Config r10 = (android.graphics.Bitmap.Config) r10
            em.k0 r13 = em.c1.b()
            com.inmobi.media.Cj r6 = new com.inmobi.media.Cj
            r11 = 0
            r8 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            r0.f24555a = r5
            r0.f24556b = r5
            r0.f24559e = r3
            java.lang.Object r12 = em.i.j(r13, r6, r0)
            if (r12 != r1) goto L76
        L75:
            return r1
        L76:
            fl.g0 r12 = fl.g0.f38750a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Ej.a(com.inmobi.media.Ej, java.lang.String, com.inmobi.media.Tj, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public final Object a(Ii ii2, N3 n10) throws C3092kc {
        if (URLUtil.isNetworkUrl(ii2.f25024a)) {
            return em.i.j(em.c1.c(), new Aj(this, ii2, null), n10);
        }
        throw new C3092kc("Companion Invalid Resource Error");
    }
}
