package com.googlecode.mp4parser.authoring.samples;

import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.SampleSizeBox;
import com.coremedia.iso.boxes.SampleToChunkBox;
import com.coremedia.iso.boxes.TrackBox;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.Logger;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class DefaultMp4SampleList extends AbstractList<Sample> {
    private static final Logger LOG = Logger.getLogger(DefaultMp4SampleList.class);
    SoftReference<ByteBuffer>[] cache;
    int[] chunkNumsStartSampleNum;
    long[] chunkOffsets;
    long[] chunkSizes;
    int lastChunk = 0;
    long[][] sampleOffsetsWithinChunks;
    SampleSizeBox ssb;
    Container topLevel;
    TrackBox trackBox;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class SampleImpl implements Sample {
        private int index;

        public SampleImpl(int i10) {
            this.index = i10;
        }

        @Override // com.googlecode.mp4parser.authoring.Sample
        public synchronized ByteBuffer asByteBuffer() {
            long j10;
            ByteBuffer byteBuffer;
            int chunkForSample = DefaultMp4SampleList.this.getChunkForSample(this.index);
            DefaultMp4SampleList defaultMp4SampleList = DefaultMp4SampleList.this;
            SoftReference<ByteBuffer> softReference = defaultMp4SampleList.cache[chunkForSample];
            int i10 = defaultMp4SampleList.chunkNumsStartSampleNum[chunkForSample] - 1;
            int i11 = this.index - i10;
            long j11 = chunkForSample;
            long[] jArr = defaultMp4SampleList.sampleOffsetsWithinChunks[CastUtils.l2i(j11)];
            j10 = jArr[i11];
            if (softReference == null || (byteBuffer = softReference.get()) == null) {
                try {
                    DefaultMp4SampleList defaultMp4SampleList2 = DefaultMp4SampleList.this;
                    byteBuffer = defaultMp4SampleList2.topLevel.getByteBuffer(defaultMp4SampleList2.chunkOffsets[CastUtils.l2i(j11)], jArr[jArr.length - 1] + DefaultMp4SampleList.this.ssb.getSampleSizeAtIndex((i10 + jArr.length) - 1));
                    DefaultMp4SampleList.this.cache[chunkForSample] = new SoftReference<>(byteBuffer);
                } catch (IOException e10) {
                    StringWriter stringWriter = new StringWriter();
                    e10.printStackTrace(new PrintWriter(stringWriter));
                    DefaultMp4SampleList.LOG.logError(stringWriter.toString());
                    throw new IndexOutOfBoundsException(e10.getMessage());
                }
            }
            return (ByteBuffer) ((ByteBuffer) byteBuffer.duplicate().position(CastUtils.l2i(j10))).slice().limit(CastUtils.l2i(DefaultMp4SampleList.this.ssb.getSampleSizeAtIndex(this.index)));
        }

        @Override // com.googlecode.mp4parser.authoring.Sample
        public long getSize() {
            return DefaultMp4SampleList.this.ssb.getSampleSizeAtIndex(this.index);
        }

        public String toString() {
            return "Sample(index: " + this.index + " size: " + DefaultMp4SampleList.this.ssb.getSampleSizeAtIndex(this.index) + ")";
        }

        @Override // com.googlecode.mp4parser.authoring.Sample
        public void writeTo(WritableByteChannel writableByteChannel) throws IOException {
            writableByteChannel.write(asByteBuffer());
        }
    }

    public DefaultMp4SampleList(long j10, Container container) {
        int i10;
        int i11;
        this.trackBox = null;
        this.cache = null;
        int i12 = 0;
        this.topLevel = container;
        for (TrackBox trackBox : ((MovieBox) container.getBoxes(MovieBox.class).get(0)).getBoxes(TrackBox.class)) {
            int i13 = i12;
            if (trackBox.getTrackHeaderBox().getTrackId() == j10) {
                this.trackBox = trackBox;
            }
            i12 = i13;
        }
        TrackBox trackBox2 = this.trackBox;
        if (trackBox2 == null) {
            throw new RuntimeException("This MP4 does not contain track " + j10);
        }
        long[] chunkOffsets = trackBox2.getSampleTableBox().getChunkOffsetBox().getChunkOffsets();
        this.chunkOffsets = chunkOffsets;
        this.chunkSizes = new long[chunkOffsets.length];
        SoftReference<ByteBuffer>[] softReferenceArr = new SoftReference[chunkOffsets.length];
        this.cache = softReferenceArr;
        Arrays.fill(softReferenceArr, new SoftReference(null));
        this.sampleOffsetsWithinChunks = new long[this.chunkOffsets.length][];
        this.ssb = this.trackBox.getSampleTableBox().getSampleSizeBox();
        List<SampleToChunkBox.Entry> entries = this.trackBox.getSampleTableBox().getSampleToChunkBox().getEntries();
        SampleToChunkBox.Entry[] entryArr = (SampleToChunkBox.Entry[]) entries.toArray(new SampleToChunkBox.Entry[entries.size()]);
        SampleToChunkBox.Entry entry = entryArr[i12];
        long firstChunk = entry.getFirstChunk();
        int iL2i = CastUtils.l2i(entry.getSamplesPerChunk());
        int size = size();
        int i14 = i12;
        int i15 = i14;
        int i16 = 1;
        int i17 = 1;
        while (true) {
            int i18 = i14 + 1;
            if (i18 == firstChunk) {
                if (entryArr.length > i16) {
                    SampleToChunkBox.Entry entry2 = entryArr[i16];
                    i15 = iL2i;
                    iL2i = CastUtils.l2i(entry2.getSamplesPerChunk());
                    i16++;
                    firstChunk = entry2.getFirstChunk();
                } else {
                    i15 = iL2i;
                    iL2i = -1;
                    firstChunk = Long.MAX_VALUE;
                }
            }
            i10 = i12;
            this.sampleOffsetsWithinChunks[i14] = new long[i15];
            i17 += i15;
            if (i17 > size) {
                break;
            }
            i14 = i18;
            i12 = i10;
        }
        this.chunkNumsStartSampleNum = new int[i14 + 2];
        SampleToChunkBox.Entry entry3 = entryArr[i10];
        long firstChunk2 = entry3.getFirstChunk();
        int iL2i2 = CastUtils.l2i(entry3.getSamplesPerChunk());
        int i19 = 1;
        int i20 = 1;
        int i21 = i10;
        int i22 = i21;
        while (true) {
            i11 = i21 + 1;
            this.chunkNumsStartSampleNum[i21] = i19;
            if (i11 == firstChunk2) {
                if (entryArr.length > i20) {
                    SampleToChunkBox.Entry entry4 = entryArr[i20];
                    i22 = iL2i2;
                    iL2i2 = CastUtils.l2i(entry4.getSamplesPerChunk());
                    firstChunk2 = entry4.getFirstChunk();
                    i20++;
                } else {
                    i22 = iL2i2;
                    iL2i2 = -1;
                    firstChunk2 = Long.MAX_VALUE;
                }
            }
            i19 += i22;
            if (i19 > size) {
                break;
            } else {
                i21 = i11;
            }
        }
        this.chunkNumsStartSampleNum[i11] = Integer.MAX_VALUE;
        long sampleSizeAtIndex = 0;
        int i23 = i10;
        for (int i24 = 1; i24 <= this.ssb.getSampleCount(); i24++) {
            while (i24 == this.chunkNumsStartSampleNum[i23]) {
                i23++;
                sampleSizeAtIndex = 0;
            }
            long[] jArr = this.chunkSizes;
            int i25 = i23 - 1;
            int i26 = i24 - 1;
            jArr[i25] = jArr[i25] + this.ssb.getSampleSizeAtIndex(i26);
            this.sampleOffsetsWithinChunks[i25][i24 - this.chunkNumsStartSampleNum[i25]] = sampleSizeAtIndex;
            sampleSizeAtIndex += this.ssb.getSampleSizeAtIndex(i26);
        }
    }

    synchronized int getChunkForSample(int i10) {
        int i11 = i10 + 1;
        int[] iArr = this.chunkNumsStartSampleNum;
        int i12 = this.lastChunk;
        int i13 = iArr[i12];
        if (i11 >= i13 && i11 < iArr[i12 + 1]) {
            return i12;
        }
        if (i11 < i13) {
            this.lastChunk = 0;
            while (true) {
                int[] iArr2 = this.chunkNumsStartSampleNum;
                int i14 = this.lastChunk;
                if (iArr2[i14 + 1] > i11) {
                    return i14;
                }
                this.lastChunk = i14 + 1;
            }
        } else {
            this.lastChunk = i12 + 1;
            while (true) {
                int[] iArr3 = this.chunkNumsStartSampleNum;
                int i15 = this.lastChunk;
                if (iArr3[i15 + 1] > i11) {
                    return i15;
                }
                this.lastChunk = i15 + 1;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return CastUtils.l2i(this.trackBox.getSampleTableBox().getSampleSizeBox().getSampleCount());
    }

    @Override // java.util.AbstractList, java.util.List
    public Sample get(int i10) {
        if (i10 < this.ssb.getSampleCount()) {
            return new SampleImpl(i10);
        }
        throw new IndexOutOfBoundsException();
    }
}
