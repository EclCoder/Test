package xo;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class q {
    public static ro.i a() {
        ro.i iVar = new ro.i();
        iVar.d(new ro.e("http", 80, ro.d.a()));
        iVar.d(new ro.e("https", 443, org.apache.http.conn.ssl.h.getSocketFactory()));
        return iVar;
    }
}
