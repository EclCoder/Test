package com.googlecode.mp4parser;

import com.googlecode.mp4parser.util.CastUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class MultiFileDataSourceImpl implements DataSource {
    FileChannel[] fcs;
    int index = 0;

    public MultiFileDataSourceImpl(File... fileArr) {
        this.fcs = new FileChannel[fileArr.length];
        for (int i10 = 0; i10 < fileArr.length; i10++) {
            this.fcs[i10] = new FileInputStream(fileArr[i10]).getChannel();
        }
    }

    @Override // com.googlecode.mp4parser.DataSource, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        for (FileChannel fileChannel : this.fcs) {
            fileChannel.close();
        }
    }

    @Override // com.googlecode.mp4parser.DataSource
    public ByteBuffer map(long j10, long j11) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(CastUtils.l2i(j11));
        transferTo(j10, j11, Channels.newChannel(byteArrayOutputStream));
        return ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
    }

    @Override // com.googlecode.mp4parser.DataSource
    public long position() {
        long size = 0;
        int i10 = 0;
        while (true) {
            int i11 = this.index;
            if (i10 >= i11) {
                return size + this.fcs[i11].position();
            }
            size += this.fcs[i10].size();
            i10++;
        }
    }

    @Override // com.googlecode.mp4parser.DataSource
    public int read(ByteBuffer byteBuffer) throws IOException {
        int iRemaining = byteBuffer.remaining();
        int i10 = this.fcs[this.index].read(byteBuffer);
        if (i10 == iRemaining) {
            return i10;
        }
        this.index++;
        return i10 + read(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.DataSource
    public long size() {
        long size = 0;
        for (FileChannel fileChannel : this.fcs) {
            size += fileChannel.size();
        }
        return size;
    }

    @Override // com.googlecode.mp4parser.DataSource
    public long transferTo(long j10, long j11, WritableByteChannel writableByteChannel) throws IOException {
        if (j11 == 0) {
            return 0L;
        }
        MultiFileDataSourceImpl multiFileDataSourceImpl = this;
        FileChannel[] fileChannelArr = multiFileDataSourceImpl.fcs;
        int length = fileChannelArr.length;
        int i10 = 0;
        long j12 = 0;
        while (i10 < length) {
            FileChannel fileChannel = fileChannelArr[i10];
            long size = fileChannel.size();
            if (j10 >= j12 && j10 < j12 + size && j10 + j11 > j12) {
                long j13 = j10 - j12;
                long jMin = Math.min(j11, size - j13);
                fileChannel.transferTo(j13, jMin, writableByteChannel);
                return jMin + multiFileDataSourceImpl.transferTo(j10 + jMin, j11 - jMin, writableByteChannel);
            }
            j12 += size;
            i10++;
            multiFileDataSourceImpl = this;
        }
        return 0L;
    }

    @Override // com.googlecode.mp4parser.DataSource
    public void position(long j10) throws IOException {
        int i10 = 0;
        while (true) {
            FileChannel[] fileChannelArr = this.fcs;
            if (i10 >= fileChannelArr.length) {
                return;
            }
            if (j10 - fileChannelArr[i10].size() < 0) {
                this.fcs[i10].position(j10);
                this.index = i10;
                return;
            } else {
                j10 -= this.fcs[i10].size();
                i10++;
            }
        }
    }
}
