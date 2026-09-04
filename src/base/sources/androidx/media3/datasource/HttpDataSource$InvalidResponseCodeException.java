package androidx.media3.datasource;

import java.io.IOException;
import java.util.Map;
import z1.g;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f4714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f4715g;

    public HttpDataSource$InvalidResponseCodeException(int i10, String str, IOException iOException, Map map, g gVar, byte[] bArr) {
        super("Response code: " + i10, iOException, gVar, 2004, 1);
        this.f4712d = i10;
        this.f4713e = str;
        this.f4714f = map;
        this.f4715g = bArr;
    }
}
