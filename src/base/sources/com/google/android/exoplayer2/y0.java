package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.y0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class y0 implements com.google.android.exoplayer2.g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final y0 f18973i = new c().a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f18974j = ob.r0.y0(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f18975k = ob.r0.y0(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f18976l = ob.r0.y0(2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f18977m = ob.r0.y0(3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f18978n = ob.r0.y0(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f18979o = ob.r0.y0(5);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final com.google.android.exoplayer2.g.a f18980p = new com.google.android.exoplayer2.g.a() { // from class: o9.s
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return y0.c(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f18982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f18983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f18984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z0 f18985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f18986f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f18987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f18988h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements com.google.android.exoplayer2.g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f18989c = ob.r0.y0(0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final com.google.android.exoplayer2.g.a f18990d = new com.google.android.exoplayer2.g.a() { // from class: o9.t
            @Override // com.google.android.exoplayer2.g.a
            public final com.google.android.exoplayer2.g a(Bundle bundle) {
                return y0.b.b(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f18991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f18992b;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Uri f18993a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Object f18994b;

            public a(Uri uri) {
                this.f18993a = uri;
            }

            public b c() {
                return new b(this);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b b(Bundle bundle) {
            Uri uri = (Uri) bundle.getParcelable(f18989c);
            ob.a.e(uri);
            return new a(uri).c();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f18991a.equals(bVar.f18991a) && ob.r0.c(this.f18992b, bVar.f18992b);
        }

        public int hashCode() {
            int iHashCode = this.f18991a.hashCode() * 31;
            Object obj = this.f18992b;
            return iHashCode + (obj != null ? obj.hashCode() : 0);
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f18989c, this.f18991a);
            return bundle;
        }

        private b(a aVar) {
            this.f18991a = aVar.f18993a;
            this.f18992b = aVar.f18994b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f18995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Uri f18996b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f18997c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d.a f18998d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private f.a f18999e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f19000f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f19001g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private com.google.common.collect.c0 f19002h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private b f19003i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Object f19004j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private z0 f19005k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private g.a f19006l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private i f19007m;

        public y0 a() {
            h hVar;
            ob.a.g(this.f18999e.f19047b == null || this.f18999e.f19046a != null);
            Uri uri = this.f18996b;
            if (uri != null) {
                hVar = new h(uri, this.f18997c, this.f18999e.f19046a != null ? this.f18999e.i() : null, this.f19003i, this.f19000f, this.f19001g, this.f19002h, this.f19004j);
            } else {
                hVar = null;
            }
            String str = this.f18995a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e eVarG = this.f18998d.g();
            g gVarF = this.f19006l.f();
            z0 z0Var = this.f19005k;
            if (z0Var == null) {
                z0Var = z0.I;
            }
            return new y0(str2, eVarG, hVar, gVarF, z0Var, this.f19007m);
        }

        public c b(d dVar) {
            this.f18998d = dVar.b();
            return this;
        }

        public c c(g gVar) {
            this.f19006l = gVar.b();
            return this;
        }

        public c d(String str) {
            this.f18995a = (String) ob.a.e(str);
            return this;
        }

        public c e(List list) {
            this.f19002h = com.google.common.collect.c0.x(list);
            return this;
        }

        public c f(Object obj) {
            this.f19004j = obj;
            return this;
        }

        public c g(Uri uri) {
            this.f18996b = uri;
            return this;
        }

        public c h(String str) {
            return g(str == null ? null : Uri.parse(str));
        }

        public c() {
            this.f18998d = new d.a();
            this.f18999e = new f.a();
            this.f19000f = Collections.EMPTY_LIST;
            this.f19002h = com.google.common.collect.c0.C();
            this.f19006l = new g.a();
            this.f19007m = i.f19088d;
        }

        private c(y0 y0Var) {
            f.a aVar;
            this();
            this.f18998d = y0Var.f18986f.b();
            this.f18995a = y0Var.f18981a;
            this.f19005k = y0Var.f18985e;
            this.f19006l = y0Var.f18984d.b();
            this.f19007m = y0Var.f18988h;
            h hVar = y0Var.f18982b;
            if (hVar != null) {
                this.f19001g = hVar.f19084f;
                this.f18997c = hVar.f19080b;
                this.f18996b = hVar.f19079a;
                this.f19000f = hVar.f19083e;
                this.f19002h = hVar.f19085g;
                this.f19004j = hVar.f19087i;
                f fVar = hVar.f19081c;
                if (fVar != null) {
                    aVar = fVar.c();
                } else {
                    aVar = new f.a();
                }
                this.f18999e = aVar;
                this.f19003i = hVar.f19082d;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class d implements com.google.android.exoplayer2.g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f19008f = new a().f();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f19009g = ob.r0.y0(0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f19010h = ob.r0.y0(1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f19011i = ob.r0.y0(2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f19012j = ob.r0.y0(3);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f19013k = ob.r0.y0(4);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final com.google.android.exoplayer2.g.a f19014l = new com.google.android.exoplayer2.g.a() { // from class: o9.u
            @Override // com.google.android.exoplayer2.g.a
            public final com.google.android.exoplayer2.g a(Bundle bundle) {
                return y0.d.a(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f19015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f19016b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f19017c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f19018d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f19019e;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f19020a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f19021b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f19022c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f19023d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f19024e;

            public d f() {
                return g();
            }

            public e g() {
                return new e(this);
            }

            public a h(long j10) {
                ob.a.a(j10 == Long.MIN_VALUE || j10 >= 0);
                this.f19021b = j10;
                return this;
            }

            public a i(boolean z10) {
                this.f19023d = z10;
                return this;
            }

            public a j(boolean z10) {
                this.f19022c = z10;
                return this;
            }

            public a k(long j10) {
                ob.a.a(j10 >= 0);
                this.f19020a = j10;
                return this;
            }

            public a l(boolean z10) {
                this.f19024e = z10;
                return this;
            }

            public a() {
                this.f19021b = Long.MIN_VALUE;
            }

            private a(d dVar) {
                this.f19020a = dVar.f19015a;
                this.f19021b = dVar.f19016b;
                this.f19022c = dVar.f19017c;
                this.f19023d = dVar.f19018d;
                this.f19024e = dVar.f19019e;
            }
        }

        public static /* synthetic */ e a(Bundle bundle) {
            a aVar = new a();
            String str = f19009g;
            d dVar = f19008f;
            return aVar.k(bundle.getLong(str, dVar.f19015a)).h(bundle.getLong(f19010h, dVar.f19016b)).j(bundle.getBoolean(f19011i, dVar.f19017c)).i(bundle.getBoolean(f19012j, dVar.f19018d)).l(bundle.getBoolean(f19013k, dVar.f19019e)).g();
        }

        public a b() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f19015a == dVar.f19015a && this.f19016b == dVar.f19016b && this.f19017c == dVar.f19017c && this.f19018d == dVar.f19018d && this.f19019e == dVar.f19019e;
        }

        public int hashCode() {
            long j10 = this.f19015a;
            int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
            long j11 = this.f19016b;
            return ((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f19017c ? 1 : 0)) * 31) + (this.f19018d ? 1 : 0)) * 31) + (this.f19019e ? 1 : 0);
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            long j10 = this.f19015a;
            d dVar = f19008f;
            if (j10 != dVar.f19015a) {
                bundle.putLong(f19009g, j10);
            }
            long j11 = this.f19016b;
            if (j11 != dVar.f19016b) {
                bundle.putLong(f19010h, j11);
            }
            boolean z10 = this.f19017c;
            if (z10 != dVar.f19017c) {
                bundle.putBoolean(f19011i, z10);
            }
            boolean z11 = this.f19018d;
            if (z11 != dVar.f19018d) {
                bundle.putBoolean(f19012j, z11);
            }
            boolean z12 = this.f19019e;
            if (z12 != dVar.f19019e) {
                bundle.putBoolean(f19013k, z12);
            }
            return bundle;
        }

        private d(a aVar) {
            this.f19015a = aVar.f19020a;
            this.f19016b = aVar.f19021b;
            this.f19017c = aVar.f19022c;
            this.f19018d = aVar.f19023d;
            this.f19019e = aVar.f19024e;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e extends d {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final e f19025m = new d.a().g();

        private e(d.a aVar) {
            super(aVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class f implements com.google.android.exoplayer2.g {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f19026l = ob.r0.y0(0);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f19027m = ob.r0.y0(1);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f19028n = ob.r0.y0(2);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f19029o = ob.r0.y0(3);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f19030p = ob.r0.y0(4);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f19031q = ob.r0.y0(5);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final String f19032r = ob.r0.y0(6);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final String f19033s = ob.r0.y0(7);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final com.google.android.exoplayer2.g.a f19034t = new com.google.android.exoplayer2.g.a() { // from class: o9.v
            @Override // com.google.android.exoplayer2.g.a
            public final com.google.android.exoplayer2.g a(Bundle bundle) {
                return y0.f.d(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f19035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f19036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Uri f19037c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final com.google.common.collect.e0 f19038d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final com.google.common.collect.e0 f19039e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f19040f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f19041g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f19042h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final com.google.common.collect.c0 f19043i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final com.google.common.collect.c0 f19044j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final byte[] f19045k;

        /* JADX INFO: Access modifiers changed from: private */
        public static f d(Bundle bundle) {
            UUID uuidFromString = UUID.fromString((String) ob.a.e(bundle.getString(f19026l)));
            Uri uri = (Uri) bundle.getParcelable(f19027m);
            com.google.common.collect.e0 e0VarB = ob.c.b(ob.c.f(bundle, f19028n, Bundle.EMPTY));
            boolean z10 = bundle.getBoolean(f19029o, false);
            boolean z11 = bundle.getBoolean(f19030p, false);
            boolean z12 = bundle.getBoolean(f19031q, false);
            com.google.common.collect.c0 c0VarX = com.google.common.collect.c0.x(ob.c.g(bundle, f19032r, new ArrayList()));
            return new a(uuidFromString).n(uri).m(e0VarB).o(z10).j(z12).p(z11).k(c0VarX).l(bundle.getByteArray(f19033s)).i();
        }

        public a c() {
            return new a();
        }

        public byte[] e() {
            byte[] bArr = this.f19045k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f19035a.equals(fVar.f19035a) && ob.r0.c(this.f19037c, fVar.f19037c) && ob.r0.c(this.f19039e, fVar.f19039e) && this.f19040f == fVar.f19040f && this.f19042h == fVar.f19042h && this.f19041g == fVar.f19041g && this.f19044j.equals(fVar.f19044j) && Arrays.equals(this.f19045k, fVar.f19045k);
        }

        public int hashCode() {
            int iHashCode = this.f19035a.hashCode() * 31;
            Uri uri = this.f19037c;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f19039e.hashCode()) * 31) + (this.f19040f ? 1 : 0)) * 31) + (this.f19042h ? 1 : 0)) * 31) + (this.f19041g ? 1 : 0)) * 31) + this.f19044j.hashCode()) * 31) + Arrays.hashCode(this.f19045k);
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putString(f19026l, this.f19035a.toString());
            Uri uri = this.f19037c;
            if (uri != null) {
                bundle.putParcelable(f19027m, uri);
            }
            if (!this.f19039e.isEmpty()) {
                bundle.putBundle(f19028n, ob.c.h(this.f19039e));
            }
            boolean z10 = this.f19040f;
            if (z10) {
                bundle.putBoolean(f19029o, z10);
            }
            boolean z11 = this.f19041g;
            if (z11) {
                bundle.putBoolean(f19030p, z11);
            }
            boolean z12 = this.f19042h;
            if (z12) {
                bundle.putBoolean(f19031q, z12);
            }
            if (!this.f19044j.isEmpty()) {
                bundle.putIntegerArrayList(f19032r, new ArrayList<>(this.f19044j));
            }
            byte[] bArr = this.f19045k;
            if (bArr != null) {
                bundle.putByteArray(f19033s, bArr);
            }
            return bundle;
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private UUID f19046a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Uri f19047b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private com.google.common.collect.e0 f19048c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f19049d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f19050e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f19051f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private com.google.common.collect.c0 f19052g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private byte[] f19053h;

            public f i() {
                return new f(this);
            }

            public a j(boolean z10) {
                this.f19051f = z10;
                return this;
            }

            public a k(List list) {
                this.f19052g = com.google.common.collect.c0.x(list);
                return this;
            }

            public a l(byte[] bArr) {
                this.f19053h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
                return this;
            }

            public a m(Map map) {
                this.f19048c = com.google.common.collect.e0.j(map);
                return this;
            }

            public a n(Uri uri) {
                this.f19047b = uri;
                return this;
            }

            public a o(boolean z10) {
                this.f19049d = z10;
                return this;
            }

            public a p(boolean z10) {
                this.f19050e = z10;
                return this;
            }

            public a(UUID uuid) {
                this.f19046a = uuid;
                this.f19048c = com.google.common.collect.e0.q();
                this.f19052g = com.google.common.collect.c0.C();
            }

            private a() {
                this.f19048c = com.google.common.collect.e0.q();
                this.f19052g = com.google.common.collect.c0.C();
            }

            private a(f fVar) {
                this.f19046a = fVar.f19035a;
                this.f19047b = fVar.f19037c;
                this.f19048c = fVar.f19039e;
                this.f19049d = fVar.f19040f;
                this.f19050e = fVar.f19041g;
                this.f19051f = fVar.f19042h;
                this.f19052g = fVar.f19044j;
                this.f19053h = fVar.f19045k;
            }
        }

        private f(a aVar) {
            ob.a.g((aVar.f19051f && aVar.f19047b == null) ? false : true);
            UUID uuid = (UUID) ob.a.e(aVar.f19046a);
            this.f19035a = uuid;
            this.f19036b = uuid;
            this.f19037c = aVar.f19047b;
            this.f19038d = aVar.f19048c;
            this.f19039e = aVar.f19048c;
            this.f19040f = aVar.f19049d;
            this.f19042h = aVar.f19051f;
            this.f19041g = aVar.f19050e;
            this.f19043i = aVar.f19052g;
            this.f19044j = aVar.f19052g;
            this.f19045k = aVar.f19053h != null ? Arrays.copyOf(aVar.f19053h, aVar.f19053h.length) : null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class g implements com.google.android.exoplayer2.g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final g f19054f = new a().f();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f19055g = ob.r0.y0(0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f19056h = ob.r0.y0(1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f19057i = ob.r0.y0(2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f19058j = ob.r0.y0(3);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f19059k = ob.r0.y0(4);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final com.google.android.exoplayer2.g.a f19060l = new com.google.android.exoplayer2.g.a() { // from class: o9.w
            @Override // com.google.android.exoplayer2.g.a
            public final com.google.android.exoplayer2.g a(Bundle bundle) {
                return y0.g.a(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f19061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f19062b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f19063c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f19064d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f19065e;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f19066a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f19067b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private long f19068c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private float f19069d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private float f19070e;

            public g f() {
                return new g(this);
            }

            public a g(long j10) {
                this.f19068c = j10;
                return this;
            }

            public a h(float f10) {
                this.f19070e = f10;
                return this;
            }

            public a i(long j10) {
                this.f19067b = j10;
                return this;
            }

            public a j(float f10) {
                this.f19069d = f10;
                return this;
            }

            public a k(long j10) {
                this.f19066a = j10;
                return this;
            }

            public a() {
                this.f19066a = C.TIME_UNSET;
                this.f19067b = C.TIME_UNSET;
                this.f19068c = C.TIME_UNSET;
                this.f19069d = -3.4028235E38f;
                this.f19070e = -3.4028235E38f;
            }

            private a(g gVar) {
                this.f19066a = gVar.f19061a;
                this.f19067b = gVar.f19062b;
                this.f19068c = gVar.f19063c;
                this.f19069d = gVar.f19064d;
                this.f19070e = gVar.f19065e;
            }
        }

        public static /* synthetic */ g a(Bundle bundle) {
            String str = f19055g;
            g gVar = f19054f;
            return new g(bundle.getLong(str, gVar.f19061a), bundle.getLong(f19056h, gVar.f19062b), bundle.getLong(f19057i, gVar.f19063c), bundle.getFloat(f19058j, gVar.f19064d), bundle.getFloat(f19059k, gVar.f19065e));
        }

        public a b() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f19061a == gVar.f19061a && this.f19062b == gVar.f19062b && this.f19063c == gVar.f19063c && this.f19064d == gVar.f19064d && this.f19065e == gVar.f19065e;
        }

        public int hashCode() {
            long j10 = this.f19061a;
            long j11 = this.f19062b;
            int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f19063c;
            int i11 = (i10 + ((int) ((j12 >>> 32) ^ j12))) * 31;
            float f10 = this.f19064d;
            int iFloatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f19065e;
            return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            long j10 = this.f19061a;
            g gVar = f19054f;
            if (j10 != gVar.f19061a) {
                bundle.putLong(f19055g, j10);
            }
            long j11 = this.f19062b;
            if (j11 != gVar.f19062b) {
                bundle.putLong(f19056h, j11);
            }
            long j12 = this.f19063c;
            if (j12 != gVar.f19063c) {
                bundle.putLong(f19057i, j12);
            }
            float f10 = this.f19064d;
            if (f10 != gVar.f19064d) {
                bundle.putFloat(f19058j, f10);
            }
            float f11 = this.f19065e;
            if (f11 != gVar.f19065e) {
                bundle.putFloat(f19059k, f11);
            }
            return bundle;
        }

        private g(a aVar) {
            this(aVar.f19066a, aVar.f19067b, aVar.f19068c, aVar.f19069d, aVar.f19070e);
        }

        public g(long j10, long j11, long j12, float f10, float f11) {
            this.f19061a = j10;
            this.f19062b = j11;
            this.f19063c = j12;
            this.f19064d = f10;
            this.f19065e = f11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class h implements com.google.android.exoplayer2.g {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f19071j = ob.r0.y0(0);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f19072k = ob.r0.y0(1);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f19073l = ob.r0.y0(2);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f19074m = ob.r0.y0(3);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f19075n = ob.r0.y0(4);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f19076o = ob.r0.y0(5);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f19077p = ob.r0.y0(6);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final com.google.android.exoplayer2.g.a f19078q = new com.google.android.exoplayer2.g.a() { // from class: o9.x
            @Override // com.google.android.exoplayer2.g.a
            public final com.google.android.exoplayer2.g a(Bundle bundle) {
                return y0.h.b(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f19079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f19080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f f19081c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f19082d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List f19083e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f19084f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final com.google.common.collect.c0 f19085g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f19086h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Object f19087i;

        /* JADX INFO: Access modifiers changed from: private */
        public static h b(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(f19073l);
            f fVar = bundle2 == null ? null : (f) f.f19034t.a(bundle2);
            Bundle bundle3 = bundle.getBundle(f19074m);
            b bVar = bundle3 != null ? (b) b.f18990d.a(bundle3) : null;
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f19075n);
            com.google.common.collect.c0 c0VarC = parcelableArrayList == null ? com.google.common.collect.c0.C() : ob.c.d(new com.google.android.exoplayer2.g.a() { // from class: o9.y
                @Override // com.google.android.exoplayer2.g.a
                public final com.google.android.exoplayer2.g a(Bundle bundle4) {
                    return qa.c.b(bundle4);
                }
            }, parcelableArrayList);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(f19077p);
            return new h((Uri) ob.a.e((Uri) bundle.getParcelable(f19071j)), bundle.getString(f19072k), fVar, bVar, c0VarC, bundle.getString(f19076o), parcelableArrayList2 == null ? com.google.common.collect.c0.C() : ob.c.d(k.f19106o, parcelableArrayList2), null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f19079a.equals(hVar.f19079a) && ob.r0.c(this.f19080b, hVar.f19080b) && ob.r0.c(this.f19081c, hVar.f19081c) && ob.r0.c(this.f19082d, hVar.f19082d) && this.f19083e.equals(hVar.f19083e) && ob.r0.c(this.f19084f, hVar.f19084f) && this.f19085g.equals(hVar.f19085g) && ob.r0.c(this.f19087i, hVar.f19087i);
        }

        public int hashCode() {
            int iHashCode = this.f19079a.hashCode() * 31;
            String str = this.f19080b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f19081c;
            int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            b bVar = this.f19082d;
            int iHashCode4 = (((iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f19083e.hashCode()) * 31;
            String str2 = this.f19084f;
            int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f19085g.hashCode()) * 31;
            Object obj = this.f19087i;
            return iHashCode5 + (obj != null ? obj.hashCode() : 0);
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f19071j, this.f19079a);
            String str = this.f19080b;
            if (str != null) {
                bundle.putString(f19072k, str);
            }
            f fVar = this.f19081c;
            if (fVar != null) {
                bundle.putBundle(f19073l, fVar.toBundle());
            }
            b bVar = this.f19082d;
            if (bVar != null) {
                bundle.putBundle(f19074m, bVar.toBundle());
            }
            if (!this.f19083e.isEmpty()) {
                bundle.putParcelableArrayList(f19075n, ob.c.i(this.f19083e));
            }
            String str2 = this.f19084f;
            if (str2 != null) {
                bundle.putString(f19076o, str2);
            }
            if (!this.f19085g.isEmpty()) {
                bundle.putParcelableArrayList(f19077p, ob.c.i(this.f19085g));
            }
            return bundle;
        }

        private h(Uri uri, String str, f fVar, b bVar, List list, String str2, com.google.common.collect.c0 c0Var, Object obj) {
            this.f19079a = uri;
            this.f19080b = str;
            this.f19081c = fVar;
            this.f19082d = bVar;
            this.f19083e = list;
            this.f19084f = str2;
            this.f19085g = c0Var;
            com.google.common.collect.c0.a aVarR = com.google.common.collect.c0.r();
            for (int i10 = 0; i10 < c0Var.size(); i10++) {
                aVarR.a(((k) c0Var.get(i10)).b().j());
            }
            this.f19086h = aVarR.m();
            this.f19087i = obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class i implements com.google.android.exoplayer2.g {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final i f19088d = new a().d();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f19089e = ob.r0.y0(0);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f19090f = ob.r0.y0(1);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f19091g = ob.r0.y0(2);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final com.google.android.exoplayer2.g.a f19092h = new com.google.android.exoplayer2.g.a() { // from class: o9.z
            @Override // com.google.android.exoplayer2.g.a
            public final com.google.android.exoplayer2.g a(Bundle bundle) {
                return new y0.i.a().f((Uri) bundle.getParcelable(y0.i.f19089e)).g(bundle.getString(y0.i.f19090f)).e(bundle.getBundle(y0.i.f19091g)).d();
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f19093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f19094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bundle f19095c;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Uri f19096a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f19097b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Bundle f19098c;

            public i d() {
                return new i(this);
            }

            public a e(Bundle bundle) {
                this.f19098c = bundle;
                return this;
            }

            public a f(Uri uri) {
                this.f19096a = uri;
                return this;
            }

            public a g(String str) {
                this.f19097b = str;
                return this;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return ob.r0.c(this.f19093a, iVar.f19093a) && ob.r0.c(this.f19094b, iVar.f19094b);
        }

        public int hashCode() {
            Uri uri = this.f19093a;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f19094b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            Uri uri = this.f19093a;
            if (uri != null) {
                bundle.putParcelable(f19089e, uri);
            }
            String str = this.f19094b;
            if (str != null) {
                bundle.putString(f19090f, str);
            }
            Bundle bundle2 = this.f19095c;
            if (bundle2 != null) {
                bundle.putBundle(f19091g, bundle2);
            }
            return bundle;
        }

        private i(a aVar) {
            this.f19093a = aVar.f19096a;
            this.f19094b = aVar.f19097b;
            this.f19095c = aVar.f19098c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class j extends k {
        private j(k.a aVar) {
            super(aVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class k implements com.google.android.exoplayer2.g {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f19099h = ob.r0.y0(0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f19100i = ob.r0.y0(1);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f19101j = ob.r0.y0(2);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f19102k = ob.r0.y0(3);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f19103l = ob.r0.y0(4);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f19104m = ob.r0.y0(5);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f19105n = ob.r0.y0(6);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final com.google.android.exoplayer2.g.a f19106o = new com.google.android.exoplayer2.g.a() { // from class: o9.a0
            @Override // com.google.android.exoplayer2.g.a
            public final com.google.android.exoplayer2.g a(Bundle bundle) {
                return y0.k.c(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f19107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f19108b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f19109c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f19110d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f19111e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f19112f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f19113g;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Uri f19114a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f19115b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f19116c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f19117d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f19118e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private String f19119f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private String f19120g;

            /* JADX INFO: Access modifiers changed from: private */
            public j j() {
                return new j(this);
            }

            public k i() {
                return new k(this);
            }

            public a k(String str) {
                this.f19120g = str;
                return this;
            }

            public a l(String str) {
                this.f19119f = str;
                return this;
            }

            public a m(String str) {
                this.f19116c = str;
                return this;
            }

            public a n(String str) {
                this.f19115b = str;
                return this;
            }

            public a o(int i10) {
                this.f19118e = i10;
                return this;
            }

            public a p(int i10) {
                this.f19117d = i10;
                return this;
            }

            public a(Uri uri) {
                this.f19114a = uri;
            }

            private a(k kVar) {
                this.f19114a = kVar.f19107a;
                this.f19115b = kVar.f19108b;
                this.f19116c = kVar.f19109c;
                this.f19117d = kVar.f19110d;
                this.f19118e = kVar.f19111e;
                this.f19119f = kVar.f19112f;
                this.f19120g = kVar.f19113g;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static k c(Bundle bundle) {
            Uri uri = (Uri) ob.a.e((Uri) bundle.getParcelable(f19099h));
            String string = bundle.getString(f19100i);
            String string2 = bundle.getString(f19101j);
            int i10 = bundle.getInt(f19102k, 0);
            int i11 = bundle.getInt(f19103l, 0);
            String string3 = bundle.getString(f19104m);
            return new a(uri).n(string).m(string2).p(i10).o(i11).l(string3).k(bundle.getString(f19105n)).i();
        }

        public a b() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f19107a.equals(kVar.f19107a) && ob.r0.c(this.f19108b, kVar.f19108b) && ob.r0.c(this.f19109c, kVar.f19109c) && this.f19110d == kVar.f19110d && this.f19111e == kVar.f19111e && ob.r0.c(this.f19112f, kVar.f19112f) && ob.r0.c(this.f19113g, kVar.f19113g);
        }

        public int hashCode() {
            int iHashCode = this.f19107a.hashCode() * 31;
            String str = this.f19108b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f19109c;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f19110d) * 31) + this.f19111e) * 31;
            String str3 = this.f19112f;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f19113g;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f19099h, this.f19107a);
            String str = this.f19108b;
            if (str != null) {
                bundle.putString(f19100i, str);
            }
            String str2 = this.f19109c;
            if (str2 != null) {
                bundle.putString(f19101j, str2);
            }
            int i10 = this.f19110d;
            if (i10 != 0) {
                bundle.putInt(f19102k, i10);
            }
            int i11 = this.f19111e;
            if (i11 != 0) {
                bundle.putInt(f19103l, i11);
            }
            String str3 = this.f19112f;
            if (str3 != null) {
                bundle.putString(f19104m, str3);
            }
            String str4 = this.f19113g;
            if (str4 != null) {
                bundle.putString(f19105n, str4);
            }
            return bundle;
        }

        private k(a aVar) {
            this.f19107a = aVar.f19114a;
            this.f19108b = aVar.f19115b;
            this.f19109c = aVar.f19116c;
            this.f19110d = aVar.f19117d;
            this.f19111e = aVar.f19118e;
            this.f19112f = aVar.f19119f;
            this.f19113g = aVar.f19120g;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static y0 c(Bundle bundle) {
        String str = (String) ob.a.e(bundle.getString(f18974j, ""));
        Bundle bundle2 = bundle.getBundle(f18975k);
        g gVar = bundle2 == null ? g.f19054f : (g) g.f19060l.a(bundle2);
        Bundle bundle3 = bundle.getBundle(f18976l);
        z0 z0Var = bundle3 == null ? z0.I : (z0) z0.f19152q0.a(bundle3);
        Bundle bundle4 = bundle.getBundle(f18977m);
        e eVar = bundle4 == null ? e.f19025m : (e) d.f19014l.a(bundle4);
        Bundle bundle5 = bundle.getBundle(f18978n);
        i iVar = bundle5 == null ? i.f19088d : (i) i.f19092h.a(bundle5);
        Bundle bundle6 = bundle.getBundle(f18979o);
        return new y0(str, eVar, bundle6 == null ? null : (h) h.f19078q.a(bundle6), gVar, z0Var, iVar);
    }

    public static y0 d(Uri uri) {
        return new c().g(uri).a();
    }

    public static y0 e(String str) {
        return new c().h(str).a();
    }

    private Bundle f(boolean z10) {
        h hVar;
        Bundle bundle = new Bundle();
        if (!this.f18981a.equals("")) {
            bundle.putString(f18974j, this.f18981a);
        }
        if (!this.f18984d.equals(g.f19054f)) {
            bundle.putBundle(f18975k, this.f18984d.toBundle());
        }
        if (!this.f18985e.equals(z0.I)) {
            bundle.putBundle(f18976l, this.f18985e.toBundle());
        }
        if (!this.f18986f.equals(d.f19008f)) {
            bundle.putBundle(f18977m, this.f18986f.toBundle());
        }
        if (!this.f18988h.equals(i.f19088d)) {
            bundle.putBundle(f18978n, this.f18988h.toBundle());
        }
        if (z10 && (hVar = this.f18982b) != null) {
            bundle.putBundle(f18979o, hVar.toBundle());
        }
        return bundle;
    }

    public c b() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return ob.r0.c(this.f18981a, y0Var.f18981a) && this.f18986f.equals(y0Var.f18986f) && ob.r0.c(this.f18982b, y0Var.f18982b) && ob.r0.c(this.f18984d, y0Var.f18984d) && ob.r0.c(this.f18985e, y0Var.f18985e) && ob.r0.c(this.f18988h, y0Var.f18988h);
    }

    public int hashCode() {
        int iHashCode = this.f18981a.hashCode() * 31;
        h hVar = this.f18982b;
        return ((((((((iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f18984d.hashCode()) * 31) + this.f18986f.hashCode()) * 31) + this.f18985e.hashCode()) * 31) + this.f18988h.hashCode();
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        return f(false);
    }

    private y0(String str, e eVar, h hVar, g gVar, z0 z0Var, i iVar) {
        this.f18981a = str;
        this.f18982b = hVar;
        this.f18983c = hVar;
        this.f18984d = gVar;
        this.f18985e = z0Var;
        this.f18986f = eVar;
        this.f18987g = eVar;
        this.f18988h = iVar;
    }
}
