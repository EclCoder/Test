package r3;

import android.text.TextUtils;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.common.collect.g0;
import com.google.common.collect.g1;
import com.google.common.collect.i0;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f51011d = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final g0 f51012e = g0.B("auto", DevicePublicKeyStringDef.NONE);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final g0 f51013f = g0.C("dot", "sesame", "circle");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final g0 f51014g = g0.B("filled", com.vungle.ads.internal.presenter.g.OPEN);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final g0 f51015h = g0.C("after", "before", "outside");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f51017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f51018c;

    private b(int i10, int i11, int i12) {
        this.f51016a = i10;
        this.f51017b = i11;
        this.f51018c = i12;
    }

    public static b a(String str) {
        if (str == null) {
            return null;
        }
        String strE = sc.c.e(str.trim());
        if (strE.isEmpty()) {
            return null;
        }
        return b(g0.w(TextUtils.split(strE, f51011d)));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00da  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ee  */
    private static b b(g0 g0Var) {
        int i10;
        g1.e eVarE;
        int i11;
        g1.e eVarE2;
        g1.e eVarE3;
        String str;
        int iHashCode;
        int i12;
        String str2;
        int iHashCode2;
        String str3;
        int iHashCode3;
        String str4 = (String) i0.c(g1.e(f51015h, g0Var), "outside");
        int iHashCode4 = str4.hashCode();
        int i13 = 1;
        if (iHashCode4 != -1392885889) {
            if (iHashCode4 != -1106037339) {
                if (iHashCode4 == 92734940 && str4.equals("after")) {
                    i10 = 2;
                }
            } else if (str4.equals("outside")) {
                i10 = -2;
            }
            eVarE = g1.e(f51012e, g0Var);
            i11 = -1;
            if (!eVarE.isEmpty()) {
                str3 = (String) eVarE.iterator().next();
                iHashCode3 = str3.hashCode();
                if (iHashCode3 != 3005871) {
                    str3.equals("auto");
                } else if (iHashCode3 == 3387192 && str3.equals(DevicePublicKeyStringDef.NONE)) {
                    i11 = 0;
                }
                return new b(i11, 0, i10);
            }
            eVarE2 = g1.e(f51014g, g0Var);
            eVarE3 = g1.e(f51013f, g0Var);
            if (!eVarE2.isEmpty() && eVarE3.isEmpty()) {
                return new b(-1, 0, i10);
            }
            str = (String) i0.c(eVarE2, "filled");
            iHashCode = str.hashCode();
            if (iHashCode != -1274499742) {
                if (iHashCode == 3417674 && str.equals(com.vungle.ads.internal.presenter.g.OPEN)) {
                    i12 = 2;
                }
                str2 = (String) i0.c(eVarE3, "circle");
                iHashCode2 = str2.hashCode();
                if (iHashCode2 != -1360216880) {
                    str2.equals("circle");
                } else if (iHashCode2 != -905816648) {
                    if (iHashCode2 == 99657 && str2.equals("dot")) {
                        i13 = 2;
                    }
                } else if (str2.equals("sesame")) {
                    i13 = 3;
                }
                return new b(i13, i12, i10);
            }
            str.equals("filled");
            i12 = 1;
            str2 = (String) i0.c(eVarE3, "circle");
            iHashCode2 = str2.hashCode();
            if (iHashCode2 != -1360216880) {
                str2.equals("circle");
            } else if (iHashCode2 != -905816648) {
                if (iHashCode2 == 99657) {
                    i13 = 2;
                }
            } else if (str2.equals("sesame")) {
                i13 = 3;
            }
            return new b(i13, i12, i10);
        }
        str4.equals("before");
        i10 = 1;
        eVarE = g1.e(f51012e, g0Var);
        i11 = -1;
        if (!eVarE.isEmpty()) {
            str3 = (String) eVarE.iterator().next();
            iHashCode3 = str3.hashCode();
            if (iHashCode3 != 3005871) {
                str3.equals("auto");
            } else if (iHashCode3 == 3387192) {
                i11 = 0;
            }
            return new b(i11, 0, i10);
        }
        eVarE2 = g1.e(f51014g, g0Var);
        eVarE3 = g1.e(f51013f, g0Var);
        if (!eVarE2.isEmpty()) {
        }
        str = (String) i0.c(eVarE2, "filled");
        iHashCode = str.hashCode();
        if (iHashCode != -1274499742) {
            if (iHashCode == 3417674) {
                i12 = 2;
            }
            str2 = (String) i0.c(eVarE3, "circle");
            iHashCode2 = str2.hashCode();
            if (iHashCode2 != -1360216880) {
                str2.equals("circle");
            } else if (iHashCode2 != -905816648) {
                if (iHashCode2 == 99657) {
                    i13 = 2;
                }
            } else if (str2.equals("sesame")) {
                i13 = 3;
            }
            return new b(i13, i12, i10);
        }
        str.equals("filled");
        i12 = 1;
        str2 = (String) i0.c(eVarE3, "circle");
        iHashCode2 = str2.hashCode();
        if (iHashCode2 != -1360216880) {
            str2.equals("circle");
        } else if (iHashCode2 != -905816648) {
            if (iHashCode2 == 99657) {
                i13 = 2;
            }
        } else if (str2.equals("sesame")) {
            i13 = 3;
        }
        return new b(i13, i12, i10);
    }
}
