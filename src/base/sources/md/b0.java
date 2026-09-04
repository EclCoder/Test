package md;

import com.mbridge.msdk.dycreator.baseview.qEqO.QGbBllacZSmHKn;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b0 extends h0.f.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f45946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f45948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f45949d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends h0.f.e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f45950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f45951b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f45952c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f45953d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f45954e;

        b() {
        }

        @Override // md.h0.f.e.a
        public h0.f.e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f45952c = str;
            return this;
        }

        @Override // md.h0.f.e.a
        public h0.f.e.a c(boolean z10) {
            this.f45953d = z10;
            this.f45954e = (byte) (this.f45954e | 2);
            return this;
        }

        @Override // md.h0.f.e.a
        public h0.f.e.a d(int i10) {
            this.f45950a = i10;
            this.f45954e = (byte) (this.f45954e | 1);
            return this;
        }

        @Override // md.h0.f.e.a
        public h0.f.e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f45951b = str;
            return this;
        }

        @Override // md.h0.f.e.a
        public h0.f.e a() {
            String str;
            String str2;
            if (this.f45954e == 3 && (str = this.f45951b) != null && (str2 = this.f45952c) != null) {
                return new b0(this.f45950a, str, str2, this.f45953d);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f45954e & 1) == 0) {
                sb2.append(" platform");
            }
            if (this.f45951b == null) {
                sb2.append(QGbBllacZSmHKn.fbmMJriEX);
            }
            if (this.f45952c == null) {
                sb2.append(" buildVersion");
            }
            if ((this.f45954e & 2) == 0) {
                sb2.append(" jailbroken");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }
    }

    @Override // md.h0.f.e
    public String b() {
        return this.f45948c;
    }

    @Override // md.h0.f.e
    public int c() {
        return this.f45946a;
    }

    @Override // md.h0.f.e
    public String d() {
        return this.f45947b;
    }

    @Override // md.h0.f.e
    public boolean e() {
        return this.f45949d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0.f.e) {
            h0.f.e eVar = (h0.f.e) obj;
            if (this.f45946a == eVar.c() && this.f45947b.equals(eVar.d()) && this.f45948c.equals(eVar.b()) && this.f45949d == eVar.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f45946a ^ 1000003) * 1000003) ^ this.f45947b.hashCode()) * 1000003) ^ this.f45948c.hashCode()) * 1000003) ^ (this.f45949d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f45946a + ", version=" + this.f45947b + ", buildVersion=" + this.f45948c + ", jailbroken=" + this.f45949d + "}";
    }

    private b0(int i10, String str, String str2, boolean z10) {
        this.f45946a = i10;
        this.f45947b = str;
        this.f45948c = str2;
        this.f45949d = z10;
    }
}
