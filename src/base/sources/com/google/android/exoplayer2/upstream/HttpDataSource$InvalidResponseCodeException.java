package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f18741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f18742g;

    public HttpDataSource$InvalidResponseCodeException(int i10, String str, IOException iOException, Map map, a aVar, byte[] bArr) {
        super("Response code: " + i10, iOException, aVar, 2004, 1);
        this.f18739d = i10;
        this.f18740e = str;
        this.f18741f = map;
        this.f18742g = bArr;
    }
}
