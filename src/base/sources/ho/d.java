package ho;

import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d f40729a = new d();

    public static d b() {
        return f40729a;
    }

    @Override // ho.e
    public InputStream a(InputStream inputStream) {
        return new GZIPInputStream(inputStream);
    }
}
