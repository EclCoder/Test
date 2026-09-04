package com.google.android.exoplayer2;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f17058e = new b(0).e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f17059f = ob.r0.y0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f17060g = ob.r0.y0(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f17061h = ob.r0.y0(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f17062i = ob.r0.y0(3);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g.a f17063j = new g.a() { // from class: o9.e
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return com.google.android.exoplayer2.j.a(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17067d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f17068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f17069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f17070c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f17071d;

        public b(int i10) {
            this.f17068a = i10;
        }

        public j e() {
            ob.a.a(this.f17069b <= this.f17070c);
            return new j(this);
        }

        public b f(int i10) {
            this.f17070c = i10;
            return this;
        }

        public b g(int i10) {
            this.f17069b = i10;
            return this;
        }

        public b h(String str) {
            ob.a.a(this.f17068a != 0 || str == null);
            this.f17071d = str;
            return this;
        }
    }

    public static /* synthetic */ j a(Bundle bundle) {
        int i10 = bundle.getInt(f17059f, 0);
        int i11 = bundle.getInt(f17060g, 0);
        int i12 = bundle.getInt(f17061h, 0);
        return new b(i10).g(i11).f(i12).h(bundle.getString(f17062i)).e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f17064a == jVar.f17064a && this.f17065b == jVar.f17065b && this.f17066c == jVar.f17066c && ob.r0.c(this.f17067d, jVar.f17067d);
    }

    public int hashCode() {
        int i10 = (((((527 + this.f17064a) * 31) + this.f17065b) * 31) + this.f17066c) * 31;
        String str = this.f17067d;
        return i10 + (str == null ? 0 : str.hashCode());
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i10 = this.f17064a;
        if (i10 != 0) {
            bundle.putInt(f17059f, i10);
        }
        int i11 = this.f17065b;
        if (i11 != 0) {
            bundle.putInt(f17060g, i11);
        }
        int i12 = this.f17066c;
        if (i12 != 0) {
            bundle.putInt(f17061h, i12);
        }
        String str = this.f17067d;
        if (str != null) {
            bundle.putString(f17062i, str);
        }
        return bundle;
    }

    private j(b bVar) {
        this.f17064a = bVar.f17068a;
        this.f17065b = bVar.f17069b;
        this.f17066c = bVar.f17070c;
        this.f17067d = bVar.f17071d;
    }
}
