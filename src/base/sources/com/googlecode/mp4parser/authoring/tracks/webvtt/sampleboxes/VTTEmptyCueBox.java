package com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeWriter;
import ii.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class VTTEmptyCueBox extends a {
    public VTTEmptyCueBox() {
        super("vtte");
    }

    @Override // com.coremedia.iso.boxes.Box
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        IsoTypeWriter.writeUInt32(byteBufferAllocate, getSize());
        byteBufferAllocate.put(IsoFile.fourCCtoBytes(getType()));
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
    }

    @Override // com.coremedia.iso.boxes.Box
    public long getSize() {
        return 8L;
    }
}
