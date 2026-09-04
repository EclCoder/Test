package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.googlecode.mp4parser.authoring.Edit;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;
import com.googlecode.mp4parser.util.CastUtils;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class SilenceTrackImpl implements Track {
    long[] decodingTimes;
    String name;
    List<Sample> samples = new LinkedList();
    Track source;

    public SilenceTrackImpl(Track track, long j10) {
        this.source = track;
        this.name = j10 + "ms silence";
        if (!AudioSampleEntry.TYPE3.equals(track.getSampleDescriptionBox().getSampleEntry().getType())) {
            throw new RuntimeException("Tracks of type " + track.getClass().getSimpleName() + " are not supported");
        }
        int iL2i = CastUtils.l2i(((getTrackMetaData().getTimescale() * j10) / 1000) / 1024);
        long[] jArr = new long[iL2i];
        this.decodingTimes = jArr;
        Arrays.fill(jArr, ((getTrackMetaData().getTimescale() * j10) / ((long) iL2i)) / 1000);
        while (true) {
            int i10 = iL2i - 1;
            if (iL2i <= 0) {
                return;
            }
            this.samples.add(new SampleImpl((ByteBuffer) ByteBuffer.wrap(new byte[]{33, 16, 4, 96, -116, 28}).rewind()));
            iL2i = i10;
        }
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long getDuration() {
        long j10 = 0;
        for (long j11 : this.decodingTimes) {
            j10 += j11;
        }
        return j10;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public List<Edit> getEdits() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public String getHandler() {
        return this.source.getHandler();
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public String getName() {
        return this.name;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.source.getSampleDescriptionBox();
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long[] getSampleDurations() {
        return this.decodingTimes;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public Map<GroupEntry, long[]> getSampleGroups() {
        return this.source.getSampleGroups();
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public List<Sample> getSamples() {
        return this.samples;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public SubSampleInformationBox getSubsampleInformationBox() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long[] getSyncSamples() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public TrackMetaData getTrackMetaData() {
        return this.source.getTrackMetaData();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
