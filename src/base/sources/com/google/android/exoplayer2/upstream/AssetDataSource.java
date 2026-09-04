package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import nb.e;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class AssetDataSource extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AssetManager f18720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f18721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InputStream f18722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f18723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f18724i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class AssetDataSourceException extends DataSourceException {
        public AssetDataSourceException(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public AssetDataSource(Context context) {
        super(false);
        this.f18720e = context.getAssets();
    }

    @Override // nb.j
    public void close() {
        this.f18721f = null;
        try {
            try {
                InputStream inputStream = this.f18722g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f18722g = null;
                if (this.f18724i) {
                    this.f18724i = false;
                    j();
                }
            } catch (IOException e10) {
                throw new AssetDataSourceException(e10, 2000);
            }
        } catch (Throwable th2) {
            this.f18722g = null;
            if (this.f18724i) {
                this.f18724i = false;
                j();
            }
            throw th2;
        }
    }

    @Override // nb.j
    public Uri getUri() {
        return this.f18721f;
    }

    @Override // nb.j
    public long h(a aVar) throws AssetDataSourceException {
        try {
            Uri uri = aVar.f18779a;
            this.f18721f = uri;
            String strSubstring = (String) ob.a.e(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            k(aVar);
            InputStream inputStreamOpen = this.f18720e.open(strSubstring, 1);
            this.f18722g = inputStreamOpen;
            if (inputStreamOpen.skip(aVar.f18785g) < aVar.f18785g) {
                throw new AssetDataSourceException(null, 2008);
            }
            long j10 = aVar.f18786h;
            if (j10 != -1) {
                this.f18723h = j10;
            } else {
                long jAvailable = this.f18722g.available();
                this.f18723h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f18723h = -1L;
                }
            }
            this.f18724i = true;
            l(aVar);
            return this.f18723h;
        } catch (AssetDataSourceException e10) {
            throw e10;
        } catch (IOException e11) {
            throw new AssetDataSourceException(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // nb.h
    public int read(byte[] bArr, int i10, int i11) throws AssetDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f18723h;
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
        int i12 = ((InputStream) r0.j(this.f18722g)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f18723h;
        if (j11 != -1) {
            this.f18723h = j11 - ((long) i12);
        }
        i(i12);
        return i12;
    }
}
