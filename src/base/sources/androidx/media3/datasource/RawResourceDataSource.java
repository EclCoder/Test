package androidx.media3.datasource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;
import w1.c0;
import z1.g;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class RawResourceDataSource extends z1.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f4716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g f4717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f4718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InputStream f4719h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f4720i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f4721j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class RawResourceDataSourceException extends DataSourceException {
        public RawResourceDataSourceException(String str) {
            super(str, null, 2000);
        }

        public RawResourceDataSourceException(String str, Throwable th2, int i10) {
            super(str, th2, i10);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f4716e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    private static AssetFileDescriptor h(Context context, g gVar) throws RawResourceDataSourceException {
        Resources resourcesForApplication;
        int identifier;
        Uri uriNormalizeScheme = gVar.f58544a.normalizeScheme();
        if (TextUtils.equals(com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource.RAW_RESOURCE_SCHEME, uriNormalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new RawResourceDataSourceException("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            identifier = i(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new RawResourceDataSourceException("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String strSubstring = (String) w1.a.e(uriNormalizeScheme.getPath());
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new RawResourceDataSourceException("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e10, 2005);
                }
            }
            if (strSubstring.matches("\\d+")) {
                identifier = i(strSubstring);
            } else {
                identifier = resourcesForApplication.getIdentifier(packageName + ":" + strSubstring, "raw", null);
                if (identifier == 0) {
                    throw new RawResourceDataSourceException("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                return assetFileDescriptorOpenRawResourceFd;
            }
            throw new RawResourceDataSourceException("Resource is compressed: " + uriNormalizeScheme, null, 2000);
        } catch (Resources.NotFoundException e11) {
            throw new RawResourceDataSourceException(null, e11, 2005);
        }
    }

    private static int i(String str) throws RawResourceDataSourceException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
        }
    }

    @Override // androidx.media3.datasource.a
    public long a(g gVar) throws RawResourceDataSourceException {
        this.f4717f = gVar;
        f(gVar);
        AssetFileDescriptor assetFileDescriptorH = h(this.f4716e, gVar);
        this.f4718g = assetFileDescriptorH;
        long length = assetFileDescriptorH.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.f4718g.getFileDescriptor());
        this.f4719h = fileInputStream;
        if (length != -1) {
            try {
                if (gVar.f58550g > length) {
                    throw new RawResourceDataSourceException(null, null, 2008);
                }
            } catch (RawResourceDataSourceException e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RawResourceDataSourceException(null, e11, 2000);
            }
        }
        long startOffset = this.f4718g.getStartOffset();
        long jSkip = fileInputStream.skip(gVar.f58550g + startOffset) - startOffset;
        if (jSkip != gVar.f58550g) {
            throw new RawResourceDataSourceException(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.f4720i = -1L;
            } else {
                long size = channel.size() - channel.position();
                this.f4720i = size;
                if (size < 0) {
                    throw new RawResourceDataSourceException(null, null, 2008);
                }
            }
        } else {
            long j10 = length - jSkip;
            this.f4720i = j10;
            if (j10 < 0) {
                throw new DataSourceException(2008);
            }
        }
        long jMin = gVar.f58551h;
        if (jMin != -1) {
            long j11 = this.f4720i;
            if (j11 != -1) {
                jMin = Math.min(j11, jMin);
            }
            this.f4720i = jMin;
        }
        this.f4721j = true;
        g(gVar);
        long j12 = gVar.f58551h;
        return j12 != -1 ? j12 : this.f4720i;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // androidx.media3.datasource.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() {
        /*
            r5 = this;
            r0 = 0
            r5.f4717f = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.InputStream r3 = r5.f4719h     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            if (r3 == 0) goto L12
            r3.close()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            goto L12
        Le:
            r3 = move-exception
            goto L44
        L10:
            r3 = move-exception
            goto L3e
        L12:
            r5.f4719h = r0
            android.content.res.AssetFileDescriptor r3 = r5.f4718g     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            if (r3 == 0) goto L20
            r3.close()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            goto L20
        L1c:
            r1 = move-exception
            goto L32
        L1e:
            r3 = move-exception
            goto L2c
        L20:
            r5.f4718g = r0
            boolean r0 = r5.f4721j
            if (r0 == 0) goto L2b
            r5.f4721j = r2
            r5.e()
        L2b:
            return
        L2c:
            androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException r4 = new androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.f4718g = r0
            boolean r0 = r5.f4721j
            if (r0 == 0) goto L3d
            r5.f4721j = r2
            r5.e()
        L3d:
            throw r1
        L3e:
            androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException r4 = new androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> Le
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.f4719h = r0
            android.content.res.AssetFileDescriptor r4 = r5.f4718g     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            if (r4 == 0) goto L52
            r4.close()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            goto L52
        L4e:
            r1 = move-exception
            goto L64
        L50:
            r3 = move-exception
            goto L5e
        L52:
            r5.f4718g = r0
            boolean r0 = r5.f4721j
            if (r0 == 0) goto L5d
            r5.f4721j = r2
            r5.e()
        L5d:
            throw r3
        L5e:
            androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException r4 = new androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.f4718g = r0
            boolean r0 = r5.f4721j
            if (r0 == 0) goto L6f
            r5.f4721j = r2
            r5.e()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.datasource.RawResourceDataSource.close():void");
    }

    @Override // androidx.media3.datasource.a
    public Uri getUri() {
        g gVar = this.f4717f;
        if (gVar != null) {
            return gVar.f58544a;
        }
        return null;
    }

    @Override // t1.g
    public int read(byte[] bArr, int i10, int i11) throws RawResourceDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f4720i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new RawResourceDataSourceException(null, e10, 2000);
            }
        }
        int i12 = ((InputStream) c0.h(this.f4719h)).read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f4720i == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j11 = this.f4720i;
        if (j11 != -1) {
            this.f4720i = j11 - ((long) i12);
        }
        d(i12);
        return i12;
    }
}
