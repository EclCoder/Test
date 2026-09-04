package com.googlecode.mp4parser.authoring.tracks.mjpeg;

import com.coremedia.iso.Hex;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Edit;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorFactory;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import javax.imageio.ImageIO;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class OneJpegPerIframe extends AbstractTrack {
    File[] jpegs;
    long[] sampleDurations;
    SampleDescriptionBox stsd;
    long[] syncSamples;
    TrackMetaData trackMetaData;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public OneJpegPerIframe(String str, File[] fileArr, Track track) {
        super(str);
        this.trackMetaData = new TrackMetaData();
        this.jpegs = fileArr;
        if (track.getSyncSamples().length != fileArr.length) {
            throw new RuntimeException("Number of sync samples doesn't match the number of stills (" + track.getSyncSamples().length + " vs. " + fileArr.length + ")");
        }
        BufferedImage bufferedImage = ImageIO.read(fileArr[0]);
        this.trackMetaData.setWidth(bufferedImage.getWidth());
        this.trackMetaData.setHeight(bufferedImage.getHeight());
        this.trackMetaData.setTimescale(track.getTrackMetaData().getTimescale());
        long[] sampleDurations = track.getSampleDurations();
        long[] syncSamples = track.getSyncSamples();
        this.sampleDurations = new long[syncSamples.length];
        long j10 = 0;
        boolean z10 = true;
        long j11 = 0;
        int i10 = 1;
        for (int i11 = 1; i11 < sampleDurations.length; i11++) {
            if (i10 < syncSamples.length && i11 == syncSamples[i10]) {
                this.sampleDurations[i10 - 1] = j11;
                i10++;
                j11 = 0;
            }
            j11 += sampleDurations[i11];
        }
        long[] jArr = this.sampleDurations;
        jArr[jArr.length - 1] = j11;
        this.stsd = new SampleDescriptionBox();
        VisualSampleEntry visualSampleEntry = new VisualSampleEntry(VisualSampleEntry.TYPE1);
        this.stsd.addBox(visualSampleEntry);
        ESDescriptorBox eSDescriptorBox = new ESDescriptorBox();
        eSDescriptorBox.setData(ByteBuffer.wrap(Hex.decodeHex("038080801B000100048080800D6C11000000000A1CB4000A1CB4068080800102")));
        eSDescriptorBox.setEsDescriptor((ESDescriptor) ObjectDescriptorFactory.createFrom(-1, ByteBuffer.wrap(Hex.decodeHex("038080801B000100048080800D6C11000000000A1CB4000A1CB4068080800102"))));
        visualSampleEntry.addBox(eSDescriptorBox);
        this.syncSamples = new long[fileArr.length];
        int i12 = 0;
        while (true) {
            long[] jArr2 = this.syncSamples;
            if (i12 >= jArr2.length) {
                break;
            }
            int i13 = i12 + 1;
            jArr2[i12] = i13;
            i12 = i13;
        }
        boolean z11 = true;
        double timescale = 0.0d;
        for (Edit edit : track.getEdits()) {
            if (edit.getMediaTime() == -1 && !z10) {
                throw new RuntimeException("Cannot accept edit list for processing (1)");
            }
            if (edit.getMediaTime() >= 0 && !z11) {
                throw new RuntimeException("Cannot accept edit list for processing (2)");
            }
            if (edit.getMediaTime() == -1) {
                timescale += edit.getSegmentDuration();
            } else {
                timescale -= edit.getMediaTime() / edit.getTimeScale();
                z11 = false;
                z10 = false;
            }
        }
        if (track.getCompositionTimeEntries() != null && track.getCompositionTimeEntries().size() > 0) {
            int[] iArrBlowupCompositionTimes = CompositionTimeToSample.blowupCompositionTimes(track.getCompositionTimeEntries());
            for (int i14 = 0; i14 < iArrBlowupCompositionTimes.length && i14 < 50; i14++) {
                iArrBlowupCompositionTimes[i14] = (int) (((long) iArrBlowupCompositionTimes[i14]) + j10);
                j10 += track.getSampleDurations()[i14];
            }
            Arrays.sort(iArrBlowupCompositionTimes);
            timescale += ((double) iArrBlowupCompositionTimes[0]) / track.getTrackMetaData().getTimescale();
        }
        if (timescale < 0.0d) {
            getEdits().add(new Edit((long) ((-timescale) * getTrackMetaData().getTimescale()), getTrackMetaData().getTimescale(), 1.0d, getDuration() / getTrackMetaData().getTimescale()));
        } else if (timescale > 0.0d) {
            getEdits().add(new Edit(-1L, getTrackMetaData().getTimescale(), 1.0d, timescale));
            getEdits().add(new Edit(0L, getTrackMetaData().getTimescale(), 1.0d, getDuration() / getTrackMetaData().getTimescale()));
        }
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public String getHandler() {
        return "vide";
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.stsd;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long[] getSampleDurations() {
        return this.sampleDurations;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public List<Sample> getSamples() {
        return new AbstractList<Sample>() { // from class: com.googlecode.mp4parser.authoring.tracks.mjpeg.OneJpegPerIframe.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return OneJpegPerIframe.this.jpegs.length;
            }

            @Override // java.util.AbstractList, java.util.List
            public Sample get(final int i10) {
                return new Sample() { // from class: com.googlecode.mp4parser.authoring.tracks.mjpeg.OneJpegPerIframe.1.1
                    ByteBuffer sample = null;

                    @Override // com.googlecode.mp4parser.authoring.Sample
                    public ByteBuffer asByteBuffer() {
                        if (this.sample == null) {
                            try {
                                RandomAccessFile randomAccessFile = new RandomAccessFile(OneJpegPerIframe.this.jpegs[i10], CampaignEx.JSON_KEY_AD_R);
                                this.sample = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, randomAccessFile.length());
                            } catch (IOException e10) {
                                throw new RuntimeException(e10);
                            }
                        }
                        return this.sample;
                    }

                    @Override // com.googlecode.mp4parser.authoring.Sample
                    public long getSize() {
                        return OneJpegPerIframe.this.jpegs[i10].length();
                    }

                    @Override // com.googlecode.mp4parser.authoring.Sample
                    public void writeTo(WritableByteChannel writableByteChannel) throws IOException {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(OneJpegPerIframe.this.jpegs[i10], CampaignEx.JSON_KEY_AD_R);
                        randomAccessFile.getChannel().transferTo(0L, randomAccessFile.length(), writableByteChannel);
                        randomAccessFile.close();
                    }
                };
            }
        };
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public long[] getSyncSamples() {
        return this.syncSamples;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public TrackMetaData getTrackMetaData() {
        return this.trackMetaData;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
