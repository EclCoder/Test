package xn;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public interface f extends o0, WritableByteChannel {
    f A0(long j10);

    f C();

    long C0(q0 q0Var);

    f D(int i10);

    f J();

    f N(String str);

    f Q(String str, int i10, int i11);

    f a0(long j10);

    @Override // xn.o0, java.io.Flushable
    void flush();

    f k0(h hVar);

    e u();

    f write(byte[] bArr);

    f write(byte[] bArr, int i10, int i11);

    f writeByte(int i10);

    f writeInt(int i10);

    f writeShort(int i10);
}
