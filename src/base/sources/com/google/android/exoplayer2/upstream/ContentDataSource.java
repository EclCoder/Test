package com.google.android.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import nb.e;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class ContentDataSource extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ContentResolver f18725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f18726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f18727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private FileInputStream f18728h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f18729i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f18730j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class ContentDataSourceException extends DataSourceException {
        public ContentDataSourceException(IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    public ContentDataSource(Context context) {
        super(false);
        this.f18725e = context.getContentResolver();
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
            r5.f18726f = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.f18728h     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
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
            r5.f18728h = r0
            android.content.res.AssetFileDescriptor r3 = r5.f18727g     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
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
            r5.f18727g = r0
            boolean r0 = r5.f18730j
            if (r0 == 0) goto L2b
            r5.f18730j = r2
            r5.j()
        L2b:
            return
        L2c:
            com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException r4 = new com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.f18727g = r0
            boolean r0 = r5.f18730j
            if (r0 == 0) goto L3d
            r5.f18730j = r2
            r5.j()
        L3d:
            throw r1
        L3e:
            com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException r4 = new com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> Le
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.f18728h = r0
            android.content.res.AssetFileDescriptor r4 = r5.f18727g     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
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
            r5.f18727g = r0
            boolean r0 = r5.f18730j
            if (r0 == 0) goto L5d
            r5.f18730j = r2
            r5.j()
        L5d:
            throw r3
        L5e:
            com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException r4 = new com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.f18727g = r0
            boolean r0 = r5.f18730j
            if (r0 == 0) goto L6f
            r5.f18730j = r2
            r5.j()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.ContentDataSource.close():void");
    }

    @Override // nb.j
    public Uri getUri() {
        return this.f18726f;
    }

    @Override // nb.j
    public long h(a aVar) throws ContentDataSourceException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uriNormalizeScheme = aVar.f18779a.normalizeScheme();
            this.f18726f = uriNormalizeScheme;
            k(aVar);
            if ("content".equals(uriNormalizeScheme.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = this.f18725e.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = this.f18725e.openAssetFileDescriptor(uriNormalizeScheme, CampaignEx.JSON_KEY_AD_R);
            }
            this.f18727g = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new ContentDataSourceException(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f18728h = fileInputStream;
            if (length != -1 && aVar.f18785g > length) {
                throw new ContentDataSourceException(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(aVar.f18785g + startOffset) - startOffset;
            if (jSkip != aVar.f18785g) {
                throw new ContentDataSourceException(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f18729i = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f18729i = jPosition;
                    if (jPosition < 0) {
                        throw new ContentDataSourceException(null, 2008);
                    }
                }
            } else {
                long j10 = length - jSkip;
                this.f18729i = j10;
                if (j10 < 0) {
                    throw new ContentDataSourceException(null, 2008);
                }
            }
            long jMin = aVar.f18786h;
            if (jMin != -1) {
                long j11 = this.f18729i;
                if (j11 != -1) {
                    jMin = Math.min(j11, jMin);
                }
                this.f18729i = jMin;
            }
            this.f18730j = true;
            l(aVar);
            long j12 = aVar.f18786h;
            return j12 != -1 ? j12 : this.f18729i;
        } catch (ContentDataSourceException e10) {
            throw e10;
        } catch (IOException e11) {
            throw new ContentDataSourceException(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // nb.h
    public int read(byte[] bArr, int i10, int i11) throws ContentDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f18729i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new ContentDataSourceException(e10, 2000);
            }
        }
        int i12 = ((FileInputStream) r0.j(this.f18728h)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f18729i;
        if (j11 != -1) {
            this.f18729i = j11 - ((long) i12);
        }
        i(i12);
        return i12;
    }
}
