package com.coremedia.iso.boxes;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface Container {
    List<Box> getBoxes();

    <T extends Box> List<T> getBoxes(Class<T> cls);

    <T extends Box> List<T> getBoxes(Class<T> cls, boolean z10);

    ByteBuffer getByteBuffer(long j10, long j11);

    void setBoxes(List<Box> list);

    void writeContainer(WritableByteChannel writableByteChannel);
}
