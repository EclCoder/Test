package org.apache.http.impl.client;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class l implements oo.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f49292a = new l();

    @Override // oo.e
    public long a(co.q qVar, gp.f fVar) {
        ip.a.h(qVar, "HTTP response");
        org.apache.http.message.d dVar = new org.apache.http.message.d(qVar.headerIterator("Keep-Alive"));
        while (dVar.hasNext()) {
            co.e eVarNextElement = dVar.nextElement();
            String name = eVarNextElement.getName();
            String value = eVarNextElement.getValue();
            if (value != null && name.equalsIgnoreCase("timeout")) {
                try {
                    return Long.parseLong(value) * 1000;
                } catch (NumberFormatException unused) {
                    continue;
                }
            }
        }
        return -1L;
    }
}
