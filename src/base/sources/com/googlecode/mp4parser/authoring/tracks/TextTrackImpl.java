package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.sampleentry.TextSampleEntry;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.SampleImpl;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class TextTrackImpl extends AbstractTrack {
    SampleDescriptionBox sampleDescriptionBox;
    List<Sample> samples;
    List<Line> subs;
    TrackMetaData trackMetaData;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class Line {
        long from;
        String text;

        /* JADX INFO: renamed from: to, reason: collision with root package name */
        long f22490to;

        public Line(long j10, long j11, String str) {
            this.from = j10;
            this.f22490to = j11;
            this.text = str;
        }

        public long getFrom() {
            return this.from;
        }

        public String getText() {
            return this.text;
        }

        public long getTo() {
            return this.f22490to;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public TextTrackImpl() {
        super("subtitles");
        this.trackMetaData = new TrackMetaData();
        this.subs = new LinkedList();
        this.sampleDescriptionBox = new SampleDescriptionBox();
        TextSampleEntry textSampleEntry = new TextSampleEntry(TextSampleEntry.TYPE1);
        textSampleEntry.setDataReferenceIndex(1);
        textSampleEntry.setStyleRecord(new TextSampleEntry.StyleRecord());
        textSampleEntry.setBoxRecord(new TextSampleEntry.BoxRecord());
        this.sampleDescriptionBox.addBox(textSampleEntry);
        FontTableBox fontTableBox = new FontTableBox();
        fontTableBox.setEntries(Collections.singletonList(new FontTableBox.FontRecord(1, "Serif")));
        textSampleEntry.addBox(fontTableBox);
        this.trackMetaData.setCreationTime(new Date());
        this.trackMetaData.setModificationTime(new Date());
        this.trackMetaData.setTimescale(1000L);
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public String getHandler() {
        return "sbtl";
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.sampleDescriptionBox;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long[] getSampleDurations() {
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        for (Line line : this.subs) {
            long j11 = line.from - j10;
            if (j11 > 0) {
                arrayList.add(Long.valueOf(j11));
            } else if (j11 < 0) {
                throw new Error("Subtitle display times may not intersect");
            }
            arrayList.add(Long.valueOf(line.f22490to - line.from));
            j10 = line.f22490to;
        }
        long[] jArr = new long[arrayList.size()];
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            jArr[i10] = ((Long) obj).longValue();
            i10++;
        }
        return jArr;
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public synchronized List<Sample> getSamples() {
        try {
            if (this.samples == null) {
                this.samples = new ArrayList();
                long j10 = 0;
                for (Line line : this.subs) {
                    long j11 = line.from - j10;
                    if (j11 > 0) {
                        this.samples.add(new SampleImpl(ByteBuffer.wrap(new byte[2])));
                    } else if (j11 < 0) {
                        throw new Error("Subtitle display times may not intersect");
                    }
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    try {
                        dataOutputStream.writeShort(line.text.getBytes(C.UTF8_NAME).length);
                        dataOutputStream.write(line.text.getBytes(C.UTF8_NAME));
                        dataOutputStream.close();
                        this.samples.add(new SampleImpl(ByteBuffer.wrap(byteArrayOutputStream.toByteArray())));
                        j10 = line.f22490to;
                    } catch (IOException unused) {
                        throw new Error("VM is broken. Does not support UTF-8");
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.samples;
    }

    public List<Line> getSubs() {
        return this.subs;
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
