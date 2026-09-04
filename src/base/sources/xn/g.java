package xn;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public interface g extends q0, ReadableByteChannel {
    h B0();

    long D0(o0 o0Var);

    int H0();

    String I();

    String K(long j10);

    String R();

    long R0();

    short S();

    InputStream S0();

    long V();

    long X(h hVar);

    void Z(long j10);

    String e0(long j10);

    int f(f0 f0Var);

    h f0(long j10);

    byte[] l0();

    boolean n0();

    long o0(h hVar);

    long q0();

    int read(byte[] bArr);

    byte readByte();

    int readInt();

    short readShort();

    boolean request(long j10);

    void skip(long j10);

    e u();

    String x0(Charset charset);

    boolean z0(long j10, h hVar);
}
