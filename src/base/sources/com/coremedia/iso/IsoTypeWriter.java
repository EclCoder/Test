package com.coremedia.iso;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class IsoTypeWriter {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public static void writeFixedPoint0230(ByteBuffer byteBuffer, double d10) {
        int i10 = (int) (d10 * 1.073741824E9d);
        byteBuffer.put((byte) (((-16777216) & i10) >> 24));
        byteBuffer.put((byte) ((16711680 & i10) >> 16));
        byteBuffer.put((byte) ((65280 & i10) >> 8));
        byteBuffer.put((byte) (i10 & 255));
    }

    public static void writeFixedPoint1616(ByteBuffer byteBuffer, double d10) {
        int i10 = (int) (d10 * 65536.0d);
        byteBuffer.put((byte) (((-16777216) & i10) >> 24));
        byteBuffer.put((byte) ((16711680 & i10) >> 16));
        byteBuffer.put((byte) ((65280 & i10) >> 8));
        byteBuffer.put((byte) (i10 & 255));
    }

    public static void writeFixedPoint88(ByteBuffer byteBuffer, double d10) {
        short s10 = (short) (d10 * 256.0d);
        byteBuffer.put((byte) ((65280 & s10) >> 8));
        byteBuffer.put((byte) (s10 & 255));
    }

    public static void writeIso639(ByteBuffer byteBuffer, String str) {
        if (str.getBytes().length != 3) {
            throw new IllegalArgumentException("\"" + str + "\" language string isn't exactly 3 characters long!");
        }
        int i10 = 0;
        for (int i11 = 0; i11 < 3; i11++) {
            i10 += (str.getBytes()[i11] - 96) << ((2 - i11) * 5);
        }
        writeUInt16(byteBuffer, i10);
    }

    public static void writePascalUtfString(ByteBuffer byteBuffer, String str) {
        byte[] bArrConvert = Utf8.convert(str);
        writeUInt8(byteBuffer, bArrConvert.length);
        byteBuffer.put(bArrConvert);
    }

    public static void writeUInt16(ByteBuffer byteBuffer, int i10) {
        writeUInt8(byteBuffer, (65535 & i10) >> 8);
        writeUInt8(byteBuffer, i10 & 255);
    }

    public static void writeUInt16BE(ByteBuffer byteBuffer, int i10) {
        writeUInt8(byteBuffer, i10 & 255);
        writeUInt8(byteBuffer, (65535 & i10) >> 8);
    }

    public static void writeUInt24(ByteBuffer byteBuffer, int i10) {
        int i11 = i10 & 16777215;
        writeUInt16(byteBuffer, i11 >> 8);
        writeUInt8(byteBuffer, i11);
    }

    public static void writeUInt32(ByteBuffer byteBuffer, long j10) {
        byteBuffer.putInt((int) j10);
    }

    public static void writeUInt32BE(ByteBuffer byteBuffer, long j10) {
        writeUInt16BE(byteBuffer, ((int) j10) & 65535);
        writeUInt16BE(byteBuffer, (int) ((j10 >> 16) & 65535));
    }

    public static void writeUInt48(ByteBuffer byteBuffer, long j10) {
        writeUInt16(byteBuffer, (int) ((281474976710655L & j10) >> 32));
        writeUInt32(byteBuffer, j10 & 4294967295L);
    }

    public static void writeUInt64(ByteBuffer byteBuffer, long j10) {
        byteBuffer.putLong(j10);
    }

    public static void writeUInt8(ByteBuffer byteBuffer, int i10) {
        byteBuffer.put((byte) (i10 & 255));
    }

    public static void writeUtf8String(ByteBuffer byteBuffer, String str) {
        byteBuffer.put(Utf8.convert(str));
        writeUInt8(byteBuffer, 0);
    }

    public static void writeZeroTermUtf8String(ByteBuffer byteBuffer, String str) {
        byteBuffer.put(Utf8.convert(str));
        writeUInt8(byteBuffer, 0);
    }
}
