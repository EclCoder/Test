package com.mbridge.msdk.thrid.okio;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public interface e extends s, ReadableByteChannel {
    long a(byte b10);

    c a();

    String a(Charset charset);

    boolean a(long j10, f fVar);

    f b(long j10);

    String c();

    byte[] c(long j10);

    String d(long j10);

    int e();

    void e(long j10);

    boolean f();

    short g();

    long i();

    InputStream j();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    short readShort();

    void skip(long j10);
}
