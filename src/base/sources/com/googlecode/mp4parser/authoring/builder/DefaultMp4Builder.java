package com.googlecode.mp4parser.authoring.builder;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.DataEntryUrlBox;
import com.coremedia.iso.boxes.DataInformationBox;
import com.coremedia.iso.boxes.DataReferenceBox;
import com.coremedia.iso.boxes.EditBox;
import com.coremedia.iso.boxes.EditListBox;
import com.coremedia.iso.boxes.FileTypeBox;
import com.coremedia.iso.boxes.HandlerBox;
import com.coremedia.iso.boxes.HintMediaHeaderBox;
import com.coremedia.iso.boxes.MediaBox;
import com.coremedia.iso.boxes.MediaHeaderBox;
import com.coremedia.iso.boxes.MediaInformationBox;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.MovieHeaderBox;
import com.coremedia.iso.boxes.NullMediaHeaderBox;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleSizeBox;
import com.coremedia.iso.boxes.SampleTableBox;
import com.coremedia.iso.boxes.SampleToChunkBox;
import com.coremedia.iso.boxes.SoundMediaHeaderBox;
import com.coremedia.iso.boxes.StaticChunkOffsetBox;
import com.coremedia.iso.boxes.SubtitleMediaHeaderBox;
import com.coremedia.iso.boxes.SyncSampleBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.VideoMediaHeaderBox;
import com.coremedia.iso.boxes.mdat.MediaDataBox;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.BasicContainer;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.authoring.Edit;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack;
import com.googlecode.mp4parser.boxes.dece.SampleEncryptionBox;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.Logger;
import com.googlecode.mp4parser.util.Math;
import com.googlecode.mp4parser.util.Mp4Arrays;
import com.googlecode.mp4parser.util.Path;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox;
import hi.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class DefaultMp4Builder implements Mp4Builder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static Logger LOG = Logger.getLogger(DefaultMp4Builder.class);
    private Fragmenter fragmenter;
    Map<Track, StaticChunkOffsetBox> chunkOffsetBoxes = new HashMap();
    Set<SampleAuxiliaryInformationOffsetsBox> sampleAuxiliaryInformationOffsetsBoxes = new HashSet();
    HashMap<Track, List<Sample>> track2Sample = new HashMap<>();
    HashMap<Track, long[]> track2SampleSizes = new HashMap<>();

    public static long gcd(long j10, long j11) {
        return j11 == 0 ? j10 : gcd(j11, j10 % j11);
    }

    private static long sum(int[] iArr) {
        long j10 = 0;
        for (int i10 : iArr) {
            j10 += (long) i10;
        }
        return j10;
    }

    @Override // com.googlecode.mp4parser.authoring.builder.Mp4Builder
    public Container build(Movie movie) {
        Box next;
        if (this.fragmenter == null) {
            this.fragmenter = new BetterFragmenter(2.0d);
        }
        LOG.logDebug("Creating movie " + movie);
        Iterator<Track> it = movie.getTracks().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Movie movie2 = movie;
            Track next2 = it.next();
            List<Sample> samples = next2.getSamples();
            putSamples(next2, samples);
            int size = samples.size();
            long[] jArr = new long[size];
            for (int i10 = 0; i10 < size; i10++) {
                jArr[i10] = samples.get(i10).getSize();
            }
            this.track2SampleSizes.put(next2, jArr);
            movie = movie2;
        }
        BasicContainer basicContainer = new BasicContainer();
        basicContainer.addBox(createFileTypeBox(movie));
        HashMap map = new HashMap();
        for (Track track : movie.getTracks()) {
            Movie movie3 = movie;
            map.put(track, getChunkSizes(track));
            movie = movie3;
        }
        MovieBox movieBoxCreateMovieBox = createMovieBox(movie, map);
        basicContainer.addBox(movieBoxCreateMovieBox);
        Iterator it2 = Path.getPaths((Box) movieBoxCreateMovieBox, "trak/mdia/minf/stbl/stsz").iterator();
        long jSum = 0;
        while (it2.hasNext()) {
            movie = movie;
            map = map;
            jSum = sum(((SampleSizeBox) it2.next()).getSampleSizes()) + jSum;
        }
        LOG.logDebug("About to create mdat");
        InterleaveChunkMdat interleaveChunkMdat = new InterleaveChunkMdat(this, movie, map, jSum, null);
        basicContainer.addBox(interleaveChunkMdat);
        LOG.logDebug("mdat crated");
        long dataOffset = interleaveChunkMdat.getDataOffset();
        Iterator<StaticChunkOffsetBox> it3 = this.chunkOffsetBoxes.values().iterator();
        while (it3.hasNext()) {
            long[] chunkOffsets = it3.next().getChunkOffsets();
            for (int i11 = 0; i11 < chunkOffsets.length; i11++) {
                chunkOffsets[i11] = chunkOffsets[i11] + dataOffset;
            }
        }
        for (SampleAuxiliaryInformationOffsetsBox sampleAuxiliaryInformationOffsetsBox : this.sampleAuxiliaryInformationOffsetsBoxes) {
            long size2 = sampleAuxiliaryInformationOffsetsBox.getSize() + 44;
            Object obj = sampleAuxiliaryInformationOffsetsBox;
            while (true) {
                Container parent = ((Box) obj).getParent();
                Iterator<Box> it4 = parent.getBoxes().iterator();
                while (it4.hasNext() && (next = it4.next()) != obj) {
                    size2 += next.getSize();
                }
                if (!(parent instanceof Box)) {
                    break;
                }
                obj = parent;
            }
            long[] offsets = sampleAuxiliaryInformationOffsetsBox.getOffsets();
            for (int i12 = 0; i12 < offsets.length; i12++) {
                offsets[i12] = offsets[i12] + size2;
            }
            sampleAuxiliaryInformationOffsetsBox.setOffsets(offsets);
        }
        return basicContainer;
    }

    protected void createCencBoxes(CencEncryptedTrack cencEncryptedTrack, SampleTableBox sampleTableBox, int[] iArr) {
        SampleAuxiliaryInformationSizesBox sampleAuxiliaryInformationSizesBox = new SampleAuxiliaryInformationSizesBox();
        sampleAuxiliaryInformationSizesBox.setAuxInfoType(C.CENC_TYPE_cenc);
        sampleAuxiliaryInformationSizesBox.setFlags(1);
        List<a> sampleEncryptionEntries = cencEncryptedTrack.getSampleEncryptionEntries();
        if (cencEncryptedTrack.hasSubSampleEncryption()) {
            int size = sampleEncryptionEntries.size();
            short[] sArr = new short[size];
            for (int i10 = 0; i10 < size; i10++) {
                sArr[i10] = (short) sampleEncryptionEntries.get(i10).b();
            }
            sampleAuxiliaryInformationSizesBox.setSampleInfoSizes(sArr);
        } else {
            sampleAuxiliaryInformationSizesBox.setDefaultSampleInfoSize(8);
            sampleAuxiliaryInformationSizesBox.setSampleCount(cencEncryptedTrack.getSamples().size());
        }
        SampleAuxiliaryInformationOffsetsBox sampleAuxiliaryInformationOffsetsBox = new SampleAuxiliaryInformationOffsetsBox();
        SampleEncryptionBox sampleEncryptionBox = new SampleEncryptionBox();
        sampleEncryptionBox.setSubSampleEncryption(cencEncryptedTrack.hasSubSampleEncryption());
        sampleEncryptionBox.setEntries(sampleEncryptionEntries);
        long offsetToFirstIV = sampleEncryptionBox.getOffsetToFirstIV();
        long[] jArr = new long[iArr.length];
        int i11 = 0;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            jArr[i12] = offsetToFirstIV;
            int i13 = 0;
            while (i13 < iArr[i12]) {
                offsetToFirstIV += (long) sampleEncryptionEntries.get(i11).b();
                i13++;
                i11++;
                sampleEncryptionBox = sampleEncryptionBox;
            }
        }
        sampleAuxiliaryInformationOffsetsBox.setOffsets(jArr);
        sampleTableBox.addBox(sampleAuxiliaryInformationSizesBox);
        sampleTableBox.addBox(sampleAuxiliaryInformationOffsetsBox);
        sampleTableBox.addBox(sampleEncryptionBox);
        this.sampleAuxiliaryInformationOffsetsBoxes.add(sampleAuxiliaryInformationOffsetsBox);
    }

    protected void createCtts(Track track, SampleTableBox sampleTableBox) {
        List<CompositionTimeToSample.Entry> compositionTimeEntries = track.getCompositionTimeEntries();
        if (compositionTimeEntries == null || compositionTimeEntries.isEmpty()) {
            return;
        }
        CompositionTimeToSample compositionTimeToSample = new CompositionTimeToSample();
        compositionTimeToSample.setEntries(compositionTimeEntries);
        sampleTableBox.addBox(compositionTimeToSample);
    }

    protected Box createEdts(Track track, Movie movie) {
        if (track.getEdits() == null || track.getEdits().size() <= 0) {
            return null;
        }
        EditListBox editListBox = new EditListBox();
        editListBox.setVersion(0);
        ArrayList arrayList = new ArrayList();
        for (Edit edit : track.getEdits()) {
            arrayList.add(new EditListBox.Entry(editListBox, Math.round(edit.getSegmentDuration() * movie.getTimescale()), (edit.getMediaTime() * track.getTrackMetaData().getTimescale()) / edit.getTimeScale(), edit.getMediaRate()));
        }
        editListBox.setEntries(arrayList);
        EditBox editBox = new EditBox();
        editBox.addBox(editListBox);
        return editBox;
    }

    protected FileTypeBox createFileTypeBox(Movie movie) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("mp42");
        linkedList.add("iso6");
        linkedList.add(VisualSampleEntry.TYPE3);
        linkedList.add("isom");
        return new FileTypeBox("iso6", 1L, linkedList);
    }

    protected MovieBox createMovieBox(Movie movie, Map<Track, int[]> map) {
        long duration;
        MovieBox movieBox = new MovieBox();
        MovieHeaderBox movieHeaderBox = new MovieHeaderBox();
        movieHeaderBox.setCreationTime(new Date());
        movieHeaderBox.setModificationTime(new Date());
        movieHeaderBox.setMatrix(movie.getMatrix());
        long timescale = getTimescale(movie);
        long j10 = 0;
        for (Track track : movie.getTracks()) {
            if (track.getEdits() == null || track.getEdits().isEmpty()) {
                duration = (track.getDuration() * timescale) / track.getTrackMetaData().getTimescale();
            } else {
                Iterator<Edit> it = track.getEdits().iterator();
                double segmentDuration = 0.0d;
                while (it.hasNext()) {
                    segmentDuration += (long) it.next().getSegmentDuration();
                }
                duration = (long) (segmentDuration * timescale);
            }
            if (duration > j10) {
                j10 = duration;
            }
        }
        movieHeaderBox.setDuration(j10);
        movieHeaderBox.setTimescale(timescale);
        long trackId = 0;
        for (Track track2 : movie.getTracks()) {
            if (trackId < track2.getTrackMetaData().getTrackId()) {
                trackId = track2.getTrackMetaData().getTrackId();
            }
        }
        movieHeaderBox.setNextTrackId(trackId + 1);
        movieBox.addBox(movieHeaderBox);
        Iterator<Track> it2 = movie.getTracks().iterator();
        while (it2.hasNext()) {
            movieBox.addBox(createTrackBox(it2.next(), movie, map));
        }
        Box boxCreateUdta = createUdta(movie);
        if (boxCreateUdta != null) {
            movieBox.addBox(boxCreateUdta);
        }
        return movieBox;
    }

    protected void createSdtp(Track track, SampleTableBox sampleTableBox) {
        if (track.getSampleDependencies() == null || track.getSampleDependencies().isEmpty()) {
            return;
        }
        SampleDependencyTypeBox sampleDependencyTypeBox = new SampleDependencyTypeBox();
        sampleDependencyTypeBox.setEntries(track.getSampleDependencies());
        sampleTableBox.addBox(sampleDependencyTypeBox);
    }

    protected Box createStbl(Track track, Movie movie, Map<Track, int[]> map) {
        SampleTableBox sampleTableBox = new SampleTableBox();
        createStsd(track, sampleTableBox);
        createStts(track, sampleTableBox);
        createCtts(track, sampleTableBox);
        createStss(track, sampleTableBox);
        createSdtp(track, sampleTableBox);
        createStsc(track, map, sampleTableBox);
        createStsz(track, sampleTableBox);
        createStco(track, movie, map, sampleTableBox);
        HashMap map2 = new HashMap();
        for (Map.Entry<GroupEntry, long[]> entry : track.getSampleGroups().entrySet()) {
            String type = entry.getKey().getType();
            List arrayList = (List) map2.get(type);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map2.put(type, arrayList);
            }
            arrayList.add(entry.getKey());
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            SampleGroupDescriptionBox sampleGroupDescriptionBox = new SampleGroupDescriptionBox();
            String str = (String) entry2.getKey();
            sampleGroupDescriptionBox.setGroupingType(str);
            sampleGroupDescriptionBox.setGroupEntries((List) entry2.getValue());
            SampleToGroupBox sampleToGroupBox = new SampleToGroupBox();
            sampleToGroupBox.setGroupingType(str);
            SampleToGroupBox.Entry entry3 = null;
            for (int i10 = 0; i10 < track.getSamples().size(); i10++) {
                int i11 = 0;
                for (int i12 = 0; i12 < ((List) entry2.getValue()).size(); i12++) {
                    if (Arrays.binarySearch(track.getSampleGroups().get((GroupEntry) ((List) entry2.getValue()).get(i12)), i10) >= 0) {
                        i11 = i12 + 1;
                    }
                }
                if (entry3 == null || entry3.getGroupDescriptionIndex() != i11) {
                    SampleToGroupBox.Entry entry4 = new SampleToGroupBox.Entry(1L, i11);
                    sampleToGroupBox.getEntries().add(entry4);
                    entry3 = entry4;
                } else {
                    entry3.setSampleCount(entry3.getSampleCount() + 1);
                }
            }
            sampleTableBox.addBox(sampleGroupDescriptionBox);
            sampleTableBox.addBox(sampleToGroupBox);
        }
        if (track instanceof CencEncryptedTrack) {
            createCencBoxes((CencEncryptedTrack) track, sampleTableBox, map.get(track));
        }
        createSubs(track, sampleTableBox);
        LOG.logDebug("done with stbl for track_" + track.getTrackMetaData().getTrackId());
        return sampleTableBox;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0129 A[PHI: r3
      0x0129: PHI (r3v15 com.googlecode.mp4parser.authoring.Track) = (r3v13 com.googlecode.mp4parser.authoring.Track), (r3v18 com.googlecode.mp4parser.authoring.Track) binds: [B:23:0x0124, B:19:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    protected void createStco(Track track, Movie movie, Map<Track, int[]> map, SampleTableBox sampleTableBox) {
        int i10;
        Track track2;
        int i11 = 0;
        if (this.chunkOffsetBoxes.get(track) == null) {
            LOG.logDebug("Calculating chunk offsets for track_" + track.getTrackMetaData().getTrackId());
            ArrayList arrayList = new ArrayList(map.keySet());
            Collections.sort(arrayList, new Comparator<Track>() { // from class: com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder.1
                @Override // java.util.Comparator
                public int compare(Track track3, Track track4) {
                    return CastUtils.l2i(track3.getTrackMetaData().getTrackId() - track4.getTrackMetaData().getTrackId());
                }
            });
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            HashMap map4 = new HashMap();
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                Track track3 = (Track) obj;
                map2.put(track3, 0);
                map3.put(track3, 0);
                map4.put(track3, Double.valueOf(0.0d));
                this.chunkOffsetBoxes.put(track3, new StaticChunkOffsetBox());
                i11 = 0;
            }
            long j10 = 0;
            while (true) {
                int size2 = arrayList.size();
                Track track4 = null;
                int i13 = i11;
                while (i13 < size2) {
                    Track track5 = track4;
                    Object obj2 = arrayList.get(i13);
                    i13++;
                    track4 = (Track) obj2;
                    if (track5 != null) {
                        track2 = track5;
                        if (((Double) map4.get(track4)).doubleValue() >= ((Double) map4.get(track2)).doubleValue()) {
                            track4 = track2;
                        }
                        i11 = 0;
                    } else {
                        track2 = track5;
                    }
                    if (((Integer) map2.get(track4)).intValue() >= map.get(track4).length) {
                        track4 = track2;
                    }
                    i11 = 0;
                }
                if (track4 == null) {
                    break;
                }
                StaticChunkOffsetBox staticChunkOffsetBox = this.chunkOffsetBoxes.get(track4);
                long[] chunkOffsets = staticChunkOffsetBox.getChunkOffsets();
                long[] jArr = new long[1];
                jArr[i11] = j10;
                staticChunkOffsetBox.setChunkOffsets(Mp4Arrays.copyOfAndAppend(chunkOffsets, jArr));
                int iIntValue = ((Integer) map2.get(track4)).intValue();
                int i14 = map.get(track4)[iIntValue];
                int iIntValue2 = ((Integer) map3.get(track4)).intValue();
                double dDoubleValue = ((Double) map4.get(track4)).doubleValue();
                long[] sampleDurations = track4.getSampleDurations();
                int i15 = iIntValue2;
                while (true) {
                    i10 = iIntValue2 + i14;
                    if (i15 >= i10) {
                        break;
                    }
                    j10 += this.track2SampleSizes.get(track4)[i15];
                    Track track6 = track4;
                    dDoubleValue += sampleDurations[i15] / track6.getTrackMetaData().getTimescale();
                    i15++;
                    track4 = track6;
                    i11 = 0;
                }
                map2.put(track4, Integer.valueOf(iIntValue + 1));
                map3.put(track4, Integer.valueOf(i10));
                map4.put(track4, Double.valueOf(dDoubleValue));
            }
        }
        sampleTableBox.addBox(this.chunkOffsetBoxes.get(track));
    }

    protected void createStsc(Track track, Map<Track, int[]> map, SampleTableBox sampleTableBox) {
        int[] iArr = map.get(track);
        SampleToChunkBox sampleToChunkBox = new SampleToChunkBox();
        sampleToChunkBox.setEntries(new LinkedList());
        long j10 = -2147483648L;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (j10 != iArr[i10]) {
                sampleToChunkBox.getEntries().add(new SampleToChunkBox.Entry(i10 + 1, iArr[i10], 1L));
                j10 = iArr[i10];
            }
        }
        sampleTableBox.addBox(sampleToChunkBox);
    }

    protected void createStsd(Track track, SampleTableBox sampleTableBox) {
        sampleTableBox.addBox(track.getSampleDescriptionBox());
    }

    protected void createStss(Track track, SampleTableBox sampleTableBox) {
        long[] syncSamples = track.getSyncSamples();
        if (syncSamples == null || syncSamples.length <= 0) {
            return;
        }
        SyncSampleBox syncSampleBox = new SyncSampleBox();
        syncSampleBox.setSampleNumber(syncSamples);
        sampleTableBox.addBox(syncSampleBox);
    }

    protected void createStsz(Track track, SampleTableBox sampleTableBox) {
        SampleSizeBox sampleSizeBox = new SampleSizeBox();
        sampleSizeBox.setSampleSizes(this.track2SampleSizes.get(track));
        sampleTableBox.addBox(sampleSizeBox);
    }

    protected void createStts(Track track, SampleTableBox sampleTableBox) {
        ArrayList arrayList = new ArrayList();
        TimeToSampleBox.Entry entry = null;
        for (long j10 : track.getSampleDurations()) {
            if (entry == null || entry.getDelta() != j10) {
                entry = new TimeToSampleBox.Entry(1L, j10);
                arrayList.add(entry);
            } else {
                entry.setCount(entry.getCount() + 1);
            }
        }
        TimeToSampleBox timeToSampleBox = new TimeToSampleBox();
        timeToSampleBox.setEntries(arrayList);
        sampleTableBox.addBox(timeToSampleBox);
    }

    protected void createSubs(Track track, SampleTableBox sampleTableBox) {
        if (track.getSubsampleInformationBox() != null) {
            sampleTableBox.addBox(track.getSubsampleInformationBox());
        }
    }

    protected TrackBox createTrackBox(Track track, Movie movie, Map<Track, int[]> map) {
        TrackBox trackBox = new TrackBox();
        TrackHeaderBox trackHeaderBox = new TrackHeaderBox();
        trackHeaderBox.setEnabled(true);
        trackHeaderBox.setInMovie(true);
        trackHeaderBox.setMatrix(track.getTrackMetaData().getMatrix());
        trackHeaderBox.setAlternateGroup(track.getTrackMetaData().getGroup());
        trackHeaderBox.setCreationTime(track.getTrackMetaData().getCreationTime());
        if (track.getEdits() == null || track.getEdits().isEmpty()) {
            trackHeaderBox.setDuration((track.getDuration() * getTimescale(movie)) / track.getTrackMetaData().getTimescale());
        } else {
            Iterator<Edit> it = track.getEdits().iterator();
            long segmentDuration = 0;
            while (it.hasNext()) {
                segmentDuration += (long) it.next().getSegmentDuration();
            }
            trackHeaderBox.setDuration(segmentDuration * track.getTrackMetaData().getTimescale());
        }
        trackHeaderBox.setHeight(track.getTrackMetaData().getHeight());
        trackHeaderBox.setWidth(track.getTrackMetaData().getWidth());
        trackHeaderBox.setLayer(track.getTrackMetaData().getLayer());
        trackHeaderBox.setModificationTime(new Date());
        trackHeaderBox.setTrackId(track.getTrackMetaData().getTrackId());
        trackHeaderBox.setVolume(track.getTrackMetaData().getVolume());
        trackBox.addBox(trackHeaderBox);
        trackBox.addBox(createEdts(track, movie));
        MediaBox mediaBox = new MediaBox();
        trackBox.addBox(mediaBox);
        MediaHeaderBox mediaHeaderBox = new MediaHeaderBox();
        mediaHeaderBox.setCreationTime(track.getTrackMetaData().getCreationTime());
        mediaHeaderBox.setDuration(track.getDuration());
        mediaHeaderBox.setTimescale(track.getTrackMetaData().getTimescale());
        mediaHeaderBox.setLanguage(track.getTrackMetaData().getLanguage());
        mediaBox.addBox(mediaHeaderBox);
        HandlerBox handlerBox = new HandlerBox();
        mediaBox.addBox(handlerBox);
        handlerBox.setHandlerType(track.getHandler());
        MediaInformationBox mediaInformationBox = new MediaInformationBox();
        if (track.getHandler().equals("vide")) {
            mediaInformationBox.addBox(new VideoMediaHeaderBox());
        } else if (track.getHandler().equals("soun")) {
            mediaInformationBox.addBox(new SoundMediaHeaderBox());
        } else if (track.getHandler().equals("text")) {
            mediaInformationBox.addBox(new NullMediaHeaderBox());
        } else if (track.getHandler().equals("subt")) {
            mediaInformationBox.addBox(new SubtitleMediaHeaderBox());
        } else if (track.getHandler().equals("hint")) {
            mediaInformationBox.addBox(new HintMediaHeaderBox());
        } else if (track.getHandler().equals("sbtl")) {
            mediaInformationBox.addBox(new NullMediaHeaderBox());
        }
        DataInformationBox dataInformationBox = new DataInformationBox();
        DataReferenceBox dataReferenceBox = new DataReferenceBox();
        dataInformationBox.addBox(dataReferenceBox);
        DataEntryUrlBox dataEntryUrlBox = new DataEntryUrlBox();
        dataEntryUrlBox.setFlags(1);
        dataReferenceBox.addBox(dataEntryUrlBox);
        mediaInformationBox.addBox(dataInformationBox);
        mediaInformationBox.addBox(createStbl(track, movie, map));
        mediaBox.addBox(mediaInformationBox);
        LOG.logDebug("done with trak for track_" + track.getTrackMetaData().getTrackId());
        return trackBox;
    }

    protected Box createUdta(Movie movie) {
        return null;
    }

    int[] getChunkSizes(Track track) {
        long[] jArrSampleNumbers = this.fragmenter.sampleNumbers(track);
        int[] iArr = new int[jArrSampleNumbers.length];
        int i10 = 0;
        while (i10 < jArrSampleNumbers.length) {
            int i11 = i10 + 1;
            iArr[i10] = CastUtils.l2i((jArrSampleNumbers.length == i11 ? track.getSamples().size() : jArrSampleNumbers[i11] - 1) - (jArrSampleNumbers[i10] - 1));
            i10 = i11;
        }
        return iArr;
    }

    public long getTimescale(Movie movie) {
        long timescale = movie.getTracks().iterator().next().getTrackMetaData().getTimescale();
        Iterator<Track> it = movie.getTracks().iterator();
        while (it.hasNext()) {
            timescale = Math.lcm(timescale, it.next().getTrackMetaData().getTimescale());
        }
        return timescale;
    }

    protected List<Sample> putSamples(Track track, List<Sample> list) {
        return this.track2Sample.put(track, list);
    }

    public void setFragmenter(Fragmenter fragmenter) {
        this.fragmenter = fragmenter;
    }

    private static long sum(long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        return j10;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class InterleaveChunkMdat implements Box {
        List<List<Sample>> chunkList;
        long contentSize;
        Container parent;
        List<Track> tracks;

        /* JADX WARN: Code duplicated, block: B:22:0x00fd A[PHI: r5
          0x00fd: PHI (r5v15 com.googlecode.mp4parser.authoring.Track) = (r5v13 com.googlecode.mp4parser.authoring.Track), (r5v18 com.googlecode.mp4parser.authoring.Track) binds: [B:20:0x00f8, B:16:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
        private InterleaveChunkMdat(Movie movie, Map<Track, int[]> map, long j10) {
            int i10;
            Track track;
            this.chunkList = new ArrayList();
            this.contentSize = j10;
            this.tracks = movie.getTracks();
            ArrayList arrayList = new ArrayList(map.keySet());
            Collections.sort(arrayList, new Comparator<Track>() { // from class: com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder.InterleaveChunkMdat.1
                @Override // java.util.Comparator
                public int compare(Track track2, Track track3) {
                    return CastUtils.l2i(track2.getTrackMetaData().getTrackId() - track3.getTrackMetaData().getTrackId());
                }
            });
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            HashMap map4 = new HashMap();
            int i11 = 0;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                Track track2 = (Track) obj;
                map2.put(track2, 0);
                map3.put(track2, 0);
                map4.put(track2, Double.valueOf(0.0d));
                i11 = 0;
            }
            while (true) {
                int size2 = arrayList.size();
                Track track3 = null;
                int i13 = i11;
                while (i13 < size2) {
                    Track track4 = track3;
                    Object obj2 = arrayList.get(i13);
                    i13++;
                    track3 = (Track) obj2;
                    if (track4 != null) {
                        track = track4;
                        if (((Double) map4.get(track3)).doubleValue() >= ((Double) map4.get(track)).doubleValue()) {
                            track3 = track;
                        }
                        i11 = 0;
                    } else {
                        track = track4;
                    }
                    if (((Integer) map2.get(track3)).intValue() >= map.get(track3).length) {
                        track3 = track;
                    }
                    i11 = 0;
                }
                if (track3 == null) {
                    return;
                }
                int iIntValue = ((Integer) map2.get(track3)).intValue();
                int i14 = map.get(track3)[iIntValue];
                int iIntValue2 = ((Integer) map3.get(track3)).intValue();
                double dDoubleValue = ((Double) map4.get(track3)).doubleValue();
                int i15 = iIntValue2;
                while (true) {
                    i10 = iIntValue2 + i14;
                    if (i15 >= i10) {
                        break;
                    }
                    Track track5 = track3;
                    dDoubleValue += track3.getSampleDurations()[i15] / track5.getTrackMetaData().getTimescale();
                    i15++;
                    track3 = track5;
                    i11 = 0;
                }
                this.chunkList.add(track3.getSamples().subList(iIntValue2, i10));
                map2.put(track3, Integer.valueOf(iIntValue + 1));
                map3.put(track3, Integer.valueOf(i10));
                map4.put(track3, Double.valueOf(dDoubleValue));
            }
        }

        private boolean isSmallBox(long j10) {
            return j10 + 8 < 4294967296L;
        }

        @Override // com.coremedia.iso.boxes.Box
        public void getBox(WritableByteChannel writableByteChannel) throws IOException {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            long size = getSize();
            if (isSmallBox(size)) {
                IsoTypeWriter.writeUInt32(byteBufferAllocate, size);
            } else {
                IsoTypeWriter.writeUInt32(byteBufferAllocate, 1L);
            }
            byteBufferAllocate.put(IsoFile.fourCCtoBytes(MediaDataBox.TYPE));
            if (isSmallBox(size)) {
                byteBufferAllocate.put(new byte[8]);
            } else {
                IsoTypeWriter.writeUInt64(byteBufferAllocate, size);
            }
            byteBufferAllocate.rewind();
            writableByteChannel.write(byteBufferAllocate);
            DefaultMp4Builder.LOG.logDebug("About to write " + this.contentSize);
            Iterator<List<Sample>> it = this.chunkList.iterator();
            long size2 = 0;
            long j10 = 0;
            while (it.hasNext()) {
                for (Sample sample : it.next()) {
                    sample.writeTo(writableByteChannel);
                    size2 += sample.getSize();
                    if (size2 > 1048576) {
                        size2 -= 1048576;
                        j10++;
                        DefaultMp4Builder.LOG.logDebug("Written " + j10 + "MB");
                    }
                }
            }
        }

        public long getDataOffset() {
            Box next;
            long size = 16;
            Object parent = this;
            while (parent instanceof Box) {
                Box box = (Box) parent;
                Iterator<Box> it = box.getParent().getBoxes().iterator();
                while (it.hasNext() && parent != (next = it.next())) {
                    size += next.getSize();
                }
                parent = box.getParent();
            }
            return size;
        }

        @Override // com.coremedia.iso.boxes.Box
        public long getOffset() {
            throw new RuntimeException("Doesn't have any meaning for programmatically created boxes");
        }

        @Override // com.coremedia.iso.boxes.Box
        public Container getParent() {
            return this.parent;
        }

        @Override // com.coremedia.iso.boxes.Box
        public long getSize() {
            return this.contentSize + 16;
        }

        @Override // com.coremedia.iso.boxes.Box
        public String getType() {
            return MediaDataBox.TYPE;
        }

        @Override // com.coremedia.iso.boxes.Box
        public void setParent(Container container) {
            this.parent = container;
        }

        /* synthetic */ InterleaveChunkMdat(DefaultMp4Builder defaultMp4Builder, Movie movie, Map map, long j10, InterleaveChunkMdat interleaveChunkMdat) {
            this(movie, map, j10);
        }

        @Override // com.coremedia.iso.boxes.Box
        public void parse(DataSource dataSource, ByteBuffer byteBuffer, long j10, BoxParser boxParser) {
        }
    }
}
