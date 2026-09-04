package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractH26XTrack extends AbstractTrack {
    public static int BUFFER = 67107840;
    protected List<CompositionTimeToSample.Entry> ctts;
    private DataSource dataSource;
    protected long[] decodingTimes;
    protected List<SampleDependencyTypeBox.Entry> sdtp;
    protected List<Integer> stss;
    protected TrackMetaData trackMetaData;
    boolean tripleZeroIsEndOfSequence;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class LookAhead {
        ByteBuffer buffer;
        DataSource dataSource;
        long start;
        long bufferStartPos = 0;
        int inBufferPos = 0;

        public LookAhead(DataSource dataSource) {
            this.dataSource = dataSource;
            fillBuffer();
        }

        public void discardByte() {
            this.inBufferPos++;
        }

        public void discardNext3AndMarkStart() {
            int i10 = this.inBufferPos + 3;
            this.inBufferPos = i10;
            this.start = this.bufferStartPos + ((long) i10);
        }

        public void fillBuffer() {
            DataSource dataSource = this.dataSource;
            this.buffer = dataSource.map(this.bufferStartPos, Math.min(dataSource.size() - this.bufferStartPos, AbstractH26XTrack.BUFFER));
        }

        public ByteBuffer getNal() {
            long j10 = this.start;
            long j11 = this.bufferStartPos;
            if (j10 < j11) {
                throw new RuntimeException("damn! NAL exceeds buffer");
            }
            this.buffer.position((int) (j10 - j11));
            ByteBuffer byteBufferSlice = this.buffer.slice();
            byteBufferSlice.limit((int) (((long) this.inBufferPos) - (this.start - this.bufferStartPos)));
            return byteBufferSlice;
        }

        public boolean nextThreeEquals000or001orEof(boolean z10) {
            int iLimit = this.buffer.limit();
            int i10 = this.inBufferPos;
            if (iLimit - i10 >= 3) {
                return this.buffer.get(i10) == 0 && this.buffer.get(this.inBufferPos + 1) == 0 && ((this.buffer.get(this.inBufferPos + 2) == 0 && z10) || this.buffer.get(this.inBufferPos + 2) == 1);
            }
            if (this.bufferStartPos + ((long) i10) + 3 > this.dataSource.size()) {
                return this.bufferStartPos + ((long) this.inBufferPos) == this.dataSource.size();
            }
            this.bufferStartPos = this.start;
            this.inBufferPos = 0;
            fillBuffer();
            return nextThreeEquals000or001orEof(z10);
        }

        public boolean nextThreeEquals001() throws EOFException {
            int iLimit = this.buffer.limit();
            int i10 = this.inBufferPos;
            if (iLimit - i10 >= 3) {
                return this.buffer.get(i10) == 0 && this.buffer.get(this.inBufferPos + 1) == 0 && this.buffer.get(this.inBufferPos + 2) == 1;
            }
            if (this.bufferStartPos + ((long) i10) + 3 < this.dataSource.size()) {
                return false;
            }
            throw new EOFException();
        }
    }

    public AbstractH26XTrack(DataSource dataSource, boolean z10) {
        super(dataSource.toString());
        this.ctts = new ArrayList();
        this.sdtp = new ArrayList();
        this.stss = new ArrayList();
        this.trackMetaData = new TrackMetaData();
        this.dataSource = dataSource;
        this.tripleZeroIsEndOfSequence = z10;
    }

    protected static InputStream cleanBuffer(InputStream inputStream) {
        return new CleanInputStream(inputStream);
    }

    protected static byte[] toArray(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        int iRemaining = byteBufferDuplicate.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBufferDuplicate.get(bArr, 0, iRemaining);
        return bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.dataSource.close();
    }

    protected Sample createSampleObject(List<? extends ByteBuffer> list) {
        byte[] bArr = new byte[list.size() * 4];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        Iterator<? extends ByteBuffer> it = list.iterator();
        while (it.hasNext()) {
            byteBufferWrap.putInt(it.next().remaining());
        }
        ByteBuffer[] byteBufferArr = new ByteBuffer[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = i10 * 2;
            byteBufferArr[i11] = ByteBuffer.wrap(bArr, i10 * 4, 4);
            byteBufferArr[i11 + 1] = list.get(i10);
        }
        return new SampleImpl(byteBufferArr);
    }

    protected ByteBuffer findNextNal(LookAhead lookAhead) {
        while (!lookAhead.nextThreeEquals001()) {
            try {
                lookAhead.discardByte();
            } catch (EOFException unused) {
                return null;
            }
        }
        lookAhead.discardNext3AndMarkStart();
        while (!lookAhead.nextThreeEquals000or001orEof(this.tripleZeroIsEndOfSequence)) {
            lookAhead.discardByte();
        }
        return lookAhead.getNal();
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {
        return this.ctts;
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        return this.sdtp;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long[] getSampleDurations() {
        return this.decodingTimes;
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public long[] getSyncSamples() {
        long[] jArr = new long[this.stss.size()];
        for (int i10 = 0; i10 < this.stss.size(); i10++) {
            jArr[i10] = this.stss.get(i10).intValue();
        }
        return jArr;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public TrackMetaData getTrackMetaData() {
        return this.trackMetaData;
    }

    public AbstractH26XTrack(DataSource dataSource) {
        this(dataSource, true);
    }
}
