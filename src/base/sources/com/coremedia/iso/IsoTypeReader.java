package com.coremedia.iso;

import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class IsoTypeReader {
    public static int byte2int(byte b10) {
        return b10 < 0 ? b10 + PublisherCallbacks.NORMAL_FLOW : b10;
    }

    public static String read4cc(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, "ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static double readFixedPoint0230(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((double) (((((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED))) / 1.073741824E9d;
    }

    public static double readFixedPoint1616(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((double) (((((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED))) / 65536.0d;
    }

    public static float readFixedPoint88(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        return ((short) (((short) ((bArr[0] << 8) & 65280)) | (bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED))) / 256.0f;
    }

    public static String readIso639(ByteBuffer byteBuffer) {
        int uInt16 = readUInt16(byteBuffer);
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 3; i10++) {
            sb2.append((char) (((uInt16 >> ((2 - i10) * 5)) & 31) + 96));
        }
        return sb2.toString();
    }

    public static String readString(ByteBuffer byteBuffer) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            byte b10 = byteBuffer.get();
            if (b10 == 0) {
                return Utf8.convert(byteArrayOutputStream.toByteArray());
            }
            byteArrayOutputStream.write(b10);
        }
    }

    public static int readUInt16(ByteBuffer byteBuffer) {
        return (byte2int(byteBuffer.get()) << 8) + byte2int(byteBuffer.get());
    }

    public static int readUInt16BE(ByteBuffer byteBuffer) {
        return byte2int(byteBuffer.get()) + (byte2int(byteBuffer.get()) << 8);
    }

    public static int readUInt24(ByteBuffer byteBuffer) {
        return (readUInt16(byteBuffer) << 8) + byte2int(byteBuffer.get());
    }

    public static long readUInt32(ByteBuffer byteBuffer) {
        long j10 = byteBuffer.getInt();
        return j10 < 0 ? j10 + 4294967296L : j10;
    }

    public static long readUInt32BE(ByteBuffer byteBuffer) {
        return (((long) readUInt8(byteBuffer)) << 24) + (((long) readUInt8(byteBuffer)) << 16) + (readUInt8(byteBuffer) << 8) + readUInt8(byteBuffer);
    }

    public static long readUInt48(ByteBuffer byteBuffer) {
        long uInt16 = ((long) readUInt16(byteBuffer)) << 32;
        if (uInt16 >= 0) {
            return uInt16 + readUInt32(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static long readUInt64(ByteBuffer byteBuffer) {
        long uInt32 = readUInt32(byteBuffer) << 32;
        if (uInt32 >= 0) {
            return uInt32 + readUInt32(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static int readUInt8(ByteBuffer byteBuffer) {
        return byte2int(byteBuffer.get());
    }

    public static String readString(ByteBuffer byteBuffer, int i10) {
        byte[] bArr = new byte[i10];
        byteBuffer.get(bArr);
        return Utf8.convert(bArr);
    }
}
