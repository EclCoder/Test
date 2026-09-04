package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f21853a;

        a(int i10) {
            this.f21853a = i10;
        }

        @Override // com.google.common.collect.p0.e
        Map c() {
            return x0.c(this.f21853a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f21854a;

        b(Comparator comparator) {
            this.f21854a = comparator;
        }

        @Override // com.google.common.collect.p0.e
        Map c() {
            return new TreeMap(this.f21854a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c implements sc.x, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f21855a;

        c(int i10) {
            this.f21855a = l.b(i10, "expectedValuesPerKey");
        }

        @Override // sc.x
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public List get() {
            return new ArrayList(this.f21855a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class d extends p0 {
        d() {
            super(null);
        }

        public abstract k0 e();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class e {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f21856a;

            a(int i10) {
                this.f21856a = i10;
            }

            @Override // com.google.common.collect.p0.d
            public k0 e() {
                return q0.b(e.this.c(), new c(this.f21856a));
            }
        }

        e() {
        }

        public d a() {
            return b(2);
        }

        public d b(int i10) {
            l.b(i10, "expectedValuesPerKey");
            return new a(i10);
        }

        abstract Map c();
    }

    /* synthetic */ p0(a aVar) {
        this();
    }

    public static e a() {
        return b(8);
    }

    public static e b(int i10) {
        l.b(i10, "expectedKeys");
        return new a(i10);
    }

    public static e c() {
        return d(w0.d());
    }

    public static e d(Comparator comparator) {
        sc.p.o(comparator);
        return new b(comparator);
    }

    private p0() {
    }
}
