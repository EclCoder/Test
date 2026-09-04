package co;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface n {
    void addHeader(d dVar);

    void addHeader(String str, String str2);

    boolean containsHeader(String str);

    d[] getAllHeaders();

    d getFirstHeader(String str);

    d[] getHeaders(String str);

    d getLastHeader(String str);

    ep.d getParams();

    v getProtocolVersion();

    g headerIterator();

    g headerIterator(String str);

    void removeHeaders(String str);

    void setHeader(String str, String str2);

    void setHeaders(d[] dVarArr);

    void setParams(ep.d dVar);
}
