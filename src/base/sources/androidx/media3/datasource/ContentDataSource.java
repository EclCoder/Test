package androidx.media3.datasource;

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
import w1.c0;
import z1.g;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class ContentDataSource extends z1.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ContentResolver f4697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f4698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f4699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private FileInputStream f4700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f4701i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f4702j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class ContentDataSourceException extends DataSourceException {
        public ContentDataSourceException(IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    public ContentDataSource(Context context) {
        super(false);
        this.f4697e = context.getContentResolver();
    }

    @Override // androidx.media3.datasource.a
    public long a(g gVar) throws ContentDataSourceException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uriNormalizeScheme = gVar.f58544a.normalizeScheme();
            this.f4698f = uriNormalizeScheme;
            f(gVar);
            if ("content".equals(uriNormalizeScheme.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = this.f4697e.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = this.f4697e.openAssetFileDescriptor(uriNormalizeScheme, CampaignEx.JSON_KEY_AD_R);
            }
            this.f4699g = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new ContentDataSourceException(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f4700h = fileInputStream;
            if (length != -1 && gVar.f58550g > length) {
                throw new ContentDataSourceException(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(gVar.f58550g + startOffset) - startOffset;
            if (jSkip != gVar.f58550g) {
                throw new ContentDataSourceException(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f4701i = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f4701i = jPosition;
                    if (jPosition < 0) {
                        throw new ContentDataSourceException(null, 2008);
                    }
                }
            } else {
                long j10 = length - jSkip;
                this.f4701i = j10;
                if (j10 < 0) {
                    throw new ContentDataSourceException(null, 2008);
                }
            }
            long jMin = gVar.f58551h;
            if (jMin != -1) {
                long j11 = this.f4701i;
                if (j11 != -1) {
                    jMin = Math.min(j11, jMin);
                }
                this.f4701i = jMin;
            }
            this.f4702j = true;
            g(gVar);
            long j12 = gVar.f58551h;
            return j12 != -1 ? j12 : this.f4701i;
        } catch (ContentDataSourceException e10) {
            throw e10;
        } catch (IOException e11) {
            throw new ContentDataSourceException(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
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
            r5.f4698f = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.f4700h     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
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
            r5.f4700h = r0
            android.content.res.AssetFileDescriptor r3 = r5.f4699g     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
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
            r5.f4699g = r0
            boolean r0 = r5.f4702j
            if (r0 == 0) goto L2b
            r5.f4702j = r2
            r5.e()
        L2b:
            return
        L2c:
            androidx.media3.datasource.ContentDataSource$ContentDataSourceException r4 = new androidx.media3.datasource.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.f4699g = r0
            boolean r0 = r5.f4702j
            if (r0 == 0) goto L3d
            r5.f4702j = r2
            r5.e()
        L3d:
            throw r1
        L3e:
            androidx.media3.datasource.ContentDataSource$ContentDataSourceException r4 = new androidx.media3.datasource.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> Le
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.f4700h = r0
            android.content.res.AssetFileDescriptor r4 = r5.f4699g     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
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
            r5.f4699g = r0
            boolean r0 = r5.f4702j
            if (r0 == 0) goto L5d
            r5.f4702j = r2
            r5.e()
        L5d:
            throw r3
        L5e:
            androidx.media3.datasource.ContentDataSource$ContentDataSourceException r4 = new androidx.media3.datasource.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.f4699g = r0
            boolean r0 = r5.f4702j
            if (r0 == 0) goto L6f
            r5.f4702j = r2
            r5.e()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.datasource.ContentDataSource.close():void");
    }

    @Override // androidx.media3.datasource.a
    public Uri getUri() {
        return this.f4698f;
    }

    @Override // t1.g
    public int read(byte[] bArr, int i10, int i11) throws ContentDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f4701i;
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
        int i12 = ((FileInputStream) c0.h(this.f4700h)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f4701i;
        if (j11 != -1) {
            this.f4701i = j11 - ((long) i12);
        }
        d(i12);
        return i12;
    }
}
