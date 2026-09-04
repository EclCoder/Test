package com.mp4parser.iso14496.part12;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.util.Mp4Arrays;
import java.nio.ByteBuffer;
import np.a;
import qp.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class TrackReferenceTypeBox extends AbstractBox {
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_0 = null;
    private static final /* synthetic */ a.InterfaceC0736a ajc$tjp_1 = null;
    long[] trackIds;

    static {
        ajc$preClinit();
    }

    public TrackReferenceTypeBox(String str) {
        super(str);
        this.trackIds = new long[0];
    }

    private static /* synthetic */ void ajc$preClinit() {
        b bVar = new b("TrackReferenceTypeBox.java", TrackReferenceTypeBox.class);
        ajc$tjp_0 = bVar.h("method-execution", bVar.g("1", "getTrackIds", "com.mp4parser.iso14496.part12.TrackReferenceTypeBox", "", "", "", "[J"), 58);
        ajc$tjp_1 = bVar.h("method-execution", bVar.g("1", "setTrackIds", "com.mp4parser.iso14496.part12.TrackReferenceTypeBox", "[J", "trackIds", "", "void"), 62);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer) {
        while (byteBuffer.remaining() >= 4) {
            this.trackIds = Mp4Arrays.copyOfAndAppend(this.trackIds, IsoTypeReader.readUInt32(byteBuffer));
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        for (long j10 : this.trackIds) {
            IsoTypeWriter.writeUInt32(byteBuffer, j10);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return this.trackIds.length * 4;
    }

    public long[] getTrackIds() {
        RequiresParseDetailAspect.aspectOf().before(b.c(ajc$tjp_0, this, this));
        return this.trackIds;
    }

    public void setTrackIds(long[] jArr) {
        RequiresParseDetailAspect.aspectOf().before(b.d(ajc$tjp_1, this, this, jArr));
        this.trackIds = jArr;
    }
}
