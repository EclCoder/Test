package com.bumptech.glide.load.resource.bitmap;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class j0 implements r5.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r5.f f11536d = r5.f.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r5.f f11537e = r5.f.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final f f11538f = new f();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List f11539g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f11540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u5.d f11541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f11542c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements r5.f.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f11543a = ByteBuffer.allocate(8);

        a() {
        }

        @Override // r5.f.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr, Long l10, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f11543a) {
                this.f11543a.position(0);
                messageDigest.update(this.f11543a.putLong(l10.longValue()).array());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements r5.f.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f11544a = ByteBuffer.allocate(4);

        b() {
        }

        @Override // r5.f.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f11544a) {
                this.f11544a.position(0);
                messageDigest.update(this.f11544a.putInt(num.intValue()).array());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c implements e {
        private c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.j0.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.j0.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface e {
        void a(MediaExtractor mediaExtractor, Object obj);

        void b(MediaMetadataRetriever mediaMetadataRetriever, Object obj);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class f {
        f() {
        }

        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class g implements e {
        g() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.j0.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.j0.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class h extends RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;

        h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    j0(u5.d dVar, e eVar) {
        this(dVar, eVar, f11538f);
    }

    public static r5.i c(u5.d dVar) {
        return new j0(dVar, new c(null));
    }

    public static r5.i d(u5.d dVar) {
        return new j0(dVar, new d());
    }

    private static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (j()) {
            try {
                if (i(mediaMetadataRetriever)) {
                    if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) != 180) {
                        return bitmap;
                    }
                    if (Log.isLoggable("VideoDecoder", 3)) {
                        Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                    }
                    Matrix matrix = new Matrix();
                    matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                }
            } catch (NumberFormatException unused) {
                if (!Log.isLoggable("VideoDecoder", 3)) {
                    return bitmap;
                }
                Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
                return bitmap;
            }
        }
        return bitmap;
    }

    private Bitmap f(Object obj, MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, l lVar) {
        if (l(obj, mediaMetadataRetriever)) {
            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
        }
        Bitmap bitmapH = (Build.VERSION.SDK_INT < 27 || i11 == Integer.MIN_VALUE || i12 == Integer.MIN_VALUE || lVar == l.f11553f) ? null : h(mediaMetadataRetriever, j10, i10, i11, i12, lVar);
        if (bitmapH == null) {
            bitmapH = g(mediaMetadataRetriever, j10, i10);
        }
        Bitmap bitmapE = e(mediaMetadataRetriever, bitmapH);
        if (bitmapE != null) {
            return bitmapE;
        }
        throw new h();
    }

    private static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10) {
        return mediaMetadataRetriever.getFrameAtTime(j10, i10);
    }

    private static Bitmap h(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, l lVar) {
        try {
            int i13 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int i14 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int i15 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i15 == 90 || i15 == 270) {
                i14 = i13;
                i13 = i14;
            }
            float fB = lVar.b(i13, i14, i11, i12);
            return mediaMetadataRetriever.getScaledFrameAtTime(j10, i10, Math.round(i13 * fB), Math.round(fB * i14));
        } catch (Throwable th2) {
            if (!Log.isLoggable("VideoDecoder", 3)) {
                return null;
            }
            Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th2);
            return null;
        }
    }

    private static boolean i(MediaMetadataRetriever mediaMetadataRetriever) {
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int i10 = Integer.parseInt(strExtractMetadata);
        return (i10 == 7 || i10 == 6) && Integer.parseInt(strExtractMetadata2) == 6;
    }

    static boolean j() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return k();
        }
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 30 && i10 < 33;
    }

    private static boolean k() {
        Iterator it = f11539g.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #2 {all -> 0x005f, blocks: (B:23:0x0053, B:25:0x0059), top: B:40:0x0053 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0063 A[DONT_GENERATE] */
    private boolean l(Object obj, MediaMetadataRetriever mediaMetadataRetriever) {
        String str = Build.DEVICE;
        if (str == null || !str.matches(".+_cheets|cheets_.+")) {
            return false;
        }
        MediaExtractor mediaExtractor = null;
        try {
            try {
                if (!MimeTypes.VIDEO_WEBM.equals(mediaMetadataRetriever.extractMetadata(12))) {
                    return false;
                }
                MediaExtractor mediaExtractor2 = new MediaExtractor();
                try {
                    this.f11540a.a(mediaExtractor2, obj);
                    int trackCount = mediaExtractor2.getTrackCount();
                    for (int i10 = 0; i10 < trackCount; i10++) {
                        if (MimeTypes.VIDEO_VP8.equals(mediaExtractor2.getTrackFormat(i10).getString("mime"))) {
                            mediaExtractor2.release();
                            return true;
                        }
                    }
                    mediaExtractor2.release();
                } catch (Throwable th2) {
                    th = th2;
                    mediaExtractor = mediaExtractor2;
                    if (Log.isLoggable("VideoDecoder", 3)) {
                        Log.d("VideoDecoder", "Exception trying to extract track info for a webm video on CrOS.", th);
                    }
                }
                return false;
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to extract track info for a webm video on CrOS.", th);
                }
                return false;
            } finally {
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static r5.i m(u5.d dVar) {
        return new j0(dVar, new g());
    }

    @Override // r5.i
    public t5.c a(Object obj, int i10, int i11, r5.g gVar) throws Exception {
        long jLongValue = ((Long) gVar.c(f11536d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + jLongValue);
        }
        Integer num = (Integer) gVar.c(f11537e);
        if (num == null) {
            num = 2;
        }
        l lVar = (l) gVar.c(l.f11555h);
        if (lVar == null) {
            lVar = l.f11554g;
        }
        l lVar2 = lVar;
        MediaMetadataRetriever mediaMetadataRetrieverA = this.f11542c.a();
        try {
            this.f11540a.b(mediaMetadataRetrieverA, obj);
            try {
                Bitmap bitmapF = f(obj, mediaMetadataRetrieverA, jLongValue, num.intValue(), i10, i11, lVar2);
                if (Build.VERSION.SDK_INT >= 29) {
                    androidx.activity.a0.a(mediaMetadataRetrieverA);
                } else {
                    mediaMetadataRetrieverA.release();
                }
                return com.bumptech.glide.load.resource.bitmap.f.d(bitmapF, this.f11541b);
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                if (Build.VERSION.SDK_INT >= 29) {
                    androidx.activity.a0.a(mediaMetadataRetrieverA);
                    throw th3;
                }
                mediaMetadataRetrieverA.release();
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // r5.i
    public boolean b(Object obj, r5.g gVar) {
        return true;
    }

    j0(u5.d dVar, e eVar, f fVar) {
        this.f11541b = dVar;
        this.f11540a = eVar;
        this.f11542c = fVar;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d implements e {
        d() {
        }

        private MediaDataSource c(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.j0.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(c(byteBuffer));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.j0.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(c(byteBuffer));
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a extends MediaDataSource {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f11545a;

            a(ByteBuffer byteBuffer) {
                this.f11545a = byteBuffer;
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f11545a.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j10, byte[] bArr, int i10, int i11) {
                if (j10 >= this.f11545a.limit()) {
                    return -1;
                }
                this.f11545a.position((int) j10);
                int iMin = Math.min(i11, this.f11545a.remaining());
                this.f11545a.get(bArr, i10, iMin);
                return iMin;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }
        }
    }
}
