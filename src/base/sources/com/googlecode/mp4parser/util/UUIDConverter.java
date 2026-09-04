package com.googlecode.mp4parser.util;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class UUIDConverter {
    public static byte[] convert(UUID uuid) {
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        byte[] bArr = new byte[16];
        for (int i10 = 0; i10 < 8; i10++) {
            bArr[i10] = (byte) (mostSignificantBits >>> ((7 - i10) * 8));
        }
        for (int i11 = 8; i11 < 16; i11++) {
            bArr[i11] = (byte) (leastSignificantBits >>> ((7 - i11) * 8));
        }
        return bArr;
    }

    public static UUID convert(byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
        return new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong());
    }
}
