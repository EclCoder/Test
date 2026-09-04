package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import nb.e;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class RawResourceDataSource extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Resources f18763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f18764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Uri f18765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AssetFileDescriptor f18766h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InputStream f18767i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f18768j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f18769k;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class RawResourceDataSourceException extends DataSourceException {
        public RawResourceDataSourceException(String str, Throwable th2, int i10) {
            super(str, th2, i10);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f18763e = context.getResources();
        this.f18764f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // nb.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() {
        /*
            r5 = this;
            r0 = 0
            r5.f18765g = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.InputStream r3 = r5.f18767i     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
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
            r5.f18767i = r0
            android.content.res.AssetFileDescriptor r3 = r5.f18766h     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
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
            r5.f18766h = r0
            boolean r0 = r5.f18769k
            if (r0 == 0) goto L2b
            r5.f18769k = r2
            r5.j()
        L2b:
            return
        L2c:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r4 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.f18766h = r0
            boolean r0 = r5.f18769k
            if (r0 == 0) goto L3d
            r5.f18769k = r2
            r5.j()
        L3d:
            throw r1
        L3e:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r4 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> Le
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.f18767i = r0
            android.content.res.AssetFileDescriptor r4 = r5.f18766h     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
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
            r5.f18766h = r0
            boolean r0 = r5.f18769k
            if (r0 == 0) goto L5d
            r5.f18769k = r2
            r5.j()
        L5d:
            throw r3
        L5e:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r4 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.f18766h = r0
            boolean r0 = r5.f18769k
            if (r0 == 0) goto L6f
            r5.f18769k = r2
            r5.j()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.RawResourceDataSource.close():void");
    }

    @Override // nb.j
    public Uri getUri() {
        return this.f18765g;
    }

    @Override // nb.j
    public long h(a aVar) throws RawResourceDataSourceException {
        int identifier;
        String str;
        Uri uriNormalizeScheme = aVar.f18779a.normalizeScheme();
        this.f18765g = uriNormalizeScheme;
        if (TextUtils.equals(com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource.RAW_RESOURCE_SCHEME, uriNormalizeScheme.getScheme()) || (TextUtils.equals("android.resource", uriNormalizeScheme.getScheme()) && uriNormalizeScheme.getPathSegments().size() == 1 && ((String) ob.a.e(uriNormalizeScheme.getLastPathSegment())).matches("\\d+"))) {
            try {
                identifier = Integer.parseInt((String) ob.a.e(uriNormalizeScheme.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new RawResourceDataSourceException("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only " + com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource.RAW_RESOURCE_SCHEME + " and android.resource are supported.", null, 1004);
            }
            String strSubstring = (String) ob.a.e(uriNormalizeScheme.getPath());
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            String host = uriNormalizeScheme.getHost();
            StringBuilder sb2 = new StringBuilder();
            if (TextUtils.isEmpty(host)) {
                str = "";
            } else {
                str = host + ":";
            }
            sb2.append(str);
            sb2.append(strSubstring);
            identifier = this.f18763e.getIdentifier(sb2.toString(), "raw", this.f18764f);
            if (identifier == 0) {
                throw new RawResourceDataSourceException("Resource not found.", null, 2005);
            }
        }
        k(aVar);
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.f18763e.openRawResourceFd(identifier);
            this.f18766h = assetFileDescriptorOpenRawResourceFd;
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new RawResourceDataSourceException("Resource is compressed: " + uriNormalizeScheme, null, 2000);
            }
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
            this.f18767i = fileInputStream;
            if (length != -1) {
                try {
                    if (aVar.f18785g > length) {
                        throw new RawResourceDataSourceException(null, null, 2008);
                    }
                } catch (RawResourceDataSourceException e10) {
                    throw e10;
                } catch (IOException e11) {
                    throw new RawResourceDataSourceException(null, e11, 2000);
                }
            }
            long startOffset = assetFileDescriptorOpenRawResourceFd.getStartOffset();
            long jSkip = fileInputStream.skip(aVar.f18785g + startOffset) - startOffset;
            if (jSkip != aVar.f18785g) {
                throw new RawResourceDataSourceException(null, null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.f18768j = -1L;
                } else {
                    long size = channel.size() - channel.position();
                    this.f18768j = size;
                    if (size < 0) {
                        throw new RawResourceDataSourceException(null, null, 2008);
                    }
                }
            } else {
                long j10 = length - jSkip;
                this.f18768j = j10;
                if (j10 < 0) {
                    throw new DataSourceException(2008);
                }
            }
            long jMin = aVar.f18786h;
            if (jMin != -1) {
                long j11 = this.f18768j;
                if (j11 != -1) {
                    jMin = Math.min(j11, jMin);
                }
                this.f18768j = jMin;
            }
            this.f18769k = true;
            l(aVar);
            long j12 = aVar.f18786h;
            return j12 != -1 ? j12 : this.f18768j;
        } catch (Resources.NotFoundException e12) {
            throw new RawResourceDataSourceException(null, e12, 2005);
        }
    }

    @Override // nb.h
    public int read(byte[] bArr, int i10, int i11) throws RawResourceDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f18768j;
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
        int i12 = ((InputStream) r0.j(this.f18767i)).read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f18768j == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j11 = this.f18768j;
        if (j11 != -1) {
            this.f18768j = j11 - ((long) i12);
        }
        i(i12);
        return i12;
    }
}
