package zo;

import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f59064b = new v();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final BitSet f59065c = org.apache.http.message.v.a(61, 59);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final BitSet f59066d = org.apache.http.message.v.a(59);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final org.apache.http.message.v f59067a = org.apache.http.message.v.f49432a;

    private co.u b(ip.c cVar, org.apache.http.message.u uVar) {
        String strF = this.f59067a.f(cVar, uVar, f59065c);
        if (uVar.a()) {
            return new org.apache.http.message.m(strF, null);
        }
        char cCharAt = cVar.charAt(uVar.b());
        uVar.d(uVar.b() + 1);
        if (cCharAt != '=') {
            return new org.apache.http.message.m(strF, null);
        }
        String strF2 = this.f59067a.f(cVar, uVar, f59066d);
        if (!uVar.a()) {
            uVar.d(uVar.b() + 1);
        }
        return new org.apache.http.message.m(strF, strF2);
    }

    public co.e a(ip.c cVar, org.apache.http.message.u uVar) {
        ip.a.h(cVar, "Char array buffer");
        ip.a.h(uVar, "Parser cursor");
        co.u uVarB = b(cVar, uVar);
        ArrayList arrayList = new ArrayList();
        while (!uVar.a()) {
            arrayList.add(b(cVar, uVar));
        }
        return new org.apache.http.message.c(uVarB.getName(), uVarB.getValue(), (co.u[]) arrayList.toArray(new co.u[arrayList.size()]));
    }
}
