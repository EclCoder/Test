package com.googlecode.mp4parser;

import com.googlecode.mp4parser.util.CastUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class DirectFileReadDataSource implements DataSource {
    private static final int TRANSFER_SIZE = 8192;
    private String filename;
    private RandomAccessFile raf;

    public DirectFileReadDataSource(File file) {
        this.raf = new RandomAccessFile(file, CampaignEx.JSON_KEY_AD_R);
        this.filename = file.getName();
    }

    @Override // com.googlecode.mp4parser.DataSource, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.raf.close();
    }

    @Override // com.googlecode.mp4parser.DataSource
    public ByteBuffer map(long j10, long j11) throws IOException {
        this.raf.seek(j10);
        byte[] bArr = new byte[CastUtils.l2i(j11)];
        this.raf.readFully(bArr);
        return ByteBuffer.wrap(bArr);
    }

    @Override // com.googlecode.mp4parser.DataSource
    public long position() {
        return this.raf.getFilePointer();
    }

    @Override // com.googlecode.mp4parser.DataSource
    public int read(ByteBuffer byteBuffer) throws IOException {
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[TRANSFER_SIZE];
        int i10 = 0;
        int i11 = 0;
        while (i10 < iRemaining) {
            i11 = this.raf.read(bArr, 0, Math.min(iRemaining - i10, TRANSFER_SIZE));
            if (i11 < 0) {
                break;
            }
            i10 += i11;
            byteBuffer.put(bArr, 0, i11);
        }
        if (i11 >= 0 || i10 != 0) {
            return i10;
        }
        return -1;
    }

    public int readAllInOnce(ByteBuffer byteBuffer) throws IOException {
        byte[] bArr = new byte[byteBuffer.remaining()];
        int i10 = this.raf.read(bArr);
        byteBuffer.put(bArr, 0, i10);
        return i10;
    }

    @Override // com.googlecode.mp4parser.DataSource
    public long size() {
        return this.raf.length();
    }

    public String toString() {
        return this.filename;
    }

    @Override // com.googlecode.mp4parser.DataSource
    public long transferTo(long j10, long j11, WritableByteChannel writableByteChannel) {
        return writableByteChannel.write(map(j10, j11));
    }

    @Override // com.googlecode.mp4parser.DataSource
    public void position(long j10) throws IOException {
        this.raf.seek(j10);
    }
}
