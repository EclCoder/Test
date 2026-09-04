package com.googlecode.mp4parser.authoring.tracks.webvtt.sampleboxes;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.util.CastUtils;
import ii.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractCueBox extends a {
    String content;

    public AbstractCueBox(String str) {
        super(str);
        this.content = "";
    }

    @Override // com.coremedia.iso.boxes.Box
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(CastUtils.l2i(getSize()));
        IsoTypeWriter.writeUInt32(byteBufferAllocate, getSize());
        byteBufferAllocate.put(IsoFile.fourCCtoBytes(getType()));
        byteBufferAllocate.put(Utf8.convert(this.content));
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
    }

    public String getContent() {
        return this.content;
    }

    @Override // com.coremedia.iso.boxes.Box
    public long getSize() {
        return Utf8.utf8StringLengthInBytes(this.content) + 8;
    }

    public void setContent(String str) {
        this.content = str;
    }
}
