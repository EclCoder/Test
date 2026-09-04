package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class CroppedTrack extends AbstractTrack {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private int fromSample;
    Track origTrack;
    private int toSample;

    public CroppedTrack(Track track, long j10, long j11) {
        super("crop(" + track.getName() + ")");
        this.origTrack = track;
        this.fromSample = (int) j10;
        this.toSample = (int) j11;
    }

    static List<TimeToSampleBox.Entry> getDecodingTimeEntries(List<TimeToSampleBox.Entry> list, long j10, long j11) {
        TimeToSampleBox.Entry next;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ListIterator<TimeToSampleBox.Entry> listIterator = list.listIterator();
        LinkedList linkedList = new LinkedList();
        long count = 0;
        while (true) {
            next = listIterator.next();
            if (next.getCount() + count > j10) {
                break;
            }
            count += next.getCount();
        }
        if (next.getCount() + count >= j11) {
            linkedList.add(new TimeToSampleBox.Entry(j11 - j10, next.getDelta()));
            return linkedList;
        }
        linkedList.add(new TimeToSampleBox.Entry((next.getCount() + count) - j10, next.getDelta()));
        long count2 = next.getCount();
        while (true) {
            count += count2;
            if (!listIterator.hasNext()) {
                break;
            }
            next = listIterator.next();
            if (next.getCount() + count >= j11) {
                break;
            }
            linkedList.add(next);
            count2 = next.getCount();
        }
        linkedList.add(new TimeToSampleBox.Entry(j11 - count, next.getDelta()));
        return linkedList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.origTrack.close();
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {
        return getCompositionTimeEntries(this.origTrack.getCompositionTimeEntries(), this.fromSample, this.toSample);
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public String getHandler() {
        return this.origTrack.getHandler();
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        if (this.origTrack.getSampleDependencies() == null || this.origTrack.getSampleDependencies().isEmpty()) {
            return null;
        }
        return this.origTrack.getSampleDependencies().subList(this.fromSample, this.toSample);
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.origTrack.getSampleDescriptionBox();
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public synchronized long[] getSampleDurations() {
        long[] jArr;
        int i10 = this.toSample - this.fromSample;
        jArr = new long[i10];
        System.arraycopy(this.origTrack.getSampleDurations(), this.fromSample, jArr, 0, i10);
        return jArr;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public List<Sample> getSamples() {
        return this.origTrack.getSamples().subList(this.fromSample, this.toSample);
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public SubSampleInformationBox getSubsampleInformationBox() {
        return this.origTrack.getSubsampleInformationBox();
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public synchronized long[] getSyncSamples() {
        try {
            if (this.origTrack.getSyncSamples() == null) {
                return null;
            }
            long[] syncSamples = this.origTrack.getSyncSamples();
            int length = syncSamples.length;
            int i10 = 0;
            while (i10 < syncSamples.length && syncSamples[i10] < this.fromSample) {
                i10++;
            }
            while (length > 0 && this.toSample < syncSamples[length - 1]) {
                length--;
            }
            int i11 = length - i10;
            long[] jArr = new long[i11];
            System.arraycopy(this.origTrack.getSyncSamples(), i10, jArr, 0, i11);
            for (int i12 = 0; i12 < i11; i12++) {
                jArr[i12] = jArr[i12] - ((long) this.fromSample);
            }
            return jArr;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public TrackMetaData getTrackMetaData() {
        return this.origTrack.getTrackMetaData();
    }

    static List<CompositionTimeToSample.Entry> getCompositionTimeEntries(List<CompositionTimeToSample.Entry> list, long j10, long j11) {
        CompositionTimeToSample.Entry next;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ListIterator<CompositionTimeToSample.Entry> listIterator = list.listIterator();
        ArrayList arrayList = new ArrayList();
        long count = 0;
        while (true) {
            next = listIterator.next();
            if (((long) next.getCount()) + count > j10) {
                break;
            }
            count += (long) next.getCount();
        }
        if (((long) next.getCount()) + count >= j11) {
            arrayList.add(new CompositionTimeToSample.Entry((int) (j11 - j10), next.getOffset()));
            return arrayList;
        }
        arrayList.add(new CompositionTimeToSample.Entry((int) ((((long) next.getCount()) + count) - j10), next.getOffset()));
        int count2 = next.getCount();
        while (true) {
            count += (long) count2;
            if (!listIterator.hasNext()) {
                break;
            }
            next = listIterator.next();
            if (((long) next.getCount()) + count >= j11) {
                break;
            }
            arrayList.add(next);
            count2 = next.getCount();
        }
        arrayList.add(new CompositionTimeToSample.Entry((int) (j11 - count), next.getOffset()));
        return arrayList;
    }
}
