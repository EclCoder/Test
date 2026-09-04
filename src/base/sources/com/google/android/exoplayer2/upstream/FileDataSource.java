package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import nb.e;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class FileDataSource extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RandomAccessFile f18732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f18733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f18734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f18735h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class FileDataSourceException extends DataSourceException {
        public FileDataSourceException(Throwable th2, int i10) {
            super(th2, i10);
        }

        public FileDataSourceException(String str, Throwable th2, int i10) {
            super(str, th2, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(Throwable th2) {
            return (th2 instanceof ErrnoException) && ((ErrnoException) th2).errno == OsConstants.EACCES;
        }
    }

    public FileDataSource() {
        super(false);
    }

    private static RandomAccessFile m(Uri uri) throws FileDataSourceException {
        try {
            return new RandomAccessFile((String) ob.a.e(uri.getPath()), CampaignEx.JSON_KEY_AD_R);
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(e10, (r0.f48425a < 21 || !a.b(e10.getCause())) ? 2005 : 2006);
            }
            throw new FileDataSourceException(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e10, 1004);
        } catch (SecurityException e11) {
            throw new FileDataSourceException(e11, 2006);
        } catch (RuntimeException e12) {
            throw new FileDataSourceException(e12, 2000);
        }
    }

    @Override // nb.j
    public void close() {
        this.f18733f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f18732e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f18732e = null;
                if (this.f18735h) {
                    this.f18735h = false;
                    j();
                }
            } catch (IOException e10) {
                throw new FileDataSourceException(e10, 2000);
            }
        } catch (Throwable th2) {
            this.f18732e = null;
            if (this.f18735h) {
                this.f18735h = false;
                j();
            }
            throw th2;
        }
    }

    @Override // nb.j
    public Uri getUri() {
        return this.f18733f;
    }

    @Override // nb.j
    public long h(com.google.android.exoplayer2.upstream.a aVar) throws FileDataSourceException {
        Uri uri = aVar.f18779a;
        this.f18733f = uri;
        k(aVar);
        RandomAccessFile randomAccessFileM = m(uri);
        this.f18732e = randomAccessFileM;
        try {
            randomAccessFileM.seek(aVar.f18785g);
            long length = aVar.f18786h;
            if (length == -1) {
                length = this.f18732e.length() - aVar.f18785g;
            }
            this.f18734g = length;
            if (length < 0) {
                throw new FileDataSourceException(null, null, 2008);
            }
            this.f18735h = true;
            l(aVar);
            return this.f18734g;
        } catch (IOException e10) {
            throw new FileDataSourceException(e10, 2000);
        }
    }

    @Override // nb.h
    public int read(byte[] bArr, int i10, int i11) throws FileDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f18734g == 0) {
            return -1;
        }
        try {
            int i12 = ((RandomAccessFile) r0.j(this.f18732e)).read(bArr, i10, (int) Math.min(this.f18734g, i11));
            if (i12 > 0) {
                this.f18734g -= (long) i12;
                i(i12);
            }
            return i12;
        } catch (IOException e10) {
            throw new FileDataSourceException(e10, 2000);
        }
    }
}
