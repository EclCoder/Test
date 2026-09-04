package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeWriterVariable;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.AbstractContainerBox;
import com.googlecode.mp4parser.MemoryDataSourceImpl;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.WrappingTrack;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.Path;
import com.mp4parser.iso14496.part15.AvcConfigurationBox;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class Avc1ToAvc3TrackImpl extends WrappingTrack {
    AvcConfigurationBox avcC;
    List<Sample> samples;
    SampleDescriptionBox stsd;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class ReplaceSyncSamplesList extends AbstractList<Sample> {
        List<Sample> parentSamples;

        public ReplaceSyncSamplesList(List<Sample> list) {
            this.parentSamples = list;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.parentSamples.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public Sample get(int i10) {
            if (Arrays.binarySearch(Avc1ToAvc3TrackImpl.this.getSyncSamples(), i10 + 1) < 0) {
                return this.parentSamples.get(i10);
            }
            final int lengthSizeMinusOne = Avc1ToAvc3TrackImpl.this.avcC.getLengthSizeMinusOne() + 1;
            final ByteBuffer byteBufferAllocate = ByteBuffer.allocate(lengthSizeMinusOne);
            final Sample sample = this.parentSamples.get(i10);
            return new Sample() { // from class: com.googlecode.mp4parser.authoring.tracks.Avc1ToAvc3TrackImpl.ReplaceSyncSamplesList.1
                @Override // com.googlecode.mp4parser.authoring.Sample
                public ByteBuffer asByteBuffer() {
                    Iterator<byte[]> it = Avc1ToAvc3TrackImpl.this.avcC.getSequenceParameterSets().iterator();
                    int length = 0;
                    while (it.hasNext()) {
                        length += lengthSizeMinusOne + it.next().length;
                    }
                    Iterator<byte[]> it2 = Avc1ToAvc3TrackImpl.this.avcC.getSequenceParameterSetExts().iterator();
                    while (it2.hasNext()) {
                        length += lengthSizeMinusOne + it2.next().length;
                    }
                    Iterator<byte[]> it3 = Avc1ToAvc3TrackImpl.this.avcC.getPictureParameterSets().iterator();
                    while (it3.hasNext()) {
                        length += lengthSizeMinusOne + it3.next().length;
                    }
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(CastUtils.l2i(sample.getSize()) + length);
                    for (byte[] bArr : Avc1ToAvc3TrackImpl.this.avcC.getSequenceParameterSets()) {
                        IsoTypeWriterVariable.write(bArr.length, byteBufferAllocate2, lengthSizeMinusOne);
                        byteBufferAllocate2.put(bArr);
                    }
                    for (byte[] bArr2 : Avc1ToAvc3TrackImpl.this.avcC.getSequenceParameterSetExts()) {
                        IsoTypeWriterVariable.write(bArr2.length, byteBufferAllocate2, lengthSizeMinusOne);
                        byteBufferAllocate2.put(bArr2);
                    }
                    for (byte[] bArr3 : Avc1ToAvc3TrackImpl.this.avcC.getPictureParameterSets()) {
                        IsoTypeWriterVariable.write(bArr3.length, byteBufferAllocate2, lengthSizeMinusOne);
                        byteBufferAllocate2.put(bArr3);
                    }
                    byteBufferAllocate2.put(sample.asByteBuffer());
                    return (ByteBuffer) byteBufferAllocate2.rewind();
                }

                @Override // com.googlecode.mp4parser.authoring.Sample
                public long getSize() {
                    Iterator<byte[]> it = Avc1ToAvc3TrackImpl.this.avcC.getSequenceParameterSets().iterator();
                    int length = 0;
                    while (it.hasNext()) {
                        length += lengthSizeMinusOne + it.next().length;
                    }
                    Iterator<byte[]> it2 = Avc1ToAvc3TrackImpl.this.avcC.getSequenceParameterSetExts().iterator();
                    while (it2.hasNext()) {
                        length += lengthSizeMinusOne + it2.next().length;
                    }
                    Iterator<byte[]> it3 = Avc1ToAvc3TrackImpl.this.avcC.getPictureParameterSets().iterator();
                    while (it3.hasNext()) {
                        length += lengthSizeMinusOne + it3.next().length;
                    }
                    return sample.getSize() + ((long) length);
                }

                @Override // com.googlecode.mp4parser.authoring.Sample
                public void writeTo(WritableByteChannel writableByteChannel) throws IOException {
                    for (byte[] bArr : Avc1ToAvc3TrackImpl.this.avcC.getSequenceParameterSets()) {
                        IsoTypeWriterVariable.write(bArr.length, (ByteBuffer) byteBufferAllocate.rewind(), lengthSizeMinusOne);
                        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
                        writableByteChannel.write(ByteBuffer.wrap(bArr));
                    }
                    for (byte[] bArr2 : Avc1ToAvc3TrackImpl.this.avcC.getSequenceParameterSetExts()) {
                        IsoTypeWriterVariable.write(bArr2.length, (ByteBuffer) byteBufferAllocate.rewind(), lengthSizeMinusOne);
                        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
                        writableByteChannel.write(ByteBuffer.wrap(bArr2));
                    }
                    for (byte[] bArr3 : Avc1ToAvc3TrackImpl.this.avcC.getPictureParameterSets()) {
                        IsoTypeWriterVariable.write(bArr3.length, (ByteBuffer) byteBufferAllocate.rewind(), lengthSizeMinusOne);
                        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
                        writableByteChannel.write(ByteBuffer.wrap(bArr3));
                    }
                    sample.writeTo(writableByteChannel);
                }
            };
        }
    }

    public Avc1ToAvc3TrackImpl(Track track) throws IOException {
        super(track);
        if (!VisualSampleEntry.TYPE3.equals(track.getSampleDescriptionBox().getSampleEntry().getType())) {
            throw new RuntimeException("Only avc1 tracks can be converted to avc3 tracks");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        track.getSampleDescriptionBox().getBox(Channels.newChannel(byteArrayOutputStream));
        SampleDescriptionBox sampleDescriptionBox = (SampleDescriptionBox) Path.getPath(new IsoFile(new MemoryDataSourceImpl(byteArrayOutputStream.toByteArray())), SampleDescriptionBox.TYPE);
        this.stsd = sampleDescriptionBox;
        ((VisualSampleEntry) sampleDescriptionBox.getSampleEntry()).setType(VisualSampleEntry.TYPE4);
        this.avcC = (AvcConfigurationBox) Path.getPath((AbstractContainerBox) this.stsd, "avc./avcC");
        this.samples = new ReplaceSyncSamplesList(track.getSamples());
    }

    @Override // com.googlecode.mp4parser.authoring.WrappingTrack, com.googlecode.mp4parser.authoring.Track
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.stsd;
    }

    @Override // com.googlecode.mp4parser.authoring.WrappingTrack, com.googlecode.mp4parser.authoring.Track
    public List<Sample> getSamples() {
        return this.samples;
    }
}
