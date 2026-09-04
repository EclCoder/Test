package androidx.media3.datasource;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import z1.g;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f4709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4710c;

    public HttpDataSource$HttpDataSourceException(g gVar, int i10, int i11) {
        super(b(i10, i11));
        this.f4709b = gVar;
        this.f4710c = i11;
    }

    private static int b(int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            return 2001;
        }
        return i10;
    }

    public static HttpDataSource$HttpDataSourceException c(final IOException iOException, final g gVar, int i10) {
        int i11;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i11 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else {
            i11 = (message == null || !sc.c.e(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i11 == 2007 ? new HttpDataSource$HttpDataSourceException(iOException, gVar) { // from class: androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException
        } : new HttpDataSource$HttpDataSourceException(iOException, gVar, i11, i10);
    }

    public HttpDataSource$HttpDataSourceException(String str, g gVar, int i10, int i11) {
        super(str, b(i10, i11));
        this.f4709b = gVar;
        this.f4710c = i11;
    }

    public HttpDataSource$HttpDataSourceException(IOException iOException, g gVar, int i10, int i11) {
        super(iOException, b(i10, i11));
        this.f4709b = gVar;
        this.f4710c = i11;
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, g gVar, int i10, int i11) {
        super(str, iOException, b(i10, i11));
        this.f4709b = gVar;
        this.f4710c = i11;
    }
}
