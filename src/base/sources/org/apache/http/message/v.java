package org.apache.http.message;

import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f49432a = new v();

    public static BitSet a(int... iArr) {
        BitSet bitSet = new BitSet();
        for (int i10 : iArr) {
            bitSet.set(i10);
        }
        return bitSet;
    }

    public static boolean e(char c10) {
        return c10 == ' ' || c10 == '\t' || c10 == '\r' || c10 == '\n';
    }

    public void b(ip.c cVar, u uVar, BitSet bitSet, StringBuilder sb2) {
        int iB = uVar.b();
        int iC = uVar.c();
        for (int iB2 = uVar.b(); iB2 < iC; iB2++) {
            char cCharAt = cVar.charAt(iB2);
            if ((bitSet != null && bitSet.get(cCharAt)) || e(cCharAt)) {
                break;
            }
            iB++;
            sb2.append(cCharAt);
        }
        uVar.d(iB);
    }

    public void c(ip.c cVar, u uVar, StringBuilder sb2) {
        if (uVar.a()) {
            return;
        }
        int iB = uVar.b();
        int iB2 = uVar.b();
        int iC = uVar.c();
        if (cVar.charAt(iB) != '\"') {
            return;
        }
        int i10 = iB + 1;
        int i11 = iB2 + 1;
        boolean z10 = false;
        while (i11 < iC) {
            char cCharAt = cVar.charAt(i11);
            if (z10) {
                if (cCharAt != '\"' && cCharAt != '\\') {
                    sb2.append('\\');
                }
                sb2.append(cCharAt);
                z10 = false;
            } else if (cCharAt == '\"') {
                i10++;
                break;
            } else if (cCharAt == '\\') {
                z10 = true;
            } else if (cCharAt != '\r' && cCharAt != '\n') {
                sb2.append(cCharAt);
            }
            i11++;
            i10++;
        }
        uVar.d(i10);
    }

    public void d(ip.c cVar, u uVar, BitSet bitSet, StringBuilder sb2) {
        int iB = uVar.b();
        int iC = uVar.c();
        for (int iB2 = uVar.b(); iB2 < iC; iB2++) {
            char cCharAt = cVar.charAt(iB2);
            if ((bitSet != null && bitSet.get(cCharAt)) || e(cCharAt) || cCharAt == '\"') {
                break;
            }
            iB++;
            sb2.append(cCharAt);
        }
        uVar.d(iB);
    }

    public String f(ip.c cVar, u uVar, BitSet bitSet) {
        StringBuilder sb2 = new StringBuilder();
        loop0: while (true) {
            boolean z10 = false;
            while (true) {
                if (!uVar.a()) {
                    char cCharAt = cVar.charAt(uVar.b());
                    if (bitSet != null && bitSet.get(cCharAt)) {
                        break loop0;
                    }
                    if (e(cCharAt)) {
                        h(cVar, uVar);
                        z10 = true;
                    }
                } else {
                    break loop0;
                }
            }
            if (z10 && sb2.length() > 0) {
                sb2.append(' ');
            }
            b(cVar, uVar, bitSet, sb2);
        }
        return sb2.toString();
    }

    public String g(ip.c cVar, u uVar, BitSet bitSet) {
        char cCharAt;
        StringBuilder sb2 = new StringBuilder();
        loop0: while (true) {
            boolean z10 = false;
            while (true) {
                if (!uVar.a()) {
                    cCharAt = cVar.charAt(uVar.b());
                    if (bitSet != null && bitSet.get(cCharAt)) {
                        break loop0;
                    }
                    if (e(cCharAt)) {
                        h(cVar, uVar);
                        z10 = true;
                    }
                } else {
                    break loop0;
                }
            }
            if (cCharAt == '\"') {
                if (z10 && sb2.length() > 0) {
                    sb2.append(' ');
                }
                c(cVar, uVar, sb2);
            } else {
                if (z10 && sb2.length() > 0) {
                    sb2.append(' ');
                }
                d(cVar, uVar, bitSet, sb2);
            }
        }
        return sb2.toString();
    }

    public void h(ip.c cVar, u uVar) {
        int iB = uVar.b();
        int iC = uVar.c();
        for (int iB2 = uVar.b(); iB2 < iC && e(cVar.charAt(iB2)); iB2++) {
            iB++;
        }
        uVar.d(iB);
    }
}
