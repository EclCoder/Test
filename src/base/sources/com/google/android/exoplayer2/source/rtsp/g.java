package com.google.android.exoplayer2.source.rtsp;

import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TreeSet f17988a = new TreeSet(new Comparator() { // from class: com.google.android.exoplayer2.source.rtsp.f
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return g.c(((g.a) obj).f17992a.f57458g, ((g.a) obj2).f17992a.f57458g);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f17989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f17990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f17991d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ya.a f17992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f17993b;

        public a(ya.a aVar, long j10) {
            this.f17992a = aVar;
            this.f17993b = j10;
        }
    }

    public g() {
        f();
    }

    private synchronized void b(a aVar) {
        this.f17989b = aVar.f17992a.f57458g;
        this.f17988a.add(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(int i10, int i11) {
        int iMin;
        int i12 = i10 - i11;
        if (Math.abs(i12) <= 1000 || (iMin = (Math.min(i10, i11) - Math.max(i10, i11)) + 65535) >= 1000) {
            return i12;
        }
        return i10 < i11 ? iMin : -iMin;
    }

    public synchronized boolean d(ya.a aVar, long j10) {
        if (this.f17988a.size() >= 5000) {
            throw new IllegalStateException("Queue size limit of 5000 reached.");
        }
        int i10 = aVar.f57458g;
        if (!this.f17991d) {
            f();
            this.f17990c = ya.a.c(i10);
            this.f17991d = true;
            b(new a(aVar, j10));
            return true;
        }
        if (Math.abs(c(i10, ya.a.b(this.f17989b))) < 1000) {
            if (c(i10, this.f17990c) <= 0) {
                return false;
            }
            b(new a(aVar, j10));
            return true;
        }
        this.f17990c = ya.a.c(i10);
        this.f17988a.clear();
        b(new a(aVar, j10));
        return true;
    }

    public synchronized ya.a e(long j10) {
        if (this.f17988a.isEmpty()) {
            return null;
        }
        a aVar = (a) this.f17988a.first();
        int i10 = aVar.f17992a.f57458g;
        if (i10 != ya.a.b(this.f17990c) && j10 < aVar.f17993b) {
            return null;
        }
        this.f17988a.pollFirst();
        this.f17990c = i10;
        return aVar.f17992a;
    }

    public synchronized void f() {
        this.f17988a.clear();
        this.f17991d = false;
        this.f17990c = -1;
        this.f17989b = -1;
    }
}
