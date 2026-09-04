package on;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f49052a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xn.h f49053b = xn.h.f56912d.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f49054c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f49055d = new String[64];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f49056e;

    static {
        String[] strArr = new String[256];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            kotlin.jvm.internal.s.g(binaryString, "toBinaryString(...)");
            strArr[i10] = bm.r.H(hn.p.j("%8s", binaryString), ' ', '0', false, 4, null);
        }
        f49056e = strArr;
        String[] strArr2 = f49055d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i11 = iArr[0];
        strArr2[i11 | 8] = strArr2[i11] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = iArr2[i12];
            int i14 = iArr[0];
            String[] strArr3 = f49055d;
            int i15 = i14 | i13;
            strArr3[i15] = strArr3[i14] + '|' + strArr3[i13];
            strArr3[i15 | 8] = strArr3[i14] + '|' + strArr3[i13] + "|PADDED";
        }
        int length = f49055d.length;
        for (int i16 = 0; i16 < length; i16++) {
            String[] strArr4 = f49055d;
            if (strArr4[i16] == null) {
                strArr4[i16] = f49056e[i16];
            }
        }
    }

    private e() {
    }

    public final String a(int i10, int i11) {
        String str;
        if (i11 == 0) {
            return "";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4 || i10 == 6) {
                return i11 == 1 ? "ACK" : f49056e[i11];
            }
            if (i10 != 7 && i10 != 8) {
                String[] strArr = f49055d;
                if (i11 < strArr.length) {
                    str = strArr[i11];
                    kotlin.jvm.internal.s.e(str);
                } else {
                    str = f49056e[i11];
                }
                String str2 = str;
                if (i10 != 5 || (i11 & 4) == 0) {
                    return (i10 != 0 || (i11 & 32) == 0) ? str2 : bm.r.I(str2, "PRIORITY", "COMPRESSED", false, 4, null);
                }
                return bm.r.I(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
            }
        }
        return f49056e[i11];
    }

    public final String b(int i10) {
        String[] strArr = f49054c;
        return i10 < strArr.length ? strArr[i10] : hn.p.j("0x%02x", Integer.valueOf(i10));
    }

    public final String c(boolean z10, int i10, int i11, int i12, int i13) {
        return hn.p.j("%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), b(i12), a(i12, i13));
    }

    public final String d(boolean z10, int i10, int i11, long j10) {
        return hn.p.j("%s 0x%08x %5d %-13s %d", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), b(8), Long.valueOf(j10));
    }
}
