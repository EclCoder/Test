package com.googlecode.mp4parser.authoring.tracks.h265;

import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class SEIMessage {
    public SEIMessage(BitReaderBuffer bitReaderBuffer) {
        int i10 = 0;
        while (bitReaderBuffer.readBits(8) == 255) {
            i10 += 255;
        }
        int bits = bitReaderBuffer.readBits(8) + i10;
        while (bitReaderBuffer.readBits(8) == 255) {
        }
        bitReaderBuffer.readBits(8);
        System.err.println("payloadType " + bits);
    }
}
