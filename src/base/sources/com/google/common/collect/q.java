package com.google.common.collect;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final q f21858a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final q f21859b = new b(-1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final q f21860c = new b(1);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends q {
        a() {
            super(null);
        }

        @Override // com.google.common.collect.q
        public q d(int i10, int i11) {
            return k(com.google.common.primitives.g.e(i10, i11));
        }

        @Override // com.google.common.collect.q
        public q e(long j10, long j11) {
            return k(com.google.common.primitives.i.a(j10, j11));
        }

        @Override // com.google.common.collect.q
        public q f(Object obj, Object obj2, Comparator comparator) {
            return k(comparator.compare(obj, obj2));
        }

        @Override // com.google.common.collect.q
        public q g(boolean z10, boolean z11) {
            return k(com.google.common.primitives.a.a(z10, z11));
        }

        @Override // com.google.common.collect.q
        public q h(boolean z10, boolean z11) {
            return k(com.google.common.primitives.a.a(z11, z10));
        }

        @Override // com.google.common.collect.q
        public int i() {
            return 0;
        }

        q k(int i10) {
            if (i10 < 0) {
                return q.f21859b;
            }
            return i10 > 0 ? q.f21860c : q.f21858a;
        }
    }

    /* synthetic */ q(a aVar) {
        this();
    }

    public static q j() {
        return f21858a;
    }

    public abstract q d(int i10, int i11);

    public abstract q e(long j10, long j11);

    public abstract q f(Object obj, Object obj2, Comparator comparator);

    public abstract q g(boolean z10, boolean z11);

    public abstract q h(boolean z10, boolean z11);

    public abstract int i();

    private q() {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b extends q {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f21861d;

        b(int i10) {
            super(null);
            this.f21861d = i10;
        }

        @Override // com.google.common.collect.q
        public int i() {
            return this.f21861d;
        }

        @Override // com.google.common.collect.q
        public q d(int i10, int i11) {
            return this;
        }

        @Override // com.google.common.collect.q
        public q e(long j10, long j11) {
            return this;
        }

        @Override // com.google.common.collect.q
        public q g(boolean z10, boolean z11) {
            return this;
        }

        @Override // com.google.common.collect.q
        public q h(boolean z10, boolean z11) {
            return this;
        }

        @Override // com.google.common.collect.q
        public q f(Object obj, Object obj2, Comparator comparator) {
            return this;
        }
    }
}
