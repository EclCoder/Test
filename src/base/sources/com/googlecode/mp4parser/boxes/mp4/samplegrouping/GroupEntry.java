package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class GroupEntry {
    public abstract ByteBuffer get();

    public abstract String getType();

    public abstract void parse(ByteBuffer byteBuffer);

    public int size() {
        return get().limit();
    }
}
