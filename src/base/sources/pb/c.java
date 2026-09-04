package pb;

import android.os.Bundle;
import java.util.Arrays;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements com.google.android.exoplayer2.g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f49823f = new c(1, 2, 3, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f49824g = new b().c(1).b(1).d(2).a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f49825h = r0.y0(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f49826i = r0.y0(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f49827j = r0.y0(2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f49828k = r0.y0(3);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final com.google.android.exoplayer2.g.a f49829l = new com.google.android.exoplayer2.g.a() { // from class: pb.b
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return c.a(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f49832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f49833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f49834e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f49835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f49836b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f49837c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f49838d;

        public c a() {
            return new c(this.f49835a, this.f49836b, this.f49837c, this.f49838d);
        }

        public b b(int i10) {
            this.f49836b = i10;
            return this;
        }

        public b c(int i10) {
            this.f49835a = i10;
            return this;
        }

        public b d(int i10) {
            this.f49837c = i10;
            return this;
        }

        public b() {
            this.f49835a = -1;
            this.f49836b = -1;
            this.f49837c = -1;
        }

        private b(c cVar) {
            this.f49835a = cVar.f49830a;
            this.f49836b = cVar.f49831b;
            this.f49837c = cVar.f49832c;
            this.f49838d = cVar.f49833d;
        }
    }

    public c(int i10, int i11, int i12, byte[] bArr) {
        this.f49830a = i10;
        this.f49831b = i11;
        this.f49832c = i12;
        this.f49833d = bArr;
    }

    public static /* synthetic */ c a(Bundle bundle) {
        return new c(bundle.getInt(f49825h, -1), bundle.getInt(f49826i, -1), bundle.getInt(f49827j, -1), bundle.getByteArray(f49828k));
    }

    private static String c(int i10) {
        if (i10 == -1) {
            return "Unset color range";
        }
        if (i10 != 1) {
            return i10 != 2 ? "Undefined color range" : "Limited range";
        }
        return "Full range";
    }

    private static String d(int i10) {
        if (i10 == -1) {
            return "Unset color space";
        }
        if (i10 == 6) {
            return "BT2020";
        }
        if (i10 != 1) {
            return i10 != 2 ? "Undefined color space" : "BT601";
        }
        return "BT709";
    }

    private static String e(int i10) {
        if (i10 == -1) {
            return "Unset color transfer";
        }
        if (i10 == 10) {
            return "Gamma 2.2";
        }
        if (i10 == 1) {
            return "Linear";
        }
        if (i10 == 2) {
            return "sRGB";
        }
        if (i10 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i10 != 6) {
            return i10 != 7 ? "Undefined color transfer" : "HLG";
        }
        return "ST2084 PQ";
    }

    public static boolean f(c cVar) {
        if (cVar == null) {
            return false;
        }
        int i10 = cVar.f49832c;
        return i10 == 7 || i10 == 6;
    }

    public static int h(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int i(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    public b b() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f49830a == cVar.f49830a && this.f49831b == cVar.f49831b && this.f49832c == cVar.f49832c && Arrays.equals(this.f49833d, cVar.f49833d)) {
                return true;
            }
        }
        return false;
    }

    public boolean g() {
        return (this.f49830a == -1 || this.f49831b == -1 || this.f49832c == -1) ? false : true;
    }

    public int hashCode() {
        if (this.f49834e == 0) {
            this.f49834e = ((((((527 + this.f49830a) * 31) + this.f49831b) * 31) + this.f49832c) * 31) + Arrays.hashCode(this.f49833d);
        }
        return this.f49834e;
    }

    public String j() {
        return !g() ? "NA" : r0.D("%s/%s/%s", d(this.f49830a), c(this.f49831b), e(this.f49832c));
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f49825h, this.f49830a);
        bundle.putInt(f49826i, this.f49831b);
        bundle.putInt(f49827j, this.f49832c);
        bundle.putByteArray(f49828k, this.f49833d);
        return bundle;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(d(this.f49830a));
        sb2.append(", ");
        sb2.append(c(this.f49831b));
        sb2.append(", ");
        sb2.append(e(this.f49832c));
        sb2.append(", ");
        sb2.append(this.f49833d != null);
        sb2.append(")");
        return sb2.toString();
    }
}
