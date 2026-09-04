package md;

import com.bytedance.adsdk.ugeno.ojm.hnj.mzIi.obFGmWgqyy;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class c extends h0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f45955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f45957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f45958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f45959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f45960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f45961g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f45962h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f45963i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends h0.a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f45964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f45965b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f45966c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f45967d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f45968e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f45969f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f45970g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f45971h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List f45972i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte f45973j;

        b() {
        }

        @Override // md.h0.a.b
        public h0.a.b b(List list) {
            this.f45972i = list;
            return this;
        }

        @Override // md.h0.a.b
        public h0.a.b c(int i10) {
            this.f45967d = i10;
            this.f45973j = (byte) (this.f45973j | 4);
            return this;
        }

        @Override // md.h0.a.b
        public h0.a.b d(int i10) {
            this.f45964a = i10;
            this.f45973j = (byte) (this.f45973j | 1);
            return this;
        }

        @Override // md.h0.a.b
        public h0.a.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f45965b = str;
            return this;
        }

        @Override // md.h0.a.b
        public h0.a.b f(long j10) {
            this.f45968e = j10;
            this.f45973j = (byte) (this.f45973j | 8);
            return this;
        }

        @Override // md.h0.a.b
        public h0.a.b g(int i10) {
            this.f45966c = i10;
            this.f45973j = (byte) (this.f45973j | 2);
            return this;
        }

        @Override // md.h0.a.b
        public h0.a.b h(long j10) {
            this.f45969f = j10;
            this.f45973j = (byte) (this.f45973j | 16);
            return this;
        }

        @Override // md.h0.a.b
        public h0.a.b i(long j10) {
            this.f45970g = j10;
            this.f45973j = (byte) (this.f45973j | 32);
            return this;
        }

        @Override // md.h0.a.b
        public h0.a.b j(String str) {
            this.f45971h = str;
            return this;
        }

        @Override // md.h0.a.b
        public h0.a a() {
            String str;
            if (this.f45973j == 63 && (str = this.f45965b) != null) {
                return new c(this.f45964a, str, this.f45966c, this.f45967d, this.f45968e, this.f45969f, this.f45970g, this.f45971h, this.f45972i);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f45973j & 1) == 0) {
                sb2.append(" pid");
            }
            if (this.f45965b == null) {
                sb2.append(" processName");
            }
            if ((this.f45973j & 2) == 0) {
                sb2.append(obFGmWgqyy.XygUbG);
            }
            if ((this.f45973j & 4) == 0) {
                sb2.append(" importance");
            }
            if ((this.f45973j & 8) == 0) {
                sb2.append(" pss");
            }
            if ((this.f45973j & 16) == 0) {
                sb2.append(" rss");
            }
            if ((this.f45973j & 32) == 0) {
                sb2.append(" timestamp");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }
    }

    @Override // md.h0.a
    public List b() {
        return this.f45963i;
    }

    @Override // md.h0.a
    public int c() {
        return this.f45958d;
    }

    @Override // md.h0.a
    public int d() {
        return this.f45955a;
    }

    @Override // md.h0.a
    public String e() {
        return this.f45956b;
    }

    public boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0.a) {
            h0.a aVar = (h0.a) obj;
            if (this.f45955a == aVar.d() && this.f45956b.equals(aVar.e()) && this.f45957c == aVar.g() && this.f45958d == aVar.c() && this.f45959e == aVar.f() && this.f45960f == aVar.h() && this.f45961g == aVar.i() && ((str = this.f45962h) != null ? str.equals(aVar.j()) : aVar.j() == null) && ((list = this.f45963i) != null ? list.equals(aVar.b()) : aVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // md.h0.a
    public long f() {
        return this.f45959e;
    }

    @Override // md.h0.a
    public int g() {
        return this.f45957c;
    }

    @Override // md.h0.a
    public long h() {
        return this.f45960f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f45955a ^ 1000003) * 1000003) ^ this.f45956b.hashCode()) * 1000003) ^ this.f45957c) * 1000003) ^ this.f45958d) * 1000003;
        long j10 = this.f45959e;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f45960f;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f45961g;
        int i12 = (i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.f45962h;
        int iHashCode2 = (i12 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f45963i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // md.h0.a
    public long i() {
        return this.f45961g;
    }

    @Override // md.h0.a
    public String j() {
        return this.f45962h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f45955a + ", processName=" + this.f45956b + ", reasonCode=" + this.f45957c + ", importance=" + this.f45958d + ", pss=" + this.f45959e + ", rss=" + this.f45960f + ", timestamp=" + this.f45961g + ", traceFile=" + this.f45962h + ", buildIdMappingForArch=" + this.f45963i + "}";
    }

    private c(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List list) {
        this.f45955a = i10;
        this.f45956b = str;
        this.f45957c = i11;
        this.f45958d = i12;
        this.f45959e = j10;
        this.f45960f = j11;
        this.f45961g = j12;
        this.f45962h = str2;
        this.f45963i = list;
    }
}
