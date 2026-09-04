package com.googlecode.mp4parser.authoring;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.EditListBox;
import com.coremedia.iso.boxes.MediaHeaderBox;
import com.coremedia.iso.boxes.MovieHeaderBox;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SampleTableBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.fragment.SampleFlags;
import com.coremedia.iso.boxes.fragment.TrackExtendsBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import com.coremedia.iso.boxes.mdat.SampleList;
import com.googlecode.mp4parser.AbstractContainerBox;
import com.googlecode.mp4parser.BasicContainer;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.Mp4Arrays;
import com.googlecode.mp4parser.util.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class Mp4TrackImpl extends AbstractTrack {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private List<CompositionTimeToSample.Entry> compositionTimeEntries;
    private long[] decodingTimes;
    IsoFile[] fragments;
    private String handler;
    private List<SampleDependencyTypeBox.Entry> sampleDependencies;
    private SampleDescriptionBox sampleDescriptionBox;
    private List<Sample> samples;
    private SubSampleInformationBox subSampleInformationBox;
    private long[] syncSamples;
    TrackBox trackBox;
    private TrackMetaData trackMetaData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:77:0x02ed  */
    public Mp4TrackImpl(String str, TrackBox trackBox, IsoFile... isoFileArr) {
        TrackRunBox trackRunBox;
        TrackFragmentHeaderBox trackFragmentHeaderBox;
        Iterator<TrackRunBox.Entry> it;
        int i10;
        boolean z10;
        Iterator it2;
        super(str);
        Mp4TrackImpl mp4TrackImpl = this;
        mp4TrackImpl.syncSamples = null;
        mp4TrackImpl.trackMetaData = new TrackMetaData();
        mp4TrackImpl.subSampleInformationBox = null;
        mp4TrackImpl.trackBox = trackBox;
        long trackId = trackBox.getTrackHeaderBox().getTrackId();
        mp4TrackImpl.samples = new SampleList(trackBox, isoFileArr);
        SampleTableBox sampleTableBox = trackBox.getMediaBox().getMediaInformationBox().getSampleTableBox();
        mp4TrackImpl.handler = trackBox.getMediaBox().getHandlerBox().getHandlerType();
        ArrayList arrayList = new ArrayList();
        mp4TrackImpl.compositionTimeEntries = new ArrayList();
        mp4TrackImpl.sampleDependencies = new ArrayList();
        arrayList.addAll(sampleTableBox.getTimeToSampleBox().getEntries());
        if (sampleTableBox.getCompositionTimeToSample() != null) {
            mp4TrackImpl.compositionTimeEntries.addAll(sampleTableBox.getCompositionTimeToSample().getEntries());
        }
        if (sampleTableBox.getSampleDependencyTypeBox() != null) {
            mp4TrackImpl.sampleDependencies.addAll(sampleTableBox.getSampleDependencyTypeBox().getEntries());
        }
        if (sampleTableBox.getSyncSampleBox() != null) {
            mp4TrackImpl.syncSamples = sampleTableBox.getSyncSampleBox().getSampleNumber();
        }
        mp4TrackImpl.subSampleInformationBox = (SubSampleInformationBox) Path.getPath((AbstractContainerBox) sampleTableBox, SubSampleInformationBox.TYPE);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(((Box) trackBox.getParent()).getParent().getBoxes(MovieFragmentBox.class));
        int length = isoFileArr.length;
        int i11 = 0;
        while (i11 < length) {
            arrayList2.addAll(isoFileArr[i11].getBoxes(MovieFragmentBox.class));
            i11++;
            mp4TrackImpl = this;
        }
        mp4TrackImpl.sampleDescriptionBox = sampleTableBox.getSampleDescriptionBox();
        List boxes = trackBox.getParent().getBoxes(MovieExtendsBox.class);
        if (boxes.size() > 0) {
            Iterator it3 = boxes.iterator();
            while (it3.hasNext()) {
                for (TrackExtendsBox trackExtendsBox : ((MovieExtendsBox) it3.next()).getBoxes(TrackExtendsBox.class)) {
                    if (trackExtendsBox.getTrackId() == trackId) {
                        if (Path.getPaths(((Box) trackBox.getParent()).getParent(), "/moof/traf/subs").size() > 0) {
                            mp4TrackImpl.subSampleInformationBox = new SubSampleInformationBox();
                        }
                        int size = arrayList2.size();
                        long j10 = 1;
                        int i12 = 0;
                        while (i12 < size) {
                            int i13 = i12 + 1;
                            long j11 = 1;
                            long j12 = j10;
                            for (TrackFragmentBox trackFragmentBox : ((MovieFragmentBox) arrayList2.get(i12)).getBoxes(TrackFragmentBox.class)) {
                                if (trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == trackId) {
                                    int i14 = size;
                                    long j13 = j12 - j11;
                                    long j14 = j11;
                                    long j15 = trackId;
                                    long j16 = j14;
                                    mp4TrackImpl.sampleGroups = mp4TrackImpl.getSampleGroups(sampleTableBox.getBoxes(SampleGroupDescriptionBox.class), Path.getPaths((Container) trackFragmentBox, SampleGroupDescriptionBox.TYPE), Path.getPaths((Container) trackFragmentBox, SampleToGroupBox.TYPE), mp4TrackImpl.sampleGroups, j13);
                                    SubSampleInformationBox subSampleInformationBox = (SubSampleInformationBox) Path.getPath((AbstractContainerBox) trackFragmentBox, SubSampleInformationBox.TYPE);
                                    if (subSampleInformationBox != null) {
                                        long j17 = (j12 - ((long) 0)) - j16;
                                        for (SubSampleInformationBox.SubSampleEntry subSampleEntry : subSampleInformationBox.getEntries()) {
                                            SubSampleInformationBox.SubSampleEntry subSampleEntry2 = new SubSampleInformationBox.SubSampleEntry();
                                            long j18 = j16;
                                            subSampleEntry2.getSubsampleEntries().addAll(subSampleEntry.getSubsampleEntries());
                                            if (j17 != 0) {
                                                subSampleEntry2.setSampleDelta(j17 + subSampleEntry.getSampleDelta());
                                                j17 = 0;
                                            } else {
                                                subSampleEntry2.setSampleDelta(subSampleEntry.getSampleDelta());
                                            }
                                            mp4TrackImpl.subSampleInformationBox.getEntries().add(subSampleEntry2);
                                            j16 = j18;
                                        }
                                    }
                                    long j19 = j16;
                                    Iterator it4 = trackFragmentBox.getBoxes(TrackRunBox.class).iterator();
                                    while (it4.hasNext()) {
                                        TrackRunBox trackRunBox2 = (TrackRunBox) it4.next();
                                        TrackFragmentHeaderBox trackFragmentHeaderBox2 = ((TrackFragmentBox) trackRunBox2.getParent()).getTrackFragmentHeaderBox();
                                        int i15 = 1;
                                        boolean z11 = true;
                                        for (Iterator<TrackRunBox.Entry> it5 = trackRunBox2.getEntries().iterator(); it5.hasNext(); it5 = it) {
                                            TrackRunBox.Entry next = it5.next();
                                            if (!trackRunBox2.isSampleDurationPresent()) {
                                                trackRunBox = trackRunBox2;
                                                trackFragmentHeaderBox = trackFragmentHeaderBox2;
                                                it = it5;
                                                i10 = i15;
                                                z10 = z11;
                                                long j20 = j19;
                                                Iterator it6 = it4;
                                                if (trackFragmentHeaderBox.hasDefaultSampleDuration()) {
                                                    it2 = it6;
                                                    arrayList.add(new TimeToSampleBox.Entry(j20, trackFragmentHeaderBox.getDefaultSampleDuration()));
                                                } else {
                                                    it2 = it6;
                                                    arrayList.add(new TimeToSampleBox.Entry(j20, trackExtendsBox.getDefaultSampleDuration()));
                                                }
                                            } else if (arrayList.size() == 0 || ((TimeToSampleBox.Entry) arrayList.get(arrayList.size() - i15)).getDelta() != next.getSampleDuration()) {
                                                i10 = i15;
                                                z10 = z11;
                                                trackRunBox = trackRunBox2;
                                                trackFragmentHeaderBox = trackFragmentHeaderBox2;
                                                it = it5;
                                                arrayList.add(new TimeToSampleBox.Entry(j19, next.getSampleDuration()));
                                                it2 = it4;
                                            } else {
                                                TimeToSampleBox.Entry entry = (TimeToSampleBox.Entry) arrayList.get(arrayList.size() - i15);
                                                i10 = i15;
                                                z10 = z11;
                                                entry.setCount(entry.getCount() + j19);
                                                trackRunBox = trackRunBox2;
                                                trackFragmentHeaderBox = trackFragmentHeaderBox2;
                                                it = it5;
                                                it2 = it4;
                                            }
                                            if (trackRunBox.isSampleCompositionTimeOffsetPresent()) {
                                                if (mp4TrackImpl.compositionTimeEntries.size() != 0) {
                                                    List<CompositionTimeToSample.Entry> list = mp4TrackImpl.compositionTimeEntries;
                                                    if (list.get(list.size() - 1).getOffset() != next.getSampleCompositionTimeOffset()) {
                                                        mp4TrackImpl.compositionTimeEntries.add(new CompositionTimeToSample.Entry(i10, CastUtils.l2i(next.getSampleCompositionTimeOffset())));
                                                    } else {
                                                        List<CompositionTimeToSample.Entry> list2 = mp4TrackImpl.compositionTimeEntries;
                                                        CompositionTimeToSample.Entry entry2 = list2.get(list2.size() - 1);
                                                        entry2.setCount(entry2.getCount() + 1);
                                                    }
                                                } else {
                                                    mp4TrackImpl.compositionTimeEntries.add(new CompositionTimeToSample.Entry(i10, CastUtils.l2i(next.getSampleCompositionTimeOffset())));
                                                }
                                            }
                                            SampleFlags sampleFlags = trackRunBox.isSampleFlagsPresent() ? next.getSampleFlags() : (z10 && trackRunBox.isFirstSampleFlagsPresent()) ? trackRunBox.getFirstSampleFlags() : trackFragmentHeaderBox.hasDefaultSampleFlags() ? trackFragmentHeaderBox.getDefaultSampleFlags() : trackExtendsBox.getDefaultSampleFlags();
                                            if (sampleFlags == null || sampleFlags.isSampleIsDifferenceSample()) {
                                                i15 = 1;
                                                z11 = false;
                                            } else {
                                                i15 = 1;
                                                z11 = false;
                                                mp4TrackImpl.syncSamples = Mp4Arrays.copyOfAndAppend(mp4TrackImpl.syncSamples, j12);
                                            }
                                            j19 = 1;
                                            j12++;
                                            it4 = it2;
                                            trackRunBox2 = trackRunBox;
                                            trackFragmentHeaderBox2 = trackFragmentHeaderBox;
                                        }
                                    }
                                    trackId = j15;
                                    size = i14;
                                    j11 = j19;
                                }
                            }
                            i12 = i13;
                            j10 = j12;
                        }
                    }
                }
            }
        } else {
            mp4TrackImpl.sampleGroups = mp4TrackImpl.getSampleGroups(sampleTableBox.getBoxes(SampleGroupDescriptionBox.class), null, sampleTableBox.getBoxes(SampleToGroupBox.class), mp4TrackImpl.sampleGroups, 0L);
        }
        mp4TrackImpl.decodingTimes = TimeToSampleBox.blowupTimeToSamples(arrayList);
        MediaHeaderBox mediaHeaderBox = trackBox.getMediaBox().getMediaHeaderBox();
        TrackHeaderBox trackHeaderBox = trackBox.getTrackHeaderBox();
        mp4TrackImpl.trackMetaData.setTrackId(trackHeaderBox.getTrackId());
        mp4TrackImpl.trackMetaData.setCreationTime(mediaHeaderBox.getCreationTime());
        mp4TrackImpl.trackMetaData.setLanguage(mediaHeaderBox.getLanguage());
        mp4TrackImpl.trackMetaData.setModificationTime(mediaHeaderBox.getModificationTime());
        mp4TrackImpl.trackMetaData.setTimescale(mediaHeaderBox.getTimescale());
        mp4TrackImpl.trackMetaData.setHeight(trackHeaderBox.getHeight());
        mp4TrackImpl.trackMetaData.setWidth(trackHeaderBox.getWidth());
        mp4TrackImpl.trackMetaData.setLayer(trackHeaderBox.getLayer());
        mp4TrackImpl.trackMetaData.setMatrix(trackHeaderBox.getMatrix());
        mp4TrackImpl.trackMetaData.setVolume(trackHeaderBox.getVolume());
        EditListBox editListBox = (EditListBox) Path.getPath((AbstractContainerBox) trackBox, "edts/elst");
        MovieHeaderBox movieHeaderBox = (MovieHeaderBox) Path.getPath((AbstractContainerBox) trackBox, "../mvhd");
        if (editListBox != null) {
            for (EditListBox.Entry entry3 : editListBox.getEntries()) {
                mp4TrackImpl.edits.add(new Edit(entry3.getMediaTime(), mediaHeaderBox.getTimescale(), entry3.getMediaRate(), entry3.getSegmentDuration() / movieHeaderBox.getTimescale()));
                mp4TrackImpl = this;
                mediaHeaderBox = mediaHeaderBox;
            }
        }
    }

    private Map<GroupEntry, long[]> getSampleGroups(List<SampleGroupDescriptionBox> list, List<SampleGroupDescriptionBox> list2, List<SampleToGroupBox> list3, Map<GroupEntry, long[]> map, long j10) {
        for (SampleToGroupBox sampleToGroupBox : list3) {
            int sampleCount = 0;
            for (SampleToGroupBox.Entry entry : sampleToGroupBox.getEntries()) {
                if (entry.getGroupDescriptionIndex() > 0) {
                    GroupEntry groupEntry = null;
                    if (entry.getGroupDescriptionIndex() > 65535) {
                        for (SampleGroupDescriptionBox sampleGroupDescriptionBox : list2) {
                            if (sampleGroupDescriptionBox.getGroupingType().equals(sampleToGroupBox.getGroupingType())) {
                                groupEntry = sampleGroupDescriptionBox.getGroupEntries().get((entry.getGroupDescriptionIndex() - 1) & 65535);
                            }
                        }
                    } else {
                        for (SampleGroupDescriptionBox sampleGroupDescriptionBox2 : list) {
                            if (sampleGroupDescriptionBox2.getGroupingType().equals(sampleToGroupBox.getGroupingType())) {
                                groupEntry = sampleGroupDescriptionBox2.getGroupEntries().get(entry.getGroupDescriptionIndex() - 1);
                            }
                        }
                    }
                    GroupEntry groupEntry2 = groupEntry;
                    long[] jArr = map.get(groupEntry2);
                    if (jArr == null) {
                        jArr = new long[0];
                    }
                    long[] jArr2 = jArr;
                    long[] jArr3 = new long[CastUtils.l2i(entry.getSampleCount()) + jArr2.length];
                    System.arraycopy(jArr2, 0, jArr3, 0, jArr2.length);
                    int i10 = 0;
                    while (true) {
                        long j11 = i10;
                        if (j11 >= entry.getSampleCount()) {
                            break;
                        }
                        jArr3[jArr2.length + i10] = j10 + ((long) sampleCount) + j11;
                        i10++;
                    }
                    map.put(groupEntry2, jArr3);
                }
                sampleCount = (int) (((long) sampleCount) + entry.getSampleCount());
            }
        }
        return map;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Container parent = this.trackBox.getParent();
        if (parent instanceof BasicContainer) {
            ((BasicContainer) parent).close();
        }
        IsoFile[] isoFileArr = this.fragments;
        if (isoFileArr != null) {
            for (IsoFile isoFile : isoFileArr) {
                isoFile.close();
            }
        }
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {
        return this.compositionTimeEntries;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public String getHandler() {
        return this.handler;
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        return this.sampleDependencies;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.sampleDescriptionBox;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public synchronized long[] getSampleDurations() {
        return this.decodingTimes;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public List<Sample> getSamples() {
        return this.samples;
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public SubSampleInformationBox getSubsampleInformationBox() {
        return this.subSampleInformationBox;
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public long[] getSyncSamples() {
        long[] jArr = this.syncSamples;
        if (jArr == null || jArr.length == this.samples.size()) {
            return null;
        }
        return this.syncSamples;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public TrackMetaData getTrackMetaData() {
        return this.trackMetaData;
    }
}
