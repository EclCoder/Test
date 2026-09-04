package com.coremedia.iso;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class IsoTypeReaderVariable {
    public static long read(ByteBuffer byteBuffer, int i10) {
        int uInt8;
        if (i10 == 1) {
            uInt8 = IsoTypeReader.readUInt8(byteBuffer);
        } else if (i10 == 2) {
            uInt8 = IsoTypeReader.readUInt16(byteBuffer);
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    return IsoTypeReader.readUInt32(byteBuffer);
                }
                if (i10 == 8) {
                    return IsoTypeReader.readUInt64(byteBuffer);
                }
                throw new RuntimeException("I don't know how to read " + i10 + " bytes");
            }
            uInt8 = IsoTypeReader.readUInt24(byteBuffer);
        }
        return uInt8;
    }
}
