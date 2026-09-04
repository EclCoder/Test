package com.mbridge.msdk.playercommon.exoplayer2.extractor;

import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Decoder;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Id3Peeker {
    private final ParsableByteArray scratch = new ParsableByteArray(10);

    public Metadata peekId3Data(ExtractorInput extractorInput, Id3Decoder.FramePredicate framePredicate) throws Throwable {
        Metadata metadataDecode = null;
        int i10 = 0;
        while (true) {
            try {
                extractorInput.peekFully(this.scratch.data, 0, 10);
                this.scratch.setPosition(0);
                if (this.scratch.readUnsignedInt24() != Id3Decoder.ID3_TAG) {
                    break;
                }
                this.scratch.skipBytes(3);
                int synchSafeInt = this.scratch.readSynchSafeInt();
                int i11 = synchSafeInt + 10;
                if (metadataDecode == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.scratch.data, 0, bArr, 0, 10);
                    extractorInput.peekFully(bArr, 10, synchSafeInt);
                    metadataDecode = new Id3Decoder(framePredicate).decode(bArr, i11);
                } else {
                    extractorInput.advancePeekPosition(synchSafeInt);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition(i10);
        return metadataDecode;
    }
}
