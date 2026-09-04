package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class VisualRandomAccessEntry extends GroupEntry {
    public static final String TYPE = "rap ";
    private short numLeadingSamples;
    private boolean numLeadingSamplesKnown;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VisualRandomAccessEntry visualRandomAccessEntry = (VisualRandomAccessEntry) obj;
        return this.numLeadingSamples == visualRandomAccessEntry.numLeadingSamples && this.numLeadingSamplesKnown == visualRandomAccessEntry.numLeadingSamplesKnown;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public ByteBuffer get() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1);
        byteBufferAllocate.put((byte) ((this.numLeadingSamplesKnown ? 128 : 0) | (this.numLeadingSamples & 127)));
        byteBufferAllocate.rewind();
        return byteBufferAllocate;
    }

    public short getNumLeadingSamples() {
        return this.numLeadingSamples;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public String getType() {
        return TYPE;
    }

    public int hashCode() {
        return ((this.numLeadingSamplesKnown ? 1 : 0) * 31) + this.numLeadingSamples;
    }

    public boolean isNumLeadingSamplesKnown() {
        return this.numLeadingSamplesKnown;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry
    public void parse(ByteBuffer byteBuffer) {
        byte b10 = byteBuffer.get();
        this.numLeadingSamplesKnown = (b10 & 128) == 128;
        this.numLeadingSamples = (short) (b10 & 127);
    }

    public void setNumLeadingSamples(short s10) {
        this.numLeadingSamples = s10;
    }

    public void setNumLeadingSamplesKnown(boolean z10) {
        this.numLeadingSamplesKnown = z10;
    }

    public String toString() {
        return "VisualRandomAccessEntry{numLeadingSamplesKnown=" + this.numLeadingSamplesKnown + ", numLeadingSamples=" + ((int) this.numLeadingSamples) + '}';
    }
}
