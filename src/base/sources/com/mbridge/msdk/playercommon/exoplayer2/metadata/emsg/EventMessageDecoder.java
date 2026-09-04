package com.mbridge.msdk.playercommon.exoplayer2.metadata.emsg;

import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class EventMessageDecoder implements MetadataDecoder {
    @Override // com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataDecoder
    public Metadata decode(MetadataInputBuffer metadataInputBuffer) {
        ByteBuffer byteBuffer = metadataInputBuffer.data;
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArrArray, iLimit);
        String nullTerminatedString = parsableByteArray.readNullTerminatedString();
        String nullTerminatedString2 = parsableByteArray.readNullTerminatedString();
        long unsignedInt = parsableByteArray.readUnsignedInt();
        return new Metadata(new EventMessage(nullTerminatedString, nullTerminatedString2, Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000L, unsignedInt), parsableByteArray.readUnsignedInt(), Arrays.copyOfRange(bArrArray, parsableByteArray.getPosition(), iLimit), Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000000L, unsignedInt)));
    }
}
