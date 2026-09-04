package androidx.media3.datasource;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import w1.c0;
import z1.g;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class AssetDataSource extends z1.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AssetManager f4692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f4693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InputStream f4694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f4695h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f4696i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class AssetDataSourceException extends DataSourceException {
        public AssetDataSourceException(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public AssetDataSource(Context context) {
        super(false);
        this.f4692e = context.getAssets();
    }

    @Override // androidx.media3.datasource.a
    public long a(g gVar) throws AssetDataSourceException {
        try {
            Uri uri = gVar.f58544a;
            this.f4693f = uri;
            String strSubstring = (String) w1.a.e(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            f(gVar);
            InputStream inputStreamOpen = this.f4692e.open(strSubstring, 1);
            this.f4694g = inputStreamOpen;
            if (inputStreamOpen.skip(gVar.f58550g) < gVar.f58550g) {
                throw new AssetDataSourceException(null, 2008);
            }
            long j10 = gVar.f58551h;
            if (j10 != -1) {
                this.f4695h = j10;
            } else {
                long jAvailable = this.f4694g.available();
                this.f4695h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f4695h = -1L;
                }
            }
            this.f4696i = true;
            g(gVar);
            return this.f4695h;
        } catch (AssetDataSourceException e10) {
            throw e10;
        } catch (IOException e11) {
            throw new AssetDataSourceException(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        this.f4693f = null;
        try {
            try {
                InputStream inputStream = this.f4694g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f4694g = null;
                if (this.f4696i) {
                    this.f4696i = false;
                    e();
                }
            } catch (IOException e10) {
                throw new AssetDataSourceException(e10, 2000);
            }
        } catch (Throwable th2) {
            this.f4694g = null;
            if (this.f4696i) {
                this.f4696i = false;
                e();
            }
            throw th2;
        }
    }

    @Override // androidx.media3.datasource.a
    public Uri getUri() {
        return this.f4693f;
    }

    @Override // t1.g
    public int read(byte[] bArr, int i10, int i11) throws AssetDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f4695h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new AssetDataSourceException(e10, 2000);
            }
        }
        int i12 = ((InputStream) c0.h(this.f4694g)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f4695h;
        if (j11 != -1) {
            this.f4695h = j11 - ((long) i12);
        }
        d(i12);
        return i12;
    }
}
