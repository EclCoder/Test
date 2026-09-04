package t1;

import android.net.Uri;
import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r f52810i = new c().a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f52811j = w1.c0.s0(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f52812k = w1.c0.s0(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f52813l = w1.c0.s0(2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f52814m = w1.c0.s0(3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f52815n = w1.c0.s0(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f52816o = w1.c0.s0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f52818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f52819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f52820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f52821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f52822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f52823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f52824h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f52825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Uri f52826b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f52827c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d.a f52828d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private f.a f52829e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f52830f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f52831g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private com.google.common.collect.c0 f52832h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Object f52833i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f52834j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private t f52835k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private g.a f52836l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private i f52837m;

        public r a() {
            h hVar;
            w1.a.g(this.f52829e.f52879b == null || this.f52829e.f52878a != null);
            Uri uri = this.f52826b;
            if (uri != null) {
                hVar = new h(uri, this.f52827c, this.f52829e.f52878a != null ? this.f52829e.i() : null, null, this.f52830f, this.f52831g, this.f52832h, this.f52833i, this.f52834j);
            } else {
                hVar = null;
            }
            String str = this.f52825a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e eVarG = this.f52828d.g();
            g gVarF = this.f52836l.f();
            t tVar = this.f52835k;
            if (tVar == null) {
                tVar = t.H;
            }
            return new r(str2, eVarG, hVar, gVarF, tVar, this.f52837m);
        }

        public c b(String str) {
            this.f52831g = str;
            return this;
        }

        public c c(g gVar) {
            this.f52836l = gVar.a();
            return this;
        }

        public c d(String str) {
            this.f52825a = (String) w1.a.e(str);
            return this;
        }

        public c e(List list) {
            this.f52832h = com.google.common.collect.c0.x(list);
            return this;
        }

        public c f(Object obj) {
            this.f52833i = obj;
            return this;
        }

        public c g(Uri uri) {
            this.f52826b = uri;
            return this;
        }

        public c h(String str) {
            return g(str == null ? null : Uri.parse(str));
        }

        public c() {
            this.f52828d = new d.a();
            this.f52829e = new f.a();
            this.f52830f = Collections.EMPTY_LIST;
            this.f52832h = com.google.common.collect.c0.C();
            this.f52836l = new g.a();
            this.f52837m = i.f52919d;
            this.f52834j = C.TIME_UNSET;
        }

        private c(r rVar) {
            f.a aVar;
            this();
            this.f52828d = rVar.f52822f.a();
            this.f52825a = rVar.f52817a;
            this.f52835k = rVar.f52821e;
            this.f52836l = rVar.f52820d.a();
            this.f52837m = rVar.f52824h;
            h hVar = rVar.f52818b;
            if (hVar != null) {
                this.f52831g = hVar.f52914e;
                this.f52827c = hVar.f52911b;
                this.f52826b = hVar.f52910a;
                this.f52830f = hVar.f52913d;
                this.f52832h = hVar.f52915f;
                this.f52833i = hVar.f52917h;
                f fVar = hVar.f52912c;
                if (fVar != null) {
                    aVar = fVar.b();
                } else {
                    aVar = new f.a();
                }
                this.f52829e = aVar;
                this.f52834j = hVar.f52918i;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final d f52838h = new a().f();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f52839i = w1.c0.s0(0);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f52840j = w1.c0.s0(1);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f52841k = w1.c0.s0(2);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f52842l = w1.c0.s0(3);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f52843m = w1.c0.s0(4);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final String f52844n = w1.c0.s0(5);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final String f52845o = w1.c0.s0(6);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f52846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f52847b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f52848c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f52849d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f52850e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f52851f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f52852g;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f52853a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f52854b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f52855c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f52856d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f52857e;

            public d f() {
                return new d(this);
            }

            public e g() {
                return new e(this);
            }

            public a() {
                this.f52854b = Long.MIN_VALUE;
            }

            private a(d dVar) {
                this.f52853a = dVar.f52847b;
                this.f52854b = dVar.f52849d;
                this.f52855c = dVar.f52850e;
                this.f52856d = dVar.f52851f;
                this.f52857e = dVar.f52852g;
            }
        }

        public a a() {
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
            return this.f52847b == dVar.f52847b && this.f52849d == dVar.f52849d && this.f52850e == dVar.f52850e && this.f52851f == dVar.f52851f && this.f52852g == dVar.f52852g;
        }

        public int hashCode() {
            long j10 = this.f52847b;
            int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
            long j11 = this.f52849d;
            return ((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f52850e ? 1 : 0)) * 31) + (this.f52851f ? 1 : 0)) * 31) + (this.f52852g ? 1 : 0);
        }

        private d(a aVar) {
            this.f52846a = w1.c0.c1(aVar.f52853a);
            this.f52848c = w1.c0.c1(aVar.f52854b);
            this.f52847b = aVar.f52853a;
            this.f52849d = aVar.f52854b;
            this.f52850e = aVar.f52855c;
            this.f52851f = aVar.f52856d;
            this.f52852g = aVar.f52857e;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class e extends d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final e f52858p = new d.a().g();

        private e(d.a aVar) {
            super(aVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class f {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f52859l = w1.c0.s0(0);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f52860m = w1.c0.s0(1);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f52861n = w1.c0.s0(2);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f52862o = w1.c0.s0(3);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        static final String f52863p = w1.c0.s0(4);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f52864q = w1.c0.s0(5);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final String f52865r = w1.c0.s0(6);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final String f52866s = w1.c0.s0(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f52867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f52868b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Uri f52869c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final com.google.common.collect.e0 f52870d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final com.google.common.collect.e0 f52871e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f52872f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f52873g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f52874h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final com.google.common.collect.c0 f52875i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final com.google.common.collect.c0 f52876j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final byte[] f52877k;

        public a b() {
            return new a();
        }

        public byte[] c() {
            byte[] bArr = this.f52877k;
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
            return this.f52867a.equals(fVar.f52867a) && w1.c0.c(this.f52869c, fVar.f52869c) && w1.c0.c(this.f52871e, fVar.f52871e) && this.f52872f == fVar.f52872f && this.f52874h == fVar.f52874h && this.f52873g == fVar.f52873g && this.f52876j.equals(fVar.f52876j) && Arrays.equals(this.f52877k, fVar.f52877k);
        }

        public int hashCode() {
            int iHashCode = this.f52867a.hashCode() * 31;
            Uri uri = this.f52869c;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f52871e.hashCode()) * 31) + (this.f52872f ? 1 : 0)) * 31) + (this.f52874h ? 1 : 0)) * 31) + (this.f52873g ? 1 : 0)) * 31) + this.f52876j.hashCode()) * 31) + Arrays.hashCode(this.f52877k);
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private UUID f52878a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Uri f52879b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private com.google.common.collect.e0 f52880c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f52881d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f52882e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f52883f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private com.google.common.collect.c0 f52884g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private byte[] f52885h;

            public f i() {
                return new f(this);
            }

            private a() {
                this.f52880c = com.google.common.collect.e0.q();
                this.f52882e = true;
                this.f52884g = com.google.common.collect.c0.C();
            }

            private a(f fVar) {
                this.f52878a = fVar.f52867a;
                this.f52879b = fVar.f52869c;
                this.f52880c = fVar.f52871e;
                this.f52881d = fVar.f52872f;
                this.f52882e = fVar.f52873g;
                this.f52883f = fVar.f52874h;
                this.f52884g = fVar.f52876j;
                this.f52885h = fVar.f52877k;
            }
        }

        private f(a aVar) {
            w1.a.g((aVar.f52883f && aVar.f52879b == null) ? false : true);
            UUID uuid = (UUID) w1.a.e(aVar.f52878a);
            this.f52867a = uuid;
            this.f52868b = uuid;
            this.f52869c = aVar.f52879b;
            this.f52870d = aVar.f52880c;
            this.f52871e = aVar.f52880c;
            this.f52872f = aVar.f52881d;
            this.f52874h = aVar.f52883f;
            this.f52873g = aVar.f52882e;
            this.f52875i = aVar.f52884g;
            this.f52876j = aVar.f52884g;
            this.f52877k = aVar.f52885h != null ? Arrays.copyOf(aVar.f52885h, aVar.f52885h.length) : null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final g f52886f = new a().f();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f52887g = w1.c0.s0(0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f52888h = w1.c0.s0(1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f52889i = w1.c0.s0(2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f52890j = w1.c0.s0(3);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f52891k = w1.c0.s0(4);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f52892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f52893b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f52894c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f52895d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f52896e;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f52897a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f52898b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private long f52899c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private float f52900d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private float f52901e;

            public g f() {
                return new g(this);
            }

            public a g(long j10) {
                this.f52899c = j10;
                return this;
            }

            public a h(float f10) {
                this.f52901e = f10;
                return this;
            }

            public a i(long j10) {
                this.f52898b = j10;
                return this;
            }

            public a j(float f10) {
                this.f52900d = f10;
                return this;
            }

            public a k(long j10) {
                this.f52897a = j10;
                return this;
            }

            public a() {
                this.f52897a = C.TIME_UNSET;
                this.f52898b = C.TIME_UNSET;
                this.f52899c = C.TIME_UNSET;
                this.f52900d = -3.4028235E38f;
                this.f52901e = -3.4028235E38f;
            }

            private a(g gVar) {
                this.f52897a = gVar.f52892a;
                this.f52898b = gVar.f52893b;
                this.f52899c = gVar.f52894c;
                this.f52900d = gVar.f52895d;
                this.f52901e = gVar.f52896e;
            }
        }

        public a a() {
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
            return this.f52892a == gVar.f52892a && this.f52893b == gVar.f52893b && this.f52894c == gVar.f52894c && this.f52895d == gVar.f52895d && this.f52896e == gVar.f52896e;
        }

        public int hashCode() {
            long j10 = this.f52892a;
            long j11 = this.f52893b;
            int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f52894c;
            int i11 = (i10 + ((int) ((j12 >>> 32) ^ j12))) * 31;
            float f10 = this.f52895d;
            int iFloatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f52896e;
            return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
        }

        private g(a aVar) {
            this(aVar.f52897a, aVar.f52898b, aVar.f52899c, aVar.f52900d, aVar.f52901e);
        }

        public g(long j10, long j11, long j12, float f10, float f11) {
            this.f52892a = j10;
            this.f52893b = j11;
            this.f52894c = j12;
            this.f52895d = f10;
            this.f52896e = f11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class h {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f52902j = w1.c0.s0(0);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f52903k = w1.c0.s0(1);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f52904l = w1.c0.s0(2);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f52905m = w1.c0.s0(3);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f52906n = w1.c0.s0(4);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f52907o = w1.c0.s0(5);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f52908p = w1.c0.s0(6);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f52909q = w1.c0.s0(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f52910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f52911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f f52912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f52913d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f52914e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final com.google.common.collect.c0 f52915f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f52916g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Object f52917h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f52918i;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f52910a.equals(hVar.f52910a) && w1.c0.c(this.f52911b, hVar.f52911b) && w1.c0.c(this.f52912c, hVar.f52912c) && w1.c0.c(null, null) && this.f52913d.equals(hVar.f52913d) && w1.c0.c(this.f52914e, hVar.f52914e) && this.f52915f.equals(hVar.f52915f) && w1.c0.c(this.f52917h, hVar.f52917h) && w1.c0.c(Long.valueOf(this.f52918i), Long.valueOf(hVar.f52918i));
        }

        public int hashCode() {
            int iHashCode = this.f52910a.hashCode() * 31;
            String str = this.f52911b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f52912c;
            int iHashCode3 = (((iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 961) + this.f52913d.hashCode()) * 31;
            String str2 = this.f52914e;
            int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f52915f.hashCode()) * 31;
            Object obj = this.f52917h;
            return (int) ((((long) (iHashCode4 + (obj != null ? obj.hashCode() : 0))) * 31) + this.f52918i);
        }

        private h(Uri uri, String str, f fVar, b bVar, List list, String str2, com.google.common.collect.c0 c0Var, Object obj, long j10) {
            this.f52910a = uri;
            this.f52911b = v.l(str);
            this.f52912c = fVar;
            this.f52913d = list;
            this.f52914e = str2;
            this.f52915f = c0Var;
            com.google.common.collect.c0.a aVarR = com.google.common.collect.c0.r();
            for (int i10 = 0; i10 < c0Var.size(); i10++) {
                aVarR.a(((k) c0Var.get(i10)).a().i());
            }
            this.f52916g = aVarR.m();
            this.f52917h = obj;
            this.f52918i = j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final i f52919d = new a().d();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f52920e = w1.c0.s0(0);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f52921f = w1.c0.s0(1);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f52922g = w1.c0.s0(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f52923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f52924b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bundle f52925c;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Uri f52926a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f52927b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Bundle f52928c;

            public i d() {
                return new i(this);
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
            if (w1.c0.c(this.f52923a, iVar.f52923a) && w1.c0.c(this.f52924b, iVar.f52924b)) {
                if ((this.f52925c == null) == (iVar.f52925c == null)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Uri uri = this.f52923a;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f52924b;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f52925c != null ? 1 : 0);
        }

        private i(a aVar) {
            this.f52923a = aVar.f52926a;
            this.f52924b = aVar.f52927b;
            this.f52925c = aVar.f52928c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class j extends k {
        private j(k.a aVar) {
            super(aVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class k {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f52929h = w1.c0.s0(0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f52930i = w1.c0.s0(1);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f52931j = w1.c0.s0(2);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f52932k = w1.c0.s0(3);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f52933l = w1.c0.s0(4);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f52934m = w1.c0.s0(5);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f52935n = w1.c0.s0(6);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f52936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f52937b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f52938c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f52939d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f52940e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f52941f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f52942g;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Uri f52943a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f52944b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private String f52945c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f52946d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f52947e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private String f52948f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private String f52949g;

            /* JADX INFO: Access modifiers changed from: private */
            public j i() {
                return new j(this);
            }

            private a(k kVar) {
                this.f52943a = kVar.f52936a;
                this.f52944b = kVar.f52937b;
                this.f52945c = kVar.f52938c;
                this.f52946d = kVar.f52939d;
                this.f52947e = kVar.f52940e;
                this.f52948f = kVar.f52941f;
                this.f52949g = kVar.f52942g;
            }
        }

        public a a() {
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
            return this.f52936a.equals(kVar.f52936a) && w1.c0.c(this.f52937b, kVar.f52937b) && w1.c0.c(this.f52938c, kVar.f52938c) && this.f52939d == kVar.f52939d && this.f52940e == kVar.f52940e && w1.c0.c(this.f52941f, kVar.f52941f) && w1.c0.c(this.f52942g, kVar.f52942g);
        }

        public int hashCode() {
            int iHashCode = this.f52936a.hashCode() * 31;
            String str = this.f52937b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f52938c;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f52939d) * 31) + this.f52940e) * 31;
            String str3 = this.f52941f;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f52942g;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        private k(a aVar) {
            this.f52936a = aVar.f52943a;
            this.f52937b = aVar.f52944b;
            this.f52938c = aVar.f52945c;
            this.f52939d = aVar.f52946d;
            this.f52940e = aVar.f52947e;
            this.f52941f = aVar.f52948f;
            this.f52942g = aVar.f52949g;
        }
    }

    public static r b(String str) {
        return new c().h(str).a();
    }

    public c a() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return w1.c0.c(this.f52817a, rVar.f52817a) && this.f52822f.equals(rVar.f52822f) && w1.c0.c(this.f52818b, rVar.f52818b) && w1.c0.c(this.f52820d, rVar.f52820d) && w1.c0.c(this.f52821e, rVar.f52821e) && w1.c0.c(this.f52824h, rVar.f52824h);
    }

    public int hashCode() {
        int iHashCode = this.f52817a.hashCode() * 31;
        h hVar = this.f52818b;
        return ((((((((iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f52820d.hashCode()) * 31) + this.f52822f.hashCode()) * 31) + this.f52821e.hashCode()) * 31) + this.f52824h.hashCode();
    }

    private r(String str, e eVar, h hVar, g gVar, t tVar, i iVar) {
        this.f52817a = str;
        this.f52818b = hVar;
        this.f52819c = hVar;
        this.f52820d = gVar;
        this.f52821e = tVar;
        this.f52822f = eVar;
        this.f52823g = eVar;
        this.f52824h = iVar;
    }
}
