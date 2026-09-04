package com.googlecode.mp4parser;

import com.googlecode.mp4parser.util.Logger;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class FileDataSourceImpl implements DataSource {
    private static Logger LOG = Logger.getLogger(FileDataSourceImpl.class);

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    FileChannel f22488fc;
    String filename;

    public FileDataSourceImpl(File file) {
        this.f22488fc = new FileInputStream(file).getChannel();
        this.filename = file.getName();
    }

    @Override // com.googlecode.mp4parser.DataSource, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f22488fc.close();
    }

    @Override // com.googlecode.mp4parser.DataSource
    public synchronized ByteBuffer map(long j10, long j11) {
        return this.f22488fc.map(FileChannel.MapMode.READ_ONLY, j10, j11);
    }

    @Override // com.googlecode.mp4parser.DataSource
    public synchronized long position() {
        return this.f22488fc.position();
    }

    @Override // com.googlecode.mp4parser.DataSource
    public synchronized int read(ByteBuffer byteBuffer) {
        return this.f22488fc.read(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.DataSource
    public synchronized long size() {
        return this.f22488fc.size();
    }

    public String toString() {
        return this.filename;
    }

    @Override // com.googlecode.mp4parser.DataSource
    public synchronized long transferTo(long j10, long j11, WritableByteChannel writableByteChannel) {
        return this.f22488fc.transferTo(j10, j11, writableByteChannel);
    }

    @Override // com.googlecode.mp4parser.DataSource
    public synchronized void position(long j10) {
        this.f22488fc.position(j10);
    }

    public FileDataSourceImpl(String str) {
        File file = new File(str);
        this.f22488fc = new FileInputStream(file).getChannel();
        this.filename = file.getName();
    }

    public FileDataSourceImpl(FileChannel fileChannel) {
        this.f22488fc = fileChannel;
        this.filename = "unknown";
    }

    public FileDataSourceImpl(FileChannel fileChannel, String str) {
        this.f22488fc = fileChannel;
        this.filename = str;
    }
}
