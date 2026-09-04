package com.googlecode.mp4parser;

import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.Logger;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class FileDataSourceViaHeapImpl implements DataSource {
    private static Logger LOG = Logger.getLogger(FileDataSourceViaHeapImpl.class);

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    FileChannel f22489fc;
    String filename;

    public FileDataSourceViaHeapImpl(File file) {
        this.f22489fc = new FileInputStream(file).getChannel();
        this.filename = file.getName();
    }

    @Override // com.googlecode.mp4parser.DataSource, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f22489fc.close();
    }

    @Override // com.googlecode.mp4parser.DataSource
    public synchronized ByteBuffer map(long j10, long j11) {
        ByteBuffer byteBufferAllocate;
        byteBufferAllocate = ByteBuffer.allocate(CastUtils.l2i(j11));
        this.f22489fc.read(byteBufferAllocate, j10);
        return (ByteBuffer) byteBufferAllocate.rewind();
    }

    @Override // com.googlecode.mp4parser.DataSource
    public synchronized long position() {
        return this.f22489fc.position();
    }

    @Override // com.googlecode.mp4parser.DataSource
    public synchronized int read(ByteBuffer byteBuffer) {
        return this.f22489fc.read(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.DataSource
    public synchronized long size() {
        return this.f22489fc.size();
    }

    public String toString() {
        return this.filename;
    }

    @Override // com.googlecode.mp4parser.DataSource
    public synchronized long transferTo(long j10, long j11, WritableByteChannel writableByteChannel) {
        return this.f22489fc.transferTo(j10, j11, writableByteChannel);
    }

    @Override // com.googlecode.mp4parser.DataSource
    public synchronized void position(long j10) {
        this.f22489fc.position(j10);
    }

    public FileDataSourceViaHeapImpl(String str) {
        File file = new File(str);
        this.f22489fc = new FileInputStream(file).getChannel();
        this.filename = file.getName();
    }

    public FileDataSourceViaHeapImpl(FileChannel fileChannel) {
        this.f22489fc = fileChannel;
        this.filename = "unknown";
    }

    public FileDataSourceViaHeapImpl(FileChannel fileChannel, String str) {
        this.f22489fc = fileChannel;
        this.filename = str;
    }
}
