package com.mbridge.msdk.config.component.load.downloader.resource.stream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BufferedOutputStream f28950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FileDescriptor f28951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RandomAccessFile f28952c;

    public b(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.f28952c = randomAccessFile;
        this.f28951b = randomAccessFile.getFD();
        this.f28950a = new BufferedOutputStream(new FileOutputStream(randomAccessFile.getFD()));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.resource.stream.a
    public void close() throws IOException {
        this.f28950a.close();
        this.f28952c.close();
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.resource.stream.a
    public void flushAndSync() throws IOException {
        this.f28950a.flush();
        this.f28951b.sync();
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.resource.stream.a
    public void seek(long j10) throws IOException {
        this.f28952c.seek(j10);
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.resource.stream.a
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f28950a.write(bArr, i10, i11);
    }
}
