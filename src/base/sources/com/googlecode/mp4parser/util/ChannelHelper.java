package com.googlecode.mp4parser.util;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class ChannelHelper {
    private static ByteBuffer empty = ByteBuffer.allocate(0).asReadOnlyBuffer();

    public static void readFully(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) throws IOException {
        readFully(readableByteChannel, byteBuffer, byteBuffer.remaining());
    }

    public static int readFully(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer, int i10) throws IOException {
        int i11;
        int i12 = 0;
        do {
            i11 = readableByteChannel.read(byteBuffer);
            if (-1 == i11) {
                break;
            }
            i12 += i11;
        } while (i12 != i10);
        if (i11 != -1) {
            return i12;
        }
        throw new EOFException("End of file. No more boxes.");
    }
}
