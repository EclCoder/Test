package com.google.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h {
    public abstract void write(byte b10);

    public abstract void write(ByteBuffer byteBuffer);

    public abstract void write(byte[] bArr, int i10, int i11);

    public abstract void writeLazy(ByteBuffer byteBuffer);

    public abstract void writeLazy(byte[] bArr, int i10, int i11);
}
