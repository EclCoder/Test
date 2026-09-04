package r6;

import android.content.Context;
import android.media.MediaDataSource;
import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import t6.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class a extends MediaDataSource {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f51105e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f51106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f51107b = -2147483648L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f51108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.bykv.vk.openvk.hnj.hnj.hnj.qor.c f51109d;

    public a(Context context, com.bykv.vk.openvk.hnj.hnj.hnj.qor.c cVar) {
        this.f51108c = context;
        this.f51109d = cVar;
        this.f51106a = new t6.a(cVar);
    }

    public static a h(Context context, com.bykv.vk.openvk.hnj.hnj.hnj.qor.c cVar) {
        a aVar = new a(context, cVar);
        f51105e.put(cVar.uua(), aVar);
        return aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f51109d.jip();
        c cVar = this.f51106a;
        if (cVar != null) {
            cVar.hn();
        }
        f51105e.remove(this.f51109d.uua());
    }

    public com.bykv.vk.openvk.hnj.hnj.hnj.qor.c d() {
        return this.f51109d;
    }

    @Override // android.media.MediaDataSource
    public long getSize() {
        if (this.f51107b == -2147483648L) {
            if (this.f51108c == null || TextUtils.isEmpty(this.f51109d.jip())) {
                return -1L;
            }
            this.f51107b = this.f51106a.qor();
        }
        return this.f51107b;
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j10, byte[] bArr, int i10, int i11) {
        int iA = this.f51106a.a(j10, bArr, i10, i11);
        int length = bArr.length;
        return iA;
    }
}
