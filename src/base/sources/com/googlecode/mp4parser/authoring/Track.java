package com.googlecode.mp4parser.authoring;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;
import java.io.Closeable;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface Track extends Closeable {
    List<CompositionTimeToSample.Entry> getCompositionTimeEntries();

    long getDuration();

    List<Edit> getEdits();

    String getHandler();

    String getName();

    List<SampleDependencyTypeBox.Entry> getSampleDependencies();

    SampleDescriptionBox getSampleDescriptionBox();

    long[] getSampleDurations();

    Map<GroupEntry, long[]> getSampleGroups();

    List<Sample> getSamples();

    SubSampleInformationBox getSubsampleInformationBox();

    long[] getSyncSamples();

    TrackMetaData getTrackMetaData();
}
