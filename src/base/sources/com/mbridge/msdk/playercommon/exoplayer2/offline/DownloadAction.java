package com.mbridge.msdk.playercommon.exoplayer2.offline;

import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class DownloadAction {
    public final byte[] data;
    public final boolean isRemoveAction;
    public final String type;
    public final Uri uri;
    public final int version;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class Deserializer {
        public final String type;
        public final int version;

        public Deserializer(String str, int i10) {
            this.type = str;
            this.version = i10;
        }

        public abstract DownloadAction readFromStream(int i10, DataInputStream dataInputStream);
    }

    protected DownloadAction(String str, int i10, Uri uri, boolean z10, byte[] bArr) {
        this.type = str;
        this.version = i10;
        this.uri = uri;
        this.isRemoveAction = z10;
        this.data = bArr == null ? new byte[0] : bArr;
    }

    public static DownloadAction deserializeFromStream(Deserializer[] deserializerArr, InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String utf = dataInputStream.readUTF();
        int i10 = dataInputStream.readInt();
        for (Deserializer deserializer : deserializerArr) {
            if (utf.equals(deserializer.type) && deserializer.version >= i10) {
                return deserializer.readFromStream(i10, dataInputStream);
            }
        }
        throw new DownloadException("No deserializer found for:" + utf + ", " + i10);
    }

    public static void serializeToStream(DownloadAction downloadAction, OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF(downloadAction.type);
        dataOutputStream.writeInt(downloadAction.version);
        downloadAction.writeToStream(dataOutputStream);
        dataOutputStream.flush();
    }

    protected abstract Downloader createDownloader(DownloaderConstructorHelper downloaderConstructorHelper);

    public boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            DownloadAction downloadAction = (DownloadAction) obj;
            if (this.type.equals(downloadAction.type) && this.version == downloadAction.version && this.uri.equals(downloadAction.uri) && this.isRemoveAction == downloadAction.isRemoveAction && Arrays.equals(this.data, downloadAction.data)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.uri.hashCode() * 31) + (this.isRemoveAction ? 1 : 0)) * 31) + Arrays.hashCode(this.data);
    }

    public boolean isSameMedia(DownloadAction downloadAction) {
        return this.uri.equals(downloadAction.uri);
    }

    public final byte[] toByteArray() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            serializeToStream(this, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new IllegalStateException();
        }
    }

    protected abstract void writeToStream(DataOutputStream dataOutputStream);
}
