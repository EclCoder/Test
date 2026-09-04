package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.adobe.ActionMessageFormat0SampleEntryBox;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class Amf0Track extends AbstractTrack {
    SortedMap<Long, byte[]> rawSamples;
    private TrackMetaData trackMetaData;

    public Amf0Track(Map<Long, byte[]> map) {
        super(ActionMessageFormat0SampleEntryBox.TYPE);
        this.rawSamples = new TreeMap<Long, byte[]>() { // from class: com.googlecode.mp4parser.authoring.tracks.Amf0Track.1
        };
        this.trackMetaData = new TrackMetaData();
        this.rawSamples = new TreeMap(map);
        this.trackMetaData.setCreationTime(new Date());
        this.trackMetaData.setModificationTime(new Date());
        this.trackMetaData.setTimescale(1000L);
        this.trackMetaData.setLanguage("eng");
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public String getHandler() {
        return DataSchemeDataSource.SCHEME_DATA;
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public SampleDescriptionBox getSampleDescriptionBox() {
        SampleDescriptionBox sampleDescriptionBox = new SampleDescriptionBox();
        ActionMessageFormat0SampleEntryBox actionMessageFormat0SampleEntryBox = new ActionMessageFormat0SampleEntryBox();
        actionMessageFormat0SampleEntryBox.setDataReferenceIndex(1);
        sampleDescriptionBox.addBox(actionMessageFormat0SampleEntryBox);
        return sampleDescriptionBox;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long[] getSampleDurations() {
        LinkedList linkedList = new LinkedList(this.rawSamples.keySet());
        Collections.sort(linkedList);
        long[] jArr = new long[linkedList.size()];
        for (int i10 = 0; i10 < linkedList.size(); i10++) {
            jArr[i10] = ((Long) linkedList.get(i10)).longValue();
        }
        return jArr;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public List<Sample> getSamples() {
        LinkedList linkedList = new LinkedList();
        Iterator<byte[]> it = this.rawSamples.values().iterator();
        while (it.hasNext()) {
            linkedList.add(new SampleImpl(ByteBuffer.wrap(it.next())));
        }
        return linkedList;
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public SubSampleInformationBox getSubsampleInformationBox() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public long[] getSyncSamples() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public TrackMetaData getTrackMetaData() {
        return this.trackMetaData;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
