package com.googlecode.mp4parser.authoring.builder;

import com.coremedia.iso.boxes.OriginalFormatBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.googlecode.mp4parser.AbstractContainerBox;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.util.Math;
import com.googlecode.mp4parser.util.Path;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class SyncSampleIntersectFinderImpl implements Fragmenter {
    private static Logger LOG = Logger.getLogger(SyncSampleIntersectFinderImpl.class.getName());
    private final int minFragmentDurationSeconds;
    private Movie movie;
    private Track referenceTrack;

    public SyncSampleIntersectFinderImpl(Movie movie, Track track, int i10) {
        this.movie = movie;
        this.referenceTrack = track;
        this.minFragmentDurationSeconds = i10;
    }

    private static long calculateTracktimesScalingFactor(Movie movie, Track track) {
        long jLcm = 1;
        for (Track track2 : movie.getTracks()) {
            if (track2.getHandler().equals(track.getHandler()) && track2.getTrackMetaData().getTimescale() != track.getTrackMetaData().getTimescale()) {
                jLcm = Math.lcm(jLcm, track2.getTrackMetaData().getTimescale());
            }
        }
        return jLcm;
    }

    static String getFormat(Track track) {
        SampleDescriptionBox sampleDescriptionBox = track.getSampleDescriptionBox();
        OriginalFormatBox originalFormatBox = (OriginalFormatBox) Path.getPath((AbstractContainerBox) sampleDescriptionBox, "enc./sinf/frma");
        return originalFormatBox != null ? originalFormatBox.getDataFormat() : sampleDescriptionBox.getSampleEntry().getType();
    }

    public static List<long[]> getSyncSamplesTimestamps(Movie movie, Track track) {
        long[] syncSamples;
        LinkedList linkedList = new LinkedList();
        for (Track track2 : movie.getTracks()) {
            if (track2.getHandler().equals(track.getHandler()) && (syncSamples = track2.getSyncSamples()) != null && syncSamples.length > 0) {
                linkedList.add(getTimes(track2, movie));
            }
        }
        return linkedList;
    }

    private static long[] getTimes(Track track, Movie movie) {
        long[] syncSamples = track.getSyncSamples();
        long[] jArr = new long[syncSamples.length];
        long jCalculateTracktimesScalingFactor = calculateTracktimesScalingFactor(movie, track);
        long j10 = 0;
        int i10 = 0;
        int i11 = 1;
        while (true) {
            long j11 = i11;
            if (j11 > syncSamples[syncSamples.length - 1]) {
                return jArr;
            }
            if (j11 == syncSamples[i10]) {
                jArr[i10] = j10 * jCalculateTracktimesScalingFactor;
                i10++;
            }
            j10 += track.getSampleDurations()[i11 - 1];
            i11++;
        }
    }

    public long[] getCommonIndices(long[] jArr, long[] jArr2, long j10, long[]... jArr3) {
        LinkedList linkedList;
        LinkedList<Long> linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        int i10 = 0;
        for (int i11 = 0; i11 < jArr2.length; i11++) {
            boolean z10 = true;
            for (long[] jArr4 : jArr3) {
                z10 &= Arrays.binarySearch(jArr4, jArr2[i11]) >= 0;
            }
            if (z10) {
                linkedList2.add(Long.valueOf(jArr[i11]));
                linkedList3.add(Long.valueOf(jArr2[i11]));
            }
        }
        if (linkedList2.size() < ((double) jArr.length) * 0.25d) {
            String str = "" + String.format("%5d - Common:  [", Integer.valueOf(linkedList2.size()));
            for (Long l10 : linkedList2) {
                l10.longValue();
                str = String.valueOf(str) + String.format("%10d,", l10);
            }
            LOG.warning(String.valueOf(str) + "]");
            String str2 = "" + String.format("%5d - In    :  [", Integer.valueOf(jArr.length));
            int length = jArr.length;
            while (i10 < length) {
                str2 = String.valueOf(str2) + String.format("%10d,", Long.valueOf(jArr[i10]));
                i10++;
            }
            LOG.warning(String.valueOf(str2) + "]");
            LOG.warning("There are less than 25% of common sync samples in the given track.");
            throw new RuntimeException("There are less than 25% of common sync samples in the given track.");
        }
        if (linkedList2.size() < ((double) jArr.length) * 0.5d) {
            LOG.fine("There are less than 50% of common sync samples in the given track. This is implausible but I'm ok to continue.");
        } else if (linkedList2.size() < jArr.length) {
            LOG.finest("Common SyncSample positions vs. this tracks SyncSample positions: " + linkedList2.size() + " vs. " + jArr.length);
        }
        LinkedList linkedList4 = new LinkedList();
        if (this.minFragmentDurationSeconds > 0) {
            Iterator it = linkedList2.iterator();
            Iterator it2 = linkedList3.iterator();
            long j11 = -1;
            while (it.hasNext() && it2.hasNext()) {
                Long l11 = (Long) it.next();
                l11.longValue();
                long jLongValue = ((Long) it2.next()).longValue();
                if (j11 == -1 || (jLongValue - j11) / j10 >= this.minFragmentDurationSeconds) {
                    linkedList4.add(l11);
                    j11 = jLongValue;
                }
            }
            linkedList = linkedList4;
        } else {
            linkedList = linkedList2;
        }
        int size = linkedList.size();
        long[] jArr5 = new long[size];
        while (i10 < size) {
            jArr5[i10] = ((Long) linkedList.get(i10)).longValue();
            i10++;
        }
        return jArr5;
    }

    @Override // com.googlecode.mp4parser.authoring.builder.Fragmenter
    public long[] sampleNumbers(Track track) {
        long sampleRate;
        if ("vide".equals(track.getHandler())) {
            if (track.getSyncSamples() == null || track.getSyncSamples().length <= 0) {
                throw new RuntimeException("Video Tracks need sync samples. Only tracks other than video may have no sync samples.");
            }
            List<long[]> syncSamplesTimestamps = getSyncSamplesTimestamps(this.movie, track);
            return getCommonIndices(track.getSyncSamples(), getTimes(track, this.movie), track.getTrackMetaData().getTimescale(), (long[][]) syncSamplesTimestamps.toArray(new long[syncSamplesTimestamps.size()][]));
        }
        int i10 = 0;
        if (!"soun".equals(track.getHandler())) {
            for (Track track2 : this.movie.getTracks()) {
                if (track2.getSyncSamples() != null && track2.getSyncSamples().length > 0) {
                    long[] jArrSampleNumbers = sampleNumbers(track2);
                    int size = track2.getSamples().size();
                    int length = jArrSampleNumbers.length;
                    long[] jArr = new long[length];
                    double size2 = ((double) track.getSamples().size()) / ((double) size);
                    for (int i11 = 0; i11 < length; i11++) {
                        jArr[i11] = ((long) Math.ceil((jArrSampleNumbers[i11] - 1) * size2)) + 1;
                    }
                    return jArr;
                }
            }
            throw new RuntimeException("There was absolutely no Track with sync samples. I can't work with that!");
        }
        if (this.referenceTrack == null) {
            for (Track track3 : this.movie.getTracks()) {
                if (track3.getSyncSamples() != null && "vide".equals(track3.getHandler()) && track3.getSyncSamples().length > 0) {
                    this.referenceTrack = track3;
                }
            }
        }
        Track track4 = this.referenceTrack;
        if (track4 == null) {
            throw new RuntimeException("There was absolutely no Track with sync samples. I can't work with that!");
        }
        long[] jArrSampleNumbers2 = sampleNumbers(track4);
        int size3 = this.referenceTrack.getSamples().size();
        int length2 = jArrSampleNumbers2.length;
        long[] jArr2 = new long[length2];
        Iterator<Track> it = this.movie.getTracks().iterator();
        while (true) {
            sampleRate = 192000;
            if (!it.hasNext()) {
                break;
            }
            Track next = it.next();
            if (getFormat(track).equals(getFormat(next))) {
                AudioSampleEntry audioSampleEntry = (AudioSampleEntry) next.getSampleDescriptionBox().getSampleEntry();
                if (audioSampleEntry.getSampleRate() < 192000) {
                    sampleRate = audioSampleEntry.getSampleRate();
                    double size4 = ((double) next.getSamples().size()) / ((double) size3);
                    long j10 = next.getSampleDurations()[0];
                    int i12 = 0;
                    while (i12 < length2) {
                        jArr2[i12] = (long) Math.ceil((jArrSampleNumbers2[i12] - 1) * size4 * j10);
                        i12++;
                        length2 = length2;
                        i10 = 0;
                    }
                    break;
                }
            }
        }
        AudioSampleEntry audioSampleEntry2 = (AudioSampleEntry) track.getSampleDescriptionBox().getSampleEntry();
        long j11 = track.getSampleDurations()[i10];
        double sampleRate2 = audioSampleEntry2.getSampleRate() / sampleRate;
        if (sampleRate2 != Math.rint(sampleRate2)) {
            throw new RuntimeException("Sample rates must be a multiple of the lowest sample rate to create a correct file!");
        }
        while (i10 < length2) {
            jArr2[i10] = (long) (((jArr2[i10] * sampleRate2) / j11) + 1.0d);
            i10++;
        }
        return jArr2;
    }
}
