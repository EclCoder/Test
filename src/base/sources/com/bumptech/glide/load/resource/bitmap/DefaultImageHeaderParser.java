package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final byte[] f11486a = "Exif\u0000\u0000".getBytes(Charset.forName(C.UTF8_NAME));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final byte[] f11487b = "MPF".getBytes(Charset.forName(C.UTF8_NAME));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f11488c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface Reader {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class EndOfFileException extends IOException {
            private static final long serialVersionUID = 1;

            EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a();

        int b(byte[] bArr, int i10);

        short c();

        long skip(long j10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements Reader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f11489a;

        a(ByteBuffer byteBuffer) {
            this.f11489a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int a() {
            return (c() << 8) | c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int b(byte[] bArr, int i10) {
            int iMin = Math.min(i10, this.f11489a.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.f11489a.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short c() throws Reader.EndOfFileException {
            if (this.f11489a.remaining() >= 1) {
                return (short) (this.f11489a.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j10) {
            int iMin = (int) Math.min(this.f11489a.remaining(), j10);
            ByteBuffer byteBuffer = this.f11489a;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f11490a;

        b(byte[] bArr, int i10) {
            this.f11490a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        private boolean c(int i10, int i11) {
            return this.f11490a.remaining() - i10 >= i11;
        }

        short a(int i10) {
            if (c(i10, 2)) {
                return this.f11490a.getShort(i10);
            }
            return (short) -1;
        }

        int b(int i10) {
            if (c(i10, 4)) {
                return this.f11490a.getInt(i10);
            }
            return -1;
        }

        int d() {
            return this.f11490a.remaining();
        }

        void e(ByteOrder byteOrder) {
            this.f11490a.order(byteOrder);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c implements Reader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InputStream f11491a;

        c(InputStream inputStream) {
            this.f11491a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int a() {
            return (c() << 8) | c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int b(byte[] bArr, int i10) throws Reader.EndOfFileException {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10 && (i12 = this.f11491a.read(bArr, i11, i10 - i11)) != -1) {
                i11 += i12;
            }
            if (i11 == 0 && i12 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i11;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short c() throws IOException {
            int i10 = this.f11491a.read();
            if (i10 != -1) {
                return (short) i10;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j10) throws IOException {
            if (j10 < 0) {
                return 0L;
            }
            long j11 = j10;
            while (j11 > 0) {
                long jSkip = this.f11491a.skip(j11);
                if (jSkip <= 0) {
                    if (this.f11491a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j11 -= jSkip;
            }
            return j10 - j11;
        }
    }

    private static int g(int i10, int i11) {
        return i10 + 2 + (i11 * 12);
    }

    private int h(Reader reader, u5.b bVar) {
        try {
            int iA = reader.a();
            if (!j(iA)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iA);
                }
                return -1;
            }
            int iP = p(reader);
            if (iP == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) bVar.c(iP, byte[].class);
            try {
                return s(reader, bArr, iP);
            } finally {
                bVar.put(bArr);
            }
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    private ImageHeaderParser.ImageType i(Reader reader) {
        try {
            int iA = reader.a();
            if (iA == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iC = (iA << 8) | reader.c();
            if (iC == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iC2 = (iC << 8) | reader.c();
            if (iC2 == -1991225785) {
                reader.skip(21L);
                try {
                    return reader.c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iC2 != 1380533830) {
                return t(reader, iC2);
            }
            reader.skip(4L);
            if (((reader.a() << 16) | reader.a()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iA2 = (reader.a() << 16) | reader.a();
            if ((iA2 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i10 = iA2 & 255;
            if (i10 != 88) {
                if (i10 != 76) {
                    return ImageHeaderParser.ImageType.WEBP;
                }
                reader.skip(4L);
                return (reader.c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            reader.skip(4L);
            short sC = reader.c();
            if ((sC & 2) != 0) {
                return ImageHeaderParser.ImageType.ANIMATED_WEBP;
            }
            return (sC & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    private static boolean j(int i10) {
        return (i10 & 65496) == 65496 || i10 == 19789 || i10 == 18761;
    }

    private boolean k(byte[] bArr, int i10) {
        return n(bArr, i10, f11486a);
    }

    private boolean l(Reader reader, u5.b bVar) {
        if (i(reader) != ImageHeaderParser.ImageType.JPEG) {
            return false;
        }
        int iO = o(reader);
        while (iO > 0) {
            byte[] bArr = (byte[]) bVar.c(iO, byte[].class);
            try {
                if (m(reader, bArr, iO)) {
                    return true;
                }
                bVar.put(bArr);
                iO = o(reader);
            } finally {
                bVar.put(bArr);
            }
        }
        if (Log.isLoggable("DfltImageHeaderParser", 2)) {
            Log.v("DfltImageHeaderParser", "hasMpf: Failed to parse APP2 segment length, or no APP2 segment with MPF metadata not found");
        }
        return false;
    }

    private boolean m(Reader reader, byte[] bArr, int i10) {
        int iB = reader.b(bArr, i10);
        if (iB == i10) {
            return n(bArr, i10, f11487b);
        }
        if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
            return false;
        }
        Log.d("DfltImageHeaderParser", "Unable to read APP2 segment data, length: " + i10 + ", actually read: " + iB);
        return false;
    }

    private boolean n(byte[] bArr, int i10, byte[] bArr2) {
        boolean z10 = (bArr == null || bArr2 == null || i10 <= bArr2.length) ? false : true;
        if (z10) {
            for (int i11 = 0; i11 < bArr2.length; i11++) {
                if (bArr[i11] != bArr2[i11]) {
                    return false;
                }
            }
        }
        return z10;
    }

    private int o(Reader reader) {
        return q(reader, Sdk$SDKError.b.PRIVACY_ICON_FALLBACK_ERROR_VALUE);
    }

    private int p(Reader reader) {
        return q(reader, Sdk$SDKError.b.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE);
    }

    private int q(Reader reader, int i10) {
        short sC;
        int iA;
        long j10;
        long jSkip;
        do {
            short sC2 = reader.c();
            if (sC2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) sC2));
                }
                return -1;
            }
            sC = reader.c();
            if (sC == 218) {
                return -1;
            }
            if (sC == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in " + i10 + " segment");
                }
                return -1;
            }
            iA = reader.a() - 2;
            if (sC == i10) {
                return iA;
            }
            j10 = iA;
            jSkip = reader.skip(j10);
        } while (jSkip == j10);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) sC) + ", wanted to skip: " + iA + ", but actually skipped: " + jSkip);
        }
        return -1;
    }

    private static int r(b bVar) {
        ByteOrder byteOrder;
        short sA = bVar.a(6);
        if (sA != 18761) {
            if (sA != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) sA));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        bVar.e(byteOrder);
        int iB = bVar.b(10) + 6;
        short sA2 = bVar.a(iB);
        for (int i10 = 0; i10 < sA2; i10++) {
            int iG = g(iB, i10);
            short sA3 = bVar.a(iG);
            if (sA3 == 274) {
                short sA4 = bVar.a(iG + 2);
                if (sA4 >= 1 && sA4 <= 12) {
                    int iB2 = bVar.b(iG + 4);
                    if (iB2 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i10 + " tagType=" + ((int) sA3) + " formatCode=" + ((int) sA4) + " componentCount=" + iB2);
                        }
                        int i11 = iB2 + f11488c[sA4];
                        if (i11 <= 4) {
                            int i12 = iG + 8;
                            if (i12 >= 0 && i12 <= bVar.d()) {
                                if (i11 >= 0 && i11 + i12 <= bVar.d()) {
                                    return bVar.a(i12);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) sA3));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i12 + " tagType=" + ((int) sA3));
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) sA4));
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) sA4));
                }
            }
        }
        return -1;
    }

    private int s(Reader reader, byte[] bArr, int i10) {
        int iB = reader.b(bArr, i10);
        if (iB == i10) {
            if (k(bArr, i10)) {
                return r(new b(bArr, i10));
            }
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i10 + ", actually read: " + iB);
        }
        return -1;
    }

    private ImageHeaderParser.ImageType t(Reader reader, int i10) {
        if (((reader.a() << 16) | reader.a()) != 1718909296) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int iA = (reader.a() << 16) | reader.a();
        if (iA == 1635150195) {
            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        int i11 = 0;
        boolean z10 = iA == 1635150182;
        reader.skip(4L);
        int i12 = i10 - 16;
        if (i12 % 4 == 0) {
            while (i11 < 5 && i12 > 0) {
                int iA2 = (reader.a() << 16) | reader.a();
                if (iA2 == 1635150195) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                if (iA2 == 1635150182) {
                    z10 = true;
                }
                i11++;
                i12 -= 4;
            }
        }
        return z10 ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public boolean a(InputStream inputStream, u5.b bVar) {
        return l(new c((InputStream) m6.k.e(inputStream)), (u5.b) m6.k.e(bVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int b(InputStream inputStream, u5.b bVar) {
        return h(new c((InputStream) m6.k.e(inputStream)), (u5.b) m6.k.e(bVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType c(ByteBuffer byteBuffer) {
        return i(new a((ByteBuffer) m6.k.e(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType d(InputStream inputStream) {
        return i(new c((InputStream) m6.k.e(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public boolean e(ByteBuffer byteBuffer, u5.b bVar) {
        return l(new a((ByteBuffer) m6.k.e(byteBuffer)), (u5.b) m6.k.e(bVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int f(ByteBuffer byteBuffer, u5.b bVar) {
        return h(new a((ByteBuffer) m6.k.e(byteBuffer)), (u5.b) m6.k.e(bVar));
    }
}
