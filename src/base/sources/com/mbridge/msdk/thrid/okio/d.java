package com.mbridge.msdk.thrid.okio;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface d extends r, WritableByteChannel {
    c a();

    d a(long j10);

    d a(String str);

    @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
    void flush();

    d write(byte[] bArr);

    d write(byte[] bArr, int i10, int i11);

    d writeByte(int i10);

    d writeInt(int i10);

    d writeShort(int i10);
}
