package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.videoPlayer.model.TrackPercentage;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.y6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3448y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.media3.exoplayer.o f27911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final em.o0 f27912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hm.v f27913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f27914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public em.z1 f27915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public em.z1 f27916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f27917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean[] f27918h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f27919i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AbstractC3050im[] f27920j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f27921k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f27922l;

    public C3448y6(androidx.media3.exoplayer.o player, AdConfig.HybridNativeConfig hybridNativeConfig, em.o0 coroutineScope, long j10, hm.v progressEvents, TrackPercentage trackPercentage) {
        kotlin.jvm.internal.s.h(player, "player");
        kotlin.jvm.internal.s.h(hybridNativeConfig, "hybridNativeConfig");
        kotlin.jvm.internal.s.h(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.s.h(progressEvents, "progressEvents");
        kotlin.jvm.internal.s.h(trackPercentage, "trackPercentage");
        this.f27911a = player;
        this.f27912b = coroutineScope;
        this.f27913c = progressEvents;
        this.f27914d = new AtomicBoolean(false);
        this.f27917g = -1;
        boolean[] zArr = new boolean[4];
        for (int i10 = 0; i10 < 4; i10++) {
            zArr[i10] = false;
        }
        this.f27918h = zArr;
        this.f27919i = new int[]{trackPercentage.getQ1(), trackPercentage.getQ2(), trackPercentage.getQ3(), trackPercentage.getQ4()};
        this.f27920j = new AbstractC3050im[]{Om.f25436a, C3490zn.f28037a, In.f25036a, Pm.f25514a};
        this.f27921k = 200L;
        this.f27922l = yl.g.e(j10, hybridNativeConfig.getMinProgressInterval());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00aa, code lost:
    
        if (r9.a(r2, r0) == r1) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.inmobi.media.C3448y6 r9, kotlin.coroutines.jvm.internal.d r10) {
        /*
            r9.getClass()
            boolean r0 = r10 instanceof com.inmobi.media.C3371v6
            if (r0 == 0) goto L16
            r0 = r10
            com.inmobi.media.v6 r0 = (com.inmobi.media.C3371v6) r0
            int r1 = r0.f27687d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f27687d = r1
            goto L1b
        L16:
            com.inmobi.media.v6 r0 = new com.inmobi.media.v6
            r0.<init>(r9, r10)
        L1b:
            java.lang.Object r10 = r0.f27685b
            java.lang.Object r1 = ll.b.f()
            int r2 = r0.f27687d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            fl.s.b(r10)
            goto Lad
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            int r2 = r0.f27684a
            fl.s.b(r10)
            goto La4
        L3e:
            fl.s.b(r10)
            androidx.media3.exoplayer.o r10 = r9.f27911a
            boolean r10 = r10.isPlaying()
            if (r10 != 0) goto L4c
            fl.g0 r9 = fl.g0.f38750a
            return r9
        L4c:
            androidx.media3.exoplayer.o r10 = r9.f27911a
            long r5 = r10.getDuration()
            int r10 = (int) r5
            if (r10 > 0) goto L58
            fl.g0 r9 = fl.g0.f38750a
            return r9
        L58:
            androidx.media3.exoplayer.o r2 = r9.f27911a
            long r5 = r2.getCurrentPosition()
            int r2 = (int) r5
            int r2 = r2 * 100
            int r2 = r2 / r10
            int r5 = r9.f27917g
            r6 = 0
            if (r5 != r3) goto L7d
            int[] r5 = r9.f27919i
            r5 = r5[r6]
            if (r2 >= r5) goto L7d
            r5 = -1
            r9.f27917g = r5
            r5 = 4
            boolean[] r7 = new boolean[r5]
            r8 = r6
        L74:
            if (r8 >= r5) goto L7b
            r7[r8] = r6
            int r8 = r8 + 1
            goto L74
        L7b:
            r9.f27918h = r7
        L7d:
            r0.f27684a = r2
            r0.f27687d = r4
            int r4 = r9.f27917g
            if (r4 < 0) goto L88
            fl.g0 r10 = fl.g0.f38750a
            goto La1
        L88:
            r9.f27917g = r6
            hm.v r4 = r9.f27913c
            com.inmobi.media.Bn r5 = new com.inmobi.media.Bn
            float r10 = (float) r10
            java.lang.String r6 = "ExoVideoProgressTracker"
            r5.<init>(r6, r10)
            java.lang.Object r10 = r4.emit(r5, r0)
            java.lang.Object r4 = ll.b.f()
            if (r10 != r4) goto L9f
            goto La1
        L9f:
            fl.g0 r10 = fl.g0.f38750a
        La1:
            if (r10 != r1) goto La4
            goto Lac
        La4:
            r0.f27687d = r3
            java.lang.Object r9 = r9.a(r2, r0)
            if (r9 != r1) goto Lad
        Lac:
            return r1
        Lad:
            fl.g0 r9 = fl.g0.f38750a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3448y6.a(com.inmobi.media.y6, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public final void a() {
        if (this.f27914d.getAndSet(false)) {
            L6.a(this.f27915e);
            L6.a(this.f27916f);
            this.f27915e = null;
            this.f27916f = null;
        }
    }

    public static final Object a(C3448y6 c3448y6, C3423x6 c3423x6) {
        Object objEmit;
        if (!c3448y6.f27911a.isPlaying()) {
            return fl.g0.f38750a;
        }
        long duration = c3448y6.f27911a.getDuration();
        if (duration <= 0) {
            return fl.g0.f38750a;
        }
        return (c3448y6.f27917g != 2 && (objEmit = c3448y6.f27913c.emit(new C3218p8(c3448y6.f27911a.getCurrentPosition(), duration), c3423x6)) == ll.b.f()) ? objEmit : fl.g0.f38750a;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0050  */
    /* JADX WARN: Code duplicated, block: B:22:0x0066 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:23:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004e -> B:23:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0064 -> B:23:0x0067). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:16:0x0044
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(int r8, kotlin.coroutines.jvm.internal.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.inmobi.media.C3319t6
            if (r0 == 0) goto L13
            r0 = r9
            com.inmobi.media.t6 r0 = (com.inmobi.media.C3319t6) r0
            int r1 = r0.f27518f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27518f = r1
            goto L18
        L13:
            com.inmobi.media.t6 r0 = new com.inmobi.media.t6
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f27516d
            java.lang.Object r1 = ll.b.f()
            int r2 = r0.f27518f
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r8 = r0.f27515c
            int r2 = r0.f27514b
            int r4 = r0.f27513a
            fl.s.b(r9)
            r9 = r4
            goto L67
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            fl.s.b(r9)
            int[] r9 = r7.f27919i
            int r9 = r9.length
            r2 = 0
            r6 = r9
            r9 = r8
            r8 = r6
        L42:
            if (r2 >= r8) goto L69
            int[] r4 = r7.f27919i
            r4 = r4[r2]
            if (r9 < r4) goto L67
            boolean[] r4 = r7.f27918h
            boolean r5 = r4[r2]
            if (r5 != 0) goto L67
            r4[r2] = r3
            hm.v r4 = r7.f27913c
            com.inmobi.media.im[] r5 = r7.f27920j
            r5 = r5[r2]
            r0.f27513a = r9
            r0.f27514b = r2
            r0.f27515c = r8
            r0.f27518f = r3
            java.lang.Object r4 = r4.emit(r5, r0)
            if (r4 != r1) goto L67
            return r1
        L67:
            int r2 = r2 + r3
            goto L42
        L69:
            fl.g0 r8 = fl.g0.f38750a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3448y6.a(int, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
