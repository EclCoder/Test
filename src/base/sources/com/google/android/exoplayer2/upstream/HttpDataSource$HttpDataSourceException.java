package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f18736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18737c;

    public HttpDataSource$HttpDataSourceException(a aVar, int i10, int i11) {
        super(b(i10, i11));
        this.f18736b = aVar;
        this.f18737c = i11;
    }

    private static int b(int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            return 2001;
        }
        return i10;
    }

    public static HttpDataSource$HttpDataSourceException c(final IOException iOException, final a aVar, int i10) {
        int i11;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i11 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else {
            i11 = (message == null || !sc.c.e(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i11 == 2007 ? new HttpDataSource$HttpDataSourceException(iOException, aVar) { // from class: com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException
        } : new HttpDataSource$HttpDataSourceException(iOException, aVar, i11, i10);
    }

    public HttpDataSource$HttpDataSourceException(String str, a aVar, int i10, int i11) {
        super(str, b(i10, i11));
        this.f18736b = aVar;
        this.f18737c = i11;
    }

    public HttpDataSource$HttpDataSourceException(IOException iOException, a aVar, int i10, int i11) {
        super(iOException, b(i10, i11));
        this.f18736b = aVar;
        this.f18737c = i11;
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, a aVar, int i10, int i11) {
        super(str, iOException, b(i10, i11));
        this.f18736b = aVar;
        this.f18737c = i11;
    }
}
