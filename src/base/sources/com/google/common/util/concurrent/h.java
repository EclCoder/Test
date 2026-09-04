package com.google.common.util.concurrent;

import com.google.common.collect.g1;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class h extends com.google.common.util.concurrent.b.j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b f21988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c0 f21989d = new c0(h.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Set f21990a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile int f21991b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static abstract class b {
        private b() {
        }

        abstract void a(h hVar, Set set, Set set2);

        abstract int b(h hVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater f21992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicIntegerFieldUpdater f21993b;

        c(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.f21992a = atomicReferenceFieldUpdater;
            this.f21993b = atomicIntegerFieldUpdater;
        }

        @Override // com.google.common.util.concurrent.h.b
        void a(h hVar, Set set, Set set2) {
            androidx.concurrent.futures.b.a(this.f21992a, hVar, set, set2);
        }

        @Override // com.google.common.util.concurrent.h.b
        int b(h hVar) {
            return this.f21993b.decrementAndGet(hVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d extends b {
        private d() {
            super();
        }

        @Override // com.google.common.util.concurrent.h.b
        void a(h hVar, Set set, Set set2) {
            synchronized (hVar) {
                try {
                    if (hVar.f21990a == set) {
                        hVar.f21990a = set2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.h.b
        int b(h hVar) {
            int iP;
            synchronized (hVar) {
                iP = h.p(hVar);
            }
            return iP;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        b dVar;
        Throwable th2 = null;
        Object[] objArr = 0;
        try {
            dVar = new c(AtomicReferenceFieldUpdater.newUpdater(h.class, Set.class, "a"), AtomicIntegerFieldUpdater.newUpdater(h.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B));
        } catch (Throwable th3) {
            dVar = new d();
            th2 = th3;
        }
        f21988c = dVar;
        if (th2 != null) {
            f21989d.a().log(Level.SEVERE, "SafeAtomicHelper is broken!", th2);
        }
    }

    h(int i10) {
        this.f21991b = i10;
    }

    static /* synthetic */ int p(h hVar) {
        int i10 = hVar.f21991b - 1;
        hVar.f21991b = i10;
        return i10;
    }

    abstract void q(Set set);

    final void r() {
        this.f21990a = null;
    }

    final int s() {
        return f21988c.b(this);
    }

    final Set t() {
        Set set = this.f21990a;
        if (set != null) {
            return set;
        }
        Set setF = g1.f();
        q(setF);
        f21988c.a(this, null, setF);
        Set set2 = this.f21990a;
        Objects.requireNonNull(set2);
        return set2;
    }
}
