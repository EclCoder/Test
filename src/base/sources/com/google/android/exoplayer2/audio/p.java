package com.google.android.exoplayer2.audio;

import com.inmobi.media.core.config.models.AdConfig;
import java.nio.ByteBuffer;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends h {
    @Override // com.google.android.exoplayer2.audio.h
    public AudioProcessor.a c(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i10 = aVar.f16456c;
        if (i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 536870912 || i10 == 805306368 || i10 == 4) {
            return i10 != 2 ? new AudioProcessor.a(aVar.f16454a, aVar.f16455b, 2) : AudioProcessor.a.f16453e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f16622b.f16456c;
        if (i11 == 3) {
            i10 *= 2;
        } else if (i11 == 4) {
            i10 /= 2;
        } else if (i11 != 268435456) {
            if (i11 != 536870912) {
                if (i11 != 805306368) {
                    throw new IllegalStateException();
                }
                i10 /= 2;
            } else {
                i10 /= 3;
                i10 *= 2;
            }
        }
        ByteBuffer byteBufferG = g(i10);
        int i12 = this.f16622b.f16456c;
        if (i12 == 3) {
            while (iPosition < iLimit) {
                byteBufferG.put((byte) 0);
                byteBufferG.put((byte) ((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) - 128));
                iPosition++;
            }
        } else if (i12 == 4) {
            while (iPosition < iLimit) {
                short sP = (short) (r0.p(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferG.put((byte) (sP & 255));
                byteBufferG.put((byte) ((sP >> 8) & 255));
                iPosition += 4;
            }
        } else if (i12 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferG.put(byteBuffer.get(iPosition + 1));
                byteBufferG.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i12 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferG.put(byteBuffer.get(iPosition + 1));
                byteBufferG.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i12 != 805306368) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferG.put(byteBuffer.get(iPosition + 2));
                byteBufferG.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferG.flip();
    }
}
