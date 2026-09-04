package org.apache.http.message;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f49389a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f49390b = new f();

    protected void a(ip.c cVar, String str, boolean z10) {
        if (!z10) {
            for (int i10 = 0; i10 < str.length() && !z10; i10++) {
                z10 = f(str.charAt(i10));
            }
        }
        if (z10) {
            cVar.a('\"');
        }
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (g(cCharAt)) {
                cVar.a('\\');
            }
            cVar.a(cCharAt);
        }
        if (z10) {
            cVar.a('\"');
        }
    }

    protected int b(co.u uVar) {
        if (uVar == null) {
            return 0;
        }
        int length = uVar.getName().length();
        String value = uVar.getValue();
        return value != null ? length + value.length() + 3 : length;
    }

    protected int c(co.u[] uVarArr) {
        if (uVarArr == null || uVarArr.length < 1) {
            return 0;
        }
        int length = (uVarArr.length - 1) * 2;
        for (co.u uVar : uVarArr) {
            length += b(uVar);
        }
        return length;
    }

    public ip.c d(ip.c cVar, co.u uVar, boolean z10) {
        ip.a.h(uVar, "Name / value pair");
        int iB = b(uVar);
        if (cVar == null) {
            cVar = new ip.c(iB);
        } else {
            cVar.d(iB);
        }
        cVar.b(uVar.getName());
        String value = uVar.getValue();
        if (value != null) {
            cVar.a('=');
            a(cVar, value, z10);
        }
        return cVar;
    }

    public ip.c e(ip.c cVar, co.u[] uVarArr, boolean z10) {
        ip.a.h(uVarArr, "Header parameter array");
        int iC = c(uVarArr);
        if (cVar == null) {
            cVar = new ip.c(iC);
        } else {
            cVar.d(iC);
        }
        for (int i10 = 0; i10 < uVarArr.length; i10++) {
            if (i10 > 0) {
                cVar.b("; ");
            }
            d(cVar, uVarArr[i10], z10);
        }
        return cVar;
    }

    protected boolean f(char c10) {
        return " ;,:@()<>\\\"/[]?={}\t".indexOf(c10) >= 0;
    }

    protected boolean g(char c10) {
        return "\"\\".indexOf(c10) >= 0;
    }
}
