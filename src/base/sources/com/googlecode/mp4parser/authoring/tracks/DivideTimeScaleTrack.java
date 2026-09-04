package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.googlecode.mp4parser.authoring.Edit;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class DivideTimeScaleTrack implements Track {
    Track source;
    private int timeScaleDivisor;

    public DivideTimeScaleTrack(Track track, int i10) {
        this.source = track;
        this.timeScaleDivisor = i10;
    }

    List<CompositionTimeToSample.Entry> adjustCtts() {
        List<CompositionTimeToSample.Entry> compositionTimeEntries = this.source.getCompositionTimeEntries();
        if (compositionTimeEntries == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(compositionTimeEntries.size());
        for (CompositionTimeToSample.Entry entry : compositionTimeEntries) {
            arrayList.add(new CompositionTimeToSample.Entry(entry.getCount(), entry.getOffset() / this.timeScaleDivisor));
        }
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.source.close();
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {
        return adjustCtts();
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long getDuration() {
        long j10 = 0;
        for (long j11 : getSampleDurations()) {
            j10 += j11;
        }
        return j10;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public List<Edit> getEdits() {
        return this.source.getEdits();
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public String getHandler() {
        return this.source.getHandler();
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public String getName() {
        return "timscale(" + this.source.getName() + ")";
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        return this.source.getSampleDependencies();
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.source.getSampleDescriptionBox();
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long[] getSampleDurations() {
        long[] jArr = new long[this.source.getSampleDurations().length];
        for (int i10 = 0; i10 < this.source.getSampleDurations().length; i10++) {
            jArr[i10] = this.source.getSampleDurations()[i10] / ((long) this.timeScaleDivisor);
        }
        return jArr;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public Map<GroupEntry, long[]> getSampleGroups() {
        return this.source.getSampleGroups();
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public List<Sample> getSamples() {
        return this.source.getSamples();
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public SubSampleInformationBox getSubsampleInformationBox() {
        return this.source.getSubsampleInformationBox();
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long[] getSyncSamples() {
        return this.source.getSyncSamples();
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public TrackMetaData getTrackMetaData() {
        TrackMetaData trackMetaData = (TrackMetaData) this.source.getTrackMetaData().clone();
        trackMetaData.setTimescale(this.source.getTrackMetaData().getTimescale() / ((long) this.timeScaleDivisor));
        return trackMetaData;
    }

    public String toString() {
        return "MultiplyTimeScaleTrack{source=" + this.source + '}';
    }
}
