package un;

import am.j;
import gl.r;
import hn.m;
import java.net.IDN;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import xn.h;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f54857b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h f54858c = h.f56912d.e(42);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List f54859d = r.e("*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static c f54860e = new c(e.a(d.f54862a));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f54861a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(h hVar, h[] hVarArr, int i10) {
            int i11;
            int iB;
            boolean z10;
            int iB2;
            int iD = hVar.D();
            int i12 = 0;
            while (i12 < iD) {
                int i13 = (i12 + iD) / 2;
                while (i13 > -1 && hVar.j(i13) != 10) {
                    i13--;
                }
                int i14 = i13 + 1;
                int i15 = 1;
                while (true) {
                    i11 = i14 + i15;
                    if (hVar.j(i11) == 10) {
                        break;
                    }
                    i15++;
                }
                int i16 = i11 - i14;
                int i17 = i10;
                boolean z11 = false;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    if (z11) {
                        iB = 46;
                        z10 = false;
                    } else {
                        boolean z12 = z11;
                        iB = m.b(hVarArr[i17].j(i18), 255);
                        z10 = z12;
                    }
                    iB2 = iB - m.b(hVar.j(i14 + i19), 255);
                    if (iB2 != 0) {
                        break;
                    }
                    i19++;
                    i18++;
                    if (i19 == i16) {
                        break;
                    }
                    if (hVarArr[i17].D() != i18) {
                        z11 = z10;
                    } else {
                        if (i17 == hVarArr.length - 1) {
                            break;
                        }
                        i17++;
                        z11 = true;
                        i18 = -1;
                    }
                }
                if (iB2 >= 0) {
                    if (iB2 <= 0) {
                        int i20 = i16 - i19;
                        int iD2 = hVarArr[i17].D() - i18;
                        int length = hVarArr.length;
                        for (int i21 = i17 + 1; i21 < length; i21++) {
                            iD2 += hVarArr[i21].D();
                        }
                        if (iD2 >= i20) {
                            if (iD2 <= i20) {
                                return hVar.G(i14, i16 + i14).F(bm.d.f9079b);
                            }
                        }
                    }
                    i12 = i11 + 1;
                }
                iD = i13;
            }
            return null;
        }

        public final c c() {
            return c.f54860e;
        }

        private a() {
        }
    }

    public c(d publicSuffixList) {
        s.h(publicSuffixList, "publicSuffixList");
        this.f54861a = publicSuffixList;
    }

    private final List b(List list) {
        String str;
        String strB;
        String str2;
        List listL;
        List listL2;
        this.f54861a.b();
        int size = list.size();
        h[] hVarArr = new h[size];
        for (int i10 = 0; i10 < size; i10++) {
            hVarArr[i10] = h.f56912d.d((String) list.get(i10));
        }
        int i11 = 0;
        while (true) {
            str = null;
            if (i11 >= size) {
                strB = null;
                break;
            }
            strB = f54857b.b(this.f54861a.a(), hVarArr, i11);
            if (strB != null) {
                break;
            }
            i11++;
        }
        if (size <= 1) {
            str2 = null;
            break;
        }
        h[] hVarArr2 = (h[]) hVarArr.clone();
        int length = hVarArr2.length - 1;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                str2 = null;
                break;
            }
            hVarArr2[i12] = f54858c;
            String strB2 = f54857b.b(this.f54861a.a(), hVarArr2, i12);
            if (strB2 != null) {
                str2 = strB2;
                break;
            }
            i12++;
        }
        if (str2 != null) {
            int i13 = size - 1;
            for (int i14 = 0; i14 < i13; i14++) {
                String strB3 = f54857b.b(this.f54861a.c(), hVarArr, i14);
                if (strB3 != null) {
                    str = strB3;
                    break;
                }
            }
        }
        if (str != null) {
            return bm.r.E0('!' + str, new char[]{'.'}, false, 0, 6, null);
        }
        if (strB == null && str2 == null) {
            return f54859d;
        }
        if (strB == null || (listL = bm.r.E0(strB, new char[]{'.'}, false, 0, 6, null)) == null) {
            listL = r.l();
        }
        if (str2 == null || (listL2 = bm.r.E0(str2, new char[]{'.'}, false, 0, 6, null)) == null) {
            listL2 = r.l();
        }
        return listL.size() > listL2.size() ? listL : listL2;
    }

    private final List d(String str) {
        List listE0 = bm.r.E0(str, new char[]{'.'}, false, 0, 6, null);
        return s.c(r.n0(listE0), "") ? r.X(listE0, 1) : listE0;
    }

    public final String c(String domain) {
        int size;
        int size2;
        s.h(domain, "domain");
        String unicode = IDN.toUnicode(domain);
        s.e(unicode);
        List listD = d(unicode);
        List listB = b(listD);
        if (listD.size() == listB.size() && ((String) listB.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listB.get(0)).charAt(0) == '!') {
            size = listD.size();
            size2 = listB.size();
        } else {
            size = listD.size();
            size2 = listB.size() + 1;
        }
        return j.w(j.n(r.T(d(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }
}
