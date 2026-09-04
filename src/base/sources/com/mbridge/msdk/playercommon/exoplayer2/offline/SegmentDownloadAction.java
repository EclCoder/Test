package com.mbridge.msdk.playercommon.exoplayer2.offline;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class SegmentDownloadAction<K extends Comparable<K>> extends DownloadAction {
    public final List<K> keys;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    protected static abstract class SegmentDownloadActionDeserializer<K> extends DownloadAction.Deserializer {
        public SegmentDownloadActionDeserializer(String str, int i10) {
            super(str, i10);
        }

        protected abstract DownloadAction createDownloadAction(Uri uri, boolean z10, byte[] bArr, List<K> list);

        @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction.Deserializer
        public final DownloadAction readFromStream(int i10, DataInputStream dataInputStream) throws IOException {
            Uri uri = Uri.parse(dataInputStream.readUTF());
            boolean z10 = dataInputStream.readBoolean();
            byte[] bArr = new byte[dataInputStream.readInt()];
            dataInputStream.readFully(bArr);
            int i11 = dataInputStream.readInt();
            List<K> arrayList = new ArrayList<>();
            for (int i12 = 0; i12 < i11; i12++) {
                arrayList.add(readKey(dataInputStream));
            }
            return createDownloadAction(uri, z10, bArr, arrayList);
        }

        protected abstract K readKey(DataInputStream dataInputStream);
    }

    protected SegmentDownloadAction(String str, int i10, Uri uri, boolean z10, byte[] bArr, List<K> list) {
        super(str, i10, uri, z10, bArr);
        if (z10) {
            Assertions.checkArgument(list.isEmpty());
            this.keys = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList(list);
            Collections.sort(arrayList);
            this.keys = Collections.unmodifiableList(arrayList);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj)) {
            return this.keys.equals(((SegmentDownloadAction) obj).keys);
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction
    public int hashCode() {
        return (super.hashCode() * 31) + this.keys.hashCode();
    }

    protected abstract void writeKey(DataOutputStream dataOutputStream, K k10);

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction
    public final void writeToStream(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeUTF(this.uri.toString());
        dataOutputStream.writeBoolean(this.isRemoveAction);
        dataOutputStream.writeInt(this.data.length);
        dataOutputStream.write(this.data);
        dataOutputStream.writeInt(this.keys.size());
        for (int i10 = 0; i10 < this.keys.size(); i10++) {
            writeKey(dataOutputStream, this.keys.get(i10));
        }
    }
}
