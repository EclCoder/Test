package com.pgl.ssdk;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class r {
    public static q a(RandomAccessFile randomAccessFile, long j10, long j11) {
        return a(randomAccessFile.getChannel(), j10, j11);
    }

    public static q a(FileChannel fileChannel, long j10, long j11) {
        fileChannel.getClass();
        return new m(fileChannel, j10, j11);
    }
}
