package com.coremedia.iso;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class IsoTypeWriterVariable {
    public static void write(long j10, ByteBuffer byteBuffer, int i10) {
        if (i10 == 1) {
            IsoTypeWriter.writeUInt8(byteBuffer, (int) (j10 & 255));
            return;
        }
        if (i10 == 2) {
            IsoTypeWriter.writeUInt16(byteBuffer, (int) (j10 & 65535));
            return;
        }
        if (i10 == 3) {
            IsoTypeWriter.writeUInt24(byteBuffer, (int) (j10 & 16777215));
            return;
        }
        if (i10 == 4) {
            IsoTypeWriter.writeUInt32(byteBuffer, j10);
        } else {
            if (i10 == 8) {
                IsoTypeWriter.writeUInt64(byteBuffer, j10);
                return;
            }
            throw new RuntimeException("I don't know how to read " + i10 + " bytes");
        }
    }
}
