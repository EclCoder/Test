package org.apache.http.impl.client;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class k extends vo.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f49291b = new k();

    @Override // vo.c, co.a
    public boolean a(co.q qVar, gp.f fVar) {
        co.o oVar = (co.o) fVar.getAttribute("http.request");
        if (oVar != null) {
            co.d[] headers = oVar.getHeaders("Connection");
            if (headers.length != 0) {
                org.apache.http.message.p pVar = new org.apache.http.message.p(new org.apache.http.message.e(headers, null));
                while (pVar.hasNext()) {
                    if ("Close".equalsIgnoreCase(pVar.nextToken())) {
                        return false;
                    }
                }
            }
        }
        return super.a(qVar, fVar);
    }
}
