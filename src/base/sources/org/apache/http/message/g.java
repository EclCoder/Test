package org.apache.http.message;

import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class g implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f49391b = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f49392c = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final BitSet f49393d = v.a(61, 59, 44);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final BitSet f49394e = v.a(59, 44);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f49395a = v.f49432a;

    public static co.e[] e(String str, r rVar) {
        ip.a.h(str, "Value");
        ip.c cVar = new ip.c(str.length());
        cVar.b(str);
        u uVar = new u(0, str.length());
        if (rVar == null) {
            rVar = f49392c;
        }
        return rVar.b(cVar, uVar);
    }

    @Override // org.apache.http.message.r
    public co.e a(ip.c cVar, u uVar) {
        ip.a.h(cVar, "Char array buffer");
        ip.a.h(uVar, "Parser cursor");
        co.u uVarF = f(cVar, uVar);
        return c(uVarF.getName(), uVarF.getValue(), (uVar.a() || cVar.charAt(uVar.b() + (-1)) == ',') ? null : g(cVar, uVar));
    }

    @Override // org.apache.http.message.r
    public co.e[] b(ip.c cVar, u uVar) {
        ip.a.h(cVar, "Char array buffer");
        ip.a.h(uVar, "Parser cursor");
        ArrayList arrayList = new ArrayList();
        while (!uVar.a()) {
            co.e eVarA = a(cVar, uVar);
            if (!eVarA.getName().isEmpty() || eVarA.getValue() != null) {
                arrayList.add(eVarA);
            }
        }
        return (co.e[]) arrayList.toArray(new co.e[arrayList.size()]);
    }

    protected co.e c(String str, String str2, co.u[] uVarArr) {
        return new c(str, str2, uVarArr);
    }

    protected co.u d(String str, String str2) {
        return new m(str, str2);
    }

    public co.u f(ip.c cVar, u uVar) {
        ip.a.h(cVar, "Char array buffer");
        ip.a.h(uVar, "Parser cursor");
        String strF = this.f49395a.f(cVar, uVar, f49393d);
        if (uVar.a()) {
            return new m(strF, null);
        }
        char cCharAt = cVar.charAt(uVar.b());
        uVar.d(uVar.b() + 1);
        if (cCharAt != '=') {
            return d(strF, null);
        }
        String strG = this.f49395a.g(cVar, uVar, f49394e);
        if (!uVar.a()) {
            uVar.d(uVar.b() + 1);
        }
        return d(strF, strG);
    }

    public co.u[] g(ip.c cVar, u uVar) {
        ip.a.h(cVar, "Char array buffer");
        ip.a.h(uVar, "Parser cursor");
        this.f49395a.h(cVar, uVar);
        ArrayList arrayList = new ArrayList();
        while (!uVar.a()) {
            arrayList.add(f(cVar, uVar));
            if (cVar.charAt(uVar.b() - 1) == ',') {
                break;
            }
        }
        return (co.u[]) arrayList.toArray(new co.u[arrayList.size()]);
    }
}
