package com.coremedia.iso.boxes;

import com.coremedia.iso.BoxParser;
import com.googlecode.mp4parser.DataSource;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface Box {
    void getBox(WritableByteChannel writableByteChannel);

    long getOffset();

    Container getParent();

    long getSize();

    String getType();

    void parse(DataSource dataSource, ByteBuffer byteBuffer, long j10, BoxParser boxParser);

    void setParent(Container container);
}
