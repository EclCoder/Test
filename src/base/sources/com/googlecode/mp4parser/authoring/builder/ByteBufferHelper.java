package com.googlecode.mp4parser.authoring.builder;

import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class ByteBufferHelper {
    public static List<ByteBuffer> mergeAdjacentBuffers(List<ByteBuffer> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (ByteBuffer byteBuffer : list) {
            int size = arrayList.size() - 1;
            if (size >= 0 && byteBuffer.hasArray() && ((ByteBuffer) arrayList.get(size)).hasArray() && byteBuffer.array() == ((ByteBuffer) arrayList.get(size)).array() && ((ByteBuffer) arrayList.get(size)).arrayOffset() + ((ByteBuffer) arrayList.get(size)).limit() == byteBuffer.arrayOffset()) {
                ByteBuffer byteBuffer2 = (ByteBuffer) arrayList.remove(size);
                arrayList.add(ByteBuffer.wrap(byteBuffer.array(), byteBuffer2.arrayOffset(), byteBuffer2.limit() + byteBuffer.limit()).slice());
            } else if (size >= 0 && (byteBuffer instanceof MappedByteBuffer) && (arrayList.get(size) instanceof MappedByteBuffer) && ((ByteBuffer) arrayList.get(size)).limit() == ((ByteBuffer) arrayList.get(size)).capacity() - byteBuffer.capacity()) {
                ByteBuffer byteBuffer3 = (ByteBuffer) arrayList.get(size);
                byteBuffer3.limit(byteBuffer.limit() + byteBuffer3.limit());
            } else {
                byteBuffer.reset();
                arrayList.add(byteBuffer);
            }
        }
        return arrayList;
    }
}
