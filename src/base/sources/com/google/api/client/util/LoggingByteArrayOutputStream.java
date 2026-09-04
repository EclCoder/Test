package com.google.api.client.util;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class LoggingByteArrayOutputStream extends ByteArrayOutputStream {
    private int bytesWritten;
    private boolean closed;
    private final Logger logger;
    private final Level loggingLevel;
    private final int maximumBytesToLog;

    public LoggingByteArrayOutputStream(Logger logger, Level level, int i10) {
        this.logger = (Logger) Preconditions.checkNotNull(logger);
        this.loggingLevel = (Level) Preconditions.checkNotNull(level);
        Preconditions.checkArgument(i10 >= 0);
        this.maximumBytesToLog = i10;
    }

    private static void appendBytes(StringBuilder sb2, int i10) {
        if (i10 == 1) {
            sb2.append("1 byte");
        } else {
            sb2.append(NumberFormat.getInstance().format(i10));
            sb2.append(" bytes");
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (!this.closed) {
                if (this.bytesWritten != 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Total: ");
                    appendBytes(sb2, this.bytesWritten);
                    int i10 = ((ByteArrayOutputStream) this).count;
                    if (i10 != 0 && i10 < this.bytesWritten) {
                        sb2.append(" (logging first ");
                        appendBytes(sb2, ((ByteArrayOutputStream) this).count);
                        sb2.append(")");
                    }
                    this.logger.config(sb2.toString());
                    if (((ByteArrayOutputStream) this).count != 0) {
                        this.logger.log(this.loggingLevel, toString(C.UTF8_NAME).replaceAll("[\\x00-\\x09\\x0B\\x0C\\x0E-\\x1F\\x7F]", " "));
                    }
                }
                this.closed = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized int getBytesWritten() {
        return this.bytesWritten;
    }

    public final int getMaximumBytesToLog() {
        return this.maximumBytesToLog;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i10) {
        Preconditions.checkArgument(!this.closed);
        this.bytesWritten++;
        if (((ByteArrayOutputStream) this).count < this.maximumBytesToLog) {
            super.write(i10);
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i10, int i11) {
        Preconditions.checkArgument(!this.closed);
        this.bytesWritten += i11;
        int i12 = ((ByteArrayOutputStream) this).count;
        int i13 = this.maximumBytesToLog;
        if (i12 < i13) {
            int i14 = i12 + i11;
            if (i14 > i13) {
                i11 += i13 - i14;
            }
            super.write(bArr, i10, i11);
        }
    }
}
