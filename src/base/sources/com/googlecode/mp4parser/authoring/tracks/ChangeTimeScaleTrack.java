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
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class ChangeTimeScaleTrack implements Track {
    private static final Logger LOG = Logger.getLogger(ChangeTimeScaleTrack.class.getName());
    List<CompositionTimeToSample.Entry> ctts;
    long[] decodingTimes;
    Track source;
    long timeScale;

    public ChangeTimeScaleTrack(Track track, long j10, long[] jArr) {
        this.source = track;
        this.timeScale = j10;
        double timescale = j10 / track.getTrackMetaData().getTimescale();
        this.ctts = adjustCtts(track.getCompositionTimeEntries(), timescale);
        this.decodingTimes = adjustTts(track.getSampleDurations(), timescale, jArr, getTimes(track, jArr, j10));
    }

    static List<CompositionTimeToSample.Entry> adjustCtts(List<CompositionTimeToSample.Entry> list, double d10) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (CompositionTimeToSample.Entry entry : list) {
            arrayList.add(new CompositionTimeToSample.Entry(entry.getCount(), (int) Math.round(((double) entry.getOffset()) * d10)));
        }
        return arrayList;
    }

    static long[] adjustTts(long[] jArr, double d10, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[jArr.length];
        long j10 = 0;
        int i10 = 1;
        while (i10 <= jArr.length) {
            int i11 = i10 - 1;
            long jRound = Math.round(jArr[i11] * d10);
            int i12 = i10 + 1;
            int iBinarySearch = Arrays.binarySearch(jArr2, i12);
            if (iBinarySearch >= 0) {
                long j11 = jArr3[iBinarySearch];
                if (j11 != j10) {
                    long j12 = j11 - (j10 + jRound);
                    LOG.finest(String.format("Sample %d %d / %d - correct by %d", Integer.valueOf(i10), Long.valueOf(j10), Long.valueOf(jArr3[iBinarySearch]), Long.valueOf(j12)));
                    jRound += j12;
                }
            }
            j10 += jRound;
            jArr4[i11] = jRound;
            i10 = i12;
        }
        return jArr4;
    }

    private static long[] getTimes(Track track, long[] jArr, long j10) {
        long[] jArr2 = new long[jArr.length];
        long j11 = 0;
        int i10 = 0;
        int i11 = 1;
        while (true) {
            long j12 = i11;
            if (j12 > jArr[jArr.length - 1]) {
                return jArr2;
            }
            if (j12 == jArr[i10]) {
                jArr2[i10] = (j11 * j10) / track.getTrackMetaData().getTimescale();
                i10++;
            }
            j11 += track.getSampleDurations()[i11 - 1];
            i11++;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.source.close();
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {
        return this.ctts;
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
        return this.source.getEdits();
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public String getHandler() {
        return this.source.getHandler();
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public String getName() {
        return "timeScale(" + this.source.getName() + ")";
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
        return this.decodingTimes;
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
        trackMetaData.setTimescale(this.timeScale);
        return trackMetaData;
    }

    public String toString() {
        return "ChangeTimeScaleTrack{source=" + this.source + '}';
    }
}
