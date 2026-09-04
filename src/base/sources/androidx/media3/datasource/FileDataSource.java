package androidx.media3.datasource;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import w1.c0;
import z1.g;
import z1.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class FileDataSource extends z1.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RandomAccessFile f4704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f4705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f4706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f4707h;

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

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements androidx.media3.datasource.a.InterfaceC0055a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private m f4708a;

        @Override // androidx.media3.datasource.a.InterfaceC0055a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FileDataSource createDataSource() {
            FileDataSource fileDataSource = new FileDataSource();
            m mVar = this.f4708a;
            if (mVar != null) {
                fileDataSource.c(mVar);
            }
            return fileDataSource;
        }
    }

    public FileDataSource() {
        super(false);
    }

    private static RandomAccessFile h(Uri uri) throws FileDataSourceException {
        try {
            return new RandomAccessFile((String) w1.a.e(uri.getPath()), CampaignEx.JSON_KEY_AD_R);
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(e10, (c0.f55769a < 21 || !a.b(e10.getCause())) ? 2005 : 2006);
            }
            throw new FileDataSourceException(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e10, 1004);
        } catch (SecurityException e11) {
            throw new FileDataSourceException(e11, 2006);
        } catch (RuntimeException e12) {
            throw new FileDataSourceException(e12, 2000);
        }
    }

    @Override // androidx.media3.datasource.a
    public long a(g gVar) throws FileDataSourceException {
        Uri uri = gVar.f58544a;
        this.f4705f = uri;
        f(gVar);
        RandomAccessFile randomAccessFileH = h(uri);
        this.f4704e = randomAccessFileH;
        try {
            randomAccessFileH.seek(gVar.f58550g);
            long length = gVar.f58551h;
            if (length == -1) {
                length = this.f4704e.length() - gVar.f58550g;
            }
            this.f4706g = length;
            if (length < 0) {
                throw new FileDataSourceException(null, null, 2008);
            }
            this.f4707h = true;
            g(gVar);
            return this.f4706g;
        } catch (IOException e10) {
            throw new FileDataSourceException(e10, 2000);
        }
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        this.f4705f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f4704e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f4704e = null;
                if (this.f4707h) {
                    this.f4707h = false;
                    e();
                }
            } catch (IOException e10) {
                throw new FileDataSourceException(e10, 2000);
            }
        } catch (Throwable th2) {
            this.f4704e = null;
            if (this.f4707h) {
                this.f4707h = false;
                e();
            }
            throw th2;
        }
    }

    @Override // androidx.media3.datasource.a
    public Uri getUri() {
        return this.f4705f;
    }

    @Override // t1.g
    public int read(byte[] bArr, int i10, int i11) throws FileDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f4706g == 0) {
            return -1;
        }
        try {
            int i12 = ((RandomAccessFile) c0.h(this.f4704e)).read(bArr, i10, (int) Math.min(this.f4706g, i11));
            if (i12 > 0) {
                this.f4706g -= (long) i12;
                d(i12);
            }
            return i12;
        } catch (IOException e10) {
            throw new FileDataSourceException(e10, 2000);
        }
    }
}
