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
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SampleSizeBox;
import com.coremedia.iso.boxes.SampleTableBox;
import com.coremedia.iso.boxes.SampleToChunkBox;
import com.coremedia.iso.boxes.SoundMediaHeaderBox;
import com.coremedia.iso.boxes.StaticChunkOffsetBox;
import com.coremedia.iso.boxes.SubtitleMediaHeaderBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.VideoMediaHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessOffsetBox;
import com.coremedia.iso.boxes.fragment.SampleFlags;
import com.coremedia.iso.boxes.fragment.TrackExtendsBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import com.coremedia.iso.boxes.mdat.MediaDataBox;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.AbstractContainerBox;
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
import com.googlecode.mp4parser.util.Path;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox;
import com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox;
import hi.a;
import hi.b;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class FragmentedMp4Builder implements Mp4Builder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Logger LOG = Logger.getLogger(FragmentedMp4Builder.class.getName());
    protected Fragmenter fragmenter;

    private long getTrackDuration(Movie movie, Track track) {
        return (track.getDuration() * movie.getTimescale()) / track.getTrackMetaData().getTimescale();
    }

    @Override // com.googlecode.mp4parser.authoring.builder.Mp4Builder
    public Container build(Movie movie) {
        LOG.fine("Creating movie " + movie);
        if (this.fragmenter == null) {
            this.fragmenter = new BetterFragmenter(2.0d);
        }
        BasicContainer basicContainer = new BasicContainer();
        basicContainer.addBox(createFtyp(movie));
        basicContainer.addBox(createMoov(movie));
        Iterator<Box> it = createMoofMdat(movie).iterator();
        while (it.hasNext()) {
            basicContainer.addBox(it.next());
        }
        basicContainer.addBox(createMfra(movie, basicContainer));
        return basicContainer;
    }

    protected DataInformationBox createDinf(Movie movie, Track track) {
        DataInformationBox dataInformationBox = new DataInformationBox();
        DataReferenceBox dataReferenceBox = new DataReferenceBox();
        dataInformationBox.addBox(dataReferenceBox);
        DataEntryUrlBox dataEntryUrlBox = new DataEntryUrlBox();
        dataEntryUrlBox.setFlags(1);
        dataReferenceBox.addBox(dataEntryUrlBox);
        return dataInformationBox;
    }

    protected Box createEdts(Track track, Movie movie) {
        if (track.getEdits() == null || track.getEdits().size() <= 0) {
            return null;
        }
        EditListBox editListBox = new EditListBox();
        editListBox.setVersion(1);
        ArrayList arrayList = new ArrayList();
        for (Edit edit : track.getEdits()) {
            arrayList.add(new EditListBox.Entry(editListBox, Math.round(edit.getSegmentDuration() * movie.getTimescale()), (edit.getMediaTime() * track.getTrackMetaData().getTimescale()) / edit.getTimeScale(), edit.getMediaRate()));
        }
        editListBox.setEntries(arrayList);
        EditBox editBox = new EditBox();
        editBox.addBox(editListBox);
        return editBox;
    }

    protected int createFragment(List<Box> list, Track track, long j10, long j11, int i10) {
        if (j10 == j11) {
            return i10;
        }
        list.add(createMoof(j10, j11, track, i10));
        list.add(createMdat(j10, j11, track, i10));
        return i10;
    }

    public Box createFtyp(Movie movie) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("mp42");
        linkedList.add("iso6");
        linkedList.add(VisualSampleEntry.TYPE3);
        linkedList.add("isom");
        return new FileTypeBox("iso6", 1L, linkedList);
    }

    protected Box createMdat(final long j10, final long j11, final Track track, int i10) {
        return new Box() { // from class: com.googlecode.mp4parser.authoring.builder.FragmentedMp4Builder.1Mdat
            Container parent;
            long size_ = -1;

            @Override // com.coremedia.iso.boxes.Box
            public void getBox(WritableByteChannel writableByteChannel) throws IOException {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                IsoTypeWriter.writeUInt32(byteBufferAllocate, CastUtils.l2i(getSize()));
                byteBufferAllocate.put(IsoFile.fourCCtoBytes(getType()));
                byteBufferAllocate.rewind();
                writableByteChannel.write(byteBufferAllocate);
                Iterator<Sample> it = FragmentedMp4Builder.this.getSamples(j10, j11, track).iterator();
                while (it.hasNext()) {
                    it.next().writeTo(writableByteChannel);
                }
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
                long j12 = this.size_;
                if (j12 != -1) {
                    return j12;
                }
                Iterator<Sample> it = FragmentedMp4Builder.this.getSamples(j10, j11, track).iterator();
                long size = 8;
                while (it.hasNext()) {
                    size += it.next().getSize();
                }
                this.size_ = size;
                return size;
            }

            @Override // com.coremedia.iso.boxes.Box
            public String getType() {
                return MediaDataBox.TYPE;
            }

            @Override // com.coremedia.iso.boxes.Box
            public void setParent(Container container) {
                this.parent = container;
            }

            @Override // com.coremedia.iso.boxes.Box
            public void parse(DataSource dataSource, ByteBuffer byteBuffer, long j12, BoxParser boxParser) {
            }
        };
    }

    protected Box createMdhd(Movie movie, Track track) {
        MediaHeaderBox mediaHeaderBox = new MediaHeaderBox();
        mediaHeaderBox.setCreationTime(track.getTrackMetaData().getCreationTime());
        mediaHeaderBox.setModificationTime(getDate());
        mediaHeaderBox.setDuration(0L);
        mediaHeaderBox.setTimescale(track.getTrackMetaData().getTimescale());
        mediaHeaderBox.setLanguage(track.getTrackMetaData().getLanguage());
        return mediaHeaderBox;
    }

    protected Box createMdia(Track track, Movie movie) {
        MediaBox mediaBox = new MediaBox();
        mediaBox.addBox(createMdhd(movie, track));
        mediaBox.addBox(createMdiaHdlr(track, movie));
        mediaBox.addBox(createMinf(track, movie));
        return mediaBox;
    }

    protected Box createMdiaHdlr(Track track, Movie movie) {
        HandlerBox handlerBox = new HandlerBox();
        handlerBox.setHandlerType(track.getHandler());
        return handlerBox;
    }

    protected void createMfhd(long j10, long j11, Track track, int i10, MovieFragmentBox movieFragmentBox) {
        MovieFragmentHeaderBox movieFragmentHeaderBox = new MovieFragmentHeaderBox();
        movieFragmentHeaderBox.setSequenceNumber(i10);
        movieFragmentBox.addBox(movieFragmentHeaderBox);
    }

    protected Box createMfra(Movie movie, Container container) {
        MovieFragmentRandomAccessBox movieFragmentRandomAccessBox = new MovieFragmentRandomAccessBox();
        Iterator<Track> it = movie.getTracks().iterator();
        while (it.hasNext()) {
            movieFragmentRandomAccessBox.addBox(createTfra(it.next(), container));
        }
        MovieFragmentRandomAccessOffsetBox movieFragmentRandomAccessOffsetBox = new MovieFragmentRandomAccessOffsetBox();
        movieFragmentRandomAccessBox.addBox(movieFragmentRandomAccessOffsetBox);
        movieFragmentRandomAccessOffsetBox.setMfraSize(movieFragmentRandomAccessBox.getSize());
        return movieFragmentRandomAccessBox;
    }

    protected Box createMinf(Track track, Movie movie) {
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
        mediaInformationBox.addBox(createDinf(movie, track));
        mediaInformationBox.addBox(createStbl(movie, track));
        return mediaInformationBox;
    }

    protected Box createMoof(long j10, long j11, Track track, int i10) {
        MovieFragmentBox movieFragmentBox = new MovieFragmentBox();
        createMfhd(j10, j11, track, i10, movieFragmentBox);
        createTraf(j10, j11, track, i10, movieFragmentBox);
        TrackRunBox trackRunBox = movieFragmentBox.getTrackRunBoxes().get(0);
        trackRunBox.setDataOffset(1);
        trackRunBox.setDataOffset((int) (movieFragmentBox.getSize() + 8));
        return movieFragmentBox;
    }

    protected List<Box> createMoofMdat(Movie movie) {
        LinkedList linkedList = new LinkedList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (Track track : movie.getTracks()) {
            map.put(track, this.fragmenter.sampleNumbers(track));
            map2.put(track, Double.valueOf(0.0d));
        }
        int i10 = 1;
        while (!map.isEmpty()) {
            Track track2 = null;
            double dDoubleValue = Double.MAX_VALUE;
            for (Map.Entry entry : map2.entrySet()) {
                if (((Double) entry.getValue()).doubleValue() < dDoubleValue) {
                    dDoubleValue = ((Double) entry.getValue()).doubleValue();
                    track2 = (Track) entry.getKey();
                }
            }
            long[] jArr = (long[]) map.get(track2);
            long j10 = jArr[0];
            long size = jArr.length > 1 ? jArr[1] : track2.getSamples().size() + 1;
            long[] sampleDurations = track2.getSampleDurations();
            long j11 = size;
            long timescale = track2.getTrackMetaData().getTimescale();
            double d10 = dDoubleValue;
            long j12 = j10;
            while (j12 < j11) {
                d10 += sampleDurations[CastUtils.l2i(j12 - 1)] / timescale;
                j12++;
                j10 = j10;
                j11 = j11;
            }
            Track track3 = track2;
            createFragment(linkedList, track3, j10, j11, i10);
            if (jArr.length == 1) {
                map.remove(track3);
                map2.remove(track3);
            } else {
                int length = jArr.length - 1;
                long[] jArr2 = new long[length];
                System.arraycopy(jArr, 1, jArr2, 0, length);
                map.put(track3, jArr2);
                map2.put(track3, Double.valueOf(d10));
            }
            i10++;
        }
        return linkedList;
    }

    protected Box createMoov(Movie movie) {
        MovieBox movieBox = new MovieBox();
        movieBox.addBox(createMvhd(movie));
        Iterator<Track> it = movie.getTracks().iterator();
        while (it.hasNext()) {
            movieBox.addBox(createTrak(it.next(), movie));
        }
        movieBox.addBox(createMvex(movie));
        return movieBox;
    }

    protected Box createMvex(Movie movie) {
        MovieExtendsBox movieExtendsBox = new MovieExtendsBox();
        MovieExtendsHeaderBox movieExtendsHeaderBox = new MovieExtendsHeaderBox();
        movieExtendsHeaderBox.setVersion(1);
        Iterator<Track> it = movie.getTracks().iterator();
        while (it.hasNext()) {
            long trackDuration = getTrackDuration(movie, it.next());
            if (movieExtendsHeaderBox.getFragmentDuration() < trackDuration) {
                movieExtendsHeaderBox.setFragmentDuration(trackDuration);
            }
        }
        movieExtendsBox.addBox(movieExtendsHeaderBox);
        Iterator<Track> it2 = movie.getTracks().iterator();
        while (it2.hasNext()) {
            movieExtendsBox.addBox(createTrex(movie, it2.next()));
        }
        return movieExtendsBox;
    }

    protected Box createMvhd(Movie movie) {
        MovieHeaderBox movieHeaderBox = new MovieHeaderBox();
        movieHeaderBox.setVersion(1);
        movieHeaderBox.setCreationTime(getDate());
        movieHeaderBox.setModificationTime(getDate());
        long trackId = 0;
        movieHeaderBox.setDuration(0L);
        movieHeaderBox.setTimescale(movie.getTimescale());
        for (Track track : movie.getTracks()) {
            if (trackId < track.getTrackMetaData().getTrackId()) {
                trackId = track.getTrackMetaData().getTrackId();
            }
        }
        movieHeaderBox.setNextTrackId(trackId + 1);
        return movieHeaderBox;
    }

    protected void createSaio(long j10, long j11, CencEncryptedTrack cencEncryptedTrack, int i10, TrackFragmentBox trackFragmentBox) {
        Box next;
        SampleAuxiliaryInformationOffsetsBox sampleAuxiliaryInformationOffsetsBox = new SampleAuxiliaryInformationOffsetsBox();
        trackFragmentBox.addBox(sampleAuxiliaryInformationOffsetsBox);
        sampleAuxiliaryInformationOffsetsBox.setAuxInfoType(C.CENC_TYPE_cenc);
        sampleAuxiliaryInformationOffsetsBox.setFlags(1);
        long offsetToFirstIV = 8;
        for (Box box : trackFragmentBox.getBoxes()) {
            if (box instanceof SampleEncryptionBox) {
                offsetToFirstIV += (long) ((SampleEncryptionBox) box).getOffsetToFirstIV();
                break;
            }
            offsetToFirstIV += box.getSize();
        }
        long size = offsetToFirstIV + 16;
        Iterator<Box> it = ((MovieFragmentBox) trackFragmentBox.getParent()).getBoxes().iterator();
        while (it.hasNext() && (next = it.next()) != trackFragmentBox) {
            size += next.getSize();
        }
        sampleAuxiliaryInformationOffsetsBox.setOffsets(new long[]{size});
    }

    protected void createSaiz(long j10, long j11, CencEncryptedTrack cencEncryptedTrack, int i10, TrackFragmentBox trackFragmentBox) {
        SampleDescriptionBox sampleDescriptionBox = cencEncryptedTrack.getSampleDescriptionBox();
        b bVar = (b) Path.getPath((AbstractContainerBox) sampleDescriptionBox, "enc.[0]/sinf[0]/schi[0]/tenc[0]");
        SampleAuxiliaryInformationSizesBox sampleAuxiliaryInformationSizesBox = new SampleAuxiliaryInformationSizesBox();
        sampleAuxiliaryInformationSizesBox.setAuxInfoType(C.CENC_TYPE_cenc);
        sampleAuxiliaryInformationSizesBox.setFlags(1);
        if (cencEncryptedTrack.hasSubSampleEncryption()) {
            int iL2i = CastUtils.l2i(j11 - j10);
            short[] sArr = new short[iL2i];
            List<a> listSubList = cencEncryptedTrack.getSampleEncryptionEntries().subList(CastUtils.l2i(j10 - 1), CastUtils.l2i(j11 - 1));
            for (int i11 = 0; i11 < iL2i; i11++) {
                sArr[i11] = (short) listSubList.get(i11).b();
            }
            sampleAuxiliaryInformationSizesBox.setSampleInfoSizes(sArr);
        } else {
            sampleAuxiliaryInformationSizesBox.setDefaultSampleInfoSize(bVar.getDefaultIvSize());
            sampleAuxiliaryInformationSizesBox.setSampleCount(CastUtils.l2i(j11 - j10));
        }
        trackFragmentBox.addBox(sampleAuxiliaryInformationSizesBox);
    }

    protected void createSenc(long j10, long j11, CencEncryptedTrack cencEncryptedTrack, int i10, TrackFragmentBox trackFragmentBox) {
        SampleEncryptionBox sampleEncryptionBox = new SampleEncryptionBox();
        sampleEncryptionBox.setSubSampleEncryption(cencEncryptedTrack.hasSubSampleEncryption());
        sampleEncryptionBox.setEntries(cencEncryptedTrack.getSampleEncryptionEntries().subList(CastUtils.l2i(j10 - 1), CastUtils.l2i(j11 - 1)));
        trackFragmentBox.addBox(sampleEncryptionBox);
    }

    protected Box createStbl(Movie movie, Track track) {
        SampleTableBox sampleTableBox = new SampleTableBox();
        createStsd(track, sampleTableBox);
        sampleTableBox.addBox(new TimeToSampleBox());
        sampleTableBox.addBox(new SampleToChunkBox());
        sampleTableBox.addBox(new SampleSizeBox());
        sampleTableBox.addBox(new StaticChunkOffsetBox());
        return sampleTableBox;
    }

    protected void createStsd(Track track, SampleTableBox sampleTableBox) {
        sampleTableBox.addBox(track.getSampleDescriptionBox());
    }

    protected void createTfdt(long j10, Track track, TrackFragmentBox trackFragmentBox) {
        TrackFragmentBaseMediaDecodeTimeBox trackFragmentBaseMediaDecodeTimeBox = new TrackFragmentBaseMediaDecodeTimeBox();
        trackFragmentBaseMediaDecodeTimeBox.setVersion(1);
        long[] sampleDurations = track.getSampleDurations();
        long j11 = 0;
        for (int i10 = 1; i10 < j10; i10++) {
            j11 += sampleDurations[i10 - 1];
        }
        trackFragmentBaseMediaDecodeTimeBox.setBaseMediaDecodeTime(j11);
        trackFragmentBox.addBox(trackFragmentBaseMediaDecodeTimeBox);
    }

    protected void createTfhd(long j10, long j11, Track track, int i10, TrackFragmentBox trackFragmentBox) {
        TrackFragmentHeaderBox trackFragmentHeaderBox = new TrackFragmentHeaderBox();
        trackFragmentHeaderBox.setDefaultSampleFlags(new SampleFlags());
        trackFragmentHeaderBox.setBaseDataOffset(-1L);
        trackFragmentHeaderBox.setTrackId(track.getTrackMetaData().getTrackId());
        trackFragmentHeaderBox.setDefaultBaseIsMoof(true);
        trackFragmentBox.addBox(trackFragmentHeaderBox);
    }

    protected Box createTfra(Track track, Container container) {
        Box box;
        long j10;
        LinkedList linkedList;
        TrackFragmentRandomAccessBox trackFragmentRandomAccessBox = new TrackFragmentRandomAccessBox();
        trackFragmentRandomAccessBox.setVersion(1);
        LinkedList linkedList2 = new LinkedList();
        TrackExtendsBox trackExtendsBox = null;
        for (TrackExtendsBox trackExtendsBox2 : Path.getPaths(container, "moov/mvex/trex")) {
            TrackFragmentRandomAccessBox trackFragmentRandomAccessBox2 = trackFragmentRandomAccessBox;
            LinkedList linkedList3 = linkedList2;
            if (trackExtendsBox2.getTrackId() == track.getTrackMetaData().getTrackId()) {
                trackExtendsBox = trackExtendsBox2;
            }
            trackFragmentRandomAccessBox = trackFragmentRandomAccessBox2;
            linkedList2 = linkedList3;
        }
        Iterator<Box> it = container.getBoxes().iterator();
        long sampleDuration = 0;
        long size = 0;
        while (it.hasNext()) {
            Box next = it.next();
            if (next instanceof MovieFragmentBox) {
                List boxes = ((MovieFragmentBox) next).getBoxes(TrackFragmentBox.class);
                int i10 = 0;
                while (i10 < boxes.size()) {
                    TrackFragmentBox trackFragmentBox = (TrackFragmentBox) boxes.get(i10);
                    if (trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == track.getTrackMetaData().getTrackId()) {
                        List boxes2 = trackFragmentBox.getBoxes(TrackRunBox.class);
                        int i11 = 0;
                        while (i11 < boxes2.size()) {
                            LinkedList linkedList4 = new LinkedList();
                            TrackRunBox trackRunBox = (TrackRunBox) boxes2.get(i11);
                            int i12 = 0;
                            while (i12 < trackRunBox.getEntries().size()) {
                                TrackRunBox.Entry entry = trackRunBox.getEntries().get(i12);
                                SampleFlags firstSampleFlags = (i12 == 0 && trackRunBox.isFirstSampleFlagsPresent()) ? trackRunBox.getFirstSampleFlags() : trackRunBox.isSampleFlagsPresent() ? entry.getSampleFlags() : trackExtendsBox.getDefaultSampleFlags();
                                TrackFragmentRandomAccessBox trackFragmentRandomAccessBox3 = trackFragmentRandomAccessBox;
                                if (firstSampleFlags == null && track.getHandler().equals("vide")) {
                                    throw new RuntimeException("Cannot find SampleFlags for video track but it's required to build tfra");
                                }
                                if (firstSampleFlags == null || firstSampleFlags.getSampleDependsOn() == 2) {
                                    box = next;
                                    j10 = sampleDuration;
                                    linkedList = linkedList4;
                                    linkedList.add(new TrackFragmentRandomAccessBox.Entry(j10, size, i10 + 1, i11 + 1, i12 + 1));
                                } else {
                                    box = next;
                                    j10 = sampleDuration;
                                    linkedList = linkedList4;
                                }
                                i12++;
                                linkedList4 = linkedList;
                                sampleDuration = j10 + entry.getSampleDuration();
                                i10 = i10;
                                boxes2 = boxes2;
                                i11 = i11;
                                next = box;
                                boxes = boxes;
                                trackFragmentRandomAccessBox = trackFragmentRandomAccessBox3;
                                linkedList2 = linkedList2;
                            }
                            if (linkedList4.size() != trackRunBox.getEntries().size() || trackRunBox.getEntries().size() <= 0) {
                                linkedList2.addAll(linkedList4);
                            } else {
                                linkedList2.add((TrackFragmentRandomAccessBox.Entry) linkedList4.get(0));
                            }
                            i11++;
                        }
                    }
                    i10++;
                    next = next;
                    boxes = boxes;
                    trackFragmentRandomAccessBox = trackFragmentRandomAccessBox;
                    linkedList2 = linkedList2;
                }
            }
            TrackFragmentRandomAccessBox trackFragmentRandomAccessBox4 = trackFragmentRandomAccessBox;
            LinkedList linkedList5 = linkedList2;
            size += next.getSize();
            trackFragmentRandomAccessBox = trackFragmentRandomAccessBox4;
            linkedList2 = linkedList5;
        }
        trackFragmentRandomAccessBox.setEntries(linkedList2);
        trackFragmentRandomAccessBox.setTrackId(track.getTrackMetaData().getTrackId());
        return trackFragmentRandomAccessBox;
    }

    protected Box createTkhd(Movie movie, Track track) {
        TrackHeaderBox trackHeaderBox = new TrackHeaderBox();
        trackHeaderBox.setVersion(1);
        trackHeaderBox.setFlags(7);
        trackHeaderBox.setAlternateGroup(track.getTrackMetaData().getGroup());
        trackHeaderBox.setCreationTime(track.getTrackMetaData().getCreationTime());
        trackHeaderBox.setDuration(0L);
        trackHeaderBox.setHeight(track.getTrackMetaData().getHeight());
        trackHeaderBox.setWidth(track.getTrackMetaData().getWidth());
        trackHeaderBox.setLayer(track.getTrackMetaData().getLayer());
        trackHeaderBox.setModificationTime(getDate());
        trackHeaderBox.setTrackId(track.getTrackMetaData().getTrackId());
        trackHeaderBox.setVolume(track.getTrackMetaData().getVolume());
        return trackHeaderBox;
    }

    protected void createTraf(long j10, long j11, Track track, int i10, MovieFragmentBox movieFragmentBox) {
        TrackFragmentBox trackFragmentBox = new TrackFragmentBox();
        movieFragmentBox.addBox(trackFragmentBox);
        createTfhd(j10, j11, track, i10, trackFragmentBox);
        createTfdt(j10, track, trackFragmentBox);
        createTrun(j10, j11, track, i10, trackFragmentBox);
        if (track instanceof CencEncryptedTrack) {
            CencEncryptedTrack cencEncryptedTrack = (CencEncryptedTrack) track;
            createSaiz(j10, j11, cencEncryptedTrack, i10, trackFragmentBox);
            createSenc(j10, j11, cencEncryptedTrack, i10, trackFragmentBox);
            createSaio(j10, j11, cencEncryptedTrack, i10, trackFragmentBox);
        }
        HashMap map = new HashMap();
        for (Map.Entry<GroupEntry, long[]> entry : track.getSampleGroups().entrySet()) {
            String type = entry.getKey().getType();
            List arrayList = (List) map.get(type);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(type, arrayList);
            }
            arrayList.add(entry.getKey());
        }
        for (Map.Entry entry2 : map.entrySet()) {
            SampleGroupDescriptionBox sampleGroupDescriptionBox = new SampleGroupDescriptionBox();
            String str = (String) entry2.getKey();
            sampleGroupDescriptionBox.setGroupEntries((List) entry2.getValue());
            sampleGroupDescriptionBox.setGroupingType(str);
            SampleToGroupBox sampleToGroupBox = new SampleToGroupBox();
            sampleToGroupBox.setGroupingType(str);
            SampleToGroupBox.Entry entry3 = null;
            for (int iL2i = CastUtils.l2i(j10 - 1); iL2i < CastUtils.l2i(j11 - 1); iL2i++) {
                int i11 = 0;
                for (int i12 = 0; i12 < ((List) entry2.getValue()).size(); i12++) {
                    if (Arrays.binarySearch(track.getSampleGroups().get((GroupEntry) ((List) entry2.getValue()).get(i12)), iL2i) >= 0) {
                        i11 = 65537 + i12;
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
            trackFragmentBox.addBox(sampleGroupDescriptionBox);
            trackFragmentBox.addBox(sampleToGroupBox);
        }
    }

    protected Box createTrak(Track track, Movie movie) {
        LOG.fine("Creating Track " + track);
        TrackBox trackBox = new TrackBox();
        trackBox.addBox(createTkhd(movie, track));
        Box boxCreateEdts = createEdts(track, movie);
        if (boxCreateEdts != null) {
            trackBox.addBox(boxCreateEdts);
        }
        trackBox.addBox(createMdia(track, movie));
        return trackBox;
    }

    protected Box createTrex(Movie movie, Track track) {
        TrackExtendsBox trackExtendsBox = new TrackExtendsBox();
        trackExtendsBox.setTrackId(track.getTrackMetaData().getTrackId());
        trackExtendsBox.setDefaultSampleDescriptionIndex(1L);
        trackExtendsBox.setDefaultSampleDuration(0L);
        trackExtendsBox.setDefaultSampleSize(0L);
        SampleFlags sampleFlags = new SampleFlags();
        if ("soun".equals(track.getHandler()) || "subt".equals(track.getHandler())) {
            sampleFlags.setSampleDependsOn(2);
            sampleFlags.setSampleIsDependedOn(2);
        }
        trackExtendsBox.setDefaultSampleFlags(sampleFlags);
        return trackExtendsBox;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x015e A[PHI: r6
      0x015e: PHI (r6v8 long) = (r6v3 long), (r6v10 long) binds: [B:62:0x0146, B:64:0x014c] A[DONT_GENERATE, DONT_INLINE]] */
    protected void createTrun(long j10, long j11, Track track, int i10, TrackFragmentBox trackFragmentBox) {
        long[] jArr;
        boolean z10;
        TrackRunBox trackRunBox = new TrackRunBox();
        boolean z11 = true;
        trackRunBox.setVersion(1);
        long[] sampleSizes = getSampleSizes(j10, j11, track, i10);
        trackRunBox.setSampleDurationPresent(true);
        trackRunBox.setSampleSizePresent(true);
        ArrayList arrayList = new ArrayList(CastUtils.l2i(j11 - j10));
        List<CompositionTimeToSample.Entry> compositionTimeEntries = track.getCompositionTimeEntries();
        CompositionTimeToSample.Entry[] entryArr = (compositionTimeEntries == null || compositionTimeEntries.size() <= 0) ? null : (CompositionTimeToSample.Entry[]) compositionTimeEntries.toArray(new CompositionTimeToSample.Entry[compositionTimeEntries.size()]);
        long count = entryArr != null ? entryArr[0].getCount() : -1;
        long j12 = 0;
        trackRunBox.setSampleCompositionTimeOffsetPresent(count > 0);
        int i11 = 0;
        long j13 = 1;
        while (j13 < j10) {
            long[] jArr2 = sampleSizes;
            long j14 = j12;
            if (entryArr != null) {
                count--;
                if (count == j14) {
                    z10 = true;
                    if (entryArr.length - i11 > 1) {
                        i11++;
                        count = entryArr[i11].getCount();
                    }
                } else {
                    z10 = true;
                }
            } else {
                z10 = true;
            }
            j13++;
            j12 = j14;
            sampleSizes = jArr2;
            z11 = z10;
        }
        boolean z12 = ((track.getSampleDependencies() == null || track.getSampleDependencies().isEmpty()) && (track.getSyncSamples() == null || track.getSyncSamples().length == 0)) ? false : z11;
        trackRunBox.setSampleFlagsPresent(z12);
        int i12 = 0;
        while (i12 < sampleSizes.length) {
            long j15 = j12;
            TrackRunBox.Entry entry = new TrackRunBox.Entry();
            entry.setSampleSize(sampleSizes[i12]);
            if (z12) {
                SampleFlags sampleFlags = new SampleFlags();
                if (track.getSampleDependencies() != null && !track.getSampleDependencies().isEmpty()) {
                    SampleDependencyTypeBox.Entry entry2 = track.getSampleDependencies().get(i12);
                    sampleFlags.setSampleDependsOn(entry2.getSampleDependsOn());
                    sampleFlags.setSampleIsDependedOn(entry2.getSampleIsDependentOn());
                    sampleFlags.setSampleHasRedundancy(entry2.getSampleHasRedundancy());
                }
                if (track.getSyncSamples() == null || track.getSyncSamples().length <= 0) {
                    jArr = sampleSizes;
                } else {
                    jArr = sampleSizes;
                    if (Arrays.binarySearch(track.getSyncSamples(), j10 + ((long) i12)) >= 0) {
                        sampleFlags.setSampleIsDifferenceSample(false);
                        sampleFlags.setSampleDependsOn(2);
                    } else {
                        sampleFlags.setSampleIsDifferenceSample(true);
                        sampleFlags.setSampleDependsOn(1);
                    }
                }
                entry.setSampleFlags(sampleFlags);
            } else {
                jArr = sampleSizes;
            }
            entry.setSampleDuration(track.getSampleDurations()[CastUtils.l2i((j10 + ((long) i12)) - 1)]);
            if (entryArr != null) {
                entry.setSampleCompositionTimeOffset(entryArr[i11].getOffset());
                count--;
                if (count == j15 && entryArr.length - i11 > 1) {
                    i11++;
                    count = entryArr[i11].getCount();
                }
            }
            arrayList.add(entry);
            i12++;
            j12 = j15;
            sampleSizes = jArr;
        }
        trackRunBox.setEntries(arrayList);
        trackFragmentBox.addBox(trackRunBox);
    }

    public Date getDate() {
        return new Date();
    }

    public Fragmenter getFragmenter() {
        return this.fragmenter;
    }

    protected long[] getSampleSizes(long j10, long j11, Track track, int i10) {
        List<Sample> samples = getSamples(j10, j11, track);
        int size = samples.size();
        long[] jArr = new long[size];
        for (int i11 = 0; i11 < size; i11++) {
            jArr[i11] = samples.get(i11).getSize();
        }
        return jArr;
    }

    protected List<Sample> getSamples(long j10, long j11, Track track) {
        return track.getSamples().subList(CastUtils.l2i(j10) - 1, CastUtils.l2i(j11) - 1);
    }

    public void setFragmenter(Fragmenter fragmenter) {
        this.fragmenter = fragmenter;
    }

    protected List<Track> sortTracksInSequence(List<Track> list, final int i10, final Map<Track, long[]> map) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList, new Comparator<Track>() { // from class: com.googlecode.mp4parser.authoring.builder.FragmentedMp4Builder.1
            @Override // java.util.Comparator
            public int compare(Track track, Track track2) {
                long j10 = ((long[]) map.get(track))[i10];
                long j11 = ((long[]) map.get(track2))[i10];
                long[] sampleDurations = track.getSampleDurations();
                long[] sampleDurations2 = track2.getSampleDurations();
                long j12 = 0;
                for (int i11 = 1; i11 < j10; i11++) {
                    j12 += sampleDurations[i11 - 1];
                }
                long j13 = 0;
                for (int i12 = 1; i12 < j11; i12++) {
                    j13 += sampleDurations2[i12 - 1];
                }
                return (int) (((j12 / track.getTrackMetaData().getTimescale()) - (j13 / track2.getTrackMetaData().getTimescale())) * 100.0d);
            }
        });
        return linkedList;
    }
}
